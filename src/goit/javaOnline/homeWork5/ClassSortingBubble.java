package goit.javaOnline.homeWork5;

import java.util.Arrays;

public class ClassSortingBubble {

    private int temp;

    public void sortBubble(int[] array){

        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if (array[i]>=array[j]){
                    temp = array [i];
                    array[i] = array[j];
                     array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
