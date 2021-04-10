package sy3;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        System.out.println("请输入数组下标：");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        try {
            System.out.println(a[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组下标越界");
        }
    }
}




