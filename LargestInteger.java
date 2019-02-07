 
import java.util.Scanner;

public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        int max=integers [0];
        
        int len= integers.length;
        
        for (int i= 1; i<len;i++){
            
            if (integers[i]>max){
                
                max=integers [i];
            }
            
            
            
        }
        
        return max;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        int max=integers [0];
        
        int len= integers.length;
        
        for (int i= 1; i<len;i++){
            
             max=Math.max (integers[i],max);
                
                //max=integers [i];
            }
            
            
            
        
        
        return max;
    }
}
