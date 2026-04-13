package easy;

public class countCharOccurances {

    public static void printCounter(int[] counter){
        for(int i = 0; i < counter.length; i++){
            char currentC = (char) (i + 'a');
            System.out.println(currentC + ": " + counter[i]);
        }
    }
    
    public static int[] counter(String line){

        if(line == null || line.isBlank()){
            System.out.println("incorrect input");
            return new int[0];
        }
        int[] result = new int[26];
        String lowerLine = line.toLowerCase();
        
        loopLine:
        for (int i = 0; i < line.length(); i++){
            char currentC = lowerLine.charAt(i);
            if(currentC < 'a' || currentC > 'z'){
                continue loopLine;
            }
            result[currentC - 'a']++;
        }
        return result;
    }
}
