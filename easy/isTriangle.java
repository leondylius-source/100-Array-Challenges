package easy;

public class isTriangle{
    
    public static boolean checker(int x1, int x2, int x3, int y1, int y2, int y3) {
       
        if((y2-y1)*(x3-x1) == (y3-y1)*(x2-x1)){
            return false;
        }

        return true;
    }
}
