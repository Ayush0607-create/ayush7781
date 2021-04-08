import java.util.Scanner;
public class Eleventh {
    public static void main(String[] args) 
    {
    	System.out.print("Enter the String: ");
    	Scanner S=new Scanner(System.in);
    	String str=S.nextLine();
        boolean n= true;
        n = str.matches("-?\\d+(\\.\\d+)?");
        if(n)
            System.out.println(str + " is a Number");
        else
            System.out.println(str + " is not a Number");
    }
}