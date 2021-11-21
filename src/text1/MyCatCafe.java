package text1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

import static java.lang.Math.abs;


public class MyCatCafe implements CatCafe{
    private double balance;//余额
    private ArrayList<Cat> cats;//存放在店里的猫猫
    private ArrayList<Customer> customers;//以往的所有顾客
    private double income;//一天的收入
    private LocalDate today;//当天的日期

    public void setToday(LocalDate today) {
        this.today = today;
    }

    public MyCatCafe(double balance) {
        this.balance = balance;
        this.cats = new ArrayList<Cat>();
        this.customers = new ArrayList<Customer>();
    }

    public MyCatCafe(double balance, ArrayList<Cat> cats, ArrayList<Customer> customers) {
        this.balance = balance;
        this.cats = cats;
        this.customers = customers;
    }

    @Override
    public void purchase(Cat cat) {
        double money = balance - cat.getPrice();
        if(money < 0){
            throw new InsufficientBalanceException("购买"+cat.getName()+"失败，还差"+Double.toString(abs(money))+"元");
        }else{
            balance = money;
            cats.add(cat);
            System.out.println("购买成功,库存小猫"+ cats.size()+"只,余额："+balance+"元。");
        }
    }

    @Override
    public void treat(Customer customer) {
        if(cats.isEmpty()){
            throw new CatNotFoundException("很抱歉哦，现在本店无猫可rua。。。");
        }else{
            customers.add(customer);
            income += 15 * customer.getRua();
            Random r = new Random();
            for (int i=0;i < customer.getRua();i++){
                balance += 15;
                int temp = r.nextInt(cats.size());
                System.out.println("rua猫的顾客："+customer.getName());
                System.out.print(cats.get(temp));
                System.out.println("本店余额:"+balance);
            }
        }
    }

    @Override
    public void close() {
        System.out.println();
        System.out.println("日期"+today);
        System.out.println("一天的利润为"+income+"元,以下是今天的顾客信息：");
        System.out.println();
        for (Customer cus:customers) {
            if(cus.getArrTime().isEqual(today)){
                System.out.println(cus);
            }
        }
        System.out.println();
        income = 0;
    }
}
