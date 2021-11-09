package text1;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author xyj
 * @create 2021-11-08 12:50
 */
public class Customer {
    private String name;
    private int rua;
    private LocalDate arrTime;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", rua=" + rua +
                ", arrTime=" + arrTime +
                '}';
    }
}
