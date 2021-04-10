package sy3;

public class ComputerTest {
    public static void main(String[] args) {
        Computer c=new Computer();
        try {
            c.getMaxCommonDivisor(20, 12);
            c.getMaxCommonDivisor(20,-12);
        }
        catch(NopositiveException e) {
            System.out.println(e.getMessage());
        }
    }
}
