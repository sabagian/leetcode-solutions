import java.lang.Math;
import java.lang.Long;
import java.lang.Double;
public class Solution {
    public static int divide (int dividend, int divisor){
        long index=0;
        long acc=0;
        long dividend_abs=Math.abs(dividend);
        long divisor_abs=Math.abs(divisor);
        if(dividend_abs<0){
            dividend_abs=-dividend_abs;
        }
        if(divisor_abs<0){
            divisor_abs=-divisor_abs;
        }
        for(;dividend_abs>=acc+divisor_abs;acc=acc+divisor_abs){
            index++;
        }
    
        if((dividend<0 && divisor>0) || (dividend>0 && divisor<0)){
            index = -index; 
        }
        if(index>Math.pow(2, 31)-1){
            Double result=new Double(Math.pow(2, 31)-1);
            return result.intValue(); 
        }else if(index<-Math.pow(2, 31)){
            Double result=new Double(-Math.pow(2, 31));
            return result.intValue();
        }
        return ((int)index);

    }
}
