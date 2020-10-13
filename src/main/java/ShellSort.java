import java.util.Arrays;

public class ShellSort {

    public static void shellSort(int[] arr) {
        int len = arr.length;
        int temp = 0;
        int z = 1;

        while(z < len/3) {
            z = z * 3+1;
        }


        for(int gap = z;gap > 0;gap = (int)Math.floor(gap/3)) {
            for(int i = gap;i<len;i++) {
                temp = arr[i];
                for(int j = i-gap;j>0 && arr[j] > temp;j-=gap) {
                    arr[j+gap] = arr[j];
                }
                arr[i-gap] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] i = new int[]{1,3,5,2,4,7,9,6,8};
        shellSort(i);
        System.out.println(Arrays.toString(i));
    }
}
