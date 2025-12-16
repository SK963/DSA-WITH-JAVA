public class LemonadeChange {

    public static boolean lemonadeChange(int[] bills) {
        int counter[] = new int[] { 0, 0, 0 };
        for (int i = 0; i < bills.length; i++) {
            int cash = bills[i];
            if (cash == 5)
                counter[0] += 1; // no need to give changes
            else if (cash == 10) {
                if (counter[0] >= 1) {
                    counter[0] -= 1; // give 1 $5 bill
                    counter[1] += 1; // add the $10 bill
                } else
                    return false;
            } else { // $20 bill

                if (counter[1] >= 1) { // return a $10 bill if exist
                    counter[1] -= 1; // reduce
                    cash -= 10;

                }

                if (counter[0] >= 1) {
                    while (cash >= 10 && counter[0] >= 1) {
                        counter[0] -= 1;
                        System.out.println(cash);
                        cash -= 5;
                    }
                    System.out.println(cash);

                    if (cash != 5)
                        return false;
                    else {
                        counter[2] += 1;

                    }

                } else
                    return false;

            }

        }

        return true;

    }

    public static boolean lemonadeChange2(int []bills){

        int fives = 0 , tens = 0;
        for(int bill : bills){
            if(bill == 5)fives++;
            if(bill ==10){
                if(fives >=1){
                    fives-- ;
                    tens++;
                }else return false;
            }
            if(bill == 20){
                if(tens >= 1 && fives >= 1){
                    tens--;
                    fives--;
                }
                else if(fives >=3)fives -= 3;
                else return false;
            }
        }

        return true;

    }


    public static void main(String[] args) {
        System.out.println(lemonadeChange2(new int[] { 5, 5, 5, 10, 20 }));
        System.out.println(lemonadeChange2(new int[] { 5, 5, 10, 10, 20 }));
        System.out.println(lemonadeChange2(new int[] { 5, 5, 5, 5, 10, 5, 10, 10, 10, 20 }));

    }

}
