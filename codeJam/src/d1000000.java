import java.util.Arrays;
import java.util.Scanner;

public class d1000000 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        for (int i = 0; i < input; i++) {
            int n;
            n = scan.nextInt();
            int arr[]=new int[n];
            for (int j = 0; j < n; j++) {
                 arr[j] = scan.nextInt();
            }
            System.out.println();
            solve(arr,i);

        }
    }
    public static void solve(int[] arr,int j){
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>count){
                count++;
            }
        }
        System.out.print("Case #"+(j+1)+": "+count);
    }
}