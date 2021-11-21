package text1;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class OrangeCat extends Cat {
    private boolean isFat;

    public OrangeCat(String name, int age, String gender, boolean isFat) {
        super(name, age, gender, 200);
        this.isFat = isFat;
    }

    @Override
    public String toString() {
        return "喵名："+name+"\n"
                +"喵龄："+age+"\n"
                +"性别：" +gender+"\n"
                +"肥喵属性："+isFat+"\n"
                +"价格："+price+"\n";
    }

}

