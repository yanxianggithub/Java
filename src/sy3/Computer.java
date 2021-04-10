package sy3;

public class Computer {
    public void getMaxCommonDivisor(int m,int n)throws NopositiveException{
        if(m<0 || n<0) throw new NopositiveException(m,n);
        int r=m%n;
        while(r!=0) {
            m=n;
            n=r;
            r=m%n;
        }
        System.out.println(n);
    }
}
