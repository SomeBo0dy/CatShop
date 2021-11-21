package text1;


public abstract class Cat {
    protected String name;
    protected int age;
    protected String gender;
    protected double price;

    public Cat(String name, int age, String gender, double price) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public abstract String toString();
}
