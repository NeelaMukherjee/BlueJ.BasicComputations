 
import java.util.Scanner;

public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
        return angle % 360;
            
        
        
        
        //return i;
    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
        return Math.floorMod(integer,360);
    }

    public static void main(String[] args){
      Scanner scanner=new Scanner (System.in);
       System.out.println("Please enter an angle");  
      int input = scanner.nextInt();
        
      NormalizeAngle a =new NormalizeAngle(); 
      System.out.println("Entered angle is normalized to "+ a.normalizeValueUsingModulo(input));
 
      
        

    }
}
