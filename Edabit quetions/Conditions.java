import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Conditions {
    //  1 https://edabit.com/challenge/5gpukjfi5rAH8MvKF
    public static boolean isSameNum(int x, int y) {
        return x == y;
    }

    //2 https://edabit.com/challenge/gdRGePvnZDfQGDS8g
    public static boolean isEqual(int num1, int num2) {
        return num1 == num2;
    }

    //3 https://edabit.com/challenge/EP66YmuNMWhRZdniY
    public static boolean lessThanOrEqualToZero(int num) {
        return num <= 0;
    }

    //4 https://edabit.com/challenge/KWRQP86jxzM9SZmRM
    public static boolean reverse(boolean b) {
        return b == true ? false : true;
    }

    //5 https://edabit.com/challenge/KnRj8TSD63JBpzDfi
    public static boolean divisible(int num) {
        return num / 100 != 0;
    }

    // 6 https://edabit.com/challenge/kewawqtmmyXiiA9B6
    public static boolean profitableGamble(double prob, double prize, double pay) {
        if (prob * prize > pay) {
            return true;
        } else return false;
    }

    //7  https://edabit.com/challenge/fY3bzat74jGhLMepSr
    public static String greeting(String name) {
        if (name == "Mubashir") {
            return "Hello, my Love!";
        }
        return "Hello, " + name + "!";
    }

    // 8 https://edabit.com/challenge/umRwYETG7ogToZhSi
    public static String isEvenOrOdd(int num) {
        if (num % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    // 9 https://edabit.com/challenge/Nz6AzC4v8jyMCH2Tu
    public static boolean makesTen(int a, int b) {
        if (a == 10 || b == 10 || a + b == 10) {
            return true;
        } else {
            return false;
        }
    }

    // 10  https://edabit.com/challenge/a9Shdt64Ak2Hwq7oP
    public static boolean comp(String str1, String str2) {
        if (str1.length() == str2.length()) {
            return true;
        } else {
            return false;
        }
    }

    // 11    https://edabit.com/challenge/MvBYeGybFo4iEpWyp
    public static boolean acceptIntoMovie(int age, boolean isSupervised) {
        if (age >= 15 || isSupervised == true) {
            return true;
        } else {
            return false;
        }
    }

    //  12 https://edabit.com/challenge/fvhabpSbe4vjWS9rP
    public static boolean intWithinBounds(int n, int lower, int upper) {
        return n >= lower && n < upper;
    }

    //13 https://edabit.com/challenge/AWcHJdDbjMLT74FfX
    public static boolean both(int n1, int n2) {
        if (n1 > 0 && n2 >= 0 || n1 == 0 && n2 == 0 || n1 < 0 && n2 < 0) {
            return true;
        } else {
            return false;
        }
    }

    //14 https://edabit.com/challenge/9FXkWr6AAc3rFHnyL
    public static String whoWinsTonight(int coins, int space, int price, int size) {
        return "";
    }

    //15 https://edabit.com/challenge/pzLMEsMpbCLsPXqy2
    public static boolean isPlural(String word) {
        return word.endsWith("s");
    }

    //16 https://edabit.com/challenge/JawiuQQuLkhcRQ2Hh
    public static String helloWorld(int num) {
        switch (num) {
            case 3:
                return "Hello";
            case 5:
                return "World";
            case 3 * 5:
                return "Hello World";
            default:
                return "invalid";
        }
    }

    //  16 https://edabit.com/challenge/iXN3vagpLRSwxRYvx
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

    // 17  https://edabit.com/challenge/dWpuMsnxdJsBZqj8P
    public static boolean hurdleJump(int[] hurdles, int h) {
        for (int i = 0; i < hurdles.length; i++) {
            if (hurdles[i] < h) {
                return true;
            }
        }
        return false;
    }

    // 18 https://edabit.com/challenge/YTGuwJBQjE4csZtLW
    public static String repeatString(Object t, int n) {
        if (t instanceof Integer) {
            return "Not a string!";
        }
        String str = "";
        str = t.toString().repeat(n);
        return str;
    }

    //  19 https://edabit.com/challenge/fDE9uvkfAXgBN6mWZ
    public static String preventDistractions(String args) {
        if (args.contains("anime") || args.contains("meme") || args.contains("vines") || args.contains("roasts") || args.contains("Danny DeVito")) {
            return "NO!";
        } else {
            return "Safe watching!";
        }
    }

    //  20   https://edabit.com/challenge/
    public static String hackerSpeak(String str) {
        return str.replace("a", "4").replace("e", "3").replace("i", "1").replace("o", "0").replace("s", "5");
    }

    // 21    https://edabit.com/challenge/rYD9NTBmNhaPM6wx2
    public static boolean canCapture(String[] rooks) {
        for (int i = 0; i < rooks.length; i++) {
            if (rooks[0].charAt(0) == rooks[1].charAt(0) || rooks[0].charAt(1) == rooks[1].charAt(1)) {
                return true;
            }
        }
        return false;
    }

    //22 https://edabit.com/challenge/nfc7H9CQFqJp54uEh
    public static int equal(int a, int b, int c) {
        int count = 0;
        if (a == b && b == c) {
            count = 3;
        } else if (a == b && b != c || a == c && a != b) {
            count = 2;
//        }else {
//            count=0;
        }
        return count;
    }

    //23  https://edabit.com/challenge/bkFqwEP5Gej23didA
    public static boolean getXO(String str) {
        int x = 0;
        int o = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x' || str.charAt(i) == 'X') {
                x++;
            } else if (str.charAt(i) == 'o' || str.charAt(i) == 'O') {
                o++;
            }
        }
        return x == o;
    }

    //25 https://edabit.com/challenge/zFccarRuia5zq4rhP
    public static String sayHelloBye(String name, int num) {
//        return num==1?"Hello "+name:"Bye "+name;
        String str = "";
        if (num == 1) {
            str = "Hello " + name;
        } else {
            str = "Bye " + name;
        }
        return str;
    }

    //26 https://edabit.com/challenge/YmeiRhzaiR3MCPBiT
// 27    https://edabit.com/challenge/jwXx478haGbZpRCWQ
    public static int[] findEvenNums(int num) {
        int[] arr = new int[num / 2];
        for (int i = 2; i <= num; i += 2) {
            arr[i / 2 - 1] = i;
        }
        return arr;
    }

    // 28 https://edabit.com/challenge/6gDTBRgZKpotCsgib
    public static boolean variableValid(String variable) {
        if (variable.contains(" ") || Character.isDigit(variable.charAt(0))) {
            return false;
        }
//        return variable.matches("[a-zA-z][0-9a-zA-z]*");
        return true;
    }

    //    29 https://edabit.com/challenge/iJSAYBTLZvLuqAnN4
    public static String tpChecker(int people, int tp) {
        int tP = tp * 500;
        int sheet = 57;
        int stsyhome = 14;
        int days = 1;
        for (int i = 0; i < tp; i++) {
            tp -= sheet * people;
            days++;
        }
        return days >= stsyhome ? "Your TP will last  " + days + " days, no need to panic!" : "Your TP WILL LAST " + days + " days, buy more!";
    }

    // 30    https://edabit.com/challenge/gzjQoZY6mYRBwDv2Q
//31  https://edabit.com/challenge/EmRPehwiJFk6rf2iD
    public static String[] isFourLetters(String[] s) {
        String str = "";
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() == 4) {
                str += s[i] + ",";
            } else if (s[i].length() == 0) {
                return new String[]{};
            }
        }
        return str.split(",");
    }

    //  32   https://edabit.com/challenge/vFLhYANAZQGKTtxA2
    public static String add(String a, String b) {
        if (a.equals("") || b.equals("") || b.equals(null) || a.equals(null)) {
            return "Invalid Operation";
        }
        return Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
    }

    // 33 https://edabit.com/challenge/eHA9jMjzADDo6PhuJ
    public static String operation(String a, String b, String op) {
        if (op.equals("add")) {
            op = String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
        } else if (op.equals("subtract")) {
            op = String.valueOf(Integer.parseInt(a) - Integer.parseInt(b));
        } else if (op.equals("divide") && b != "0") {
            op = String.valueOf(Integer.parseInt(a) / Integer.parseInt(b));
        } else if (op.equals("divide") && b.equals("0")) {
            op = String.valueOf(Integer.MIN_VALUE);
        } else if (op.equals("multiply")) {
            op = String.valueOf(Integer.parseInt(a) * Integer.parseInt(b));
        } else if (a.equals("0")) ;
        return op;
    }

    // 34 https://edabit.com/challenge/sBRPyEAjBfWKsnTaZ
    public static int quadraticEquation(int a, int b, int c) {
        return 0;
    }

    // 35 https://edabit.com/challenge/jfRHGwHMZcnzZm9JL
    public static String split(String str) {
        return str;
    }

    //36 https://edabit.com/challenge/r2csEmtFvoa3tDWB4
    public static String oddishOrEvenish(int num) {
        int count = 0;
        String str = Integer.toString(num);
        for (int i = 0; i < str.length(); i++) {
            count += str.charAt(i);
        }
        if (count % 2 == 0) {
            return "Evenish";
        } else {
            return "Oddish";
        }
    }

    //37 https://edabit.com/challenge/BxnxYJGQ9MMQn2EfR
    public static String gradePercentage(String userScore, String passScore) {
        String str = "";
        if (Integer.parseInt(userScore.substring(0, userScore.length())) >= Integer.parseInt(passScore.substring(0, passScore.length()))) {
            str = " YOU PASSED THE EXAM ";
        } else if (Integer.parseInt(userScore.substring(0, userScore.length())) < Integer.parseInt(passScore.substring(0, passScore.length()))) {
            str = "YOU FAILD THE EXAM";
        }
        return str;
    }

    // 38 https://edabit.com/challenge/c52kNwPuWo5kp9x4H
    public static String flipEndChars(String s) {
        if (s.length() < 2) {
            return "Incompatible.";
        } else if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return "Two's a pair.";
        }
        return s.substring(s.length() - 1) + s.substring(1, s.length() - 1) + s.charAt(0);
    }

    // 39  https://edabit.com/challenge/aPmfBKu7ixcsYYKaZ
    public static String dnaToRna(String strand) {
        return strand.replace("A", "U").replace("T", "A").replace("G", "c").replace("C", "G").replace("c", "C");
    }

    //40 https://edabit.com/challenge/Abq8d76QDQC2ocfX7
    //41 https://edabit.com/challenge/auwAWq4MXmXFwWrHf
    public static boolean parityAnalysis(int num) {
        int count = 0;
        String str = Integer.toString(num);
        for (int i = 0; i < str.length(); i++) {
            count += str.charAt(i);
        }
        if ((num % 2) == (count % 2)) {
            return false;
        } else {
            return true;
        }
    }

    //42 https://edabit.com/challenge/i3T6iJNinAq6quMXo
    //43 https://edabit.com/challenge/n7kbvMp5zHRmRbFQF
    public static int[] countPositivesSumNegatives(int[] input) {
        int count = 0;
        int sum = 0;
        if (input.length == 0) {
            return new int[]{};
        }
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                count++;
            } else if (input[i] < 0) {
                sum += input[i];
            }
        }
        return new int[]{count, sum};
    }

    // 44    https://edabit.com/challenge/faMvfHSZ6r6DbGYAc
    // 45  https://edabit.com/challenge/9Y83kppxQeMbvtDtF
    public static String alternatingCaps(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                str += Character.toUpperCase(s.charAt(i));
            } else {
                str += Character.toLowerCase(s.charAt(i));
            }
        }
        return str;
    }

    // 46  https://edabit.com/challenge/qY9s6qK4WpbPBxQES
    // 47 https://edabit.com/challenge/xix4GjLCpXmetXGca
    public static String censor(String str) {
        String[] sr = str.split(" ");
        String st = "";
        for (int i = 0; i < sr.length; i++) {
            if (sr[i].length() > 4) {
                st += sr[i].replaceAll("[^//. ]", "*") + " ";
                continue;
            }
            st += sr[i] + " ";
        }
        return st.trim();
    }

    // 48 https://edabit.com/challenge/gvcJa987XYCxqf9xN
    public static String[] dictionary(String s, String[] w) {
        String str = "";
        for (int i = 0; i < w.length; i++) {
            if (w[i].startsWith(s)) {
                str += w[i] + " ";
            }
        }
        return str.trim().split(" ");
    }

    //49 https://edabit.com/challenge/xzRcBmkYYNhoeBNv5
    public static String absolute(String s) {
        String[] str = s.split(" ");
        String arr = "";
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("a")) {
                arr += "an absolute ";
            } else if (str[i].equals("A")) {
                arr += "An absolute ";
            } else {
                arr += str[i] + " ";
            }
        }
        return arr.trim();
    }

    //50  https://edabit.com/challenge/g5n85W62rJqZakMry
    public static String xPronounce(String sentence) {
//        return sentence.replaceAll(" x "," ecks ").replaceAll(" x"," z").replaceAll("x","cks");
        String[] arr = sentence.split(" ");
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toLowerCase().equals("x")) {
                str += arr[i].replace("x", "ecks") + " ";
            } else if (arr[i].startsWith("x")) {
                str += arr[i].replace("x", "z");
            } else if (arr[i].contains("x")) {
                str += arr[i].replace("x", "cks") + " ";
            } else {
                str += arr[i] + " ";
            }
        }
        return str;
    }

    // 51  https://edabit.com/challenge/jfeWP9tjtwNeRu4WG
    public static String isOdd(int number) {
        // use bitwise operator
        // modulo operator (%) is prohibited
        return (number & 1) != 0 ? "Yes" : "No";
    }

    public static String isEven(String number) {
        // use regular expression
        // modulo operator (%) is prohibited
        return (Integer.valueOf(number) & 1) == 0 ? "Yes" : "No";
    }


    public static void main(String[] args) {

//51        System.out.println(Conditions.isEven("0"));
//        System.out.println(Conditions.isEven("-99"));
//        System.out.println(Conditions.isOdd(3));
//        System.out.println(Conditions.isOdd(58));

//50        System.out.println(Conditions.xPronounce("Inside the box was a xylophone"));
//        System.out.println(Conditions.xPronounce("The x ray is excellent"));
//        System.out.println(Conditions.xPronounce("OMG x box unboxing video x D"));

// 49       System.out.println(Conditions.absolute("Truly, a heart that beats for no one but for Tesh."));
//        System.out.println(Conditions.absolute("Tesha is a woman of true substance and a beauty."));
//        System.out.println(Conditions.absolute("A spread of love, not hate."));

// 48        System.out.println(Arrays.toString(Conditions.dictionary("bu", new String[]{"button", "breakfast", "border"})));
//        System.out.println(Arrays.toString(Conditions.dictionary("tri", new String[]{"triplet", "tries", "trip", "piano", "tree"})));
//        System.out.println(Arrays.toString(Conditions.dictionary("beau[\"pastry\", \"delicious\", \"name\", \"boring\"]", new String[]{})));

// 47        System.out.println(Conditions.censor("The code is fourty"));
//        System.out.println(Conditions.censor("Two plus three is five"));
//        System.out.println(Conditions.censor("aaaa aaaaa 1234 12345"));

        System.out.println(Conditions.alternatingCaps("Hello"));

// 43       System.out.println(Arrays.toString(Conditions.countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15})));
//        System.out.println(Arrays.toString(Conditions.countPositivesSumNegatives(new int[]{92, 6, 73, -77, 81, -90, 99, 8, -85, 34})));
//        System.out.println(Arrays.toString(Conditions.countPositivesSumNegatives(new int[]{91, -4, 80, -73, -28})));
//        System.out.println(Arrays.toString(Conditions.countPositivesSumNegatives(new int[]{})));

// 41        System.out.println(Conditions.parityAnalysis(243));
//        System.out.println(Conditions.parityAnalysis(12));
//        System.out.println(Conditions.parityAnalysis(3));
//        System.out.println(Conditions.parityAnalysis(22));

// 39        System.out.println(Conditions.dnaToRna("ATTAGCGCGATATACGCGTAC"));
//        System.out.println(Conditions.dnaToRna("CGATATA"));
//        System.out.println(Conditions.dnaToRna("GTCATACGACGTA"));

// 38        System.out.println(Conditions.flipEndChars("Cat, dog, and mouse."));
//        System.out.println(Conditions.flipEndChars("ada"));
//        System.out.println(Conditions.flipEndChars("adA"));
//        System.out.println(Conditions.flipEndChars("z"));

// 37        System.out.println(Conditions.gradePercentage("65","85"));
//        System.out.println(Conditions.gradePercentage("99","85"));
//        System.out.println(Conditions.gradePercentage("99","90"));

//36        System.out.println((Conditions.oddishOrEvenish(43)));
//        System.out.println((Conditions.oddishOrEvenish(373)));
//        System.out.println((Conditions.oddishOrEvenish(4433)));

//33        System.out.println(Conditions.operation("4",  "5",  "subtract"));
//        System.out.println(Conditions.operation("9",  "3",  "divide"));
//        System.out.println(Conditions.operation("4",  "5",  "add"));
//        System.out.println(Conditions.operation("4",  "5",  "multiply"));

//32        System.out.println(Conditions.add("111", "111"));
//        System.out.println(Conditions.add("10", "90"));
//        System.out.println(Conditions.add("", "20"));

// 31       System.out.println(Arrays.toString(Conditions.isFourLetters(new String[]{"Tomato", "Potato", "Pair"})));
//        System.out.println(Arrays.toString(Conditions.isFourLetters(new String[]{"Ryan", "Kieran", "Jason", "Matt"})));

// 30        System.out.println(Conditions.isSymmetrical(7227));
//        System.out.println(Conditions.isSymmetrical(12567));
//        System.out.println(Conditions.isSymmetrical(9939));

//29         System.out.println(Conditions.tpChecker(4,1));
//        System.out.println(Conditions.tpChecker(3,20));

// 28        System.out.println(Conditions.variableValid("result"));
//        System.out.println(Conditions.variableValid("Times2"));
//        System.out.println(Conditions.variableValid("2odd_nums"));
//        System.out.println(Conditions.variableValid("odd nums"));

// 27        System.out.println(Arrays.toString(Conditions.findEvenNums(8)));
//        System.out.println(Arrays.toString(Conditions.findEvenNums(25)));

// 25        System.out.println(Conditions.sayHelloBye("alone",1));
//        System.out.println(Conditions.sayHelloBye("tomi",0));
//        System.out.println(Conditions.sayHelloBye("josi",0));

//  23      System.out.println(Conditions.getXO("ooxx"));
//        System.out.println(Conditions.getXO("xooxx"));
//        System.out.println(Conditions.getXO("ooxXm"));
//        System.out.println(Conditions.getXO("zpzpzpzpz"));
//        System.out.println(Conditions.getXO("zzoo"));

// 22       System.out.println(Conditions.equal(3,4,3));
//        System.out.println(Conditions.equal(1,1,1));
//        System.out.println(Conditions.equal(3,4,1));

//21       System.out.println(Conditions.canCapture(new String[]{"A8", "E8"}));
//        System.out.println(Conditions.canCapture(new String[]{"A1", "B2"}));
//        System.out.println(Conditions.canCapture(new String[]{"H4", "H3"}));
//        System.out.println(Conditions.canCapture(new String[]{"F5", "C8"}));

// 20        System.out.println(Conditions.hackerSpeak("javascript is cool"));
//        System.out.println(Conditions.hackerSpeak("become a coder"));
//        System.out.println(Conditions.hackerSpeak("programmingj is fun"));

// 19       System.out.println(Conditions.preventDistractions("vines that butter my eggroll"));
//        System.out.println(Conditions.preventDistractions("Hot pictures of Danny DeVito"));
//        System.out.println(Conditions.preventDistractions("How to ace BC Calculus in 5 Easy Steps"));

//18         System.out.println(Conditions.repeatString("Tesha", 2));
//        System.out.println(Conditions.repeatString("Deep", 3));
//        System.out.println(Conditions.repeatString("Tesha", 4));
//        System.out.println(Conditions.repeatString(2000, 4));

//17         System.out.println(Conditions.hurdleJump(new int[]{1,2,3,4,5},5));
//        System.out.println(Conditions.hurdleJump(new int[]{5,5,3,4,5},3));
//        System.out.println(Conditions.hurdleJump(new int[]{4,4,5,6},10));
//        System.out.println(Conditions.hurdleJump(new int[]{1,2,1},1));

// 16       System.out.println(Conditions.monthName(4));
//        System.out.println(Conditions.monthName(7));
//        System.out.println(Conditions.monthName(13));

// 15        System.out.println(Conditions.helloWorld(15));
//        System.out.println(Conditions.helloWorld(3));
//        System.out.println(Conditions.helloWorld(5));

//  14      System.out.println(Conditions.isPlural("changes"));
//        System.out.println(Conditions.isPlural("change"));
//        System.out.println(Conditions.isPlural("magic"));
//        System.out.println(Conditions.isPlural("dudes"));

//13        System.out.println(Conditions.both(6,2));
//        System.out.println(Conditions.both(0,0));
//        System.out.println(Conditions.both(0,2));
//        System.out.println(Conditions.both(-2,-2));
//        System.out.println(Conditions.both(-1,2));

// 12       System.out.println(Conditions.intWithinBounds(3, 1, 9));
//        System.out.println(Conditions.intWithinBounds(6, 1, 6));

//11        System.out.println(Conditions.acceptIntoMovie(14,true));
//        System.out.println(Conditions.acceptIntoMovie(14,false));
//        System.out.println(Conditions.acceptIntoMovie(16,false));

// 10       System.out.println(Conditions.comp("AB","CD"));
//        System.out.println(Conditions.comp("ABC","CD"));
//        System.out.println(Conditions.comp("hello", "edabit"));

// 9       System.out.println(Conditions.makesTen(9,10));
//        System.out.println(Conditions.makesTen(1,9));
//        System.out.println(Conditions.makesTen(9,9));

// 8       System.out.println(Conditions.isEvenOrOdd(3));
//        System.out.println(Conditions.isEvenOrOdd(146));
//        System.out.println(Conditions.isEvenOrOdd(19));

// 7       System.out.println(Conditions.greeting("Matt"));
//        System.out.println(Conditions.greeting("Helen"));
//        System.out.println(Conditions.greeting("Mubashir"));

//6       System.out.println(Conditions.profitableGamble(0.2f,50,9));
//        System.out.println(Conditions.profitableGamble(0.9,1,2));

// 5       System.out.println(Conditions.divisible(1));
//        System.out.println(Conditions.divisible(100));
//        System.out.println(Conditions.divisible(1000));

//  4      System.out.println(Conditions.reverse(true));
//        System.out.println(Conditions.reverse(false));

// 3       System.out.println(Conditions.lessThanOrEqualToZero(5));
//        System.out.println(Conditions.lessThanOrEqualToZero(0));
//        System.out.println(Conditions.lessThanOrEqualToZero(-1));

// 2       System.out.println(Conditions.isEqual(5,6));
//        System.out.println(Conditions.isEqual(1,1));
//        System.out.println(Conditions.isEqual(36,35));

// 1       System.out.println(Conditions.isSameNum(4,8));
//        System.out.println(Conditions.isSameNum(2,2));
//        System.out.println(Conditions.isSameNum(42,32));
    }

}
