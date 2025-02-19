public class StringToInteger{

    public static int myAtoi(String s){
        String result = s.trim();//remove whitespaces
        int sign = 1;
        if(result.charAt(0) == '-')sign = -1;
        
        
        int start =0;
        for(int i = 0 ; i< result.length(); i++){
            if(Character.isDigit(result.charAt(i))){
                start = i;
                break;
            }
            
        }

        int end = start;
        for(int i = end ; i< result.length() ; i++){
            if(!Character.isDigit(result.charAt(i))){
                end = i;
                break;
            }
            end = i+1;
        }
        // System.out.println("start : "+ start +" end : "+ end);

        result = result.substring(start, end);
        // System.out.println(result);
        return  Integer.parseInt(result)*sign;
        


    }

    public static void main(String[] args) {
        System.out.println(myAtoi("42")); //42
        System.out.println(myAtoi(" -042")); //-42
        System.out.println(myAtoi("1337c0d3")); //1337
        System.out.println(myAtoi("0-1")); //0
        
    }
    
}
