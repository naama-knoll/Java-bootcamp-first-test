import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //array answer
        int [] array = new int[10];
        for(int i=0;i<10;i++){
            array[i]= (int) Math.pow(i,2);
        }
        System.out.println(Arrays.toString(array));


        System.out.println(takeStairs(5));


    }
    //recursion ans
    public static int takeStairs(int n){
        if(n<=0)
            return 0;
        if(n==1|| n==2)
            return n;
        return takeStairs(n-1)+takeStairs(n-2);

    }
}
