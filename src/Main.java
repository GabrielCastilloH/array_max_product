public class Main {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 5, 18, -20};
        int product;
        int max = myArray[0];
        int max1 = myArray[0];


        for (int k : myArray) {
            if (k > max) {
                max = k;
            }
        }

        for (int j : myArray) {
            if (j != max) {
                if (j > max1) {
                    max1 = j;
                }
            }
        }


        product = max * max1;

        System.out.println("The highest product of the array is: " + product +
                "\nWhich is the product of (" + max + ", " + max1 + ").");
    }

}


