
public class Prog1 {

    public static void main(String[] args) {
        /*
        A function to get random numbers x and y, then to calculate PI to power x, and y to the power PI
         */

        //Generate random numbers
        int x = RandomNumbers.getRandomInt(1,9);
        int y = RandomNumbers.getRandomInt(3,14);

        //Generate PI to the power x and y
        double xPower = Math.pow(Math.PI, x);
        double yPower = Math.pow(y, Math.PI);

        //Print output
        System.out.println("Random number is: " + x + " and PI to the power "+ x + " = " + xPower);
        System.out.println("Random number is: " + y + " and "+ y +  " to the power PI" + " = " + yPower);

    }

}
