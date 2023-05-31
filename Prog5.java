public class Prog5 {
    public static int[] combine(int[] a, int[] b) {
        /*
        This function will combine both array a and b into one combined array (combinedArr)
         */
        int lenA = a.length;
        int lenB = b.length;

        int[] combinedArr = new int[lenA + lenB];

        // Copy values from array a to array combinedArr
        for (int i = 0; i < lenA; i++) {
            combinedArr[i] = a[i];
        }

        // Copy values from array b to array combinedArr
        for (int i = 0; i < lenB; i++) {
            combinedArr[lenA + i] = b[i];
        }

        return combinedArr;
    }

    public static void main(String[] args) {
        //Define int arrays
        int[] a = {5, 6, -4, 3, 1};
        int[] b = {3, 8, 9, 11};

        /**Calling combine function
         * @param a,b
         * @return combined arrays
          */
        int[] combinedArr = combine(a, b);

        //Printing combined array
        System.out.print("Output arrays: ");
        for (int val : combinedArr) {
            System.out.print(val + " ");
        }
    }

}