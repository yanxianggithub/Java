package sy3;

public class NopositiveException extends Exception{
    String message;
    NopositiveException(int m,int n){
        message="提供的数值m:"+m+"或者n:"+n+"是小于0的数";
    }
    public String getMessage() {
        return message;
    }
}
