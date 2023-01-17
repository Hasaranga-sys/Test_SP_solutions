package problem_1;


import java.util.List;
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        var Numbers = List.of(1,2,3,4,5);

        var sum = 0;
        for (int i = 0; i < Numbers.size() ; i++) {
            sum += Numbers.get(i);
        }
        System.out.println(sum);

    }

    }

