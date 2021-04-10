package sy3;

public class Sum {
    public void addContinue(int n) throws ArgumentException{
        int s=0;
        if(n<0) throw new ArgumentException(n);
        for(int i=0;i<=n;i++) {
            s=s+i;
        }
        System.out.println("1+2+……+"+n+"="+s);
    }
}
