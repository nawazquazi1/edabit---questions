import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Arryas_question {

    public static int arrayOfMultiples(int num, int length) {
//        int [] c  = new int[0];
        for (int i = 1; i <= length; i++) {
            System.out.print(num * i + " ");

        }
        return num;
    }

    public static int[] transform(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i]--;
            } else {
                arr[i]++;
            }
        }
        return arr;
    }

    public static HashMap<String, Integer> multipal(String str) {
        HashMap<String, Integer> set = new HashMap<>();
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            String key = String.valueOf(arr[i]);
            if (set.containsKey(key)) {
                set.put(key, set.get(key) + 1);
            } else {
                set.put(key, 1);
            }
        }
        return set;
    }

    public static String str(String str) {
        char[] arr = str.toCharArray();
        int counter = 1;
        char chr = arr[0];
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == chr) {
                counter++;
            } else {
                result.append(counter + String.valueOf(chr));
                chr = arr[i];
                counter = 1;
            }
        }
        result.append(counter + String.valueOf(chr));
        return result.toString();
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n - 1, p1 = m - 1, p2 = n - 1;
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[last--] = nums1[p1--];
            } else {
                nums1[last--] = nums2[p2--];
            }

        }
    }

    static int[] sort(int[] arr) {
        int[] nim = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] > arr[j]) {
                    nim[i] = arr[i];
                    arr[i] = arr[j];
                    arr[j] = nim[i];
                }
            }
            System.out.println(arr[i]);
        }
        return nim;
    }

    public static void Merge(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si+(ei - si) / 2;
        System.out.println(mid);
        Merge(arr, si, mid);
        Merge(arr, mid + 1, ei);
    }


    public static void main(String[] args) {
        //        System.out.println(transform(new int[]{1,2,3,4,
//        System.out.println(Arrays.toString(Arryas_question.sort(new int[]{5, 3, 2, 1, 4, 6, 7, 8, 3, 9, 2})));
        int[]arr={1,2,3,2,5,47,57,8,76,4,457};
        int n=arr.length;
        Merge(arr,0,n-1);

        System.out.println(Arryas_question.str("aaabbaaaabbbccczpeeezzzzppppplaabbbb"));


//        arrayOfMultiples(7,5);

//        float[] arr = {1.43f, 45.4f, 45.6f, 55.5f, 67.6f};
//        float sum = 0;
//        for (float i : arr) {
//            sum = sum + i;
//        }
//        System.out.println(sum);

//        float[] arry = {12.3f, 34.2f, 45.4f, 55.4f, 11, 6f};
//        float num = 11;
////        boolean arryq = false;
//        boolean arryq = false;
//        for (float el : arry) {
//            if (el == num) {
//                arryq = true;
//                break;
//            }
//        }
//        if (arryq) {
//            System.out.println("The value is present in the array");
//        } else {
//            System.out.println("The value is not present in the array");
//        }

//        int[] arr = new int[5];
//        arr[0] = 2;
//        arr[1] = 332;
//        arr[2] = 242;
//        arr[3] = 23;
//        arr[4] = 32;
//        for (int e = 0; e < arr.length; e++) {
//            arr[e] = e;
////            System.out.println(e);
//        }

//        int [] a=new int[5];
//        int [] c=new int[5];
//        int [] d=new int[5];
//        int num=5;
//        System.out.println(" values in arrays a : " );
//        for (int i=0;i<5;i++){
//            a[i]=i;
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        System.out.println(" values in arrays b : " );
//        for (int i=0;i<c.length;i++){
//            c[i]=num;
//            ++num;
//            System.out.print(c[i]+" ");
//        }
//        System.out.println();
//        System.out.println("values of a + b ");
//        for (int i=0;i<5;i++) {
//            d[i]=a[i]+c[i];
//            System.out.print(d[i]+" ");
//        }
//
//        int[][] a = new int[3][3];
//        int num = 0;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                a[i][j] = num;
//                ++num;
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println("  ");
//
//        }
    }
}
