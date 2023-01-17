package problem_2;

import java.util.ArrayList;

public class problem_2 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        ArrayList<String> merge = new ArrayList<>();
        for(int i=0; i<3;i++){
            merge.add(list1.get(i));
            merge.add(list2.get(i));
        }
        System.out.println("Combined" + merge);

    }
}
