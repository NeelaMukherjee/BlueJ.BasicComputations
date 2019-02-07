 
import java.util.Scanner;

public class IntegerPrinter {

    public String printIntegerAsBinary(int value){
        
        String binary = Integer.toBinaryString(value);
        
        return binary;
    }

    public String printIntegerAsOctal(int value){
        String Octal = Integer.toOctalString(value);
        
        return Octal;
    }

    public String printIntegerAsHexadecimal(int value){
        String hexa = Integer.toHexString(value);
        
        return hexa;
    }

    public static void main(String[] args){
        
        Scanner scanner=new Scanner (System.in);
        System.out.println("Please enter an integer");
        int input = scanner.nextInt();
        
       IntegerPrinter p =new IntegerPrinter();
        
        System.out.println("Entered interger is printed as Binary "+ p.printIntegerAsBinary(input));
        System.out.println("Entered interger is printed an Octal "+ p.printIntegerAsOctal(input));
        System.out.println("Entered interger is printed as Hexadecimal "+ p.printIntegerAsHexadecimal(input));

    }
}
