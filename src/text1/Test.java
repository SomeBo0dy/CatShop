package text1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;


public class Test {
    public static void main(String[] args) {
        MyCatCafe cafe = new MyCatCafe(2000);//创业基金；

        BlackCat blackCat01 = new BlackCat("小黑1号",3,"母滴");
        BlackCat blackCat02 = new BlackCat("小黑2号",5,"公滴");
        BlackCat blackCat03 = new BlackCat("小黑3号",1,"母滴");
        OrangeCat orangeCat01 = new OrangeCat("小橘1号",2,"公滴",true);
        OrangeCat orangeCat02 = new OrangeCat("小橘2号",8,"公滴",true);
        OrangeCat orangeCat03 = new OrangeCat("小橘3号",4,"母滴",true);

        Customer customer01 = new Customer("我爱橘猫",5,LocalDate.of(2021,11,11));
        Customer customer02 = new Customer("我也爱橘猫",6,LocalDate.of(2021,11,11));
        Customer customer03 = new Customer("我超爱橘猫",4,LocalDate.of(2021,11,12));
        Customer customer04 = new Customer("我爱黑猫",5,LocalDate.of(2021,11,12));
        Customer customer05 = new Customer("我也爱黑猫",10,LocalDate.of(2021,11,12));
        Customer customer06 = new Customer("我超爱黑猫",4,LocalDate.of(2021,11,13));
        Customer customer07 = new Customer("我爱黑橘猫",2,LocalDate.of(2021,11,13));
        System.out.println("新的一天！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
        cafe.setToday(LocalDate.of(2021,11,11));
        try{
            cafe.treat(customer01);
        }catch(CatNotFoundException c){
            System.out.println(c.getMessage());
        }
        for (BlackCat blackCat : Arrays.asList(blackCat01, blackCat02, blackCat03)) {
            try{
                cafe.purchase(blackCat);
            }catch(InsufficientBalanceException i){
                System.out.println(i.getMessage());
            }
        }
        for (OrangeCat orangeCat : Arrays.asList(orangeCat01, orangeCat02, orangeCat03)) {
            try{
                cafe.purchase(orangeCat);
            }catch(InsufficientBalanceException i){
                System.out.println(i.getMessage());
            }
        }
        for (OrangeCat orangeCat : Arrays.asList(orangeCat01, orangeCat02, orangeCat03)) {
            try{
                cafe.purchase(orangeCat);
            }catch(InsufficientBalanceException i){
                System.out.println(i.getMessage());
            }
        }
        for (Customer customer : Arrays.asList(customer01, customer02)) {
            try {
                cafe.treat(customer);
            }catch (InsufficientBalanceException i){
                System.out.println(i.getMessage());
            }
        }
        cafe.close();
        System.out.println("新的一天！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
        cafe.setToday(LocalDate.of(2021,11,12));
        for (Customer customer : Arrays.asList(customer03, customer04,customer05)) {
            try {
                cafe.treat(customer);
            }catch (InsufficientBalanceException i){
                System.out.println(i.getMessage());
            }
        }
        cafe.close();
        System.out.println("新的一天！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
        cafe.setToday(LocalDate.of(2021,11,13));
        for (Customer customer : Arrays.asList(customer06, customer07)) {
            try {
                cafe.treat(customer);
            }catch (InsufficientBalanceException i){
                System.out.println(i.getMessage());
            }
        }
        cafe.close();
        System.out.println("以下是这三天的所有顾客名单：");
        ArrayList<Customer> customers =  cafe.getCustomers();
        for (Customer cus:customers) {
            System.out.println(cus);
        }
    }

}
