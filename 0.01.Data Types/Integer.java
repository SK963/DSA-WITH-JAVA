public class Integer {

    public static void main(String[] args) {
        int num = 121;
        // converstion 
        // int -> string

        // String stnum = Integer.toString(num);
        // System.out.println(stnum);

        String strNum = String.valueOf(num); // strNum will be "456"
        System.out.println(strNum);


        String stNum = "" + num; // strNum will be "789"
        System.out.println(stNum);
    
    }
    
}

