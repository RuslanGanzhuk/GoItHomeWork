package goit.javaOnline.homeWork5;

public class ClassArraySearch {


    public void searchMinOfArray(int[] array) {

         int minOfArray = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minOfArray) {
                minOfArray = array[i];
            }
        }
        System.out.println("Minimal element of array: " + minOfArray);
    }

    public void searchMaxOfArray(int[] array) {

        int maxOfArray = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxOfArray) {
                maxOfArray = array[i];
            }
        }
        System.out.println("Maximal element of array: " + maxOfArray);
    }
}
