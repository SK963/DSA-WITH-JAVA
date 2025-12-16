import java.util.*;

public class Basics {
    static void bitManipulation(int num, int i) {

        ArrayList<Integer> number = decimaltobinary(num);

        int index = i;
        if (index > number.size()) {
            for (int j = number.size() - 1; j < i; j++) {
                number.add(0, 0);// add it at first
            }
        }

        // get ith bit (from right)
        index = number.size() - i;
        System.out.print(number.get(index) + " ");

        // set ith bit
        if (number.get(index) == 1)
            System.out.print(num + " ");
        else {
            number.set(index, 1);
            System.out.print(binarytodecimal(number) + " ");
        }

        // clear ith bit
        if (number.get(index) == 0)
            System.out.print(num + " ");
        else {
            number.set(index, 0);
            System.out.print(binarytodecimal(number) + " ");
        }

    }

    // ---------------------------------

    // decimal -> binary
    static ArrayList<Integer> decimaltobinary(int num) {
        ArrayList<Integer> binary = new ArrayList<>();
        while (num > 0) {
            binary.add(num % 2);
            num /= 2;
        }

        Collections.reverse(binary);
        return binary;

    }

    // binary to decimal
    static int binarytodecimal(ArrayList<Integer> num) {
        int ans = 0;
        int pow = 1;

        for (int i = num.size() - 1; i >= 0; i--) {
            if (num.get(i) == 1)
                ans += pow;
            pow *= 2;

        }
        return ans;
    }

    // Bitwise opetor Use
    static boolean checkKthBit(int n, int k) {

        // using left shift operator
        return ((n & (1 << k)) != 0);
        // using right shift operator
        // return (((n >> k) & 1) == 0) ;
    }

    static int setithbit(int n, int k) {
        return (n | (1 << k));
    }

    static int clearithbit(int n, int k) {
        return (n & (~(1 << k)));
    }

    static int toggleithbit(int n, int k) {
        return (n ^ (1 << k));
    }

    static int removelastsetbit(int n) {
        return (n & (n - 1));
    }

    static boolean isEven(int n) {

        return (n & 1) >= 1 ? false : true;
    }

    static boolean checknumberispowerof2(int n) {
        // 16 : 10000 : true
        return (n & (n - 1)) == 0;

    }

    static int countsetbits(int n) {
        int count = 0;
        while (n > 0) {
            n = (n & (n - 1));
            count++;

        }
        return count;
    }

    // Set the rightmost unset bit

    public static void main(String[] args) {

        System.out.println(decimaltobinary(70));
        bitManipulation(70, 3);// 1 70 66

        System.out.println();
        System.out.println(decimaltobinary(446733544));
        bitManipulation(446733544, 30);
        // 0 983604456 446733544

        System.out.println();
        // check kth bit
        System.out.println("Check kth bit");
        System.out.println(checkKthBit(13, 2));// 1101 (false)
        System.out.println(checkKthBit(13, 1));// 1101 (true)
        System.out.println(checkKthBit(27818, 1));//111000010000010
        // (true)

        // set kth bit
        System.out.println("Set kth bit : ");
        System.out.println(setithbit(9, 2));// 13

        // clear kth bt
        System.out.println(clearithbit(13, 2));// 9

        // toggle kth bit
        System.out.println(toggleithbit(13, 1));// 15

        // remove lst set bit
        System.out.println("Remove Last set Bit");
        System.out.println(removelastsetbit(16));// 0

        // even odd
        System.out.println("Even or Odd : ");
        System.out.println(isEven(4));
        System.out.println(isEven(5));

        // check number is power of 2
        System.out.println("check number is power of 2 ");
        System.out.println(checknumberispowerof2(16)); // true
        System.out.println(checknumberispowerof2(15));// false

        System.out.println("Count of Set bits : ");
        // count number of set bits in the number
        System.out.println(countsetbits(13));// 1101

    }

}