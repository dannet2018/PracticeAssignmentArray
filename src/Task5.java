public class Task5 {



        public static void main(String[] args) {
            int[] myArray = new int[5];

            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = i;
            }


            for (int value : myArray) {
                System.out.println(value);
            }
        }
    }


