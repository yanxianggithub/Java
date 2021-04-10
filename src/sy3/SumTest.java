package sy3;

public class SumTest {
    public static void main(String[] args) {
        try {
            Sum sum=new Sum();
            sum.addContinue(100);
            sum.addContinue(-100);
        }
        catch(ArgumentException e) {
            System.out.println("出现异常，输入的数字："+e.getN()+"<=0");
        }
    }
}
