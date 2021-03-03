package first;

import java.util.Scanner;

public class FirstJava {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("请输入：");
        String str = in.next();
        System.out.println(str);
        in.close();
    }
}
