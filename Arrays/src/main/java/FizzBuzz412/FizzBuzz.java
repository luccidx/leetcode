package FizzBuzz412;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 15;
        System.out.println("For N = "+a+" Values are : \n" + fizzBuzz(a));
        System.out.println("For N = "+b+" Values are : \n" + fizzBuzz(b));
        System.out.println("For N = "+c+" Values are : \n" + fizzBuzz(c));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0)
                result.add("FizzBuzz");
            else if(i%3==0)
                result.add("Fizz");
            else if(i%5==0)
                result.add("Buzz");
            else
                result.add(String.valueOf(i));
        }
        return result;
    }
}
