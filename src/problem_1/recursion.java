package problem_1;

public class recursion {

    public static int sum(int[]numbers, int index){
        if(index == numbers.length){
            return 0;
        }
        return numbers[index] + sum(numbers,index+1);
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int sum= sum(numbers,0);
        System.out.println(sum);

    }


}
