public class Recursion {

    public static int printsum(int n, int i) {
        if (n == i) {
            return 0;
        }
        System.out.println(n + 1);
        return n + printsum(n + 1, i);
    }

    public static int fac(int n) {
        if (n == 1) {
            return n;
        }
        int fac_n1 = n * fac(n - 1);
        return fac_n1;
    }

    public static int fibonacci(int a) {
        if (a == 0 || a == 1) {
            return a;
        }
//        int n=0;
//        int b=1;
//        int fib=a+b;
//        System.out.println(fib);
        return fibonacci(a - 1) + fibonacci(a - 2);
    }

    // 1    https://edabit.com/challenge/EhGqjXhY9zS7MHjWd
    public static int factorial(int num) {
        if (num == 1) {
            return num;
        }
        return num * factorial(num - 1);
    }

    // 2  https://edabit.com/challenge/3NowS55XTdfWtKh9n
    public static int search(int arr[], int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < item) {
                return -1;
            }
        }
        return item;
    }

    //3  https://edabit.com/challenge/nn65XKhviizSgwW2k
    public static int addUp(int num) {
        if (num == 0) {
            return 0;
        }
        return num + addUp(num - 1);
    }

    // 4    https://edabit.com/challenge/8s2jBHWKXCrT5oQ63
    public static int collatzConjecture(int n) {
        if (n == 1) {
            return 0;
        } else if (n % 2 == 0) {
            return collatzConjecture(n / 2) + 1;
        } else {
            return collatzConjecture(n * 3 + 1) + 1;
        }
    }

    // 5 https://edabit.com/challenge/t3NThQjrcbjhiF5zt
    public static int Fibonacci(int a) {
        if ( a<=1) {
            return 1;
        }
           return Fibonacci(a-1)+Fibonacci(a-2);
    }

//6 https://edabit.com/challenge/z5hQaDNPSSqP9bN5t
public static int gcd(int a, int b) {
        if (b==0){
            return a;
        }
        return gcd(b,a%b);
//    System.out.println(a%b);
//        return 0;
}
// 7    https://edabit.com/challenge/DtTdXqwFQYTf6ZE3J
public static int countVowels(String str) {

//        pattern 1
//        int count=0;
//        if (str.contains("a")) {
//            count++;
//        } if (str.contains("e")) {
//        count++;
//    }if (str.contains("i")) {
//        count++;
//    }if (str.contains("o")) {
//        count++;
//    }if (str.contains("u")){
//            count++;
//        }
//return count;

//    paattern 2
    int counter = 0;
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
            counter += 1;
        }
    }
    return counter;
}


    public static void main(String[] args) {

        System.out.println(Recursion.countVowels("apple"));
        System.out.println(Recursion.countVowels("cheesecake"));


//        System.out.println(Recursion.gcd);

//        System.out.println(Recursion.Fibonacci(7));

//        System.out.println(Recursion.collatzConjecture(10));

//        System.out.println(Recursion.addUp(600));

//        System.out.println(search(new int[]{1,2,3,4},3));

//        System.out.println(Recursion.factorial(5));//120

//        System.out.println(0);
//        System.out.println(1 );
//        System.out.println(Recursion.fibonacci(8));

//        System.out.println(Recursion.fac(3));

//        System.out.println(Recursion.printsum(12,1));


    }
}
