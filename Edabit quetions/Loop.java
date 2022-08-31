import java.util.*;

public class Loop {
    //1 https://edabit.com/challenge/sn9KfW72BBoT7eesC
    public static ArrayList<Integer> PrintArray(int number) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int count = 1; count <= number; count++) {
            array.add(count);
        }
        return array;
    }

    // 2 https://edabit.com/challenge/LYAuwTojeNTyEiHgC
    // 3 https://edabit.com/challenge/32iWpCcttQSaGB7xS
    public static long calculateExponent(int num, int exp) {
        return (long) Math.pow(num, exp);
    }

    //4 https://edabit.com/challenge/6ECfG93f3izMagjkP
    public static int addUpTo(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    //5   https://edabit.com/challenge/BMzs2RZDgFvyLWn29
    public static boolean forbiddenLetter(String ch, String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(ch)) {
                return false;
            }
        }
        return true;
    }

    // 6  https://edabit.com/challenge/TfL74CMecNnmtABNg
    public static int[] mysteryFunc(int[] arr, int num) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % num == 0) {
                a = arr[0];
            }
        }
        return arr;
    }

    //7 https://edabit.com/challenge/yNGGdbWigsLXwPMqY
    public static int[] sumOfCubes(int[] nums) {
        int rr = 0;
        for (int i = 0; i < nums.length; i++) {
            rr += nums[i] * nums[i] * nums[i];
        }
        return new int[]{rr};
    }

    // 8    https://edabit.com/challenge/oqMBTbwcxMDodEbWs
    public static String howManyTimes(int num) {
        String s = "";
        for (int i = 0; i < num; i++) {
            s += "a";
        }
        return "Ed" + s + "bit";
    }

    //   9  https://edabit.com/challenge/2gFHh4REnB2F2bb3E
    public static double parallelResistance(int[] r) {
        double arr = 0.0;
        for (int i = 0; i < r.length; i++) {
            arr += r[i] / 1;
            System.out.println(1 / r[i]);
        }
        return arr / r.length;
    }

    //10 https://edabit.com/challenge/MhH32ydsoJKkjFjyz
    public static String Go(int num) {
        String str = "";
        for (int i = 0; i < num; i++) {
            str += "_";
        }
        return str;
    }

    //11 https://edabit.com/challenge/Mr48aLdKMXpGrdTXK
    public static int[] MultiplyByLength(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr.length;
        }
        return arr;
    }

    // 12 https://edabit.com/challenge/B5u9LiN7cZHLkJzXa
    public static int[] transform(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i]--;
            } else if (arr[i] % 2 != 0) {
                arr[i]++;
            }
        }
        return arr;
    }

    //13 https://edabit.com/challenge/oseKrpJdL8knnm4NT
    public static int[] additiveInverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= -1;
        }
        return arr;
    }

    //14 https://edabit.com/challenge/ZLbP9bodP2yxgcuz4
    public static int search(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }

    //15     https://edabit.com/challenge/mkAsw6owW6F7h2sfy
    public static boolean checkFactors(int[] factors, int num) {
        for (int i = 0; i < factors.length; i++) {
            if (num % factors[i] != 0) {
                return false;
            }
        }
        return true;
    }

    //    16 https://edabit.com/challenge/n22eru9bm8LMcBdYt
    public static String[] addEnding(String[] arr, String ending) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + ending;
        }
        return arr;
    }

    //17 https://edabit.com/challenge/YG5hYruH8TfqeZ3dc
    public static int findIndex(String[] arr, String str) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == str) {
                return i;
            }
        }
        return -1;
    }

    //18 https://edabit.com/challenge/fDE9uvkfAXgBN6mWZ
    public static String preventDistractions(String args) {
        if (args.contains("anime") || args.contains("meme") || args.contains("vines") || args.contains("roasts") || args.contains("Danny DeVito")) {
            return "NO!";
        } else {
            return "Safe watching!";
        }
    }

    //  19 https://edabit.com/challenge/kPHNYy2E6EijPLDja
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

    //    20 https://edabit.com/challenge/RXpy6CSczRnuE7r2q
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

    // 21 https://edabit.com/challenge/42TaSuEe8tzepCK75
    public static boolean abcmath(int a, int b, int c) {
        for (int i = 0; i <= b; i++) {
            a += a;
        }
        return a % c == 0;
    }

    // 22   https://edabit.com/challenge/72yxSzSevYhvY5Dbu
    public static int charCount(char c, String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    //23 https://edabit.com/challenge/Pbbu6wDPnqbbzXwTG
    public static boolean[] integerBoolean(String bits) {
        boolean[] arr = new boolean[bits.length()];
        for (int i = 0; i < bits.length(); i++) {
            if (bits.charAt(i) == '1') {
                arr[i] = true;
            } else {
                arr[i] = false;
            }
        }
        return arr;
    }

    //24   https://edabit.com/challenge/aNty236u5wtfsBayy
    public static int sumEvenNumsInRange(int start, int stop) {
        int sum = 0;
        for (int i = start; i <= stop; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    //25  https://edabit.com/challenge/mftGnKMaNpZhBeNBF
    public static int hammingDistance(String str1, String str2) {
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    //26 https://edabit.com/challenge/rq4AeNEFm7uBsoDDn
    public static int getAbsSum(int[] nums) {
        int sum = 0;

//        patterjj 1
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] < 0) {
//                nums[i] *= -1;
//            }
//            sum += nums[i];
//        }
//        return sum;

//        pattern 2
        for (int i = 0; i < nums.length; i++) {
            sum += Math.abs(nums[i]);
        }
        return sum;
    }

    //27 https://edabit.com/challenge/3Tn5HZgBzdTHPp9zT
    public static Boolean[] switches(Object[] t) {
        Boolean[] result = new Boolean[t.length];
        boolean b = true;
        for (int i = 0; i < t.length; i++) {
            if (t[i].equals("flick")) {
                b = !b;
            }
            result[i] = b;
        }
        return result;
    }

    //  28   https://edabit.com/challenge/5yCvczJJbq68Pavky
    public static int findLargestNum(int[] nums) {

//        pattrrn 1
//        int large=0;
//        for (int i=0;i<nums.length;i++){
//            if (large<nums[i]){
//                large=nums[i];
//            }
//        }
//return large;

//    pattern 2
        Arrays.sort(nums);
        return nums[nums.length - 1];
    }

    //29 https://edabit.com/challenge/utCRd99E6E3FRS4Rz
    public static int findSmallestInt(int[] args) {
//        Arrays.sort(args);
//        return args[0];

        int min = args[0];
        for (int i = 0; i < args.length; i++) {
            if (args[i] < min) {
                min = args[i];
            }
        }
        return min;
    }

    //    30 https://edabit.com/challenge/8HB8AB873TYGukT6J
    public static int[] countdown(int start) {
        int[] arr = new int[start + 1];
        for (int i = start; i > 0; i--) {
            arr[start - i] = i;
        }
        return arr;
    }

    //31  https://edabit.com/challenge/fLc7y5ke7ZLkZk9sv
    // 32 https://edabit.com/challenge/4kEHkvobTA4i6AQRE
    public static int triangle(int n) {
        int sum = 0, f = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    //33 https://edabit.com/challenge/hymPkXdhmDQLe87QT
    public static int differenceMaxMin(int[] arr) {
//        pattern 1
//        Arrays.sort(arr);
//        return arr[arr.length-1]-arr[0];

//    pattern 2
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];
            }
        }
        return max - min;
    }

    // 34    https://edabit.com/challenge/SvptD77rYQJgjDvZY
    public static boolean factorChain(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] % arr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    //35  https://edabit.com/challenge/GBKphScsmDi9ek3ra
    public static int getCount(String str) {
        int vowelsCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'i') {
                vowelsCount++;
//        }else if (str.charAt(i)=='e'){
//            vowelsCount++;
//        }else if (str.charAt(i)=='o'){
//            vowelsCount++;
//        }else if (str.charAt(i)=='u'){
//            vowelsCount++;
//        }else if (str.charAt(i)=='i'){
//            vowelsCount++;
            }
        }
        return vowelsCount;
    }

    //36 https://edabit.com/challenge/pbK6j5Try2TuDeSwK
    public static String removeABC(String words) {
        if (!words.contains("a") || words.contains("b") || words.contains("c")) {
            return null;
        }
//        return words.replaceAll("a","").replaceAll("b","").replaceAll("c","");
        return words.replaceAll("[abcABC]", "");
    }

    //37 https://edabit.com/challenge/yk7GqGcCpFgQrk8fH
    public static boolean isAvgWhole(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum % arr.length == 0) {
                return true;
            }
        }
        return false;
    }

    // 38    https://edabit.com/challenge/8s2jBHWKXCrT5oQ63
    public static int collatzConjecture(int n) {
        int count = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
                count++;
            } else {
                n = n * 3 + 1;
                count++;
            }
        }
        return count;
    }

    // 39  https://edabit.com/challenge/M8ZEHjhwCDCjYeY3n
    // 40 https://edabit.com/challenge/pKmR5HRabYPkdGunz
    public static String[] capMe(String[] s) {
        for (int i = 0; i < s.length; i++) {
            s[i] = Character.toUpperCase(s[i].charAt(0)) + s[i].substring(1).toLowerCase();
        }
        return s;
    }

    //41 https://edabit.com/challenge/s8RHRY9hfmvYMuaeC
    public static int[] hashPlusCount(String s) {

        int count = 0;
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                count++;
            } else if (s.charAt(i) == '+') {
                num++;
            }
        }
        return new int[]{count, num};
    }

    //    42 https://edabit.com/challenge/HDk4PC9w6KPS3X25W
    public static String repeat(String str, int n) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < n; j++) {
                s += "" + str.charAt(i);
            }
        }
        return s;
    }

    // 43    https://edabit.com/challenge/YmeiRhzaiR3MCPBiT
    public static boolean isSpecialArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != arr[i] % 2) {
                return false;
            }
        }
        return true;
    }

    //44 https://edabit.com/challenge/MsJzAHPmmmcwF4iCr
    public static int firstVowel(String str) {
        String s=str.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                return i;
            }
        }
        return -1;
    }

    //45 https://edabit.com/challenge/BZzAm9KXuB993p35r
    public static String indexShuffle(String str) {
        String even = "";
        String odd = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (count % 2 == 0) {
                even += str.charAt(count);
            } else {
                odd += str.charAt(count);
            }
            count++;
        }
        return even + odd;
    }

    //46 https://edabit.com/challenge/LmiWWX2kdWn2Z5aZv
    public static int[] cumulativeSum(int[] nums) {

//        pattern 1
//        for (int i=1;i<nums.length;i++){
//            nums[i]+=nums[i-1];
//        }
//        return nums;

//    pattern 2
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }

    // 47   https://edabit.com/challenge/HtruskPio7ricRvuG
    public static int incrementToTop(int[] arr) {
        Arrays.sort(arr);
        int top = 0;
        for (int i = 0; i < arr.length; i++) {
            top += arr[arr.length - 1] - arr[i];
        }
        return top;
    }

    // 48    https://edabit.com/challenge/cwLnTvxpBX5espEgs
    public static boolean checkPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                return true;
            }
        }
        return false;
    }

    //49 https://edabit.com/challenge/t3NThQjrcbjhiF5zt
//
    public static int Fibonacci(int a) {
        int prevSum = 1;
        int sum = 1;
        for (int i = 1; i < a; i++) {
            int temp = sum;
            sum = prevSum + sum;
            prevSum = temp;
        }
        return sum;
    }
    // 50 https://edabit.com/challenge/CCRmCv3huDnBsqmR7
    public static int howManyTimes(String msg) {
        int count = 0;
        for (int i = 0; i < msg.length(); i++) {
            count += msg.charAt(i) - 96;
        }
        return count;
    }

    // 51 https://edabit.com/challenge/gDikYnoenX7rKFMQm
    public static int timeToFinish(String full, String part) {
        full = full.replaceAll(" ", "");
        part = part.replaceAll(" ", "");
        return (full.length() - part.length()) / 2;
    }

    //52 https://edabit.com/challenge/mvHZK6Dy3ZF8EFoG3
    public static int mean(int a) {
        String str = (String.valueOf(a));
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return sum / str.length();
    }

    // 53    https://edabit.com/challenge/xH7uvX2MoH8e85aYS
    public static int[] binary(int num) {
//        return Integer.toBinaryString(num);
//        int binary[] = new int[40];
//        int index = 0;
//        while (num > 0) {
//            binary[index++] = num % 2;
//            num = num / 2;
//        }
//        for (int i = index - 1; i >= 0; i--) {
//            System.out.print(binary[i]);
        int rv=0;
        int p=1;
        while (num>0){
            int dig=num%2;
            num=num/2;
            rv+=dig*p;
            p=p*10;
        }

//       10
//       16,8,4,2,1
//          1 0 1 0
        return new int[]{rv};
    }

    // 54 https://edabit.com/challenge/XD6bQFpCZWiAMPanQ
    public static int[] amplify(int num) {
        int[] arr = new int[num];
        for (int i = 1; i <= num; i++) {
            if (i % 4 == 0) {
                arr[i - 1] = i * 10;
            } else {
                arr[i - 1] = i;
            }
        }
        return arr;
    }

    // 55    https://edabit.com/challenge/AYQPBDjDbrrvJtjjc
    public static boolean isIsogram(String s) {
        String str = s.toUpperCase();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    //56 https://edabit.com/challenge/CC7f9DpPfMMqmkfvC
    public static String getDrinkID(String flavor, String ml) {
        String[] s = flavor.toUpperCase().split("\\s+");
        String sa = "";
        for (String str : s) {
            sa += str.substring(0, 3);
        }
        return sa + ml.substring(0, ml.length() - 2);
    }

    // 57 https://edabit.com/challenge/FDauhMn4rAcsW7Goh
    public static int probe(int[] arr) {
        int r = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && r < arr[i]) {
                r = arr[i];
            }
        }
        return r;
    }

    //58 https://edabit.com/challenge/mkxS3CnW98Ci3kwCh
    public static String makeTitle(String s) {
        String[] str = s.split("\\s+");
        String sr = "";
        for (String sw : str) {
            sr += sw.toUpperCase().charAt(0) + sw.substring(1) + " ";
        }
        return sr;
    }

    //59 https://edabit.com/challenge/vENakDEYEDKFGPSEb
    public static String unstretch(String word) {
        String str = "";
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) != word.charAt(i + 1)) {
                str += word.charAt(i);
            }
        }
        return str + word.charAt(word.length() - 1);
    }

    // 60    https://edabit.com/challenge/rzpucPyoyEtXPo2BG
    public static int[] arrayOfMultiples(int num, int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = num * (i + 1);
        }
        return arr;
    }

    //61 https://edabit.com/challenge/7fHsizQrTLXsPWMyH
    public static int warOfNumbers(int[] numbers) {
        int even = 0;
        int odd = 0;
        int evenodd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even += numbers[i];
            } else if (numbers[i] % 2 != 0) {
                odd += numbers[i];
            }
        }
        if (even > odd) {
            evenodd = even - odd;
        } else {
            evenodd = odd - even;
        }
        return evenodd;
    }

    //    62 https://edabit.com/challenge/4r33Yd2HuEireb3Sm
    public static int count(int n) {
        String str = String.valueOf(Math.abs(n));
        return str.length();
    }

    // 63 https://edabit.com/challenge/A2M6aC7BR2P4Qj2Kr
    public static int findSeat(int n, int[] arr) {
        int a = n / arr.length;
        int per = 0;
        for (int i = 0; i < arr.length; i++) {
            per = (arr[i] * 100) / a;
            if (per<=50) {
                return i;
            }
        }
        return -1;
    }

    // 64 https://edabit.com/challenge/ev5oH5FSzb9oF6skT
    public static String firstNVowels(String str, int n) {

//        pattern 1

        String st = str.replaceAll("[^a|e|i|o|U]", "");

        if (st.length() >= n) {
            return st.substring(0, n);
        }
        return "Invalid";

//        pattern 2

//        for (int i=0;i<str.length();i++){
//            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
//                st+=str.charAt(i);
//            }
//        }
//        if (n>st.length()){
//            return "invalid";
//        }
//        return st.substring(0,n);
    }

    // 65 https://edabit.com/challenge/r7JegKpMpntfDyy6D
    public static String[] jazzify(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].contains("7")) {
                arr[i] += "7";
            }
        }
        return arr;
    }

    // 66 https://edabit.com/challenge/QLz5aGfChHhndKWMv
    public static double[] findLargestNums(double[][] arr) {
        double[] du = new double[arr.length];
        double large = 0;
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
            du[i] = arr[i][arr[i].length - 1];
//          if (large<arr[i][arr[i].length-1]) {
//              System.out.println(arr[i][arr[i].length]);
//              du[i] =large;
        }
        return du;
    }

    // 67 https://edabit.com/challenge/fCkawrffCeWEH5xja
    public static String reverseCase(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.toLowerCase().charAt(i)) {
                s += String.valueOf(str.toUpperCase().charAt(i));
            } else {
                s += String.valueOf(str.toLowerCase().charAt(i));
            }
        }
        return s;
    }

    // 68 https://edabit.com/challenge/3mCJ3idbMqueRTa7b
    public static String[] filterStateNames(String[] arr, String type) {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if (type.equals("abb") && arr[i].length() == 2 || type.equals("full") && arr[i].length() > 2) {
                str += arr[i] + " ";
            }
        }
        return str.split(" ");
    }

    // 69 https://edabit.com/challenge/G9tAPeGEhR8r2DkH5
    public static int[] factorize(int num) {

//        pattern 1
//    ArrayList<Integer> list = new ArrayList<>();
//    for (int i = 1; i <= num; i++) {
//        if (num % i == 0) {
//            list.add(i);
//        }
//    }
//    return list;
//}

//    pattern 2

        int[] arr = new int[num];
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                arr[i - 1] = i;
            }
        }
        return arr;
    }

    // 70 https://edabit.com/challenge/kgMghy3omychqLnXv4
    public static HashSet<Integer> uniqueSort(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        return set;
    }

    //71 https://edabit.com/challenge/Xbrab5yY9zaknqDjQ
    public static String capSpace(String txt) {
        String str = "";
        for (int i = 0; i < txt.length(); i++) {
            if (Character.isUpperCase(txt.charAt(i))) {
                str += ' ';
                str += Character.toLowerCase(txt.charAt(i));
            } else {
                str += txt.charAt(i);
            }
        }
        return str;
    }


    //72 https://edabit.com/challenge/jtFNMktij8FcH6zna
    public static boolean puzzlePieces(int[][] n) {
        if (n[0].length != n[1].length) {
            return false;
        }
        int sum = 0;
        sum = n[0][0] + n[1][0];
        for (int i = 0; i < n[0].length; i++) {
            if (sum != n[0][i] + n[1][i])
                return false;
        }
        return true;
    }

    //73 https://edabit.com/challenge/px8DTp5gTmojeBLve
    public static int findZip(String str) {
//      int indax=0;
//      if (str.lastIndexOf("zip")!=str.indexOf("zip")) {
//          indax = str.lastIndexOf("zip");
//      }else {
//          return -1;
//      }
//      return indax;

        return str.indexOf("zip", str.indexOf("zip") + 1);
    }

    //74 https://edabit.com/challenge/tunTJAdBeLgc8s4ap
    public static String[] identicalFilter(String[] arr) {
//    String  str="";
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i].replaceAll(""+arr[i].charAt(0)," "));
//        if (arr[i].replaceAll(""," ").length()==0){
//            str+=arr[i]+" ";
//        }
//    }
        return arr;
    }

    //75 https://edabit.com/challenge/tgjFboGwDEHY4Wn5S
    public static String accum(String str) {
        String st = "";
        for (int i = 0; i < str.length(); i++) {
            st += Character.toUpperCase(str.charAt(i));

            for (int j = 0; j < i; j++) {
                st += Character.toLowerCase(str.charAt(i));
            }
            if (i + 1 < str.length()) {
                st += "_";
            }
        }
        return st;
    }

    //76 https://edabit.com/challenge/ijNrhCjfS2ZMtNkXS
    public static String toHex(String str) {
        char[] ch = str.toCharArray();
        String builder = "";
        for (char c : ch) {
//          int i=c;
            builder += (Integer.toHexString(c).toUpperCase() + " ");
        }
        return builder;
    }

    //77 https://edabit.com/challenge/Tyzp6S67dtXPAAQan
    //78 https://edabit.com/challenge/xLHemSaX8jAc6Tyz9
    public static boolean isHarshad(int a) {
        String str = (String.valueOf(a));
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            if (a % sum == 0) {
                return true;
            }
        }
        return false;
    }

    //79 https://edabit.com/challenge/ZY7b6LA5BeWQJnJX5
    public static boolean omnipresent(int[][] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; i < arr[i].length; i++) {
                if (arr[i][j] == val) {
                    return true;
                }
            }
        }
        return false;
    }

    //80 https://edabit.com/challenge/bzgkfePPbHyAyTdN3
    public static int minSwaps(String s1, String s2) {
        int count = 0;
        int i0 = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
            }
            if ((count % 2 == 0)) {
                i0 = count / 2;
            }
        }
        return i0;
    }

    // 81 https://edabit.com/challenge/tvaT25krB65pYtghq
    public static double averageIndex(String[] arr) {
        double averg = 0;
        for (int i = 0; i < arr.length; i++) {
            averg += arr[i].charAt(i) - 96;
            System.out.println(averg);
        }
        return averg / arr.length;
    }

    //82 https://edabit.com/challenge/zmbR8SKveCgJ6KB5G
    public static int duplicates(String str) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add((int) str.charAt(i));
        }
        return str.length() - set.size();

    }

    //83 https://edabit.com/challenge/hEbyZPTpxt4AtmmhP
    public static int littleBig(int n) {
        if (n % 2 != 0) {
            return 5 + (n / 2);
        } else {
            return (int) (50 * Math.pow(2, n / 2));
        }
    }

    // 84 https://edabit.com/challenge/vYQogxrcQBEMr7y3F
    public static int nextPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                num++;
                i = 2;
            } else {
                continue;
            }
        }
        return num;

    }

    //85 https://edabit.com/challenge/Sj3pLPPLpnF8DNGQD
    public static int sumDigits(int a, int b) {
        int sum = 0;
        String stra = String.valueOf(a);
        String strb = String.valueOf(b);
        for (int i = 0; i < stra.length(); i++) {
            sum += Integer.parseInt(String.valueOf(stra.charAt(i))) + Integer.parseInt(String.valueOf(strb.charAt(i)));
        }
        return sum;
    }

    //86   https://edabit.com/challenge/aG8byPZcEj9yLKxA3
    public static String reverse(String s) {

//    pattern 1
        StringBuffer bulider = new StringBuffer();
        for (String word : s.split(" ")) {
            if (word.length() >= 5) {
                bulider.append(new StringBuilder(word).reverse());
            } else {
                bulider.append(word);
            }
            bulider.append(" ");
        }
        return bulider.toString().trim();
    }

//// pattern 2
//String [] arr=s.split(" ");
//    String str="";
//for (int i=0;i<arr.length;i++) {
//    if (arr[i].length() >= 5) {
//        for (int j = arr[i].length() - 1; j >= 0; j--) {
//            str += arr[i].charAt(j);
//        }
//    } else {
//        str += arr[i];
//    }
//    str += " ";
//}
//         return str.trim();
//        }

    //87 https://edabit.com/challenge/KGhmvXpF6iK8mAqgj
    public static String[] numInStr(String[] arr) {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].matches(".*\\d+.*")) {
                str += arr[i] + " ";
            }
        }
        return str.split(" ");
    }

    //88 https://edabit.com/challenge/p5PsoKc2z8QaYNjNG
    public static boolean possiblePath(Object[] t) {
        return true;
    }

    //89 https://edabit.com/challenge/954ZMB8AKKJBEnvDu
    public static String emphasize(String str) {
        String[] arr = str.toLowerCase().split(" ");
        String st = "";
        for (int i = 0; i < arr.length; i++) {
            st += Character.toUpperCase(arr[i].charAt(0));
            st += arr[i].substring(1) + " ";
        }
        return st;
    }

    //90 https://edabit.com/challenge/jXvNMQRZPwKmex4nG
    public static String getMissing(String strLetters) {
        String alph = "abcdefghijklmnopqrstuvwxyz";
        String missing = "";
        for (int i = 0; i < alph.length(); i++) {
            if (!strLetters.contains(Character.toString(alph.charAt(i)))) {
                missing += alph.charAt(i);
            }
        }
        return missing;
    }

    //91 https://edabit.com/challenge/sRC7wLW7g6gw24Muq
    public static String missingLetter(String str) {
        char mising = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (mising != str.charAt(i)) {
                return Character.toString(mising);
            }
            mising += 1;
        }
        return "No Missing Letter";

    }

    //92 https://edabit.com/challenge/WzE2id9w5mNfXozKL
    public static int countBoomerangs(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i + 2] && arr[i] != arr[i + 1]) {
                count++;
            }
        }
        return count;
    }

    //93 https://edabit.com/challenge/ZiuuBqBWYBRtPaKKR
    public static String stringCycling(String a, String b) {
        String str = "";
        if (a.length() < b.length()) {
            a += a;
        }
        return a.substring(0, b.length());
    }

    //94  https://edabit.com/challenge/uiNKhxnvuaJ7ikoKX
//95  https://edabit.com/challenge/mTKJRxrWNr9qrBxxG
    public static boolean bestFriend(String s, String a, String b) {
        String[] arr = s.split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(a) && !(arr[i + 1].equals(b))) {
                return false;
            }
            if (arr[arr.length - 1].equals(a)) {
                return false;
            }
        }

        return true;
    }

    //96 https://edabit.com/challenge/XgFuNXpXAENpZiDaw
//97 https://edabit.com/challenge/jRzY8tThBn7zp3jvy
//98 https://edabit.com/challenge/9k87o8Y4yNt3fvcfB
    public static int[] returnInts(Object[] arr) {

//        pattenr 1
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] instanceof Integer) {
//                list.add((Integer) arr[i]);
//            }
//        }
//        int[] aaa = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            aaa[i] = list.get(i);
//        }
//        return aaa;
//

//      pattern 2

        int[] tni = new int[arr.length];
    int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Integer) {
                tni[j] = (Integer) arr[i];
                 j++;
            }
        }
        return tni;
    }

    //99 https://edabit.com/challenge/HhExSRj4aXHxTQEgG
//100  https://edabit.com/challenge/g7mkKpAtZZ7mnuFQX
    public static int[] timeSum(String[] s) {
        int[] arr = new int[3];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < 3; j++) {
                arr[j] += Integer.parseInt(String.valueOf(s[i].split(":")[j]));
            }
            arr[1] += arr[2] / 60;
            arr[2] = arr[2] % 60;
            arr[0] += arr[1] / 60;
            arr[1] = arr[1] % 60;
        }
        return arr;
    }
// 101 https://edabit.com/challenge/Wr5YbkQakb6qh8Gax

    public static void main(String[] args) {

//        System.out.println(Loop.findSeat(200, new int[]{35, 23, 18, 10, 40}));//2
//        System.out.println(Loop.findSeat(20, new int[]{3, 5, 4, 2}));//3
//        System.out.println(Loop.findSeat(1000, new int[]{50, 20, 80, 90, 100, 60, 30, 50, 80, 60}));//0
//        System.out.println(Loop.findSeat(200, new int[]{35, 23, 40, 21, 38}));//-1

//        System.out.println(Loop.Fibonacci(7));
//        System.out.println(Loop.Fibonacci(12));
//        System.out.println(Loop.Fibonacci(3));


//        System.out.println(Arrays.toString(Loop.timeSum(new String[]{"1:03:45","1:23:05"})));
//        System.out.println(Arrays.toString(Loop.timeSum(new String[]{"5:39:42", "10:02:08", "8:26:33"})));

        System.out.println(Arrays.toString(Loop.returnInts(new Object[]{9, 2, "space", "car", "lion", 16})));


//        System.out.println(Loop.bestFriend("tesha has a pretty and a happy face", "h", "a"));
//        System.out.println(Loop.bestFriend("we found your dynamite", "d", "y"));

//        System.out.println(Loop.stringCycling("abc", "edabit"));

//        System.out.println((Loop.countBoomerangs(new int[]{9, 5, 9, 5, 1, 1, 1})));


//        System.out.println(Loop.missingLetter("abdefg"));

//        System.out.println(Loop.getMissing("abcfdgihjkl"));

//        System.out.println((Loop.emphasize("hello world")));
//        System.out.println((Loop.emphasize("I AM, BUT aLL yOuRs, TESH!")));
//        System.out.println((Loop.emphasize("99 red balloons!")));
//        System.out.println((Loop.emphasize("whErE, tO, DIANE?")));

//        System.out.println(Arrays.toString(Loop.numInStr(new String[]{"1a", "a", "2b", "b"})));
//        System.out.println(Arrays.toString(Loop.numInStr(new String[]{"abc", "ab10c", "a10bc", "bcd"})));

//        System.out.println(Loop.reverse("Reverse"));
//        System.out.println(Loop.reverse("This is a typical sentence."));
//        System.out.println(Loop.reverse("The dog is big "));

//        System.out.println(Loop.sumDigits(10,12));

//        System.out.println(Loop.nextPrime(14));

//        System.out.println(Loop.littleBig(28));

//        System.out.println(Loop.duplicates("hello world! hello "));

//        System.out.println(Loop.averageIndex(new String[]{"f", "o", "r", "t", "h", "e", "l", "o", "v", "e", "o", "f", "t", "e", "s", "h"}));

//        System.out.println(Loop.minSwaps("10011001", "01100110"));
//        System.out.println(Loop.minSwaps("1100", "1001"));

//        System.out.println(Loop.omnipresent(new int[][]{{1,1},{1,3},{5,1},{6,1}},6));
//        System.out.println(Loop.omnipresent(new int[][]{{5},{5},{5},{6,5}},5));

//        System.out.println(Loop.isHarshad(75));
//        System.out.println(Loop.isHarshad(171));

//        System.out.println(Loop.toHex("hello world"));


//        System.out.println((Loop.accum("abcd")));

//        System.out.println(Arrays.toString(Loop.identicalFilter(new  String[]{"aaaaaa", "bc", "d", "eeee", "xyz"})));

//        System.out.println(Loop.findZip("all zip files are pped"));
//        System.out.println(Loop.findZip("Zip is a file format used for data compression and archiving. A zip file contains one or more files that have been compressed, to reduce file size, or stored as is. The zip file format permits a number of compression algorithms."));

//        System.out.println(Loop.puzzlePieces(new int[][]{{1, 2, 3, 4},{4, 3, 2, 1}}));
//        System.out.println(Loop.puzzlePieces(new int[][]{{1, 8, 5, 0, -1, 7}, {0, -7, -4, 1, 2, -6}}));
//        System.out.println(Loop.puzzlePieces(new int[][]{{1,2}, {-1,-1}}));

//        System.out.println((Loop.capSpace("helloWorld")));

//        System.out.println(Loop.uniqueSort(new int[]{1, 4, 4, 4, 4, 4, 3, 2, 1, 2}));
//        System.out.println(Loop.uniqueSort(new int[]{1, 4, 4, 4, 4, 4, 3, 2, 1, 2,2,5,6,4,2,3,4,1,-10,7,7,7}));

//        System.out.println(Arrays.toString(Loop.factorize(4)));

//        System.out.println(Arrays.toString(Loop.filterStateNames(new String[]{"Arizona", "CA", "NY", "Nevada"}, "abb")));
//        System.out.println(Arrays.toString(Loop.filterStateNames(new String[]{"Arizona", "CA", "NY", "Nevada"}, "full")));

//        System.out.println(Loop.reverseCase("Happy Birthday"));
//        System.out.println(Loop.reverseCase("MANY THANKS"));
//        System.out.println(Loop.reverseCase("sPoNtAnEoUs"));

//        System.out.println(Arrays.toString(Loop.findLargestNums(new double[][]{{4, 2, 7, 1}, {20, 70, 40, 90}, {1, 2, 0}})));

//        System.out.println(Arrays.toString(Loop.jazzify(new String[]{"Dm", "G", "E", "A"})));
//        System.out.println(Arrays.toString(Loop.jazzify(new String[]{"F7", "E7", "A7", "Ab7", "Gm7", "C7"})));
//        System.out.println(Arrays.toString(Loop.jazzify(new String[]{})));

        System.out.println(Loop.firstVowel("pnAPPL"));

//        System.out.println(Loop.firstNVowels("sharpening skills", 3));
//        System.out.println(Loop.firstNVowels("aei", 3));

//        System.out.println(Loop.count(-92463));
//        System.out.println(Loop.count(-314890));
//        System.out.println(Loop.count(654321));
//        System.out.println(Loop.count(638476));
//        System.out.println(Loop.count(3));

//        System.out.println(Loop.warOfNumbers(new int[]{2, 8, 7, 5}));
//        System.out.println(Loop.warOfNumbers(new int[]{12, 90, 75}));
//        System.out.println(Loop.warOfNumbers(new int[]{5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243}));

//        System.out.println(Arrays.toString(Loop.arrayOfMultiples(7,5)));

//        System.out.println(Loop.unstretch("cccccaaarrrbbonnnnn"));

//        System.out.println(Loop.makeTitle("capitalize every word"));

//        System.out.println(Loop.probe(new int[]{3, 7, 10, 1, 7, 9, 2, 13}));
//        System.out.println(Loop.probe(new int[]{1, 3, 5, 7}));
//        System.out.println(Loop.probe(new int[]{0, 19, 18973623}));

//        System.out.println((Loop.getDrinkID("apple", "500ml")));
//        System.out.println((Loop.getDrinkID("pineapple", "45ml")));
//        System.out.println((Loop.getDrinkID("passion farut", "750ml")));

//        System.out.println(Loop.isIsogram("paSsword"));
//        System.out.println(Loop.isIsogram("Algorism"));

//        System.out.println(Arrays.toString(Loop.amplify(25)));

        System.out.println(Arrays.toString(Loop.binary(10)));

//        System.out.println(Loop.mean(12345));

//        System.out.println(Loop.checkPalindrome("reviver"));
//        System.out.println(Loop.checkPalindrome("stressed"));
//        System.out.println(Loop.checkPalindrome("mom"));

//        System.out.println(Loop.incrementToTop(new int[]{3, 4, 5}));
//        System.out.println(Loop.incrementToTop(new int[]{3, 10, 3}));

//        System.out.println(Arrays.toString(Loop.cumulativeSum(new int[]{1, 2, 3})));

//        System.out.println(Loop.indexShuffle("abcdefg"));

//        System.out.println(Arrays.toString(Loop.switches(new Object[] {"edabit", "flick", "eda", "bit"})));
//        System.out.println(Arrays.toString(Loop.switches(new Object[]{false, false, "flick", "sheep", "flick"})));

//        System.out.println(Loop.isSpecialArray(new int[]{2, 7, 4, 9, 6, 1, 6, 3}));
//        System.out.println(Loop.isSpecialArray(new int[]{2, 7, 9, 1, 6, 1, 6, 3}));

//        System.out.println((Loop.repeat("mice", 5)));

//        System.out.println(Arrays.toString(Loop.hashPlusCount("###+")));
//        System.out.println(Arrays.toString(Loop.hashPlusCount("#+++#+#++#")));
//        System.out.println(Arrays.toString(Loop.hashPlusCount("")));

//        System.out.println(Arrays.toString(Loop.capMe(new String[]{"samuel", "MABELLE", "letitia", "meridith"})));
//        System.out.println(Arrays.toString(Loop.capMe(new String[]{"Slyvia", "Kristal", "Sharilyn", "Calista"})));

//        System.out.println(Loop.collatzConjecture(3));

//        System.out.println(Loop.isAvgWhole(new int[]{1, 3}));
//        System.out.println(Loop.isAvgWhole(new int[]{9,2,2,5}));

        System.out.println(Loop.removeABC("Tesha is my world"));
        System.out.println(Loop.removeABC("hello world"));

//        System.out.println(Loop.getCount("Celebration"));
//        System.out.println(Loop.getCount("Palm"));
//        System.out.println(Loop.getCount("Prediction"));

//        System.out.println(Loop.factorChain(new int[]{1, 2, 4, 8, 16, 32}));
//        System.out.println(Loop.factorChain(new int[]{2, 4, 6, 7, 12}));

//        System.out.println(Loop.differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}));
//        System.out.println(Loop.differenceMaxMin(new int[]{44, 32, 86, 19}));

//        System.out.println(Loop.triangle(6));
//        System.out.println(Loop.triangle(215));

//        System.out.println(Arrays.toString(Loop.countdown(5)));
//        System.out.println(Arrays.toString(Loop.countdown(10)));

//        System.out.println(Loop.findSmallestInt(new int[]{34, 15, 88, 2}));
//        System.out.println(Loop.findSmallestInt(new int[]{34,-345,-1,100}));
//        System.out.println(Loop.findSmallestInt(new int[]{7,7,7}));

//        System.out.println(Loop.findLargestNum(new int[]{4, 5, 1, 3}));

//        System.out.println(Loop.getAbsSum(new int[]{2, -1, 4, 8, 10}));
//        System.out.println(Loop.getAbsSum(new int[]{-3, -4, -10, -2, -3}));

//        System.out.println(Loop.hammingDistance("abcde", "bcdef"));
//        System.out.println(Loop.hammingDistance("abcde", "abcde"));
//        System.out.println(Loop.hammingDistance("strong", "strung"));

//        System.out.println(Loop.sumEvenNumsInRange(10,20));
//        System.out.println(Loop.sumEvenNumsInRange(51,150));

//        System.out.println(Arrays.toString(Loop.integerBoolean("0110")));

//        System.out.println(Loop.charCount('a', "edabit"));
//        System.out.println(Loop.charCount('c', "Chamber of secrets"));
//        System.out.println(Loop.charCount('b', "big fat bubble"));

//        System.out.println(Loop.abcmath(42,5,10));

//        System.out.println(Loop.minimumRemovals(new int[]{1,2,3,4,5}));
//        System.out.println(Loop.minimumRemovals(new int[]{5,7,9,11}));

//        System.out.println(Arrays.toString(Loop.correctStream(new String[]{"it", "is", "find"}, new String[]{"it", "is", "fine"})));

//        System.out.println(Loop.preventDistractions("vines that butter my eggroll"));
//        System.out.println(Loop.preventDistractions("How to ace BC Calculus in 5 Easy Steps"));

//        System.out.println(Loop.findIndex(new String[]{"hi", "edabit", "fgh", "abc"}, "fgh"));
//        System.out.println(findIndex(new String[]{"Red", "blue", "Blue", "Green"}, "blue"));
//        System.out.println(findIndex(new String[]{"a", "g", "y", "d"}, "d"));
//        System.out.println(findIndex(new String[]{"Pineapple", "Orange", "Grape", "Apple"}, "Pineapple"));

//        System.out.println(Arrays.toString(Loop.addEnding(new String[]{"clever", "meek", "hurried", "nice"},"ly")));

//        System.out.println(Loop.checkFactors(new int[]{2, 3, 4}, 12));
//        System.out.println(Loop.checkFactors(new int[]{1, 2, 3, 8}, 12));

//        System.out.println(Loop.search(new int[]{1, 5, 3}, 5));
//        System.out.println(Loop.search(new int[]{9, 8, 3}, 3));
//        System.out.println(Loop.search(new int[]{1, 2, 3}, 4));

//        System.out.println(Arrays.toString(Loop.additiveInverse(new int[]{5,-7,8,3})));
//        System.out.println(Arrays.toString(Loop.additiveInverse(new int[]{1,1,1,1,1,1,1})));
//        System.out.println(Arrays.toString(Loop.additiveInverse(new int[]{-5,-25,35})));

//        System.out.println(Arrays.toString(Loop.transform(new int[]{1, 2, 3, 4, 5})));
//        System.out.println(Arrays.toString(Loop.transform(new int[]{3, 3, 4, 3})));
//        System.out.println(Arrays.toString(Loop.transform(new int[]{2, 2, 0, 8, 10})));

//        System.out.println(Arrays.toString(Loop.MultiplyByLength(new int[]{2,3,1,0})));
//        System.out.println(Arrays.toString(Loop.MultiplyByLength(new int[]{4,1,1})));
//        System.out.println(Arrays.toString(Loop.MultiplyByLength(new int[]{1,0,3,3,7,2,1})));
//        System.out.println(Arrays.toString(Loop.MultiplyByLength(new int[]{0})));

//        System.out.println(Loop.Go(5));
//        System.out.println(Loop.Go(3));
//        System.out.println(Loop.Go(1));

//        System.out.println(Loop.parallelResistance(new int[]{6,3}));

//        System.out.println(Loop.howManyTimes(5));
//        System.out.println(Loop.howManyTimes(15));

//        System.out.println(Arrays.toString(Loop.sumOfCubes(new int[]{1, 5, 9})));
//        System.out.println(Arrays.toString(Loop.sumOfCubes(new int[]{2, 3,12})));

//        System.out.println(Loop.forbiddenLetter("m", new String[]{}));
//        System.out.println(Loop.forbiddenLetter("r", new String[]{"rock", "paper", "scissors"}));
//        System.out.println(Loop.forbiddenLetter("m", new String[]{"deep", "loves", "tesh"}));

//  3       System.out.println(Loop.addUpTo(10));
//        System.out.println(Loop.addUpTo(7));
//        System.out.println(Loop.addUpTo(3));

//      System.out.println(Loop.calculateExponent(5, 5));
//        System.out.println(Loop.calculateExponent(10, 10));
//        System.out.println(Loop.calculateExponent(3, 3));

//        System.out.println(Loop.PrintArray(3));
//        System.out.println(Loop.PrintArray(6));
//        System.out.println(Loop.PrintArray(1));

    }
}
