public class Prog4 {
    public static void main(String[] args) {
        /*
        A function to calculate the sum and cast to int then to also found rounded value
         */
        float fNum = 1.27f;
        float sNum = 3.881f;
        float tNum = 9.6f;

        float sum = fNum + sNum + tNum;

        int sumIntCasted = (int) sum;
        int sumRounded = Math.round(sum);

        System.out.println("Sum \"Casted to Int\" --> " + sumIntCasted);
        System.out.println("Sum \"Rounded to nearest Int\" --> " + sumRounded);
    }
}