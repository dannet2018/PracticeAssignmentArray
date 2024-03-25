public class Task4 {

        public static void main(String[] args) {
            int[] myArray = {10, 20, 30, 40, 50};


            System.out.println("Value at index 0: " + myArray[0]);


            System.out.println("Value at last index: " + myArray[myArray.length - 1]);


            try {
                System.out.println("Value at index equal to length: " + myArray[myArray.length]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Array index out of bounds");
            }


            try {
                myArray[5] = 60;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Array index out of bounds");
            }
        }
    }


