package goit.javaOnline.homeWork5;

public class Runner {

    private static int[] array = {3,5,4,12,3,-6,0,0,23,5};

    public static void main(String[] args) {

        ClassArraySearch cas = new ClassArraySearch();

        cas.searchMinOfArray(array);
        cas.searchMaxOfArray(array);

       ClassSortingBubble csb = new ClassSortingBubble();

        System.out.println("Sort array: ");

        csb.sortBubble(array);
    }
}
