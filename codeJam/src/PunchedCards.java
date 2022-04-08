import java.util.Scanner;

public class PunchedCards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        for(int i=0;i<input;i++){
            int r,c;
            r= scan.nextInt();
            c=scan.nextInt();
            solve(r,c,i);
            System.out.println();

        }
    }
    public static void solve(int r, int c,int i){
        System.out.println("Case #"+(i+1)+":");
        System.out.print("..");
        for(int j=0;j<c;j++){
            if(j==(c-1)) {System.out.print("+");}
            else {System.out.print("+-");}
        }
        System.out.println("");
        System.out.print("..");
        for(int j=0;j<c;j++){
            if(j==c-1) System.out.print("|");
            else System.out.print("|.");
        }
        System.out.println("");
        for(int j=0;j<r-1;j++) {
            for (int k = 0; k <= c; k++) {
                if (k == c) System.out.print("+");
                else System.out.print("+-");
            }
            System.out.println("");
            for (int k = 0; k <= c; k++) {
                if (k == c) System.out.print("|");
                else System.out.print("|.");
            }
            System.out.println("");
        }
        for(int k =0;k<=c;k++){
            if(k==c) System.out.print("+");
            else System.out.print("+-");
        }


    }
}
