import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

class Person {
    private String name;
    private int age;
    private double budget;

    public Person(String name, int age, double budget) {
        super();
        this.name = name;
        this.age = age;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}

public class revision<arr> {
// ARRAY QUESTION

    //    --------  VERY EASY START ----------------
//1   https://edabit.com/challenge/XJxu5LCnqN9K8SXm5
    public static int getVoteCount(int upvotes, int downvotes) {
        return upvotes - downvotes;
    }

    //2 https://edabit.com/challenge/SquoES5RxWr4CyX6G
    public static int getFirstValue(int[] arr) {
        return arr[0];
    }

    //3 https://edabit.com/challenge/FAw6mykprqcsBW5Gr
    public static int[] makePair(int a, int b) {
        return new int[]{a, b};
    }

    //4 https://edabit.com/challenge/vzhWSMR2A6wDyFK2o
    public static boolean hasSameBread(String[] a, String[] b) {
        if (a[0] == b[0] && a[a.length - 1] == b[b.length - 1]) {
            return true;
        }
        return false;
    }

    //5 https://edabit.com/challenge/GDWatbfCLg9H7uPMF
    public static int getLastItem(int[] nums) {
        return nums[nums.length - 1];
    }

    //6 https://edabit.com/challenge/ZGzabS3xzpPcT55E6
    public static String getXP(int[] c) {
        ;
        return String.valueOf(c[0] * 5 + c[1] * 10 + c[2] * 20 + c[3] * 40 + c[4] * 80 + "xp");
    }

    //7 https://edabit.com/challenge/6KjJ7PB6iTqDbShyF
    public static int valueAt(int[] r, double i) {
        return r[(int) Math.floor(i)];
    }

    //8 https://edabit.com/challenge/SQC525f4Wqn6F4LNC
    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //9  https://edabit.com/challenge/qaKffo5AZo2RMcKyN
    public static boolean squaresAndCubes(int[] arr) {
        int sqar = (int) Math.sqrt(arr[0]);
        int cubes = (int) Math.cbrt(arr[1]);
        if (sqar == cubes) {
            return true;
        }
        return false;
    }

    //10 https://edabit.com/challenge/YMLm3DpuZXHFDAnou
    public static int indexMultiplier(int[] arr) {
        int multi = 0;
        for (int i = 0; i < arr.length; i++) {
            multi += arr[i] * i;
        }
        return multi;
    }

    //11  https://edabit.com/challenge/Py6fFcpDMJNWyTxRD
    public static int countCharacters(String[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr.length;
        }
        return count;
    }

    //12  https://edabit.com/challenge/govh9K8oJDzYgXAkY
    public static int calcDeterminant(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1];
    }

    //13 https://edabit.com/challenge/iXN3vagpLRSwxRYvx
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

    //14 https://edabit.com/challenge/hAtARtyLzAHb2TEP5
    public static boolean check(int[] arr, int el) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) {
                return true;
            }
        }
        return false;
    }

    // 15 https://edabit.com/challenge/dWpuMsnxdJsBZqj8P
    public static boolean hurdleJump(int[] hurdles, int h) {
        for (int i : hurdles) {
            if (i < h) {
                return true;
            }
        }
        return false;
    }

    //16 https://edabit.com/challenge/BMzs2RZDgFvyLWn29
    public static boolean forbiddenLetter(String ch, String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(ch)) {
                return false;
            }
        }
        return true;
    }

    //17  https://edabit.com/challenge/rj5u8J5cn4CoEG3rY
    public static String[] firstLast(String[] arr) {
        String first = arr[0];
        String last = arr[arr.length - 1];
        String[] a = {first, last};
        return new String[]{arr[0], arr[arr.length - 1]};
    }

    //18 https://edabit.com/challenge/yNGGdbWigsLXwPMqY
    public static int sumOfCubes(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            if (i == 0) {
                return 0;
            }
            sum += i * i * i;
        }
        return sum;
    }

    //19  https://edabit.com/challenge/B5u9LiN7cZHLkJzXa
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

    //20 https://edabit.com/challenge/Mr48aLdKMXpGrdTXK
    public static int[] MultiplyByLength(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr.length;
        }
        return arr;
    }

    //21  https://edabit.com/challenge/oseKrpJdL8knnm4NT
    public static int[] additiveInverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= -1;
        }
        return arr;
    }

    //22 https://edabit.com/challenge/ZLbP9bodP2yxgcuz4
    public static int search(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }

    //23 https://edabit.com/challenge/n22eru9bm8LMcBdYt
    public static String[] addEnding(String[] arr, String ending) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += ending;
        }
        return arr;
    }

    //24 https://edabit.com/challenge/mkAsw6owW6F7h2sfy
    public static boolean checkFactors(int[] factors, int num) {
        for (int i = 0; i < factors.length; i++) {
            if (num % factors[i] != 0) {
                return false;
            }
        }
        return true;
    }

    //25 https://edabit.com/challenge/YG5hYruH8TfqeZ3dc
    public static int findIndex(String[] arr, String str) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == str) {
                return i;
            }
        }
        return -1;
    }

    //26 https://edabit.com/challenge/kPHNYy2E6EijPLDja
    public static int[] correctStream(String[] user, String[] correct) {
        int[] arr = new int[user.length];
        for (int i = 0; i < user.length; i++) {
            if (user[i] == correct[i]) {
                arr[i] = 1;
            } else {
                arr[i] = -1;
            }
        }
        return arr;
    }

    //27   https://edabit.com/challenge/wFPAkqT72h4WGEuYN
    public static String hackerSpeak(String str) {
        return str.replace("a", "4").replace("e", "3").replace("i", "1").replace("o", "0").replace("s", "5");
    }

    //28 https://edabit.com/challenge/RXpy6CSczRnuE7r2q
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

    //29  https://edabit.com/challenge/wWRKKJNppJXwocprL
    public static String formatDate(String date) {
        String[] arr = date.split("/");
        return arr[2] + arr[1] + arr[0];
    }

    //30  https://edabit.com/challenge/7JBbNzmBuBEX7KPoH
    public static boolean testJackpot(String[] result) {
        for (int i = 0; i < result.length; i++) {
            if (result[i] != result[result.length - 1]) {
                return false;
            }
        }
        return true;
    }

    //31   https://edabit.com/challenge/Pbbu6wDPnqbbzXwTG
    public static boolean[] integerBoolean(String bits) {
        boolean[] boo = new boolean[bits.length()];
        for (int i = 0; i < bits.length(); i++) {
            if (bits.charAt(i) == '1') {
                boo[i] = true;
            } else {
                boo[i] = false;
            }
        }
        return boo;
    }

    //32   https://edabit.com/challenge/rq4AeNEFm7uBsoDDn
    public static int getAbsSum(int[] nums) {
        int sum = 0;
//        pattern 1
//        for (int i=0;i<nums.length;i++){
//            sum+=Math.abs(nums[i]);
//        }
//        return sum;

//         pattern 2
//         for (int i:nums){
//             if (i<0){
//                 sum+=i* -1;
//             }else {
//                 sum+=i;
//             }
//         }
//         return sum;

//         pattern 3
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                sum += nums[i] * -1;
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }

    //33   https://edabit.com/challenge/5yCvczJJbq68Pavky
    public static int findLargestNum(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length-1];

        int sum = 0;
        for (int i : nums) {
            if (i > sum) {
                sum = i;
            }
        }
        return sum;
    }

    //34   https://edabit.com/challenge/utCRd99E6E3FRS4Rz
    public static int findSmallestInt(int[] args) {
//      Arrays.sort(args);
//      return args[0];
        int sum = args[args.length - 1];
        for (int i = 0; i < args.length; i++) {
            if (args[i] < sum) {
                sum = args[i];
            }
        }
        return sum;
    }

    //35   https://edabit.com/challenge/8HB8AB873TYGukT6J
    public static int[] countdown(int start) {
        int[] arr = new int[start + 1];
        for (int i = start; i >= 0; i--) {
            arr[start - i] = i;
        }
        return arr;
    }

    //36 https://edabit.com/challenge/Hu3HxFH3Gnv2CwCeH
    public static String findNemo(String sentence) {
        String[] str = sentence.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("Nemo")) {
                return "i found Nemo at " + (i + 1) + "!";
            }
        }
        return "\"I can't find Nemo :(\".";
    }

    //37 https://edabit.com/challenge/GEreBiJFJaTMb5wye
    public static int find_bob(String[] names) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Bob")) {
                return i;
            }
        }
        return -1;
    }

    //38 https://edabit.com/challenge/odJPfYRD3kSpE45Jf
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

    //------ EASY START --------------//
// 1 https://edabit.com/challenge/vKpGt4ufSKmEJ3Xjd
    public static int countTrue(boolean[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true) {
                count++;
            }
        }
        return count;
    }

    //2  https://edabit.com/challenge/aWzxPLibBLJgn8AbZ
    public static boolean existsHigher(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= n) {
                return true;
            }
        }
        return false;
    }

    //3 https://edabit.com/challenge/rYD9NTBmNhaPM6wx2
    public static boolean canCapture(String[] rooks) {
        for (int i = 0; i < rooks.length; i++) {
            if (rooks[0].charAt(0) == rooks[1].charAt(0) || rooks[0].charAt(1) == rooks[1].charAt(1)) {
                return true;
            }
        }
        return false;
    }

    //4 https://edabit.com/challenge/jfquehNLzpXW5ZQu5
//5 https://edabit.com/challenge/hymPkXdhmDQLe87QT
    public static int differenceMaxMin(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1] - arr[0];
    }

    //6   https://edabit.com/challenge/SvptD77rYQJgjDvZY
    public static boolean factorChain(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] % arr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    //7 https://edabit.com/challenge/sPz2LcPZyAiBHRgwX
    public static String formatPhoneNumber(int[] nums) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", nums[0], nums[1], nums[2], nums[3], nums[4], nums[5], nums[6], nums[7], nums[8], nums[9]);
    }

    //8 https://edabit.com/challenge/tQ26d2JJkxpjszfsk
    public static boolean matchLastItem(String[] t) {
        String sum = "";
        for (int i = 0; i < t.length - 1; i++) {
            sum += t[i];
        }
        if (t[t.length - 1].equals(sum)) {
            return true;
        }
        return false;

    }

    //9 https://edabit.com/challenge/WM5s7vuHnXdcKCEjS
    public static int[] sortNumsAscending(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }

    //10 https://edabit.com/challenge/pKmR5HRabYPkdGunz
    public static String[] capMe(String[] s) {
        for (int i = 0; i < s.length; i++) {
            s[i] = Character.toUpperCase(s[i].charAt(0)) + s[i].substring(1).toLowerCase();
        }
        return s;
    }

    //11   https://edabit.com/challenge/yk7GqGcCpFgQrk8fH
    public static boolean isAvgWhole(int[] arr) {

//        pattern 1

//        int sum=0;
//     for (int i=0;i<arr.length;i++){
//         sum+=arr[i];
//     }if (sum%arr.length==0){
//         return true;
//        }
//     return false;

//      pattern 2
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum % arr.length == 0;
    }

    //12  https://edabit.com/challenge/J4Yop3GjeZELWeoqT
    public static double[] minMax(double[] arr) {
        Arrays.sort(arr);

//        pattern 1
//        double a=arr[0];
//        double b=arr[arr.length-1];
//        return new double[]{a,b};

//        pattern 2
//        return new double[]{arr[0],arr[arr.length-1]};

//        pattern 3
        double min = arr[0];
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return new double[]{min, max};
    }

    //13 https://edabit.com/challenge/ryEdPW2eqyngyWayy
    public static String spaceMeOut(String str) {
        return str.replace("", " ").trim();
    }

    //14 https://edabit.com/challenge/TM5f33Mpu52m2jcat
    public static int maxTotal(int[] nums) {
        Arrays.sort(nums);
        return nums[9] + nums[8] + nums[7] + nums[6] + nums[5];
    }

    //15 https://edabit.com/challenge/XsJnE47kiTt39t3da
    public static double getBudgets(Person[] persons) {
        int totalBudgets = 0;
        for (int i = 0; i < persons.length; i++) {
            totalBudgets += persons[i].getBudget();
        }
        return totalBudgets;
    }

    //16 https://edabit.com/challenge/YmeiRhzaiR3MCPBiT
//     confusing
    public static boolean isSpecialArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != arr[i] % 2) {
                return false;
            }
        }
        return true;
    }

    //17 https://edabit.com/challenge/Xf7PqJnzukWe2WxqB
    public static int secondLargest(int[] num) {
        Arrays.sort(num);
        return num[num.length - 2];
    }

    //
//18 https://edabit.com/challenge/hgHMhpJjyFxYJMMXp
    public static String getFilename(String path) {

//     pattern 1
//       String [] str=path.split("/");
//       return str[str.length-1];

//       pattern 2
        return path.substring(path.lastIndexOf("/") + 1);
    }

    //19 https://edabit.com/challenge/jwXx478haGbZpRCWQ
    public static int[] findEvenNums(int num) {
        int[] arr = new int[num / 2];
        for (int i = 2; i <= num; i += 2) {
            arr[i] = i;
        }
        return arr;
//       2/2=1-1=0 2
//       4/2=2-1=1 4
//       6/2=3-1=2 6
//       8/2=4-1=3 8
    }

    //20  https://edabit.com/challenge/zgBjnxQw9MHTBHLED
    public static int nthSmallest(int[] arr, int n) {
        if (n > arr.length) {
            return -1;
        }
        return arr[n - 1];
    }

    //21  https://edabit.com/challenge/xkD7RBBDiWuDHTiXE
    public static boolean canNest(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return arr1[0] > arr2[0] && arr1[arr1.length - 1] < arr2[arr2.length - 1];
    }

    //22    https://edabit.com/challenge/zr7BBJbeYikNBN2hf
    public static String societyName(String[] friends) {
        String str = "";
        Arrays.sort(friends);
        for (int i = 0; i < friends.length; i++) {
            str += friends[i].charAt(0);
        }
        return str;
    }

    //23 https://edabit.com/challenge/LmiWWX2kdWn2Z5aZv
    public static int[] cumulativeSum(int[] nums) {

//  pattern 1
     /* int [] result = new int[nums.length];
      int sum =0;
      for (int i=0;i<nums.length;i++){
          sum+=nums[i];
          result[i]=sum;
      }
      return result;*/
//  pattern 2

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
//   1+1-1=1
//   2+2-1=3
//   3+3=6
    }

    // 24 https://edabit.com/challenge/HtruskPio7ricRvuG
    public static int incrementToTop(int[] arr) {
        Arrays.sort(arr);
        int top = 0;
        for (int i = 0; i < arr.length; i++) {
            top += arr[arr.length - 1] - arr[i];
        }
        return top;
    }

    //25 https://edabit.com/challenge/XD6bQFpCZWiAMPanQ
    public static int[] amplify(int num) {

//        pattern 1
       /*int [] arr=new int[num];
       for (int i = 1; i <= num; i++) {
           if (i%4==0){
               arr[i-1]=i*10;
           }else {
               arr[i-1]=i;
           }
       }
       return arr;*/
//       pattern 2
        int[] arr = new int[num];
        for (int i = 1; i <= num; i++) {
            arr[i - 1] = i % 4 == 0 ? i * 10 : i;
        }
        return arr;
    }

    //26 https://edabit.com/challenge/ENNmwseEab73TMoBc
    public static String[] getExtension(String[] arr) {

//        pattern 1
//     for (int i=0;i<arr.length;i++){
//         arr[i]=arr[i].split("\\.")[1];
//     }
//     return arr;

//     pattern 2
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].substring(arr[i].lastIndexOf(".") + 1);
        }
        return arr;
    }

    //27 https://edabit.com/challenge/EmRPehwiJFk6rf2iD
    public static String[] isFourLetters(String[] s) {
        String str = "";
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() == 4) {
                str += s[i] + ",";
            }
            if (s[i].length() == 0) {
                return new String[]{};
            }
        }
        return str.split(",");
    }

    //28  https://edabit.com/challenge/kzALnF5nT9YCbGMMm
    public static int findNaN(double[] n) {
        for (int i = 0; i < n.length; i++) {
            if (n[i] != n[i]) {
                return i;
            }
        }
        return -1;
    }

    //29 https://edabit.com/challenge/S6ScbuTciqryqTAAg
    public static int trimmedAverages(int[] arr) {
//        pattern 1

//        int min =arr[0];
//        int max=arr[0];
//        int sum = 0;
//        for (int i :arr){
//            if (i<min){
//                min=i;
//            }if (i>max){
//                max=i;
//            }
//                sum+=i;
//        }
//        return  Math.round((sum-max-min)/(arr.length-2));

//        pattern 2
        Arrays.sort(arr);
        double sum = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            sum += arr[i];
        }
        return (int) Math.round(sum / (arr.length - 2));
    }

    //30 https://edabit.com/challenge/E2WdAPmgNJnbL5RvF
    public static int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[i + arr1.length] = arr2[i];
        }
        return result;
    }

    //31   https://edabit.com/challenge/AwHcrbtX9vXXbARmX
    public static int[] filterByLength(int[] numbers, int length) {
//        mistek h
        int[] arr = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (String.valueOf(numbers[i]).length() == length) {
                arr[i] = numbers[i];
            }
        }
        return arr;
    }

    //32  https://edabit.com/challenge/YNQQynxnFeoKNiqTM
    public static String removeSpecialCharacters(String s) {
        String str = "";
        str = s.replaceAll("[^a-zA-Z0-9]", "");
        return str;
    }

    //33  https://edabit.com/challenge/j5mm8HjTZGZagrnz8
    public static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] += arr[arr.length - 1 - i];
        }
        return result;
    }

// ----------- MEDIUM START ---------------  //


    //1 https://edabit.com/challenge/rzpucPyoyEtXPo2BG
    public static int[] arrayOfMultiples(int num, int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = num * (i + 1);
        }
        return arr;
    }

    // 2 https://edabit.com/challenge/7fHsizQrTLXsPWMyH
    public static int warOfNumbers(int[] numbers) {

//     pattern 1

       /* int even = 0,odd=0,sum=0;
        for (int i=0;i<numbers.length;i++) {
            if (numbers[i] % 2 == 0) {
                even += numbers[i];
            } else if (numbers[i] % 2 != 0) {
                odd += numbers[i];
            }
            if (even > odd) {
                sum=even - odd;
            } else {
                sum= odd - even;
            }
        }
        return sum;*/

//    pattern 2

        int even = 0, odd = 0;
        for (int i : numbers) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }
        return Math.abs(even - odd);
    }

    // 3 https://edabit.com/challenge/Sej5nsmmjBAXv6hHv
    public static int letterCounter(char[][] arr, char c) {

//        pattern 1
//        int coumt =0;
//            for (char[] i :arr){
//                for (char j : i){
//                    if (j==c){
//                        coumt++;
//                    }
//                }
//            }
//              return coumt;
//     }
//  pattern 2
        int o = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                o += arr[i][j] == c ? 1 : 0;
        return o;
    }

    // 4   https://edabit.com/challenge/7Tb7qMDQHtz3xpydd
    public static int[][] squarePatch(int n) {
//        mistake
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = n;
            }
        }
        return result;
    }

    // 5    https://edabit.com/challenge/hf2THAoQRQbAx2jc9
    public static int sum(int[] arr) {
//        mistake
        int sum = 0;
        for (int i : arr) {
            sum += sum(arr) + arr[arr.length - 1];
        }
        return sum;
    }

    //6 https://edabit.com/challenge/L5uwyF4SsAG4DmPpJ
    public static int spinAround(String[] turns) {
        int spin = 0;
        for (int i = 0; i < turns.length; i++) {
            if (turns[i].equals("right")) {
                spin += 90;
            } else {
                spin -= 90;
            }
        }
        return Math.abs(spin / 360);
    }

    // 7 https://edabit.com/challenge/c52kNwPuWo5kp9x4H
    public static String flipEndChars(String s) {
        if (s.length() < 2) {
            return "Incompatible.";
        } else if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return "Two's a pair.";
        }
        return s.substring(s.length() - 1) + s.substring(1, s.length() - 1) + s.charAt(0);
    }

    // 8   https://edabit.com/challenge/r7JegKpMpntfDyy6D
    public static String[] jazzify(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
//            if (!arr[i].endsWith("7")){
            if (arr[i].charAt(arr[i].length() - 1) != '7') {
                arr[i] += "7";
            }
        }
        return arr;
    }

    // 9 https://edabit.com/challenge/diiEDD4JQyysFR7zh
    public static String[] getBirthdayCake(String name, int age) {
        String i = (age % 2 == 0 ? "#" : "*");
        String[] arr = new String[3];
        arr[1] = "\n" + i + " " + age + " Happy Birthday " + name + " ! " + age + " " + i + "\n";
        arr[0] = i.repeat(arr[1].length());
        arr[2] = arr[0];
        return arr;
    }

    //10 https://edabit.com/challenge/QLz5aGfChHhndKWMv
    public static double[] findLargestNums(double[][] arr) {
        double[] da = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
            da[i] = arr[i][arr[i].length - 1];
        }
        return da;
    }

    //11    https://edabit.com/challenge/E22KYTGMhwpYtjn8x
    public static int[] numberSplit(int n) {
        int[] a = new int[2];
    /* if (n%2==0){
         a[0]=n/2;
         a[1]=n/2;
         return a;
     }else {
//         a[0]=n/2;
//         a[1]=n/2+1;
         a[0]=(n+1)/2;
         a[1]=(n-1)/2;
         }
        Arrays.sort(a);
     return a;*/
        return new int[]{(int) Math.floor(n / 2.0), (int) Math.ceil(n / 2.0)};
    }

    //12 https://edabit.com/challenge/ibJLbwfkTbP9229Kt
    public static int totalVolume(int[][] part) {
        int voluem = 0;

//        pattern 1
//        for (int i=0;i<part.length;i++){
//            voluem+=part[i][0]*part[i][1]*part[i][2];
//        }
//        return voluem;

//        pattern 2
        for (int[] i : part) {
            voluem += i[0] * i[1] * i[2];
        }
        return voluem;
    }

    // 13   https://edabit.com/challenge/A7mDjLb7DZL5bk8oz
    public static int[] noOdds(int[] nums) {
//        mistake
        int[] arr = new int[nums.length];
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                arr[even] = nums[i];
                even++;
            }
        }
        return arr;
    }

    //14  https://edabit.com/challenge/3mCJ3idbMqueRTa7b
    public static String[] filterStateNames(String[] arr, String type) {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if (type.equals("abb") && arr[i].length() == 2 || type.equals("full") && arr[i].length() > 2)
                str += arr[i] + " ";
        }
        return str.split(" ");
    }

    //15  https://edabit.com/challenge/n7kbvMp5zHRmRbFQF
    public static int[] countPositivesSumNegatives(int[] input) {
        int sum = 0, count = 0;
        /*  int[] arr=new int[2];
                if (input.length==0){
           return new int[]{};
        }
        for (int i=0;i<input.length;i++){
            if (input[i]<0){
                arr[1]+=input[i];
            }else {
                arr[0]++;
            }
        }
        return arr;*/

//      pattern 2
        if (input.length == 0) {
            return new int[]{};
        }
        for (int i : input) {
            if (i < 0) {
                sum += i;
            } else {
                count++;
            }
        }
        return new int[]{count, sum};
    }

    //16   https://edabit.com/challenge/jtFNMktij8FcH6zna
    public static boolean puzzlePieces(int[][] n) {
        if (n[0].length != n[1].length) {
            return false;
        }
        int[] sum = new int[2];
        for (int i = 0; i < n.length; i++) {
            sum[i] = n[i][0] + n[i][1];
            if (sum[i] != n[i][0] + n[i][1]) {
                return false;
            }
        }
        return true;
    }

    // 17   https://edabit.com/challenge/tunTJAdBeLgc8s4ap
    public static String[] identicalFilter(String[] arr) {
        String a = "";
        for (String i : arr) {
            if (i.replaceAll(String.valueOf(i.charAt(0)), "").length() == 0) {
                a += i + " ";
            }
        }
        return a.length() == 0 ? new String[]{} : a.split(" ");
    }

    //18 https://edabit.com/challenge/u7prkNxFxqartAfiG
    public static int sumTwoSmallestNums(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                return arr[i] + arr[i + 1];
            }
        }
        return -1;
    }

    //19 https://edabit.com/challenge/DwMxxFrzZ5eZfBSGL
    public static int[] inclusiveArray(int startNum, int endNum) {
        if (startNum > endNum) {
            return new int[]{};
        }
        int arr = endNum - startNum + 1;
        int[] a = new int[arr];
        for (int i = 0; i < arr; i++) {
            a[i] = startNum + i;
        }
        return a;
    }

    // 20   https://edabit.com/challenge/ZY7b6LA5BeWQJnJX5
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

    // 21   https://edabit.com/challenge/LzY7r73f9xKhKvtki
    public static String longestWord(String phrase) {
        String longest = "";
        for (String str : phrase.split(" ")) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        return longest;
    }

    // 22 https://edabit.com/challenge/uYS6jZBk5sQ6qQyrK
    public static int WeeklySalary(int[] hours) {
        return 0;
    }

    //23  https://edabit.com/challenge/KESQCRf5mJd7x6Rfh
    public static String[] removeDups(String[] str) {
        LinkedHashSet<String> dups = new LinkedHashSet<String>(Arrays.asList(str));
        String[] arr = dups.toArray(new String[dups.size()]);
        return arr;
    }

    public static LinkedHashSet<Integer> removeDups1(int[] nums) {
        LinkedHashSet<Integer> in = new LinkedHashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            in.add(nums[i]);
        }
        return new LinkedHashSet<>(in);
    }

    // 24 https://edabit.com/challenge/JPDNpqri6djiC8ptP
    public static String[][] zipIt(String[] women, String[] men) {
        if (women.length != men.length) {
            return null;
        }
        String[][] str = new String[women.length][2];
        for (int i = 0; i < women.length; i++) {
            str[i][0] = women[i];
            str[i][1] = men[i];
        }
        return str;
    }

    //25 https://edabit.com/challenge/tvaT25krB65pYtghq
    public static double averageIndex(String[] arr) {
        double sum = 0;
        for (String str : arr) {
            sum += str.charAt(0) - 96;
        }
        return sum / arr.length;
    }

    // 26 https://edabit.com/challenge/CnCvL9vmjYtFG785t
    public static int[] last(int[] r, int n) {
        if (r.length < n) {
            return null;
        }
        int[] arr = new int[n];
        int as = 0;
        for (int i = r.length - n; i < r.length; i++) {
            arr[as] = r[i];
            as++;
        }
        return arr;
    }

    // 27  https://edabit.com/challenge/WrHfLyMXCMuGjxf2s
    public static String indexFilter(int[] idx, String str) {
        String result = "";
        for (int i = 0; i < idx.length; i++) {
            if (idx[i] >= 0) {
                result += str.charAt(idx[i]);
            } else {
                result += str.charAt(idx[i] + str.length());
            }
        }
        return result;
    }

    // 28   https://edabit.com/challenge/zmbR8SKveCgJ6KB5G
    public static int duplicates(String str) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(String.valueOf(str.charAt(i)));
        }
        return str.length() - set.size();
    }

    // 29  https://edabit.com/challenge/T3zjJiXoNRqXqEx9u
    public static Object[] clone(Object[] arr) {
        ArrayList<Object> ar = new ArrayList<>();
        for (Object i : arr) {
            ar.add(arr);
            ar.add(i);
        }
        return ar.toArray();
    }
//30 https://edabit.com/challenge/KGhmvXpF6iK8mAqgj


    public static void main(String[] args) {

        System.out.println(Arrays.toString(revision.clone(new Object[]{5, 44})));

//        System.out.println(revision.indexFilter(new int[]{7, -1, 5, 1},"She is the love of my love"));
//        System.out.println(revision.indexFilter(new int[]{7, -1, 5, 1},"She is the love of my love"));

//26        System.out.println(Arrays.toString(revision.last(new int[]{1,2,3,4,5,6,7},7)));
//        System.out.println(Arrays.toString(revision.last(new int[]{1,2,3,4,5},7)));

//25        System.out.println(revision.averageIndex(new String[]{"f", "o", "r", "t", "h", "e", "l", "o", "v", "e", "o", "f", "t", "e", "s", "h"}));
//        System.out.println(revision.averageIndex(new String[]{"y", "o", "u", "a", "r", "e", "t", "h", "e", "b", "e", "s", "t"}));

// 24      System.out.println(Arrays.toString(revision.zipIt(new String[]{"nawaz","quazi","akib"},new String[]{"quazi","akib","nawaz"})));

// 23     System.out.println(Arrays.toString(revision.removeDups(new String[]{"John", "Taylor", "John"})));
//        System.out.println(revision.removeDups1(new int[]{1, 2, 3, 4, 5, 4, 5, 4, 3}));

// 21       System.out.println(revision.longestWord("Margaret's toy is a pretty doll."));
//        System.out.println(revision.longestWord("MOHAMMD AKIB NAWAZ QUAZI "));

//  20      System.out.println(revision.omnipresent(new int[][]{{1,1},{1,3},{5,1},{6,1}},1));
//        System.out.println(revision.omnipresent(new int[][]{{1,1},{1,3},{5,1},{6,1,5}},6));

// 19       System.out.println(Arrays.toString(revision.inclusiveArray(1,5)));
//        System.out.println(Arrays.toString(revision.inclusiveArray(2,8)));
//        System.out.println(Arrays.toString(revision.inclusiveArray(10,20)));

// 18       System.out.println(revision.sumTwoSmallestNums(new int[]{19, 5, 42, 2, 77}));
//        System.out.println(revision.sumTwoSmallestNums(new int[]{879, 953, 694, -847, 342, 221, -91, -723, 791, -587}));

//17        System.out.println(Arrays.toString(revision.identicalFilter(new String[]{"aaaaaa", "bc", "d", "eeee", "xyz"})));
//        System.out.println(Arrays.toString(revision.identicalFilter(new String[]{"88", "999", "22", "545", "133"})));

//  16      System.out.println(revision.puzzlePieces(new int[][]{{1,2,3,4},{4,3,2,1}}));
//        System.out.println(revision.puzzlePieces(new int[][]{{1,2},{-1,-1}}));

//       System.out.println(Arrays.toString(revision.countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15})));
//        System.out.println(Arrays.toString(revision.countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 4,77,-6,6,-877,-876,9, 10, -11, -12, -13, -14, -15})));
//        System.out.println(Arrays.toString(revision.countPositivesSumNegatives(new int[]{})));

// 14       System.out.println(Arrays.toString(revision.filterStateNames(new String[]{"Arizona", "CA", "NY", "Nevada"},"abb")));
//        System.out.println(Arrays.toString(revision.filterStateNames(new String[]{"Arizona", "CA", "NY", "Nevada"},"full")));

//  13      System.out.println(Arrays.toString(revision.noOdds(new int[]{1, 2, 3, 4, 5, 6, 7, 8})));
//        System.out.println(Arrays.toString(revision.noOdds(new int[]{3,6,9,12,15,18,21,24,27,30})));

//  12      System.out.println(revision.totalVolume(new int[][]{{4,2,4},{3,3,3},{1,1,2},{2,1,1}}));
//        System.out.println(revision.totalVolume(new int[][]{{2,3,2},{6,6,7},{1,2,1}}));

// 11       System.out.println(Arrays.toString(revision.numberSplit(25)));
//        System.out.println(Arrays.toString(revision.numberSplit(2001)));

// 10       System.out.println(Arrays.toString(revision.findLargestNums(new double[][]{{4,2,7,1},{20,70,40,90},{1,2,0}})));
//        System.out.println(Arrays.toString(revision.findLargestNums(new double[][]{{4,2,7,1},{20,70,40,90},{1,2,0}})));

// 9       System.out.println(Arrays.toString(revision.getBirthdayCake("nawaz",19)));
//        System.out.println(Arrays.toString(revision.getBirthdayCake("nawaz",18)));

// 8       System.out.println(Arrays.toString(revision.jazzify(new String[]{"F7", "E7", "A7", "Ab7", "Gm7", "C7"})));
//        System.out.println(Arrays.toString(revision.jazzify(new String[]{"G", "F", "C"})));
//        System.out.println(Arrays.toString(revision.jazzify(new String[]{"Dm", "G", "E", "A"})));

        System.out.println(revision.flipEndChars("z"));
        System.out.println(revision.flipEndChars("Cat, dog, and mouse."));
        System.out.println(revision.flipEndChars("Ada"));
        System.out.println(revision.flipEndChars("ada"));

//  6      System.out.println(revision.spinAround(new String[]{"right", "right", "right", "right", "left", "right"}));
//        System.out.println(revision.spinAround(new String[]{"right", "right", "right", "right", "right", "right", "right", "right"}));

//  5      System.out.println(revision.sum(new int[]{1,2,3,4}));
//        System.out.println(revision.sum(new int[]{1,2,3,4}));

// 4       System.out.println(Arrays.toString(revision.squarePatch(5)));

// 3       System.out.println(Arrays.toString(new int[]{Challenge.letterCounter(new char[][]{{'D', 'E', 'Y', 'H', 'A', 'D',
//                'C', 'B', 'Z', 'Y', 'J', 'K',
//                'D', 'B', 'C', 'A', 'M', 'N',
//                'F', 'G', 'G', 'R', 'S', 'R',
//                'V', 'X', 'H', 'A', 'S', 'S'
//                }}, 'D')}));

// 2       System.out.println(revision.warOfNumbers(new int[]{2,8,7,5}));
//        System.out.println(revision.warOfNumbers(new int[]{5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243}));

// 1       System.out.println(Arrays.toString(revision.arrayOfMultiples(7,5)));
//        System.out.println(Arrays.toString(revision.arrayOfMultiples(4,5)));


// ----------- EASY END --------------------


// 33       System.out.println(Arrays.toString(revision.reverse(new int[]{1,234,6,45,667})));
//        System.out.println(Arrays.toString(revision.reverse(new int[]{1,234,6,45,667,54,5452,55,4,54})));

// 32       System.out.println(revision.removeSpecialCharacters("%fd76$fd(-)6GvKlO."));
//        System.out.println(revision.removeSpecialCharacters("nawaz @#$%^qua$$zi%^&*"));

// 31       System.out.println(Arrays.toString(revision.filterByLength(new int[]{12, 2000, 13, 1979, 12, 17},2)));
//        System.out.println(Arrays.toString(revision.filterByLength(new int[]{12, 2000, 13, 1979, 12, 17},3)));

//30        System.out.println(Arrays.toString(revision.concat(new int[]{1,3,5},new int[]{2,6,8})));
//        System.out.println(Arrays.toString(revision.concat(new int[]{1,3,5,5,4,424,423,45,},new int[]{2,6,8,4,32,43,34,43})));

// 29       System.out.println(revision.trimmedAverages(new int[]{4,5,7,100}));
//        System.out.println(revision.trimmedAverages(new int[]{5, 4, 54, 4, 6, 46, 56}));

//28        System.out.println(revision.findNaN(new double[]{1,2,NaN}));
//        System.out.println(revision.findNaN(new double[]{NaN,1,2,3,4}));
//        System.out.println(revision.findNaN(new double[]{1,2,3,4}));

//27        System.out.println(Arrays.toString(revision.isFourLetters(new String[]{"Tomato", "Potato", "Pair","nawa"})));
//        System.out.println(Arrays.toString(revision.isFourLetters(new String[]{"Ryan", "Kieran", "Jason", "Matt"})));

//26        System.out.println(Arrays.toString(revision.getExtension(new String[]{"code.html", "code.css"})));
//        System.out.println(Arrays.toString(revision.getExtension(new String[]{"nawazquazi@gmail.com", "code.css"})));

//25        System.out.println(Arrays.toString(revision.amplify(25)));
//        System.out.println(Arrays.toString(revision.amplify(25)));

// 24       System.out.println(revision.incrementToTop(new int[]{3,4,5}));
//        System.out.println(revision.incrementToTop(new int[]{3,4,5}));

//  23      System.out.println(Arrays.toString(revision.cumulativeSum(new int[]{1,2,3})));

// 22       System.out.println(revision.societyName(new String[]{"Harry", "Newt", "Luna", "Cho"}));
//        System.out.println(revision.societyName(new String[]{"Phoebe", "Chandler", "Rachel", "Ross", "Monica", "Joey"}));

//21        System.out.println(revision.canNest(new int[]{1,2,3,4},new int[]{0,6}));
//        System.out.println(revision.canNest(new int[]{9,9,8},new int[]{8,9}));

//20        System.out.println(revision.nthSmallest(new int[]{1,3,5,7},1));
//        System.out.println(revision.nthSmallest(new int[]{1,3,5,7},5));

//19        System.out.println(Arrays.toString(revision.findEvenNums(8)));

// 18       System.out.println(revision.getFilename("C:/Projects/pil_tests/ascii/edabit.txt"));
//        System.out.println(revision.getFilename("https://edabit.com/challenge/jwXx478haGbZpRCWQ"));

// 17       System.out.println(revision.secondLargest(new int[]{555553,2,455,67,554,457,4,36,456,}));
//        System.out.println(revision.secondLargest(new int[]{25, 143, 89, 13, 105}));

// 16       System.out.println(revision.isSpecialArray(new int[]{2, 7, 4, 9, 6, 1, 6, 3}));
        System.out.println(revision.isSpecialArray(new int[]{1, 3, 5, 7, 9}));
        System.out.println(revision.isSpecialArray(new int[]{1, 2, 3, 4, 7, 9}));

// 15       System.out.println(revision.getBudgets(new Person[] { new Person("John", 21, 23000), new Person("Steve", 32, 40000),
//                new Person("Martin", 16, 2700) }));

// 14       System.out.println(revision.maxTotal(new int[]{1,1,0,1,3,10,10,10,10,1}));
//        System.out.println(revision.maxTotal(new int[]{34,35,67,45,436,4326,326,3432,5,3552}));
//        System.out.println(revision.maxTotal(new int[]{1,2, 3, 4, 5, 6, 7, 8, 9, 10}));

// 13       System.out.println(revision.spaceMeOut("space"));
//        System.out.println(revision.spaceMeOut("Nawaz"));

//12        System.out.println(Arrays.toString(revision.minMax(new double[]{1,2,3,4,5,-1})));

//11        System.out.println(revision.isAvgWhole(new int[]{1,3}));
//        System.out.println(revision.isAvgWhole(new int[]{1,2,3,4}));

//  10      System.out.println(Arrays.toString(revision.capMe(new String[]{"mavis", "senaida", "letty"})));
//        System.out.println(Arrays.toString(revision.capMe(new String[]{"nawaz","quazi"})));

//  9      System.out.println(Arrays.toString(revision.sortNumsAscending(new int[]{1,2,10,50,5})));
//        System.out.println(Arrays.toString(revision.sortNumsAscending(new int[]{80,29,4,-95,-24,85})));

// 8     System.out.println(revision.matchLastItem(new String[]{"i", "love", "tesh", "ilovetesh"}));
//        System.out.println(revision.matchLastItem(new String[]{"i", "am", "into", "her", "world", "iamintoherworld"}));
//        System.out.println(revision.matchLastItem(new String[]{"1", "1", "1", "11"}));

// 7       System.out.println(revision.formatPhoneNumber(new int[]{1,2,3,4,5,6,7,8,9,0}));
//        System.out.println(revision.formatPhoneNumber(new int[]{9,4,6,0,9,8,5,4,4,1}));
//        System.out.println(revision.formatPhoneNumber(new int[]{6,3,5,0,5,9,3,4,0,3}));

//6        System.out.println(revision.factorChain(new int[]{1, 2, 4, 8, 16, 32}));
//        System.out.println(revision.factorChain(new int[]{1,1,1,1,1,1,1}));
//        System.out.println(revision.factorChain(new int[]{2,4,6,7,12}));

// 5       System.out.println(revision.differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}));
//        System.out.println(revision.differenceMaxMin(new int[]{44,32,86,19}));

//3        System.out.println(revision.canCapture(new String[]{"A8","E8"}));
//        System.out.println(revision.canCapture(new String[]{"A1","B2"}));
//        System.out.println(revision.canCapture(new String[]{"H4","H3"}));
//        System.out.println(revision.canCapture(new String[]{"f5","c8"}));

// 2       System.out.println(revision.existsHigher(new int[]{5, 3, 15, 22, 4}, 10));
//        System.out.println(revision.existsHigher(new int[]{1,2,3,4,5}, 8));
//        System.out.println(revision.existsHigher(new int[]{4,3,3,3,3,2,2,2}, 4));
//        System.out.println(revision.existsHigher(new int[]{}, 8));

// 1       System.out.println(countTrue(new boolean[]{true, false, false, true, false}));
//        System.out.println(countTrue(new boolean[]{false, false, false, false, false}));
//        System.out.println(countTrue(new boolean[]{}));
//        System.out.println(countTrue(new boolean[]{true,true,true,true,true,true,true,}));


//--------------- VERY EAYS EMD --------------//
// 38       System.out.println(revision.nSidedShape(3));
//        System.out.println(revision.nSidedShape(4));
//        System.out.println(revision.nSidedShape(456));

// 37       System.out.println(revision.find_bob(new String[]{"Jimmy", "Layla", "Bob"}));
//        System.out.println(revision.find_bob(new String[]{"Bob", "Layla", "Kaitlyn", "Patricia"}));
//        System.out.println(revision.find_bob(new String[]{"Jimmy", "Layla", "James"}));

//  36      System.out.println(revision.findNemo("I am finding Nemo !"));
//        System.out.println(revision.findNemo("I am finding !"));

// 35       System.out.println(Arrays.toString(revision.countdown(10)));
//        System.out.println(Arrays.toString(revision.countdown(23)));

//  34      System.out.println(revision.findSmallestInt(new int[]{23,43,34546,254,4,35,325,455,45}));

// 33       System.out.println(revision.findLargestNum(new int[]{4,5,1,3}));
//        System.out.println(revision.findLargestNum(new int[]{4,5,1,3,4642,245,656,54645,5436,467,}));
//        System.out.println(revision.findLargestNum(new int[]{4,454,46,46,4543,5654,5436,4536}));

//   32     System.out.println(revision.getAbsSum(new int[]{2,-1,4,8,10}));
//        System.out.println(revision.getAbsSum(new int[]{2,-1,4,-8,-10}));

// 31       System.out.println(Arrays.toString(revision.integerBoolean(new String("01110"))));
//        System.out.println(Arrays.toString(revision.integerBoolean(new String("011100101001"))));
//        System.out.println(Arrays.toString(revision.integerBoolean(new String("0111"))));

// 30       System.out.println(revision.testJackpot(new String[]{"@", "@", "@", "@"}));
//        System.out.println(revision.testJackpot(new String[]{"&&", "&", "&&&", "&&&&"}));

// 29       System.out.println(revision.formatDate("11/12/2019"));

//28       System.out.println(revision.minimumRemovals(new int[]{1,2,3,4,5}));
//        System.out.println(revision.minimumRemovals(new int[]{5,7,9,11}));

// 27       System.out.println(revision.hackerSpeak("javascript is cool"));
//        System.out.println(revision.hackerSpeak("programming is fun"));

// 26      System.out.println(Arrays.toString(revision.correctStream(new String[]{"cat", "blue", "skt", "umbrells", "paddy"},new String[]{"cat", "blue", "sky", "umbrella", "paddy"})));
//        System.out.println(Arrays.toString(revision.correctStream(new String[]{"cat", "blue", "scdkt", "umbwfrells", "padfedy"},new String[]{"cat", "blue", "skefy", "umbrella", "paddy"})));

//25        System.out.println(revision.findIndex(new String[]{"hi", "edabit", "fgh", "abc"}, "fgh"));
//        System.out.println(revision.findIndex(new String[]{"Red", "blue", "Blue", "Green"}, "blue"));

//24    System.out.println(revision.checkFactors(new int[]{2,3,4},12));
//        System.out.println(revision.checkFactors(new int[]{1,2,3,8},12));

// 23       System.out.println(Arrays.toString(revision.addEnding(new String[]{"clever", "meek", "hurried", "nice"},"ly")));

//  22      System.out.println(revision.search(new int[]{1,2,3,4},3));
//        System.out.println(revision.search(new int[]{2,4,6,8,10},8));
//        System.out.println(revision.search(new int[]{1,3,5,7,9},11));

// 21       System.out.println(Arrays.toString(revision.additiveInverse(new int[]{1,-2,445,-43})));
//        System.out.println(Arrays.toString(revision.additiveInverse(new int[]{1,-2,445,-43,45,-5,53,-336})));

// 20       System.out.println(Arrays.toString(revision.MultiplyByLength(new int[]{2,3,1,0})));
//        System.out.println(Arrays.toString(revision.MultiplyByLength(new int[]{2,3,1,0,0,354,456,764,68,48754})));

// 19       System.out.println(Arrays.toString(revision.transform(new int[]{1,2,3,4,5})));
//        System.out.println(Arrays.toString(revision.transform(new int[]{1,2,68,8,887,3,4,5})));

// 18       System.out.println(revision.sumOfCubes(new int[]{1,5,9}));
//        System.out.println(revision.sumOfCubes(new int[]{2}));
//        System.out.println(revision.sumOfCubes(new int[]{}));

//17        System.out.println(Arrays.toString(revision.firstLast(new String[]{"edabit", "13", "true"})));
//        System.out.println(Arrays.toString(revision.firstLast(new String[]{"edabit", "13", "true","nawaz","quazi"})));

// 16       System.out.println(revision.forbiddenLetter("m",new String[]{"deep","loves","tesh"}));
//        System.out.println(revision.forbiddenLetter("r",new String[]{"rock", "paper", "scissors"}));

// 15       System.out.println(revision.hurdleJump(new int[]{1,2,3,4,5},5));
//        System.out.println(revision.hurdleJump(new int[]{5,5,3,4,5},3));
//        System.out.println(revision.hurdleJump(new int[]{5,4,5,6},10));

// 14       System.out.println(revision.check(new int[]{1,2,2,3,4,5},4));
//        System.out.println(revision.check(new int[]{1,2,2,3,4,5},8));
//        System.out.println(revision.check(new int[]{},5));

//13        System.out.println(revision.monthName(7));
//        System.out.println(revision.monthName(6));
//        System.out.println(revision.monthName(4));

//12        System.out.println(revision.calcDeterminant(new int[][]{{1,2},{3,4}}));

// 11       System.out.println(revision.countCharacters(new String[]{"###","###","###"}));
//        System.out.println(revision.countCharacters(new String[]{"###","###","###","35254","nawaz"}));

// 10      System.out.println(revision.indexMultiplier(new int[]{1,2,3,4,5}));
//        System.out.println(revision.indexMultiplier(new int[]{1,2,3,4,5,1,2,3,4,5}));

// 9       System.out.println(revision.squaresAndCubes(new int[]{4,8}));
//        System.out.println(revision.squaresAndCubes(new int[]{16,48}));

// 8       System.out.println(revision.arraySum(new int[]{2,7,4}));
//        System.out.println(revision.arraySum(new int[]{2,7,4,46,656,56,4,57,547,54,43}));

// 7       System.out.println(revision.valueAt(new int[]{1,2,3,4,5,6},10/2));
//        System.out.println(revision.valueAt(new int[]{1,2,3,4,5,6},6.5636542/2));

//  6      System.out.println(revision.getXP(new int[]{89, 77, 30, 4, 1}));

//  5      System.out.println(revision.getLastItem(new int[]{2,3,65,26,756,34}));
//        System.out.println(revision.getLastItem(new int[]{2,3,65,26,756,34,645,26576,265,456,3453,645767,653445}));

//4        System.out.println(revision.hasSameBread(new String[]{"white bread", "lettuce", "white bread"},new String[]{"white bread", "tomato", "white bread"}));
//        System.out.println(revision.hasSameBread(new String[]{"brown bread", "chicken", "brown bread"},new String[]{"white bread", "chicken", "white bread"}));

//3       System.out.println(Arrays.toString(revision.makePair(2,4)));
//        System.out.println(Arrays.toString(revision.makePair(35456,5654748)));

//2       System.out.println(revision.getFirstValue(new int[]{1,2,3}));
//        System.out.println(revision.getFirstValue(new int[]{-500,0,50}));

//1        System.out.println(revision.getVoteCount(13,0));
//        System.out.println(revision.getVoteCount(13,34));

    }
}


