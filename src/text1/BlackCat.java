package text1;


public class BlackCat extends Cat{
    public BlackCat(String name, int age, String gender) {
        super(name, age, gender, 350);
    }

    @Override
    public String toString() {
        return "喵名："+name+"\n"
                +"喵龄："+age+"\n"
                +"性别："+gender+ "\n"
                +"价格："+price+"\n";
    }
}
