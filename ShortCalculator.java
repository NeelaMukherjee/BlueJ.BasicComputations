 
import java.util.Scanner;

public class ShortCalculator {
    
    
    public short unsignedSum (short input1, short input2) {
        
        short  sum= (short)(input1+input2);
        return sum;
        
    }
    
    public short unsignedDiff (short input1, short input2) {
        
        short diff=(short)(input1-input2);
        return diff;
        
    }
    
    public short unsignedProduct (short input1, short input2) {
        
        short product=(short)(input1*input2);
        return product;
        
    }
    
    public short unsignedQuotient (short input1, short input2) {
        
        short quotient= (short)(input1/input2);
        return quotient;
        
    }
    
    public short unsignedRemainder (short input1, short input2) {
        
        short remainder=(short)(input1%input2);
        return remainder;
        
    }



public static void main(String [] args){
   Scanner scanner=new Scanner (System.in);
        System.out.println("Please enter a number between 0 and 65535");
        short input1 = (short)scanner.nextInt(); 
       System.out.println("Please enter another number between 0 and 65535");
        short input2 = (short)scanner.nextInt(); 
       ShortCalculator s =new ShortCalculator();
        
        System.out.println("The Sum is "+ s.unsignedSum(input1,input2));
        System.out.println("The Difference is "+ s.unsignedDiff(input1,input2));
        System.out.println("The Product is "+ s.unsignedProduct(input1,input2));
        System.out.println("The Quotient is "+ s.unsignedQuotient(input1, input2));
        System.out.println("The Remainder is "+ s.unsignedRemainder(input1, input2));
    } 
}
