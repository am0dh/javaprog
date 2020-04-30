import java.util.*;

public class MainClass {

    public static void main(String[] args) {
        ArrayList < Integer > arr = new ArrayList < > ();
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        for (int i = 0; i < s.length(); i++) {
            //converting the string into ascii valued arraylist
            int asciival = s.charAt(i);
            arr.add(asciival);

        }
        //Sum
        int sum = 0;
        for (int i: arr) {
            sum += i;

        }
        System.out.println(sum);

        //Mean
        int mean = sum / arr.size();
        System.out.println(mean);

        //Median
        //first sorting an array
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);

                }

            }
        }
        //Converting ArrayList type arr into Array as it makes ooperation easier to do
        int[] array = new int[arr.size()];
        for (int p = 0; p < array.length; p++) {
            array[p] = arr.get(p);
        }

        // Finds the median of the list.  If the list has no elements, returns 0.
        // The median of an odd-length list is the middle element, and the median
        // of an even-length list is the average of the middle two elements.
        if (array.length == 0) {
            System.out.println("arraylength zero");
        }
        // no elements, just return 0
        else if (array.length % 2 == 1) {
            // odd-length, return middle element
            System.out.println(array[array.length / 2]);
        } else {
            // even-length, return average of middle two elements
            // be sure to divide by 2.0 and not by 2!
            System.out.println((array[array.length / 2] + array[(array.length / 2) - 1]) / 2.0);
        }
    }


}
