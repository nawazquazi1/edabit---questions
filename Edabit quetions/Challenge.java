import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

import static java.util.Arrays.copyOfRange;

public class Challenge {


//        System.out.println(Challenge.getFirstValue(new int[]{1, 2, 3, 4}));// 1
//        System.out.println(Challenge.getFirstValue(new int[]{1, 3, 5, 7, 9})); //1
//        System.out.println(Challenge.getFirstValue(new int[]{2, 4, 6, 8, 10}));//2
//        System.out.println(Challenge.getFirstValue(new int[]{5, 7, 11, 25, 100, 200, 350}));//5
//        System.out.println(Challenge.getFirstValue(new int[]{-5, 7, 200, 350}));//-5

//        System.out.println(Challenge.getLastItem(new int[]{1, 2, 3}));
//        System.out.println(Challenge.getLastItem(new int[]{0}));
//        System.out.println(Challenge.getLastItem(new int[]{-1,-3}));

//        System.out.println(Challenge.divisible(1));
//        System.out.println(Challenge.divisible(1000));
//        System.out.println(Challenge.divisible(100));

//        System.out.println(Challenge.calcAge(65));
//        System.out.println(Challenge.calcAge(0));
//        System.out.println(Challenge.calcAge(20));

//        System.out.println(Challenge.squaed(5));
//        System.out.println(Challenge.squaed(9));
//        System.out.println(Challenge.squaed(100));

//        System.out.println(Challenge.getArea(3,4));
//        System.out.println(Challenge.getArea(10203033,-23));
//        System.out.println(Challenge.getArea(1,5));
//        System.out.println(Challenge.getArea(424,2));

//        System.out.println(stackBoxes(512));
//        System.out.println(stackBoxes(196));
//        System.out.println(stackBoxes(27));

//        System.out.println(num(8798));

//        System.out.println(Challenge.getXP(new int[]{89, 77, 30, 4, 1}));

//        System.out.println(Challenge.monthName(3));
//        System.out.println(Challenge.monthName(412));
//        System.out.println(Challenge.monthName(6));

//

//        System.out.println(Challenge.arraySum2(new  int[]{2,7,4}));
//        System.out.println(Challenge.arraySum2(new  int[]{45,3,0}));
//        System.out.println(Challenge.arraySum2(new  int[]{-2,84,23}));

//        System.out.println(Challenge.squaresAndCubes(new  int[]{4,8}));
//        System.out.println(Challenge.squaresAndCubes(new  int[]{16,48}));
//        System.out.println(Challenge.squaresAndCubes(new  int[]{9,27}));

//        System.out.println(Challenge.indexMultiplier(new int[]{1,2,3,4,5,}));

//        System.out.println(Challenge.countCharacters(new String[]{"##############"}));
//        System.out.println(Challenge.countCharacters(new String[]{""," "}));
//        System.out.println(Challenge.countCharacters(new String[]{ }));

//        System.out.println(Challenge.check(new int[]{1,2,3,4,5},3));
//        System.out.println(Challenge.check(new int[]{1,1,2,1,1},3));
//        System.out.println(Challenge.check(new int[]{},5));
//        System.out.println(Challenge.check(new int[]{1, 1, 2, 1, 5, 4, 7}, 7));
//        System.out.println(Challenge.check(new int[]{1, 1, 2, 1, 5, 4, 7}, 8));


//
//        System.out.println(Challenge.search2(new int[]{1,5,3},5));
//        System.out.println(Challenge.search2(new int[]{12,34,4556,7,2,3},3));
//        System.out.println(Challenge.search2(new int[]{1,5,7,6,8,9},4));

//        reverse(new int[]{1, 2, 3, 4, 6});

//        System.out.println(Challenge.firstLast(new String[]{"nawaz","akib","quazi"}));

//        System.out.println(Challenge.sumOfCubes(new int[]{1,5,9}));
//        System.out.println(Challenge.sumOfCubes(new int[]{2}));
//        System.out.println(Challenge.sumOfCubes(new int[]{ }));

//        System.out.println(Challenge.forbiddenLetter("m",new String[]{"deep", "loves", "tesmh"} ));
//        System.out.println(Challenge.forbiddenLetter("r",new String[]{"ock", "pape", "scisso"} ));
//        System.out.println(Challenge.forbiddenLetter("m",new String[]{ } ));

//        System.out.println(Challenge.hasSameBread(new String[]{"white bread", "lettuce", "white bread"}, new String[]{"white bread", "tomato", "white bread"}));
//        System.out.println(Challenge.hasSameBread(new String[]{"brown bread", "chicken", "brown bread"}, new String[]{"white bread", "chicken", "white bread"}));
//        System.out.println(Challenge.hasSameBread(new String[]{"white bread", "lettuce", "toast"}, new String[]{"white bread", "tomato", "toast"}));
//        System.out.println(Challenge.hasSameBread(new String[]{"nawaz", "cheese", "quazi"}, new String[]{"nawaz", "cheese", "quazi"}));
//
//     System.out.println(Challenge.transform(new int[]{1, 2, 3, 4, 5}));
//     System.out.println(Challenge.transform(new int[]{1, 2, 3, 4, 5}));
//     System.out.println(Challenge.transform(new int[]{1, 2, 3, 4, 5}));

//     System.out.println(Challenge.MultiplyByLength(new int[]{2,3,1}));

    // 1
    public static int valueAt(int[] r, double i) {
        return r[(int) Math.floor(i)];
    }

    //2  https://edabit.com/challenge/SQC525f4Wqn6F4LNC
    public static int arraySum2(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //3  https://edabit.com/challenge/ZGzabS3xzpPcT55E6
    public static String getXP(int[] c) {
        return c[0] * 5 + c[1] * 10 + c[2] * 20 + c[3] * 40 + c[4] * 80 + "xp";
    }

    //4  https://edabit.com/challenge/qaKffo5AZo2RMcKyN
    public static boolean squaresAndCubes(int[] arr) {
        int square_root = (int) Math.sqrt(arr[0]);
        int cube_root = (int) Math.cbrt(arr[1]);
        if (square_root == cube_root) {
            return true;
        } else {
            return false;
        }
    }

    //5  https://edabit.com/challenge/YMLm3DpuZXHFDAnou
    public static int indexMultiplier(int[] arr) {
        int inddxmultipli = 0;
        for (int i = 0; i < arr.length; i++) {
            inddxmultipli = arr[i] * i + inddxmultipli;
        }
        return inddxmultipli;
    }

    //6
    public static int countCharacters(String[] arr) {
        int countCharacters = 0;
        for (int i = 0; i < arr.length; i++) {
            countCharacters += arr[i].length();
        }
        return countCharacters;
    }

    //7  https://edabit.com/challenge/hAtARtyLzAHb2TEP5
    public static boolean check(int[] arr, int el) {
        for (int ele : arr) {
            if (ele == el) {
                return true;
            }
        }
        return false;
    }

    //8   https://edabit.com/challenge/dWpuMsnxdJsBZqj8P
    public static boolean hurdleJump(int[] hurdles, int h) {
        for (int a : hurdles) {
            if (a <= h) {
                return true;
            }
        }
        return false;
    }

    //9
    public static int search(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }

    //10
    public static void reverse(int[] arr) {
        int reverse = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reverse = arr[i];
            System.out.print(reverse + " ");
        }
    }

    //11
    public static String monthName(int num) {
        switch (num) {
            case 1:
                return "january";
            case 2:
                return "february";
            case 3:
                return "march";
            case 4:
                return "april";
            case 5:
                return "may";
            case 6:
                return "june";
            case 7:
                return "july";
            case 8:
                return "august";
            case 9:
                return "september";
            case 10:
                return "october";
            case 11:
                return "november";
            case 12:
                return "december";
            default:
                return "error";
        }
    }

    //12
    public static String[] firstLast(String[] arr) {
        String first = arr[0];
        String last = arr[arr.length - 1];
        String[] result = {first, last};
        return result;
    }

    //13
    public static int sumOfCubes(int[] nums) {
        int cube = 0;
        for (int sum : nums) {
            if (sum == 0) {
                return 0;
            }
            cube += sum * sum * sum;
        }
        return cube;
    }

    //14
    public static boolean forbiddenLetter(String ch, String[] words) {
        for (String el : words) {
            if (el.contains(ch)) {
                return false;
            }
        }
        return true;
    }

    //15
    public static int[] makePair(int a, int b) {
        return new int[]{a, b};
    }

    //16
    public static boolean hasSameBread(String[] a, String[] b) {
        if (a[0] == b[0] && a[a.length - 1] == b[b.length - 1]) {
            return true;
        }
        return false;
    }

    //17
    public static int getFirstValue(int[] arr) {
        return arr[0];
    }

    //18
    public static int getLastItem(int[] nums) {
//        int num =0;
//        for (int a : nums){
//            num=a;
//        }
//        return num
        return nums[nums.length - 1];
    }

    //19
    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int el : arr) {
            sum += el;
        }
        return sum;
    }

    //20
    public static boolean divisible(int num) {
        int sum = num % 100;
        if (sum == 0) {
            return true;
        } else {
            return false;
        }
    }

    //21
    public static int calcAge(int age) {
        return age * 365;
    }

    //22
    public static int squaed(int b) {
        return b * b;
    }

    //23
    public static int getArea(int h, int w) {
        int area = h * w;
        if (h <= 0 && w <= 0) {
            return -1;
        } else {
            return area;
        }
    }

    //24
    public static int num(int n) {
        return ++n;
    }
//25

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

    // 26
    public static int[] MultiplyByLength(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr.length;
        }
        return arr;
    }

    //27
    public static int search2(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }

    //28
    public static String[] addEnding(String[] arr, String ending) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + ending;
        }
        return arr;
    }

    //29
    public static int findIndex(String[] arr, String str) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == str) {
                return i;
            }
        }
        return -1;
    }

    //30
    public static boolean checkFactors(int[] factors, int num) {
        for (int i = 0; i < factors.length; i++) {
            if (num % factors[i] != 0) {
                return false;
            }
        }
        return true;
    }

    //31
    public static int[] correctStream(String[] user, String[] correct) {
        int[] arr = new int[user.length];
        for (int i = 0; i < user.length; i++) {
            if (user[i].equals(correct[i])) {
                arr[i] = 1;
            } else {
                arr[i] = -1;
            }
        }
        return arr;
    }

    //32
    public static String hackerSpeak(String str) {

        return str.replace("a", "4").replace("e", "3").replace("i", "1").replace("o", "0").replace("s", "5");
    }

    //33
    public static int minimumRemovals(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 2 == 0) {
            return 0;
        }
        return 1;
    }


    //34
    public static String formatDate(String date) {
        String[] arr = date.split("/");
        return arr[2] + arr[1] + arr[0];
    }

    //35
    public static boolean testJackpot(String[] result) {
        for (int i = 0; i < result.length; i++) {
            if (result[i] != result[result.length - 1]) {
                return false;
            }
        }
        return true;
    }

    //36
    public static boolean[] integerBoolean(String bits) {
        boolean[] bo = new boolean[bits.length()];
        for (int i = 0; i < bits.length(); i++) {
            if (bits.charAt(i) == '1') {
                bo[i] = true;
            } else {
                bo[i] = false;
            }
        }
        return bo;
    }

    //37      https://edabit.com/challenge/rq4AeNEFm7uBsoDDn
    public static int getAbsSum(int[] nums) {
//    pattern 1
        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum += Math.abs(nums[i]);
//        }
//        return sum;

//        pattern 2
        for (int num : nums) {
            if (num < 0) {
                sum += num * -1;
            } else {
                sum += num;
            }
        }
        return sum;

    }

    //38
    public static int findLargestNum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > sum) {
                sum = nums[i];
            }
        }
//          Arrays.sort(nums);
//      return nums[nums.length-1];
        return sum;
    }

    //39  https://edabit.com/challenge/5yCvczJJbq68Pavky
    public static int findSmallestInt(int[] args) {
        int num = args[args.length - 1];
        for (int n : args) {
            if (n < num) {
                num = n;
            }
        }
        return num;
    }

    //40  https://edabit.com/challenge/8HB8AB873TYGukT6J
    public static int[] countdown(int start) {
        int[] result = new int[start + 1];
        for (int i = start; i >= 0; i--) {
            result[start - i] = i;
        }
        return result;
    }

    // 41
    public static String findNemo(String sentence) {
        String[] str = sentence.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("Nemo")) {
                return "I found Nemo at " + (i + 1) + "!";
            }
        }
        return "I can't find Nemo :(";
    }
//  42

    public static int find_bob(String[] names) {
        for (int i = 0; i < names.length; i++) {
            if ("Bob".equals(names[i])) {
                return i;
            }
        }
        return -1;
    }

    //43
    public static String nSidedShape(int n) {
        switch (n) {
            case 1:
                return "circle";
            case 2:
                return "semi-circle";
            case 3:
                return "triangle";
            case 4:
                return "square";
            case 5:
                return "pentagon";
            case 6:
                return "hexagon";
            case 7:
                return "heptagon";
            case 8:
                return "octagon";
            case 9:
                return "nonagon";
            case 10:
                return "decagon";
            default:
                return "invalid";
        }
    }

    //44
    public static int countTrue(boolean[] arr) {
        int num = 0;
        for (boolean b : arr) {
            if (b) {
                num++;
            }
        }
        return num;
//            for (int i=0;i<arr.length;i++){
//                if (arr[i]==true){
//                    num++;
//                }
//            }
//            return num;
    }

    //45
    public static boolean existsHigher(int[] arr, int n) {
        for (int i : arr) {
            if (i >= n) {
                return true;
            }
        }
        return false;
    }

    //46
    public static boolean canCapture(String[] rooks) {
        return rooks[0].charAt(0) == rooks[1].charAt(0) || rooks[0].charAt(1) == rooks[1].charAt(1);
    }

    //47
    public static int differenceMaxMin(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1] - arr[0];
    }

    //48  https://edabit.com/challenge/sPz2LcPZyAiBHRgwX
    public static String formatPhoneNumber(int[] nums) {
        return String.format("(%d%d%d)%d%d%d-%d%d%d%d", nums[0], nums[1], nums[2], nums[3], nums[4], nums[5], nums[6], nums[7], nums[8], nums[9]);
    }

    //49  https://edabit.com/challenge/SvptD77rYQJgjDvZY
    public static boolean factorChain(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] % arr[i] != 0) {
                return false;
            }
        }
        return true;
    }


    // 50   https://edabit.com/challenge/WM5s7vuHnXdcKCEjS
    public static int[] sortNumsAscending(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }

    //51   https://edabit.com/challenge/tQ26d2JJkxpjszfsk
    public static boolean matchLastItem(String[] t) {
        String str = "";
        for (int i = 0; i < t.length - 1; i++) {
            str += t[i];
        }
        return t[t.length - 1].equals(str);
    }

    //52
    public static String[] capMe(String[] s) {
        for (int i = 0; i < s.length; i++) {
            s[i] = Character.toUpperCase(s[i].charAt(0)) + s[i].substring(1).toLowerCase();
        }
        return s;
    }

    //53  https://edabit.com/challenge/yk7GqGcCpFgQrk8fH
    public static boolean isAvgWhole(int[] arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum % arr.length == 0;
    }

    //54   https://edabit.com/challenge/J4Yop3GjeZELWeoqT
    public static Object minMax(Integer[] arr) {
//        pattern 1
//        double min =arr[0];
//        double max=arr[0];
//        for (int  i=0;i<arr.length;i++){
//            if (arr[i]>max){
//                max=arr[i];
//            }if (arr[i]<min){
//                min=arr[i];
//            }
//        }
//         return new double[]{min,max};

//        pattern 2
        Arrays.sort(arr);
        return new double[]{arr[0], arr[arr.length - 1]};
    }

    //55 https://edabit.com/challenge/ryEdPW2eqyngyWayy
    public static String spaceMeOut(String str) {
        return str.replace("", " ").trim();
    }

    //56 https://edabit.com/challenge/TM5f33Mpu52m2jcat
    public static int maxTotal(int[] nums) {
//   pattern 1
        Arrays.sort(nums);
//        return nums[9]+nums[8]+nums[7]+nums[6]+nums[5];

//  pattern  2
        int sum = 0;
        for (int i = 5; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    // 57  https://edabit.com/challenge/YmeiRhzaiR3MCPBiT
    public static boolean isSpecialArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int left = i % 2;
            int right = arr[i] % 2;
            if (left != right) {
                return false;
            }
        }
        return true;
    }

    // 58 https://edabit.com/challenge/Xf7PqJnzukWe2WxqB
    public static int secondLargest(int[] num) {
        Arrays.sort(num);
        return num[num.length - 2];
    }

    //59  https://edabit.com/challenge/kzALnF5nT9YCbGMMm
    public static int findNaN(double[] n) {
        for (int i = 0; i < n.length; i++) {
            if (n[i] != n[i]) {
                return i;
            }
        }
        return -1;
    }

    // 60  https://edabit.com/challenge/hgHMhpJjyFxYJMMXp
    public static String getFilename(String path) {
//        pattern 1
//        String [] str =path.split("/");
//        return str[str.length-1];

//     pattern 2
        return path.substring(path.lastIndexOf("/") + 1);
    }

////61  https://edabit.com/challenge/XsJnE47kiTt39t3da
//   public static  double getBudgets( Person [] persons) {
//
//}


    //  62  https://edabit.com/challenge/jwXx478haGbZpRCWQ
    public static int[] findEvenNums(int num) {
        int[] arr = new int[num / 2];
        for (int i = 2; i <= num; i += 2) {
            arr[i / 2 - 1] = i;
        }
        return arr;
    }

    //63 https://edabit.com/challenge/zgBjnxQw9MHTBHLED
    public static int nthSmallest(int[] arr, int n) {
        if (n > arr.length) {
            return -1;
        }
        Arrays.sort(arr);
        return arr[n - 1];
    }

    //64   https://edabit.com/challenge/xkD7RBBDiWuDHTiXE
    public static boolean canNest(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return arr1[0] > arr2[0] && arr1[arr1.length - 1] < arr2[arr2.length - 1];
    }

    //65    https://edabit.com/challenge/zr7BBJbeYikNBN2hf
    public static String societyName(String[] friends) {
        Arrays.sort(friends);
        String str = "";
        for (int i = 0; i < friends.length; i++) {
            str += friends[i].charAt(0);
        }
        return str;
    }

    //66    https://edabit.com/challenge/LmiWWX2kdWn2Z5aZv
    public static int[] cumulativeSum(int[] nums) {
//        pattern 1
//        int [] result = new int[nums.length];
//        int sum =0;
//        for (int i=0;i<nums.length;i++){
//            sum+=nums[i];
//            result[i]=sum;
//        }
//        return result;

//       pattern 2
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }


    //68   https://edabit.com/challenge/HtruskPio7ricRvuG\
    public static int incrementToTop(int[] arr) {
        Arrays.sort(arr);
        int top = 0;
        for (int i = 0; i < arr.length; i++) {
            top += arr[arr.length - 1] - arr[i];
        }
//        3,4,5,
//        5-3=2  top=2
//        5-4=1  top=3
//        5-5=0
        return top;
    }
    //69   https://edabit.com/challenge/XD6bQFpCZWiAMPanQ

    //70    https://edabit.com/challenge/ENNmwseEab73TMoBc
    public static String[] getExtension(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
//           arr[i]=arr[i].substring(arr[i].indexOf( '.' ) + 1);
            arr[i] = arr[i].split("\\.")[1];
        }

        return arr;
    }

    //71  https://edabit.com/challenge/EmRPehwiJFk6rf2iD
    public static String[] isFourLetters(String[] s) {
        String a = "";
        for (String st : s) {
            if (st.length() == 4) {
                a += st;
                a += ",";
            }
            if (st.length() == 0) {
                return new String[]{};
            }
        }
        return new String[]{a};
    }
    //72 https://edabit.com/challenge/S6ScbuTciqryqTAAg

    //73 https://edabit.com/challenge/E2WdAPmgNJnbL5RvF
    public static int[] concat(int[] arr1, int[] arr2) {
//        pattern 1
//        int[] result = new int[arr1.length + arr2.length];
//        for (int i = 0; i < arr1.length; i++) {
//            result[i] = arr1[i];
//        }public static int[] arrayOfMultiples(int num, int length) {
//
//	}
//        for (int i = 0; i < arr2.length; i++) {
//            result[i + arr1.length] = arr2[i];
//        }
//        return result;

//        pattern 2
        return arr1;
    }

    //74  https://edabit.com/challenge/YNQQynxnFeoKNiqTM
    public static String removeSpecialCharacters(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", " ");
        return str;
    }

    //75  https://edabit.com/challenge/j5mm8HjTZGZagrnz8
    public static int[] reverse2(int[] arr) {
//        pattern 1
        int[] reverse = new int[arr.length];
        int revers = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reverse[revers] = arr[i];
            revers++;
        }
        return reverse;

//   pattern 2
//      int [] out = new int[arr.length];
//      for(int i = 0; i < arr.length; i++){
//          out[i] = arr[arr.length - 1 - i];
//      }
//      return out;
//      3-0=3  4
//      3-1=2  3
//      3-2=1  2
//      3-3=0  1
    }

    // 76   https://edabit.com/challenge/rzpucPyoyEtXPo2BG
    public static int[] arrayOfMultiples(int num, int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = num * (i + 1);
        }
        return arr;
    }

    // 77  https://edabit.com/challenge/7fHsizQrTLXsPWMyH
    public static int warOfNumbers(int[] numbers) {
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            } else if (numbers[i] % 2 != 0) {
                sum2 += numbers[i];
            }
            if (sum2 > sum) {
                return sum2 - sum;
            } else return sum - sum2;
        }
        return sum;
    }

    // 78 https://edabit.com/challenge/Sej5nsmmjBAXv6hHv
    public static int letterCounter(char[][] arr, char d) {
        int count = 0;
        for (char[] i : arr) {
            for (char j : i) {
                if (j == d) {
                    count++;
                }
            }
        }
        return count;
//       char [] result=new char[arr.length];
//       for (int i=0;i<result.length;i++){
//           for (int j=0;j<arr[i].length;j++){
//               if (j==d){
//                   count++;
//               }
//           }
//       }
//       return count;
    }

    // 79   https://edabit.com/challenge/7Tb7qMDQHtz3xpydd
    public static int[][] squarePatch(int n) {
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = n;
            }
        }
        return result;
    }

    //80 https://edabit.com/challenge/hf2THAoQRQbAx2jc9
    public static int sum(int[] arr) {
        int sum = 0;
        if (arr.length <= 0) {
            return 0;
        }
        for (int i : arr) {
            sum +=i;
        }
        return sum;
    }

    //    81  https://edabit.com/challenge/4r33Yd2HuEireb3Sm
    public static int count(int n) {
//        pattern 1
//      if (Math.abs(n) < 10) {
//          return 1;
//      }
//      return 1 + count(n / 10);
//      pattern 2
//     n=Math.abs(n);
//     String str =String.valueOf(n);
//     return str.length();

//      pattern 3
//        return (Math.abs(n) + "").length();

//        patter 4
         n=Math.abs(n);
         int count=0;
         while (n!=0){
             n=n/10;
             count++;
         }
         return count;
    }

    // 82  https://edabit.com/challenge/diiEDD4JQyysFR7zh
    public static String[] getBirthdayCake(String name, int age) {
        String i = (age % 2 == 0 ? "#" : "*");
        String[] arr = new String[3];
        arr[1] = "\n" + i + " " + String.valueOf(age) + " Happy Birthday " + name + " ! " + String.valueOf(age) + " " + i + "\n";
        arr[0] = i.repeat(arr[1].length());
        arr[2] = arr[0];
        return arr;
    }

    // 83 https://edabit.com/challenge/L5uwyF4SsAG4DmPpJ
    public static int spinAround(String[] turns) {
        int aa = 0;
        for (int i = 0; i < turns.length; i++) {
            if (turns[i].equals("right")) {
                aa += 90;
            } else {
                aa -= 90;
            }
        }
        return Math.abs(aa / 360);
    }

    // 84 https://edabit.com/challenge/c52kNwPuWo5kp9x4H
    public static String flipEndChars(String s) {
        if (s.length() < 2) {
            return "Incompatible.";
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return "Two's a pair.";
        }
        return s.substring(s.length() - 1) + s.substring(1, s.length() - 1) + s.substring(0, 1);
    }

    //  85   https://edabit.com/challenge/r7JegKpMpntfDyy6D
    public static String[] jazzify(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(arr[i].length() - 1) != '7') {
//            if (!arr[i].endsWith("7"))
                arr[i] += "7";
            }
        }
        return arr;
    }

    //// 86 https://edabit.com/challenge/u4YLReJ9Q3vAYJkCm
//     public static boolean same(int[] a1, int[] a2) {
//
//}
//87  https://edabit.com/challenge/QLz5aGfChHhndKWMv
    public static double[] findLargestNums(double[][] arr) {
        double[] large = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
            large[i] = arr[i][arr[i].length - 1];
        }
        return large;
    }

    //88  https://edabit.com/challenge/E22KYTGMhwpYtjn8x
    public static int[] numberSplit(int n) {
//        pattern 1
//       if (n%2==0){
//           int []a={n/2,n/2};
//                   return a;
//       }
//       if (n>0){
//           int [] a={n/2,n/2+1};
//           return a;
//       }else {
//           int [] a={n/2-1,n/2};
//           return a;
//       }

//      pattern 2

        int[] arr = new int[2];
        if (n % 2 == 0) {
            arr[0] = n / 2;
            arr[1] = n / 2;
        } else {
            arr[0] = (n + 1) / 2;
            arr[1] = n - arr[0];
        }
        Arrays.sort(arr);
        return arr;

//      pattern 3
//      return new int[] {(int) Math.floor(n/2.0), (int) Math.ceil(n/2.0)};
    }

    //   89  https://edabit.com/challenge/ibJLbwfkTbP9229Kt
    public static int totalVolume(int[][] part) {
        int volum = 0;
//        for (int i=0;i<part.length;i++){
        for (int[] i : part) {
            volum += i[0] * i[1] * i[2];
        }
        return volum;
    }

    //90  https://edabit.com/challenge/A7mDjLb7DZL5bk8oz
    public static Object[] noOdds(int[] nums) {
//        int count = 1;
//        int[] arr = new int[count];
//        for (int i = 0; i <nums.length-1; i++) {
//            if (nums[i] % 2 == 0) {
//                arr[count] = nums[i];
//                count++;
//            }
//        }
//        return arr;

        ArrayList<Integer>list=new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            if (nums[i]%2==0){
                list.add(nums[i]);
            }
        }
        return list.toArray();
    }

    //91 https://edabit.com/challenge/3mCJ3idbMqueRTa7b
    public static String[] filterStateNames(String[] arr, String type) {
        String ststes = "";
        for (int i = 0; i < arr.length; i++) {
            if (type.equals("abb") && arr[i].length() == 2 || type.equals("full") && arr[i].length() > 2) {
                ststes += arr[i] + " ";
            }
        }
        return ststes.split(" ");
    }

    //92   https://edabit.com/challenge/n7kbvMp5zHRmRbFQF
    public static int[] countPositivesSumNegatives(int[] input) {
        int sum = 0;
        int count = 0;
//        int [] a=new int[2];
//        if ( input.length==0){
//            return new int[]{0};
//        }
//    for (int i=0;i<input.length;i++){
//        if (input[i]<=0){
//            a[1]+=input[i];
//        }if (input[i]>0){
//            a[0]++;
//        }
//    }
//    return a;
        if (input == null || input.length == 0) {
            return new int[]{};
        }
        for (int i : input) {
            if (i < 0) {
                sum += i;
            }
            if (i > 0) {
                count++;
            }
        }
        return new int[]{count, sum};
    }

    //93 https://edabit.com/challenge/kgMghy3omychqLnXv
    public static Object[] uniqueSort(int[] nums) {
       HashSet<Integer> set=new HashSet<>();
       Arrays.sort(nums);
       for (int i=0;i<nums.length;i++){
           set.add(nums[i]);
       }
       return set.toArray();
    }

    //94 https://edabit.com/challenge/jtFNMktij8FcH6zna
    public static boolean puzzlePieces(int[][] n) {
        if (n[0].length != n[1].length) {
            return false;
        }
        int sum = 0;
        int[] puzzle = new int[2];
        for (int i = 0; i < n.length; i++) {
            sum = n[i][0] + n[i][1];
            if (sum != n[i][0] + n[i][1]) {
                return false;
            }
        }
        return true;
    }

    //95  https://edabit.com/challenge/tunTJAdBeLgc8s4ap
    public static String[] identicalFilter(String[] arr) {
        String a = "";
        for (String i : arr) {
            if (i.replaceAll("" + i.charAt(0), "").length() == 0) {
                a += i + " ";
            }
        }
        return a.length() == 0 ? new String[]{} : a.split(" ");
    }

    // 96   https://edabit.com/challenge/u7prkNxFxqartAfiG
    public static int sumTwoSmallestNums(int[] arr) {
//        int sum=0;
        Arrays.sort(arr);
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]>=0){
//              sum=arr[i]+arr[i+1];
//              break;
//            }
//        }
//        return sum;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                return arr[i] + arr[i + 1];
            }
        }
        return -1;
    }

    //  97  https://edabit.com/challenge/DwMxxFrzZ5eZfBSGL
    public static int[] inclusiveArray(int startNum, int endNum) {
        if (startNum > endNum) {
            return new int[]{startNum};
        }
        int l = endNum - startNum + 1;
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i] = startNum + i;
        }
        return arr;
    }

    //98 https://edabit.com/challenge/ZY7b6LA5BeWQJnJX5
    public static boolean omnipresent(int[][] arr, int val) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int a = 0; a < arr[i].length; a++) {
                if (arr[i][a] == val) {
                    count++;
                }
            }
        }
        if (count < arr.length) {
            return false;
        }
        return true;
    }

    //99 https://edabit.com/challenge/uYS6jZBk5sQ6qQyrK
//100  https://edabit.com/challenge/LzY7r73f9xKhKvtki
    public static String longestWord(String phrase) {
        String longest = "";
//      for (String str:phrase.split(" ")){
//          if (str.length()>=longest.length()){
//              longest=str;
//          }
//      }
//      return longest;
        String[] arr = phrase.split(" ");
        Arrays.sort(arr, (a, b) -> a.length() >= b.length() ? -1 : 1);
        return arr[0];
    }

    //101
    public static String[][] zipIt(String[] women, String[] men) {
        if (women.length != men.length) {
            return null;
        }
        String[][] str = new String[men.length][2];
        for (int i = 0; i < men.length; i++) {
            str[i][0] = women[i];
            str[i][1] = men[i];
        }
        return str;
    }

    //102 https://edabit.com/challenge/tvaT25krB65pYtghq
    public static double averageIndex(String[] arr) {
        double sum = 0;
        for (String str : arr) {
            sum += str.charAt(0) - 96;
        }
        return sum / arr.length;
    }

    // 103   https://edabit.com/challenge/CnCvL9vmjYtFG785t
    public static int[] last(int[] r, int n) {
        if (n > r.length) {
            return null;
        }
        int[] arr = new int[n];
        int aa = 0;
        for (int i = r.length - n; i < r.length; i++) {
            arr[aa] = r[i];
            aa++;
        }

        return arr;
    }

    // 104 https://edabit.com/challenge/zmbR8SKveCgJ6KB5G
    public static int duplicates(String str) {
//        pattern 1
//       return (int) (str.length()-str.chars().distinct().count());

//       pattern 2
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(String.valueOf(str.charAt(i)));
        }
        return str.length() - set.size();
    }

    //105 https://edabit.com/challenge/T3zjJiXoNRqXqEx9u
    public static Object[] clone(Object[] arr) {

//        pattern 1
//    ArrayList<Object>list=new ArrayList<>();
//    for (Object i:arr){
//        list.add(arr);
//        list.add(i);
//    }
//    return list.toArray();

//    pattern 2
//    Object[] newArr = Arrays.copyOf(arr, arr.length + 1);
//    newArr[arr.length] = Arrays.copyOf(arr, arr.length);
//    return newArr;

//    pattern 3
        Object[] ab = new Object[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            ab[i] = arr[i];
        }
        ab[arr.length] = arr;
        return ab;
    }

    //106 https://edabit.com/challenge/KGhmvXpF6iK8mAqgj
    public static Object[] numInStr(String[] arr) {
        ArrayList<String> words = new ArrayList<>();
        for (String i : arr) {
            if (i.matches(".*\\d+.*")) {
                words.add(i);
            }
        }
        return words.toArray();
    }

    // 107  https://edabit.com/challenge/6THnWXvQrhRrEErtb
    public static String[] findBrokenKeys(String str1, String str2) {
        String fail = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i) && !fail.contains(String.valueOf(str1.charAt(i))))
                fail += str1.charAt(i);
        }
        return fail.split("");
    }

    //108  https://edabit.com/challenge/WzE2id9w5mNfXozKL
//109 https://edabit.com/challenge/uiNKhxnvuaJ7ikoKX
//110 https://edabit.com/challenge/M7GmLubPNJEfQj78E
    public static String[] cmsSelector(String[] cms, String re) {
        String str = "";
        if (re.equals("")) {
            Arrays.sort(cms);
            return cms;
        }
        for (int i = 0; i < cms.length; i++) {
            if (cms[i].toLowerCase().contains(re)) {
                str += cms[i] + " ";
            }
        }
        return str.split(" ");

    }



    //111 https://edabit.com/challenge/YaveE6sv8xGf4CNxk
//112 https://edabit.com/challenge/XuhT6hazGTL9c4bwE
//113 https://edabit.com/challenge/9k87o8Y4yNt3fvcfB
    public static Object[] returnInts(Object[] a) {
//        int[] z = new int[a.length];
////        int i = 0;
//        for (Object o : a)
//            if (o instanceof Integer) z[i++] = (int) o;
//        return copyOfRange(z, 0, i);
        ArrayList<String> list=new ArrayList<String>();
        for (int i=0;i<a.length;i++){
            if (a[i] instanceof String){
                list.add((String) a[i]);
            }
        }
        return list.toArray();

    }


    //114 https://edabit.com/challenge/KSX8nW7HdxLK2iFj5
    public static boolean sumOfTwo(int[] a, int[] b, int v) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] + b[j] == v) {
                    return true;
                }
            }
        }
        return false;
    }

    //115 https://edabit.com/challenge/eQcTa2pBy5WiXpQFf
    public static boolean allPrime(int[] arr) {

//    pattern 1
//   for (int i:arr){
//       if (i==1){
//           return false;
//       }
//       for (int j=2;j<i;j++){
//           if (i%j==0){
//               return false;
//           }
//       }
//   }
//   return true;

//        pattern 2
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                return false;
            }
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    //116 https://edabit.com/challenge/g7mkKpAtZZ7mnuFQX
    public static int[] timeSum(String[] s) {
        int[] arr = new int[3];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < 3; j++) {
                arr[j] += Integer.parseInt(String.valueOf(s[i].split(":")[j]));
            }
        }
        arr[1] += arr[2] / 60;
        arr[2] = arr[2] % 60;
        arr[0] += arr[1] / 60;
        arr[1] = arr[1] % 60;
        return arr;
    }

    //117 https://edabit.com/challenge/8YajvDynPYF6XG3nZ
    public static boolean isPotentialFriend(String[] y, String[] o) {
        int count = 0;
        boolean returnn = false;
        if (y.length == 1 && o.length == 1 || y[0] == o[0]) {
            return true;
        }
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < o.length; j++) {
                if (y[i] == o[j]) {
                    count++;
                }
            }
        }
        if (count >= 2) {
            return true;
        } else {
            return false;
        }
    }

    //118 https://edabit.com/challenge/4Az2B8MYAH3GbbxX6
//119 https://edabit.com/challenge/mjzKvjg92ZGLuNPJ9
//121 https://edabit.com/challenge/zSjd2EbBzBCuMjgrr
    public static String lunarSum(int number1, int number2) {
        String res = "";
        String num1 = number1 + "";
        String num2 = number2 + "";
//       if (num1.length() > num2.length()){
//           while (num1.length() != num2.length()){
//               num2 = "0" + num2;
//           }
//       } else if (num1.length() < num2.length()){
//           while (num1.length() != num2.length()){
//               num1 = "0" + num1;
//           }
//       }
        for (int i = 0; i < num1.length(); i++) {
            if (num1.charAt(i) > num2.charAt(i)) {
                res += num1.charAt(i);
            } else {
                res += num2.charAt(i);

            }
        }
        return res;
    }

    //122 https://edabit.com/challenge/S28QATbZGq3BjDHZZ
//123 https://edabit.com/challenge/6RStzK9uub9vHDt53
    public static String sortByLength(String str) {
        String[] st = str.split(" ");
        Arrays.sort(st, Comparator.comparing(String::length).thenComparing(String::compareToIgnoreCase));
        return String.join(" ", st);
    }

    //124  https://edabit.com/challenge/
    public static String likeOrDislike(String[] arr) {
        String str = "nothing";
        for (String i : arr) {
            str = i == str ? "nothing" : i;
        }
        return str;
    }

    // 125   https://edabit.com/challenge/FhsLkzfbEgb4TiJXA
    public static Map<String, String> mapping(String[] letters) {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < letters.length; i++) {
            map.put(letters[i], letters[i].toUpperCase());
        }
        return map;
    }

    // 126   https://edabit.com/challenge/bfAeRfKacFSLuuXjv
    public static boolean isMagicSquare(int[][] square) {
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < square.length; i++) {
            a += square[0][i];
            b += square[i][0];
            c += square[i][i];

        }
        return (a == b) && (a == c);
    }
    //126 https://edabit.com/challenge/5mANMR3X6gEfWephD

    public static void main(String[] args) {

        //System.out.println(Arrays.toString(Challenge.returnInts(new Object[]{43, "nawaz", 435, 43, 45, 652, "F", "r", "rq", 4})));

        //System.out.println(Arrays.toString(uniqueSort(new int[]{1, 4, 4, 4, 4, 4, 3, 2, 1, 2})));
        //System.out.println(Arrays.toString(uniqueSort(new int[]{6, 7, 3, 2, 1})));
    }
//        System.out.println(Challenge.mapping(new String[]{"x", "a", "v", "i", "e", "r"}));

//        System.out.println(Challenge.isMagicSquare(new int[][]{{8,1,6},{3,5,7},{4,9,2}}));
//        System.out.println(Challenge.isMagicSquare(new int[][]{{8,1,6},{3,5,7},{4,9,1},}));

//        System.out.println(Challenge.likeOrDislike(new String[]{"dislike","dislike"}));

//        System.out.println((Challenge.sortByLength("i nawaz am quazi")));

//        System.out.println(Challenge.lunarSum(245,317));

//        System.out.println((Challenge.isPotentialFriend(new String[]{"sports", "music", "chess"},new String[]{"coding", "music", "netflix", "chess"})));
//        System.out.println((Challenge.isPotentialFriend(new String[]{"sports", "music", "chess"},new String[]{"dancing", "drawing"})));
//        System.out.println((Challenge.isPotentialFriend(new String[]{"history"},new String[]{"history"})));

//        System.out.println(Arrays.toString(Challenge.timeSum(new String[]{"1:23:45"})));
//        System.out.println(Arrays.toString(Challenge.timeSum(new String[]{"1:03:45", "1:23:05"})));

//        System.out.println(Challenge.allPrime(new int[] {7, 5, 2, 4, 6}));
//        System.out.println(Challenge.allPrime(new int[] {2, 3, 5, 7, 13, 17, 19, 23, 29}));
//        System.out.println(Challenge.allPrime(new int[] {1,5,3}));
//        System.out.println(Challenge.allPrime(new int[] {5,3}));

//        System.out.println(Challenge.sumOfTwo(new int[]{1,2},new int[]{4,5,6},5));
//        System.out.println(Challenge.sumOfTwo(new int[]{1,2},new int[]{4,5,6},8));
//        System.out.println(Challenge.sumOfTwo(new int[]{1,2},new int[]{4,5,6},3));
//        System.out.println(Challenge.sumOfTwo(new int[]{1,2},new int[]{4,5,6},9));

//        System.out.println(Arrays.toString(Challenge.cmsSelector(new String[]{"WordPress", "Joomla", "Drupal"},"w")));
//        System.out.println(Arrays.toString(Challenge.cmsSelector(new String[]{"WordPress", "Joomla", "Drupal"},"ru")));
//        System.out.println(Arrays.toString(Challenge.cmsSelector(new String[]{"WordPress", "Joomla", "Drupal"},"")));
//        System.out.println(Arrays.toString(Challenge.cmsSelector(new String[]{"WordPress", "Joomla", "Drupal"},"o")));

//        System.out.println(Arrays.toString(Challenge.findBrokenKeys("happy birthday", "hawwy birthday")));
//        System.out.println(Arrays.toString(Challenge.findBrokenKeys("starry night", "starrq light")));
//        System.out.println(Arrays.toString(Challenge.findBrokenKeys("beethoven", "affthoif5")));

//        System.out.println(Arrays.toString(Challenge.numInStr(new String[]{"1a", "a", "2b", "b"})));
//        System.out.println(Arrays.toString(Challenge.numInStr(new String[]{"abc", "ab10c", "a10bc", "bcd"})));
//        System.out.println(Arrays.toString(Challenge.numInStr(new String[]{"this is a test", "test1"})));

//        System.out.println(Arrays.toString(Challenge.clone(new Object[]{1, 2})));

//        System.out.println(Challenge.
//        duplicates("hello world"));

//        System.out.println(Arrays.toString(Challenge.last(new  int[]{1,2,3,4,5},1)));

//        System.out.println(Challenge.averageIndex(new String[]{"f", "o", "r", "t", "h", "e", "l"}));

//        System.out.println(Arrays.toString(Challenge.zipIt(new String[]{"nawaz","quazi"},new String[]{"quazi","nawaz"})));

//        System.out.println(Challenge.spinAround(new String[]{"right", "right", "right", "right","left", "right"}));

//        System.out.println(Challenge.longestWord("\"Margaret's toy is a pretty doll.\""));

//        System.out.println(Challenge.omnipresent(new int[][]{{1,1},{1,3},{5,1},{6,1}},1));
//        System.out.println(Challenge.omnipresent(new int[][]{{1,1},{1,3},{5,1},{6,1,5}},6));




//        System.out.println(Arrays.toString(Challenge.inclusiveArray(1,5)));
//        System.out.println(Arrays.toString(Challenge.inclusiveArray(17,5)));
//        System.out.println(Arrays.toString(Challenge.inclusiveArray(10,20)));
//        System.out.println(Arrays.toString(Challenge.inclusiveArray(20,10)));
//        System.out.println(Arrays.toString(Challenge.inclusiveArray(2,8)));

//        System.out.println(Challenge.sumTwoSmallestNums(new int[]{879, 953, 694, -847, 342, 221, -91, -723, 791, -587}));

//        System.out.println(Arrays.toString(Challenge.identicalFilter(new String[]{"aaaaa", "bc", "d", "eeee", "xyz"})));
//
//        System.out.println(Challenge.puzzlePieces(new int[][]{{1, 2, 3, 4}, {4, 3, 2, 1}}));
//        System.out.println(Challenge.puzzlePieces(new int[][]{{1, 8, 5, 0, -1, 7}, {0, -7, -4, 1, 2, -6}}));
//        System.out.println(Challenge.puzzlePieces(new int[][]{{1, 2,}, {-1, -1}}));

//        System.out.println(Arrays.toString(Challenge.countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15})));
//        System.out.println(Arrays.toString(Challenge.countPositivesSumNegatives(new int[]{92, 6, 73, -77, 81, -90, 99, 8, -85, 34})));
//        System.out.println(Arrays.toString(Challenge.countPositivesSumNegatives(new int[]{91, -4, 80, -73, -28})));
//        System.out.println(Arrays.toString(Challenge.countPositivesSumNegatives(new int[]{})));
//        System.out.println(Arrays.toString(Challenge.countPositivesSumNegatives(new int[]{0})));

//        System.out.println(Arrays.toString(Challenge.filterStateNames((new String[]{"Arizona", "CA", "NY", "Nevada"}) ,"abb")));

//        System.out.println(Arrays.toString(Challenge.noOdds(new int[]{1, 2, 3, 4, 5, 6, 7, 8})));

//        System.out.println(Challenge.totalVolume(new int[][] { { 4, 2,4 }, { 3, 3, 3 }, { 1, 1, 2 }, { 2, 1, 1 },{3,45,54} }));

//        System.out.println(Arrays.toString(numberSplit(23)));

//        System.out.println(Arrays.toString(Challenge.findLargestNums(new double[][]{{4, 2, 7, 1}, {20, 70, 40, 90}, {1, 2, 0}})));

//        System.out.println(Arrays.toString(Challenge.jazzify(new String[]{"F7", "E7", "A7", "Ab7", "Gm7", "C7"})));
//        System.out.println(Arrays.toString(Challenge.jazzify(new String[]{"G", "F", "C"})));
//        System.out.println(Arrays.toString(Challenge.jazzify(new String[]{"Dm", "G", "E", "A"})));

//        System.out.println(Challenge.flipEndChars("Cat, dog, and mouse."));

//        System.out.println(Arrays.toString(Challenge.getBirthdayCake("Nawaz",18)));

//        System.out.println(Challenge.count(231273683));

//        System.out.println(Challenge.sum(new int[]{1,2,3,4}));;

//        System.out.println(Arrays.toString(Challenge.squarePatch(5)));

//        System.out.println(Arrays.toString(new int[]{Challenge.letterCounter(new char[][]{{'D', 'E', 'Y', 'H', 'A', 'D',
//                'C', 'B', 'Z', 'Y', 'J', 'K',
//                'D', 'B', 'C', 'A', 'M', 'N',
//                'F', 'G', 'G', 'R', 'S', 'R',
//                'V', 'X', 'H', 'A', 'S', 'S'
//                }}, 'D')}));

//        System.out.println(Challenge.warOfNumbers(new int[]{2, 8, 7, 5}));
//        System.out.println(Challenge.warOfNumbers(new int[]{12, 90, 75}));
//        System.out.println(Challenge.warOfNumbers(new int[]{5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243}));

//        System.out.println(Arrays.toString(Challenge.arrayOfMultiples(7,5)));

//        System.out.println(Arrays.toString(Challenge.reverse2(new int[]{1,2,3,4,5,6})));

//        System.out.println(Challenge.removeSpecialCharacters("The quick brown fox!"));
//        System.out.println(Challenge.removeSpecialCharacters("%fd76$fd(-)6GvKlO."));
//        System.out.println(Challenge.removeSpecialCharacters("D0n$c sed 0di0 du1"));

//        System.out.println(Arrays.toString(Challenge.concat(new int[]{1,2,3,4},new int[]{5,6,7,8,9})));

//        System.out.println(Arrays.toString(Challenge.isFourLetters(new String[]{"Tomato", "Potato", "Pair"})));
//        System.out.println(Arrays.toString(Challenge.isFourLetters(new String[]{"Kangaroo", "Bear", "Fox"})));
//        System.out.println(Arrays.toString(Challenge.isFourLetters(new String[]{"Ryan", "Kieran", "Jason", "Matt"})));
//        System.out.println(Arrays.toString(Challenge.isFourLetters(new String[]{"is", "up", "two", "elephant"})));
//        System.out.println(Arrays.toString(Challenge.isFourLetters(new String[]{})));
//        System.out.println(Arrays.toString(Challenge.isFourLetters(new String[]{""})));

//        System.out.println(Challenge.incrementToTop(new int[]{1, 2, 3, 4, 5}));

//        System.out.println(Arrays.toString(Challenge.getExtension(new String[]{"project1.jpg", "project1.pdf", "project1.mp3"})));


//        System.out.println(Challenge.societyName(new String[]{"Adam", "Sarah", "Malcolm"}));

//        System.out.println(Challenge.canNest(new  int[]{1,2,3,4},new int[]{0,6}));
//        System.out.println(Challenge.canNest(new  int[]{3,1},new int[]{4,0}));
//        System.out.println(Challenge.canNest(new  int[]{9,9,8},new int[]{8,9}));
//        System.out.println(Challenge.canNest(new  int[]{1,2,3,4},new int[]{2,3}));

//        System.out.println(Arrays.toString(Challenge.cumulativeSum(new int[]{1,2,3})));

//        System.out.println(Challenge.nthSmallest(new int[]{1, 3, 5, 7},1));
//        System.out.println(Challenge.nthSmallest(new int[]{1, 3, 5, 7},3));
//        System.out.println(Challenge.nthSmallest(new int[]{1, 3, 5, 7},5));
//        System.out.println(Challenge.nthSmallest(new int[]{7, 3, 5, 1},2));
//        System.out.println(Challenge.nthSmallest(new int[]{5,4,3,2,1,-3},5));


//        System.out.println(Arrays.toString(Challenge.findEvenNums(8)));
//
//        System.out.println(Challenge.getBudgets(new Person[] { new Person("John", 21, 23000), new Person("Steve", 32, 40000),
//                new Person("Martin", 16, 2700) }));


//        System.out.println(Challenge.getFilename("C:/Projects/pil_tests/ascii/edabit.txt"));

//        System.out.println(Challenge.isSpecialArray(new int[]{2, 7, 4, 9, 6, 1, 6, 3}));
//        System.out.println(Challenge.isSpecialArray(new int[]{2, 7, 9, 1, 6, 1, 6, 3}));
//        System.out.println(Challenge.isSpecialArray(new int[]{2, 7, 8, 8, 6, 1, 6, 3}));

//        System.out.println(Challenge.findNaN(new double[]{1,2,3,7,Double.parseDouble("NaN")}));

//        System.out.println(Challenge.secondLargest(new int[] {10, 40, 30, 20, 50}));
//        System.out.println(Challenge.secondLargest(new int[] {25, 143, 89, 13, 105}));
//        System.out.println(Challenge.secondLargest(new int[] {54, 23, 11, 17, 10}));

//        System.out.println(Challenge.maxTotal(new int[]{1, 1, 0, 1, 3, 10, 10, 10, 10, 1}));

//        System.out.println(Challenge.spaceMeOut(new String("space")));

//        System.out.println(Arrays.toString(Challenge.minMax(new double[]{1,3,4,5,2,6,7})));

//        System.out.println(Challenge.isAvgWhole(new int[]{1,1,1}));

//        String se = String.valueOf(Challenge.capMe(new String[]{"mavis", "senaida", "letty"}));
//        System.out.println(se);

//        System.out.println(Challenge.matchLastItem(new String[]{"i", "love", "tesh", "ilovetesh"}));
//        System.out.println(Challenge.matchLastItem(new String[]{"i", "am", "into", "her", "world", "iamintoherworld"}));
//        System.out.println(Challenge.matchLastItem(new String[]{"1", "1", "1", "11"}));
//        System.out.println(Challenge.matchLastItem(new String[]{"12", "13", "17", "19", "20", "40", "121317192040"}));

//        System.out.println(Challenge.sortNumsAscending(new int[]{1,4,2,6,7,50,3}));

//        System.out.println(Challenge.factorChain(new int[]{4}));
//        System.out.println(Challenge.factorChain(new int[]{1,1,1,1,1,1}));
//        System.out.println(Challenge.factorChain(new int[]{2,4,6,7,12}));
//        System.out.println(Challenge.factorChain(new int[]{10,1}));
//
//          System.out.println(Challenge.formatPhoneNumber(new int[]{1,2,3,4,5,6,7,8,9,0}));

//           System.out.println(Challenge.differenceMaxMin(new int[]{1, 4, 3, 4, -10, -50, 32, 21}));
//            System.out.println(Challenge.differenceMaxMin(new int[]{44, 32, 86, 19}));
//            System.out.println(Challenge.differenceMaxMin(new int[]{-70, 43, 34, 54, 22}));
//            System.out.println(Challenge.differenceMaxMin(new int[]{10, 4, 1, 2, 8, 91}));

//             System.out.println(Challenge.canCapture(new String[]{"A8", "E8"}));
//            System.out.println(Challenge.canCapture(new String[]{"A1", "B2"}));
//            System.out.println(Challenge.canCapture(new String[]{"H4", "H3"}));
//              System.out.println(Challenge.canCapture(new String[]{"F5", "C8"}));

// 45 an      System.out.println(Challenge.existsHigher(new int[]{5,3,15,22,4},10));
//            System.out.println(Challenge.existsHigher(new int[]{1,2,3,4,5},8));
//            System.out.println(Challenge.existsHigher(new int[]{6},5));
//            System.out.println(Challenge.existsHigher(new int[]{4, 3, 3, 3, 2, 2, 2},4));

// 44 ans   System.out.println(Challenge.countTrue(new boolean[]{true,false,false,true,true,false,false,true,}));
//            System.out.println(Challenge.countTrue(new boolean[]{false,false,false}));
//            System.out.println(Challenge.countTrue(new boolean[]{true,true,true,true,true,true }));

// 43 ans     System.out.println(Challenge.nSidedShape(12));
//           System.out.println(Challenge.nSidedShape(3));
//           System.out.println(Challenge.nSidedShape(1));

// 42 ans          System.out.println(Challenge.find_bob(new String[]{"Jimmy", "Layla", "Bob"}));
//           System.out.println(Challenge.find_bob(new String[]{"Bob", "Layla", "Kaitlyn", "Patricia"}));
//           System.out.println(Challenge.find_bob(new String[]{"Jimmy", "Layla", "James"}));

//         System.out.println(Challenge.findNemo("i am finding Nemo"));
//           System.out.println(Challenge.findNemo("i am finding nawaz"));
//           System.out.println(Challenge.findNemo("i am finding N e m o"));

//        int[] i = Challenge.countdown(5);
//        System.out.println(Challenge.countdown(5));

//        int[] s = Challenge.countdown(5);
//        System.out.println(s);

//        int n=Challenge.findSmallestInt(new int[]{2,3,4,3,2,734,45,45,355,24,4442,45,24,1,1});
//        System.out.println(n);
//        System.out.println(Challenge.findLargestNum(new int[]{2,4,2,1,3,8,4,3,6}));

//        System.out.println(Challenge.getAbsSum(new int[]{2, -1, 4, 8, 10}));

//        String str = String.valueOf(Challenge.integerBoolean("0110"));
//        System.out.println(str);

//        System.out.println(Challenge.testJackpot(new String[]{  "@", "@", "@", "@"}));
//        System.out.println(Challenge.testJackpot(new String[]{ "&&", "&", "&&&", "&&&&" }));

//        String formet=formatDate("20191211");
//        System.out.println(Challenge.formatDate("11/12/2019"));

//        System.out.println(Arrays.toString(Challenge.addEnding(new String[]{"clever", "meek", "hurried", "nice"}, "ly")))


//            System.out.println(Challenge.findIndex(new String[]{"hi", "edabit", "fgh", "abc"},"fgh"));
//            System.out.println(Challenge.findIndex(new String[]{"Red", "blue", "Blue", "Green"}, "blue"));
//            System.out.println(Challenge.findIndex(new String[]{"a", "g", "y", "d"},"d"));
//            System.out.println(Challenge.findIndex(new String[]{"Pineapple", "Orange", "Grape", "Apple"},"Pineapple"));

//            System.out.println(Challenge.checkFactors(new int[]{2,3,4},12));
//            System.out.println(Challenge.checkFactors(new int[]{1,2,3,8},12));
//            System.out.println(Challenge.checkFactors(new int[]{1,2,50},100));
//            System.out.println(Challenge.checkFactors(new int[]{3,6},9));

//        System.out.println(Arrays.toString(correctStream(new String[]{"it", "is", "fin"},new String[]{"it", "is", "fine"})));
//        System.out.println(Arrays.toString(correctStream(new String[]{"april", "showrs", "bring", "may", "flowers"},new String[]{"april", "showers", "bring", "may", "flowers"})));

//        System.out.println(Challenge.hackerSpeak("javascript is cool 02"));

//        System.out.println(Challenge.minimumRemovals(new int[]{1,2,3,4,5}));

//       String [] ending=addEnding(new String[]{"nawaz","quazi"},"ly");
//        System.out.println(Arrays.toString(ending));

//        System.out.println(Challenge.findIndex(new String[]{"nawaz""quazi"},"u"));

//        System.out.println(Challenge.valueAt(new int[]{1, 2, 3, 4, 5, 6}, 10 / 2));
//        System.out.println(Challenge.valueAt(new int[]{1, 2, 3, 4, 5, 6}, 8 / 2));
//        System.out.println(Challenge.valueAt(new int[]{1, 2, 3, 4}, 6.535355314 / 2));

//        System.out.println(Challenge.hurdleJump(new  intf,7,6},5));


//    }
}
















