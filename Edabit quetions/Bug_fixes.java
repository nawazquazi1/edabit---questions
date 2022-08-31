import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Bug_fixes {
    // 1    https://edabit.com/challenge/BeW6HMLCfGzHxkzbe
    public static boolean isSeven(int x) {
        return x == 7;
    }

    //2 https://edabit.com/challenge/Phy3ESenwRH6KNytm
    public static String nameString(String name) {
        return name + "Edabit";
    }

    //3 https://edabit.com/challenge/uG3DEHwC5xMtHnCdm
    public static int squaed(int b) {
        return b * b;
    }

    //4 https://edabit.com/challenge/fY3bzat74jGhLMepS
    public static String greeting(String name) {
        if (name == "Mubashir") {
            return "Hello, my Love!";
        }
        return "Hello, " + name + "!";
    }

    //5 https://edabit.com/challenge/sn9KfW72BBoT7eesC
    public static List PrintArray(int number) {
        List list = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            list.add(i);
        }
        return list;
    }

    //6 https://edabit.com/challenge/7bupZ6FmuAQwJE6CL
    public static <a> Object basicCalculator(int a, String o, int b) {
        if (o == "+") return a + b;
        if (o == "-") return a - b;
        if (o == "/" && b != 0) return a / b;
        if (o == "*") return a * b;
        return null;

//    switch (o) {
//        case "+":
//            return a + b;
//        case "-":
//            return a - b;
//        case "*":
//            return a * b;
//        case "/":
//            if (b!=0) {
//                return a / b;
//            }
//        default:
//            return null;
//    }
    }

    //7 https://edabit.com/challenge/BxnxYJGQ9MMQn2EfR
    public static String gradePercentage(String userScore, String passScore) {
        String str = "";
        if (Integer.parseInt(userScore.substring(0, userScore.length() - 1)) >= Integer.parseInt(passScore.substring(0, passScore.length() - 1))) {
            str = "You PASSED the Exam";
        }
        if (Integer.parseInt(userScore.substring(0, userScore.length() - 1)) < Integer.parseInt(passScore.substring(0, passScore.length() - 1))) {
            str = "You FAILED the Exam";
        }
        return str;
    }

    // 8  https://edabit.com/challenge/T3zjJiXoNRqXqEx9u
    public static Object[] clone(Object[] arr) {
//        ArrayList<Object> list=new ArrayList<>();
//        for (Object i:arr){
//            list.add(arr);
//            list.add(i);
//        }
//        return list.toArray();
        Object[] oj = new Object[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            oj[i] = arr[i];
        }
        oj[arr.length] = arr;
        return oj;
    }

    public static void main(String[] args) {


//  8              System.out.println(Arrays.deepToString(Bug_fixes.clone(new Object[]{4,5})));
//                System.out.println(Arrays.deepToString(Bug_fixes.clone(new Object[]{13,45,45})));
//                System.out.println(Arrays.deepToString(Bug_fixes.clone(new Object[]{"x","y"})));

//  7              System.out.println(Bug_fixes.gradePercentage("85%","85%"));
//                System.out.println(Bug_fixes.gradePercentage("90%","85%"));
//                System.out.println(Bug_fixes.gradePercentage("65%","85%"));

//6                System.out.println(Bug_fixes.basicCalculator(2,"+",4));
//                System.out.println(Bug_fixes.basicCalculator(6,"-",5));
//                System.out.println(Bug_fixes.basicCalculator(12,"/",3));
//                System.out.println(Bug_fixes.basicCalculator(3,"*",4));
//                System.out.println(Bug_fixes.basicCalculator(1,"/",0));
//                System.out.println(Bug_fixes.basicCalculator(1,"X",0));

//  5              System.out.println(Bug_fixes.PrintArray(10));

//  4          System.out.println(Bug_fixes.greeting("Matt"));
//            System.out.println(Bug_fixes.greeting("Helen"));
//            System.out.println(Bug_fixes.greeting("Mubashir"));

// 3       System.out.println(Bug_fixes.squaed(5));
//        System.out.println(Bug_fixes.squaed(9));
//        System.out.println(Bug_fixes.squaed(100));

//2        System.out.println(Bug_fixes.nameString("nawaz"));
//        System.out.println(Bug_fixes.nameString("qauzi"));

//1        System.out.println(Bug_fixes.isSeven(3));
//        System.out.println(Bug_fixes.isSeven(6));
//        System.out.println(Bug_fixes.isSeven(7));
    }
}

