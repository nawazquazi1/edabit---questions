import java.util.ArrayList;
import java.util.Arrays;

public class Control_Flow {
    // 1 https://edabit.com/challenge/4PGHC3nqN9gH2svby
    public static double calculateFuel(double n) {
        if ((n * 10) > 100) {
            return n * 10;
        } else {
            return 100;
        }
    }

    // 2 https://edabit.com/challenge/dWpuMsnxdJsBZqj8P
    public static boolean hurdleJump(int[] hurdles, int h) {
        for (int i = 0; i < hurdles.length; i++) {
            if (hurdles[i] > h) {
                return false;
            }
        }
        return true;
    }

    // 3 https://edabit.com/challenge/B5u9LiN7cZHLkJzXa
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

    //4 https://edabit.com/challenge/wFPAkqT72h4WGEuYN
    public static String hackerSpeak(String str) {
        return str.replaceAll("a", "4").replaceAll("e", "3").replaceAll("i", "1").replaceAll("o", "0").replaceAll("s", "5");
    }

    //5 https://edabit.com/challenge/7JBbNzmBuBEX7KPoH
    public static boolean testJackpot(String[] result) {
        for (int i = 0; i < result.length; i++) {
            if (result[i] != result[result.length - 1]) {
                return false;
            }
        }
        return true;
    }

    //6 https://edabit.com/challenge/zFccarRuia5zq4rhP
    public static String sayHelloBye(String name, int num) {
        if (num == 1) {
            return "Hello " + name;
        } else {
            return "Bay " + name;
        }
    }
//    7 https://edabit.com/challenge/jfRHGwHMZcnzZm9JL
//    8 https://edabit.com/challenge/G9tAPeGEhR8r2DkH5
public static int[] factorize(int num) {
    ArrayList<Integer> list =new ArrayList<>();
    for (int i=1;i<=num;i++){
        if (num%i==0) {
            list.add(i);
        }
    }
    int [] arr=new int[list.size()];
    for (int i=0;i<list.size();i++){
        arr[i]=list.get(i);
    }
    return arr;
}
//9 https://edabit.com/challenge/9To632EycoudpkgHM
//10 https://edabit.com/challenge/cAyse5aq4n4MagmYA
// 11 https://edabit.com/challenge/gBNu2G5Lk5iv22pye
//  12 https://edabit.com/challenge/5snfPLPbvjAsZ5kjo


    public static void main(String[] args) {

        System.out.println(Arrays.toString(Control_Flow.factorize(12)));
        System.out.println(Arrays.toString(Control_Flow.factorize(4)));
        System.out.println(Arrays.toString(Control_Flow.factorize(17)));

// 6        System.out.println(Control_Flow.sayHelloBye("Alon", 1));
//        System.out.println(Control_Flow.sayHelloBye("Tomi", 0));
//        System.out.println(Control_Flow.sayHelloBye("Jose", 0));

// 5       System.out.println(Control_Flow.testJackpot(new String[]{"&&", "&", "&&&", "&&&&"}));
//        System.out.println(Control_Flow.testJackpot(new String[]{"abc", "abc", "abc", "abc"}));
//        System.out.println(Control_Flow.testJackpot(new String[]{"SS", "SS", "SS", "SS"}));
//        System.out.println(Control_Flow.testJackpot(new String[]{"SS", "SS","SS", "Ss"}));

//4         System.out.println(Control_Flow.hackerSpeak("javascript is cool"));
//        System.out.println(Control_Flow.hackerSpeak("programming is fun"));
//        System.out.println(Control_Flow.hackerSpeak("become a coder"));

//3        System.out.println(Arrays.toString(Control_Flow.transform(new int[]{1,2,3,4,5})));
//        System.out.println(Arrays.toString(Control_Flow.transform(new int[]{3,3,4,3})));
//        System.out.println(Arrays.toString(Control_Flow.transform(new int[]{2,2,0,8,10})));

//2        System.out.println(Control_Flow.hurdleJump(new int[]{1,2,3,4,5},5));
//        System.out.println(Control_Flow.hurdleJump(new int[]{5,5,3,4,5},3));
//        System.out.println(Control_Flow.hurdleJump(new int[]{5,6,4,5},10));
//        System.out.println(Control_Flow.hurdleJump(new int[]{1,2,1},1));

// 1       System.out.println(Control_Flow.calculateFuel(15));
//        System.out.println(Control_Flow.calculateFuel(23.5));
//        System.out.println(Control_Flow.calculateFuel(3));
    }


}
