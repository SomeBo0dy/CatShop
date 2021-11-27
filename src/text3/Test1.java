package text3;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入邮箱号(输入q停止)：");
        while(scanner.hasNext()) {
            String re = scanner.next();
            if(re.equals("q")){
                break;
            }
            System.out.println(regex(re));
            System.out.print("输入邮箱号(输入q停止)：");
        }
    }
    static boolean regex(String item){
        String re = "^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$";
        return item.matches(re);
    }
}

