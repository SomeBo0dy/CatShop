package text1;

/**
 * @author xyj
 * @create 2021-11-08 12:49
 */
public class OrangeCat extends Cat {
    private boolean isFat;

    public OrangeCat(String name, int age, String gender, boolean isFat) {
        super(name, age, gender, 200);
        this.isFat = isFat;
    }

    @Override
    public String toString() {
        return null;
    }
}
