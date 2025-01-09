import java.util.Scanner;
public class InputScanner{
    public static void main(String[] args){
        System.out.println("Please enter your company name");
        Scanner scan = new Scanner(System.in);
        String companyname = scan.nextLine();
        System.out.println("Your comapany name is  ");
        System.out.println(companyname);

    }
}
