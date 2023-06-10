public class LogicalOperator {
    public static void main (String[] args ){
        int a=20;
        int b=10;
        int c=30;

        boolean result= a>b && a<c;
        System.out.println(result);//true
        System.out.println(b<=c);//true
        System.out.println(a<b && !(a <= c));//false
        System.out.println(a<b || b<c   );//true
        int a1=10;
        int b2=10;
        int c3=30;
        System.out.println(a1==b2 || a>b);//true


    }
}
