package text1;

import java.time.LocalDate;
import java.time.LocalTime;


public class Customer {
    private String name;
    private int rua;
    private LocalDate arrTime;

    public Customer(String name, int rua, LocalDate arrTime) {
        this.name = name;
        this.rua = rua;
        this.arrTime = arrTime;
    }

    int getRua(){
        return rua;
    }

    public String getName() {
        return name;
    }

    public LocalDate getArrTime() {
        return arrTime;
    }

    @Override
    public String toString() {
        return "Customer：" + '\n'
                +"姓名：" + name + '\n'
                + "想要rua猫的次数：" + rua + '\n'
                + "到达时间：" + arrTime +'\n';
    }
}
