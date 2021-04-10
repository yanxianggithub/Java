package sy3;

public class ArgumentException extends Exception{
    private int n;
    public ArgumentException(int n) {
        this.n=n;
    }
    public int getN() {
        return n;
    }
}