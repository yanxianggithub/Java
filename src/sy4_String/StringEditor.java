package sy4_String;
import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class StringEditor {

    public static void main(String[] args) {

        boolean flag=true;
        int choice;

        Scanner in=new Scanner(System.in);

        while(flag) {
            //调用自定义的showDate()方法输出当前时间
            showDate();


            System.out.println("请输入所要进行的操作（输入操作序号：）");
            System.out.println("-".repeat(40));
            System.out.println("0.退出");
            System.out.println("1.字符串比较");
            System.out.println("2.字符串搜索");
            System.out.println("3.字符串替换");
            System.out.println("4.字符串截取");
            System.out.println("5.字符串反转");
            System.out.println("6.字符串追加");
            System.out.println("-".repeat(40));

            choice=in.nextInt();
            switch(choice) {
                case 0://0.退出
                {
                    flag=false;
                    break;
                }
                case 1://1.字符串比较
                {
                    String str1,str2;
                    Scanner sc=new Scanner(System.in);
                    System.out.println("请输入一个字符串：");
                    str1=sc.nextLine();
                    System.out.println("请输入与之比较的字符串：");
                    str2=sc.nextLine();
                    //调用自定义的StringCompare(str1,str2)进行比较
                    StringCompare(str1,str2);
                    break;
                }
                case 2: //2.字符串搜索
                {
                    String str1,str2;
                    Scanner sc=new Scanner(System.in);
                    System.out.println("请输入一个字符串：");
                    str1=sc.nextLine();
                    System.out.println("请输入要搜索的字符串：");
                    str2=sc.nextLine();
                    //调用自定的StringSearch(str1,str2)方法进行搜索
                    StringSearch(str1,str2);
                    break;
                }
                case 3: //3.字符串替换
                {
                    String str,oldstr,newstr;
                    Scanner sc=new Scanner(System.in);
                    System.out.println("请输入一个需要处理的字符串：");
                    str=sc.nextLine();
                    System.out.println("请输入被替换的字符串：");
                    oldstr=sc.nextLine();
                    System.out.println("请输入替换的字符串");
                    newstr=sc.nextLine();
                    //调用自定义的StringReplace(str,oldstr,newstr)方法，用newstr字符（串）替换str字符串中的oldstr字符
                    StringReplace(str,oldstr,newstr);
                    break;
                }
                case 4: //4.字符串截取
                {
                    String str;
                    int begin,end;
                    Scanner sc=new Scanner(System.in);
                    System.out.println("请输入一个需要处理的字符串：");
                    str=sc.nextLine();
                    System.out.println("请输入截取字符串的开始索引（从0开始）：");
                    begin=sc.nextInt();
                    System.out.println("请输入截取字符串的结束索引");
                    end=sc.nextInt();
                    //调用自定义的StringSub(str,begin,end)方法，从begin（包括begin）开始处截取到end（包括end）结束处的字符
                    StringSub(str,begin,end);
                    break;
                }
                case 5: //5.字符串反转
                {
                    String str;
                    Scanner sc=new Scanner(System.in);
                    System.out.println("请输入一个需要反序显示的字符串：");
                    str=sc.nextLine();
                    //调用自定义的StringReverse(str)方法，将str字符串反序显示
                    StringReverse(str);
                    break;
                }
                case 6: //6.字符串追加
                {
                    String str,tempStr;
                    Scanner sc=new Scanner(System.in);
                    System.out.println("请输入一个字符串：");
                    str=sc.nextLine();
                    System.out.println("请输入要追加的字符串：");
                    tempStr=sc.nextLine();
                    //调用自定义的StringAppend(str,tempStr)方法，在str字符串后面追加tempStr字符串
                    StringAppend(str,tempStr);
                    break;
                }
                default:
                {
                    System.out.println("您没有选择任何操作");
                    break;
                }
            }
        }
    }
    //自定义的，按一定的格式显示时间的方法
    public static void showDate() {
        System.out.println("-".repeat(40));
        LocalDateTime today=LocalDateTime.now();//获取当前系统的日期和时间
        DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy年MM月dd日 EEEE hh:mm:ss");//时间日期格式化
        String nowTime=today.format(df);//将当前日期格式化为字符串
        System.out.println("当前时间："+nowTime);//输出
        System.out.println("-".repeat(40));
    }

    //自定义的StringCompare(str1,str2)方法，用来比较两个字符串是否相等
    public static void  StringCompare(String str1,String str2) {
        if(str1.equals(str2))
            System.out.println("两个字符串相同");
        else
            System.out.println("两个字符串不相同");
    }
    //自定义的StringSearch(str1,str2)方法，在str1	中搜索str2，找到，返回其索引值
    public static void StringSearch(String str1,String str2) {
        int i=str1.indexOf(str2);
        if(i>=0)
            System.out.println("字符串"+str2+"在字符串"+str1+"中的索引值为："+i);
        else
            System.out.println("字符串"+str1+"中没有"+str2);
    }
    public static void StringReplace(String str,String oldstr,String newstr) {
        String str1=str.replaceAll(oldstr, newstr);
        System.out.println(str1);
    }
    public static void StringSub(String str,int begin,int end) {
        String str1=str.substring(begin,end+1);
        System.out.println(str1);
    }
    public static void StringReverse(String str){
        StringBuilder str1=new StringBuilder(str);
        StringBuilder resultStr=str1.reverse();
        System.out.println(resultStr);
    }
    public static void StringAppend(String str,String tempStr){
        StringBuilder str1=new StringBuilder(str);
        StringBuilder str2=str1.append(tempStr);
        System.out.println("追加后的字符串是："+str2);
    }
}


