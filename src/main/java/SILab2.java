import static java.lang.Math.*;

public class SILab2 {
    public static String function(int num){
        if(Math.ceil(Math.sqrt(num)) == Math.floor(Math.sqrt(num))){
            return "Perfect Square";
        }
        else{
            return "Not Perfect Square";
        }
    }
}
