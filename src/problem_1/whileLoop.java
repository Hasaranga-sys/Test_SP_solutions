package problem_1;

import java.util.ArrayList;
import java.util.List;

public class whileLoop {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        int sum = 0;
        int c= 0;

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        while (list.size()>c){
            sum+=list.get(c);
            c++;
        }
        System.out.println(sum);
    }
}
