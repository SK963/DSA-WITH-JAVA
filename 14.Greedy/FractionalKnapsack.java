import java.util.*;

public class FractionalKnapsack {

    static class item {
        Integer val;
        Integer wt;
        Double valpwt;

        item(int val, int wt) {
            this.val = val;
            this.wt = wt;
            this.valpwt = (double) val / wt;
        }

        public String toString() {
            return "item : valpwt : " + this.valpwt + " , val : " + this.val + " , this.wt : " + this.wt +"\n";
        }

        // Static Comparator for Sorting in Descending Order
        static class ValuePerWeightComparator implements Comparator<item> {
            @Override
            public int compare(item i1, item i2) {
                return Double.compare(i2.valpwt, i1.valpwt); // Sorting in descending order
            }
        }
    }

    static double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
        List<item> items = new ArrayList<>();

        // Creating item objects
        for (int i = 0; i < val.size(); i++) {
            items.add(new item(val.get(i), wt.get(i)));
        }

        // Sorting items based on value/weight ratio in descending order
        Collections.sort(items, new item.ValuePerWeightComparator());
        // System.out.println(items.toString()); 
        int remcap = capacity;
        double totalvalue = 0;

        for (int i = 0; i < items.size() && remcap > 0; i++) {
            item curr = items.get(i);
            int weight = curr.wt;
            int value = curr.val;

            if (remcap >=weight) {
                totalvalue += value;
                remcap -= weight;
            } else {
                totalvalue += curr.valpwt * remcap;
                remcap = 0;
            }

        }

        return Double.parseDouble(String.format("%.6f", totalvalue));

    }

    public static void main(String[] args) {
        System.out.println(fractionalKnapsack(Arrays.asList(60, 100, 120), Arrays.asList(10, 20, 30), 50));// 240.000000
        System.out.println(fractionalKnapsack(Arrays.asList(60, 100), Arrays.asList(10, 20), 50));// 160.000000
        System.out.println(fractionalKnapsack(Arrays.asList(10, 20, 30), Arrays.asList(5, 10, 15), 100));// 60.000000
        System.out.println(fractionalKnapsack(Arrays.asList(8, 2, 10, 1, 9, 7, 2, 6, 4, 9),
                Arrays.asList(10, 1, 7, 7, 5, 1, 8, 6, 8, 7), 21));
    }
}
