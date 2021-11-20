package text3;

import java.util.Scanner;

/**
 文档里没给格式，就按这个写了
 1、网易出品的【xxxxxxxx@163.com】、【xxxxxxxx@126.com】格式邮箱。

 2、腾讯出品的【xxxxxxxx@qq.com】格式邮箱。

 3、谷歌出品的【xxxxxxxx@gmail.com】格式邮箱。

 4、新浪出品的【xxxxxxxx@sina.com】格式邮箱。

 5、中国移动出品的【xxxxxxxx@139.com】格式邮箱。
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String re = scanner.next();
            System.out.println(regex(re));
        }
    }
    static boolean regex(String item){
        String re = "^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$";
        return item.matches(re);
    }
}

