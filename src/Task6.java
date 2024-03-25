public class Task6 {


        public static void main(String[] args) {
            int[] myArray = new int[5];


            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = (i + 1) * 2;
            }

            // Print the array elements
            for (int value : myArray) {
                System.out.println(value);
            }
        }
    }


