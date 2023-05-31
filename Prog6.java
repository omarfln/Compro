public class Prog6 {

    public static int min(int[] arrayOfInts) {
        /**
         * Function to return the minimum value in an array
         * @return min value
         * @param arrayOfInts integer array.
         *
         */

        //When passing empty array, throw an exception that array is empty and exit
        if (arrayOfInts.length == 0) {
            throw new IllegalArgumentException("Provided array is empty, please provide a valid array");
        }

        int minVal = arrayOfInts[0];

        for (int i = 1; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] < minVal) {
                minVal = arrayOfInts[i];
            }
        }

        return minVal;
    }

    public static void main(String[] args) {
        /*
        Main function that will call the function which will find the minimum value
         */
        int[] arrayOfInts = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        int minVal = min(arrayOfInts);
        System.out.println("The minimum val is: " + minVal);

    }

}