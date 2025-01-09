public class Operators {
    public static void main(String[] args){
//comparison operators
        int a = 10;
        int b = 10;
        int c = 30;
        System.out.println(a==b);
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a!=b);
        System.out.println(a<=b);
        System.out.println(a>=b);

//        Assignment operators
        System.out.println(a+=b);
        System.out.println(a-=b);
        System.out.println(b-=a);
        System.out.println(a*=b);

//logical operators
        System.out.println(a==b && a==c);
        System.out.println(a==b || a==c);
        System.out.println(!(a==b || a==c));


    }
}


