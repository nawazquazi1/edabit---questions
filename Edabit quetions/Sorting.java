import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sorting {
    //  1  https://edabit.com/challenge/5yCvczJJbq68Pavky
    public static int findLargestNum1(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }

    // 2 https://edabit.com/challenge/utCRd99E6E3FRS4Rz
    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int i = 0; i < args.length; i++) {
            if (args[i] < min) {
                min = args[i];
            }
        }
        return min;
    }

    //3 https://edabit.com/challenge/8WBpaPzLP7piuHNeR
    public static String nameShuffle(String s) {
        return s.substring(s.lastIndexOf(" ")) + " " + s.substring(0, s.indexOf(" "));
    }

    // 4 https://edabit.com/challenge/QCgoxbd32BqFr6AY7
    public static String fizzBuzz(int n) {
        String str = "";
        if (n % 3 == 0 && n % 5 == 0) {
            str += "FizzBuzz";
        } else if (n % 5 == 0) {
            str += "buzz";
        } else if (n % 3 == 0) {
            str += "fizz";
        } else {
            str += n;
        }
        return str;
    }

    //5 https://edabit.com/challenge/5gPCp7v7iDWZvb4YQ
    public static String reverse1(final String str) {
//     patternn    1
//        StringBuilder builder=new StringBuilder();
//        builder.append(new StringBuilder(str).reverse());
//return builder.toString();

//    pattern 2
        String s = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            s += str.charAt(i);
        }
        return s;
    }

    //6 https://edabit.com/challenge/WM5s7vuHnXdcKCEjS
    public static int[] sortNumsAscending(int[] nums) {
        Arrays.sort(nums);
        ;
        return nums;
    }

    // 7 https://edabit.com/challenge/TM5f33Mpu52m2jcat
    public static int maxTotal(int[] nums) {
        Arrays.sort(nums);
        return nums[9] + nums[8] + nums[7] + nums[6] + nums[5];
    }

    //8 https://edabit.com/challenge/zgBjnxQw9MHTBHLED
    public static int nthSmallest(int[] arr, int n) {
        if (n > arr.length) {
            return -1;
        }
        return arr[n - 1];
    }

    //9 https://edabit.com/challenge/2zKtCWQM2rSxMQqLX
    public static String AlphabetSoup(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String str = String.valueOf(ch);
        return str;
    }

    //10 https://edabit.com/challenge/phaa2KFqeiM9hZeSK
    public static int leftDigit(String str) {
        int as = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                as = Integer.parseInt(str.substring(i, i + 1));
                break;
            }
        }
        return as;
    }
// mediam start

    // 1 https://edabit.com/challenge/iaCSbqngin2AXriyB
    public static String highLow(String s) {
        String[] str = s.split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        String result = arr[arr.length - 1] + " " + arr[0];
        return result;
    }

    // 2 https://edabit.com/challenge/GJh9FraKutcnHoruX
    public static int missingNum(int[] nums) {
        int s = 55;
        for (int i : nums) {
            s -= i;
        }
        return s;
    }

    // 3 https://edabit.com/challenge/QLz5aGfChHhndKWMv
    public static double[] findLargestNums(double[][] arr) {
        double[] de = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
            de[i] = arr[i][arr[i].length - 1];
        }
        return de;
    }

    // 4 https://edabit.com/challenge/kgMghy3omychqLnXv
    public static Object[] uniqueSort(int[] nums) {
        HashSet<Integer> list = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            Arrays.sort(nums);
            list.add(nums[i]);
        }
        return list.toArray();
    }

    // 5 https://edabit.com/challenge/JPDNpqri6djiC8ptP
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

    // 6 https://edabit.com/challenge/aG8byPZcEj9yLKxA3
    public static String reverse(String s) {

//        String[] arr = s.split(" ");
//        String str = "";
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].length() >= 5) {
//                for (int j = arr[i].length() - 1; j >= 0; j--) {
//                    str += arr[i].charAt(j);
//                }
//            } else {
//                str += arr[i];
//            }
//            str += " ";
//        }
//        return str.trim();

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

    // 7 https://edabit.com/challenge/NYq5PTgKa6C97qdLw
    public static int sumMissing(int[] arr) {
      int s=0;
      int sum=0;
      for (int i=0;i<arr.length;i++){
          sum+=arr[i];
      }
      for (int i=0;i<arr.length;i++){
          s+=i;
      }
      return s-sum;
    }
    // 8 https://edabit.com/challenge/JfertgG5phtnvDNpD
    public static int sortDesc(final int num) {
        String str = Integer.toString(num);
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String sort = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            sort = sort + arr[i];
        }
        int done = Integer.parseInt(sort);
        return done;
    }

    // 9 https://edabit.com/challenge/9k87o8Y4yNt3fvcfB
    public static int[] returnInts(Object[] arr) {
        int[] intr = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Integer) {
                intr[j] = (int) arr[i];
                j++;
            }
        }
        return intr;
    }

    // 10 https://edabit.com/challenge/9k87o8Y4yNt3fvcfB
// 11 https://edabit.com/challenge/S28QATbZGq3BjDHZZ
    public static String fruitSalad(String[] fruits) {
        String mixFrut = "";
        String []str=new String[fruits.length*2];
        for (int i = 0; i < fruits.length; i++) {
            int a =fruits[i].length()/2;
            String  firstString=fruits[i].substring(0,a);
            String  lastString=fruits[i].substring(a);
            int x=i*2;
            str[x]=firstString;
            int y=i*2+1;
            str[y]=lastString;
        }
        Arrays.sort(str);
        return  String.join("",str);

    }

    // 12 https://edabit.com/challenge/Md6usCHQ7Xsj2fQi3
    public static boolean cons(int[] arr) {
       Arrays.sort(arr);
       for (int i=0;i<arr.length-1;i++){
           if (arr[i]!=arr[i+1]-1){
               return false;
           }
       }
       return true;
    }

    // 13 https://edabit.com/challenge/qSJ5hZfG52Nf2hXWS
    public static int largestGap(int[] numbers) {
        int count = 0;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 1; i++) {
            int gap = numbers[i + 1] - numbers[i];
            if (gap > count) {
                count = gap;
            }

        }
        return count;
    }

    // 14 https://edabit.com/challenge/yX9Jd6s9eF75ZK43K
    public static Object[] sortIt(Object[] arr) {
        Object[] obj = new Object[arr.length];
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            obj[i] = arr[i];
        }
        return obj;
    }

    // 15 https://edabit.com/challenge/jc7nh6xMSZTBYvndz
    public static boolean isAlphabeticallySorted(String sentence) {
        String[] str = sentence.replace(".", "").split(" ");
        for (String s : str) {
            if (s.length() > 2) {
                char[] ch = s.toCharArray();
                Arrays.sort(ch);
                String sorted = String.valueOf(ch);
                if (sorted.equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }

    // 16 https://edabit.com/challenge/gskWj3Zj45ovAomTb
    public static Map<String, String> parseCode(String s) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("firstName", s.substring(0, s.indexOf("0")));
        map.put("lastName", s.substring(s.indexOf("0"), s.lastIndexOf("0")).replace("0", ""));
        map.put("id", s.substring(s.lastIndexOf("0") + 1));
        return map;
    }

    // 17 https://edabit.com/challenge/5RvoqBgeykwy2Xqdb
// 18 https://edabit.com/challenge/SnZ5y2hyxjZnWrMec
    public static String[] sortContacts(String[] arr, String sortBy) {
        if (arr==null){
            return new String[0];
        }
        String[] str = new String[arr.length];
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (sortBy.equals("DESC")) {
                str[i] = arr[i];
            }else if (sortBy.equals("ASC")){
                for (int j=arr.length-1;j>=0;j--){
                    str[j]=arr[i];
                }
            }
        }

        return str;
}


    // 19 https://edabit.com/challenge/FPemghc8ut9xfaMGo
    public static String rearrange(String s) {
        String[] str = s.split(" ");
        String sorted = "";
        for (int i = 0; i < str.length+1; i++) {
            for (int j = 0; j <str.length; j++) {
                if (str[j].contains(Integer.toString(i))) {
                    sorted += str[j].replace(Integer.toString(i),"") + " ";
                }
                if (i != str.length) {
                    sorted += "";
                }
            }
        }
        return sorted;
    }

    // 20 https://edabit.com/challenge/9P6yDuSZxYTihMtT6
    public static String[] sameVowelGroup(String[] words) {
        String[] str = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("o")) {
                str[i] = words[i];
            }
        }
        return str;
    }

    //  21 https://edabit.com/challenge/akLRnxrtrAsnyYuZb
    public static int[] reversibleInclusiveList(int start, int end) {
        if (start > end) {
            return null;
        }
        int ae = end - start + 1;
        int[] arr = new int[ae];
        for (int i = 0; i < ae; i++) {
            arr[i] = start + i;
        }
        return arr;
    }


    public static void main(String[] args) {


//        System.out.println(Arrays.toString(Sorting.reversibleInclusiveList(10,20)));

//        System.out.println(Sorting.leftDigit("TrAdE2W1n95!"));

//        System.out.println(Sorting.AlphabetSoup("nawaz"));
//        System.out.println(Sorting.AlphabetSoup("geek"));
//        System.out.println(Sorting.AlphabetSoup("geek"));
//        System.out.println(Sorting.AlphabetSoup("javascript"));

//        System.out.println(Arrays.toString(Sorting.sortNumsAscending(new int[]{5,3,7,6,8,1,9})));

//        System.out.println(Sorting.nthSmallest(new int[]{1, 3, 5, 7},1));
//        System.out.println(Sorting.nthSmallest(new int[]{1, 3, 5, 7},5));
//        System.out.println(Sorting.nthSmallest(new int[]{7, 3, 5, 1},2));

//        System.out.println(Sorting.reverse1("Hello World"));

//        System.out.println(Sorting.fizzBuzz(3));
//        System.out.println(Sorting.fizzBuzz(5));
//        System.out.println(Sorting.fizzBuzz(4));
//        System.out.println(Sorting.fizzBuzz(15));

//        System.out.println(Sorting.nameShuffle("Rosie O'Donnell"));
//        System.out.println(Sorting.nameShuffle("Donald Trump"));
//        System.out.println(Sorting.nameShuffle("Seymour Butts"));

//        System.out.println(Sorting.findSmallestInt(new int[]{24,15,88,2}));

//        System.out.println(Sorting.findLargestNum1(new int[]{1000,1001,857,1}));

//        System.out.println(Arrays.toString(Sorting.sameVowelGroup(new String[]{"toe", "ocelot", "maniac"})));
//        System.out.println(Arrays.toString(Sorting.sameVowelGroup(new String[]{"many", "carriage", "emit", "apricot", "animal"})));
//        System.out.println(Arrays.toString(Sorting.sameVowelGroup(new String[]{"hoops", "chuff", "bot", "bottom"})));

//        System.out.println(Sorting.rearrange("Tesh3 th5e 1I lov2e way6 she7 j4ust i8s"));
//        System.out.println(Sorting.rearrange("nawa3z qu4azi mohamm1ed akib2"));
//        System.out.println(Sorting.rearrange("\"the4 t3o man5 Happ1iest of6 no7 birt2hday steel8!\""));

//        System.out.println(Arrays.toString(Sorting.sortContacts(new String[]{"John Locke",
//                "Thomas Aquinas",
//                "David Hume",
//                "Rene Descartes"}, "ASC")));
//        System.out.println(Arrays.toString(Sorting.sortContacts(new String[]{"Paul Erdos",
//                "Leonhard Euler",
//                "Carl Gauss"
//        }, "DESC")));


//        System.out.println(Sorting.parseCode("Tesha000Deep00014344"));
//        System.out.println(Sorting.parseCode("Thomas00LEE0000043"));
//        System.out.println(Sorting.parseCode("Madsy0Jupiter0321"));

//        System.out.println((Sorting.isAlphabeticallySorted("Paula has a French accent.")));
//        System.out.println((Sorting.isAlphabeticallySorted("She sells sea shells by the sea shore.")));

//        System.out.println(Arrays.toString(Sorting.sortIt(new Object[]{4,1,3})));
//        System.out.println(Arrays.toString(Sorting.sortIt(new Object[]{4, 1, 3})));

//        System.out.println(Sorting.largestGap(new int[]{9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5}));

//        System.out.println(Sorting.cons(new int[]{1,2,3,4,6}));//false
//        System.out.println(Sorting.cons(new int[]{1,2,3,4,6,3}));//false
//        System.out.println(Sorting.cons(new int[]{5,6,7,8,9,9}));//false
//        System.out.println(Sorting.cons(new int[]{1,2,3,4,5}));//true

        System.out.println(Sorting.fruitSalad(new String[]{"apple", "pear", "grapes"}));
        System.out.println(Sorting.fruitSalad(new String[]{"raspberries", "mango"}));

        System.out.println(Arrays.toString(Sorting.returnInts(new Object[]{9, 2, "space", "car", "lion", 16})));//[9,2,16]


//        System.out.println((Sorting.sortDesc(123)));//321
//        System.out.println((Sorting.sortDesc(125485972)));

//        System.out.println(Sorting.sumMissing(new int[]{10,20,30,40,50,60}));

//        System.out.println(Sorting.reverse("This is a typical sentence."));

//        System.out.println(Arrays.toString(Sorting.zipIt(new String[]{"Tesha", "Tesh", "Shang"}, new String[]{"Deep", "Xavier", "Dex"})));

//        System.out.println(Arrays.toString(Sorting.uniqueSort(new int[]{1, 1, 2, 3, 4, 3, 3, 3, 4, 2, 2})));

//        System.out.println(Arrays.toString(Sorting.findLargestNums(new double[][]{{4, 2, 7, 1}, {20, 40, 90, 70}, {1, 2, 0}})));

//        System.out.println(Sorting.missingNum(new int[]{1, 2, 3, 4, 6, 7, 8, 9, 10}));

//        System.out.println((Sorting.highLow("1 2 3 4 5")));
    }

}
