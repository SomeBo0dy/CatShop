package notHomework;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {

    public static void main(String[] args) throws Exception {
        Student stdClass = new Student("3",1,2);
        // 获取public字段"score":
        //System.out.println(stdClass.getField("score"));
        // 获取继承的public字段"name":
        //System.out.println(stdClass.getField("name"));
        // 获取private字段"grade":
        //System.out.println(stdClass.getDeclaredField("grade"));
        Class c = stdClass.getClass();
        Field f=c.getDeclaredField("grade");
        f.setAccessible(true);
        f.set(stdClass,12);
        System.out.println(stdClass);
        Method m=String.class.getMethod("substring",int.class);
        String name = "haoxiangyaogenvpengyou";
        String nvpengyou = (String) m.invoke(name,13);
        System.out.println(nvpengyou);
    }


}
class Student extends Person {
    public int score;
    private int grade;

    public Student(String name, int score, int grade) {
        super(name);
        this.score = score;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                ", grade=" + grade +
                '}';
    }
}

class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }
}
