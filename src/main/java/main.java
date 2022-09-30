import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //선택정렬
        selectionSort();

        //버블정렬
        bubbleSort();
        
        //삽입정렬
        insertSort();

    }

    private static void insertSort() {
        /*
         - 삽입정렬
         - 정렬이 모두 되어있다는 가정하에 시간복잡도는 O(n)
         - 기본적인 삽입정렬은 O(n^2)이다
         */

        int n=0;
        int[] array = new int[101];
        int j=0, temp=0;
        for (int i = 0; i < 100; i++) {
            array[i] = i;
        }

        for (int i = 0; i < n; i++) {
            j = i;
            while (j > 0 && array[j - 1] > array[j]) {
                temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(array[i]);
        }
    }

    private static void bubbleSort() {
        /*
        - 버블정렬
         - 옆에있는 값과 비교하여 더 작은 값을 반복적으로 앞으로 보내는 정렬방법
         - 시간복잡도는 O(n^2)이다.
         */
        int i , j, temp=0;
        int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        for(i =0 ; i < 10; i++){
            for (j = 0; j < 9 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }

    private static void selectionSort() {
        /*
        - 선택정렬
          - 가장 작은것을 선택해서 제일 앞으로 보내는 알고리즘
          - 선택정렬의 시간복잡도는 O(N^2) 이다.
        */
        int i , j , min, index=0, temp;
        int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        for (i = 0; i < 10; i++) {
            min = 9999;
            for (j = i; j < 10; j++) {
                if (min > array[j]) {
                    min = array[j];
                    index = j;
                }
            }
            temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }

        System.out.println(Arrays.toString(array));

    }
}
