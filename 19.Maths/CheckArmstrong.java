public class CheckArmstrong{


    public static boolean cheackArmstrong(int n ){
        
        
        int k = 0;
		int copy = n;
		while(copy > 0){
			k++;
			copy /= 10;
		}

		copy = n;

		int arm = 0;
		while(copy > 0){
			arm += Math.pow((copy%10),k);
			copy /= 10;

		}

        return n == arm;
    }



    public static void main(String[] args) {


        System.out.println(cheackArmstrong(1));
        System.out.println(cheackArmstrong(1634));
        
    }
}