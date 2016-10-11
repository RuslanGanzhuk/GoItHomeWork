package goit.javaOnline.homeWork5;

public class ClassArraySearch {

    private int[] array = {1, 6, 4, 7, 12, 5, 5, 2, 21, 0, -6};
    private int minOfArray = array[0];
    private int maxOfArray = array[0];


    public void searchMinOfArray() {

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minOfArray) {
                minOfArray = array[i];
            }
        }
        System.out.println("Minimal element of array: " + minOfArray);
    }

    public void searchMaxOfArray() {

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxOfArray) {
                maxOfArray = array[i];
            }
        }
        System.out.println("Maximal element of array: " + maxOfArray);
    }
}
