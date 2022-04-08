import java.util.Scanner;

public class D3Printing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        for(int i=0;i<input;i++){
            int arr1[]=new int [4];
            for(int j=0;j<4;j++){
                arr1[i]= scan.nextInt();
            }
            int arr2[]=new int[4];
            for(int j=0;j<4;j++){
                arr1[i]= scan.nextInt();
            }
            int arr3[]=new int[4];
            for(int j=0;j<4;j++){
                arr1[i]= scan.nextInt();
            }
            solve(arr1,arr2,arr3,i);

        }

    }
    public static void solve(int arr1[],int arr2[],int arr3[],int i) {
        System.out.println("Case #"+(i+1)+":");

    }
}
