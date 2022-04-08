import java.util.Scanner;

public class FirstSingleLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char[] arrChar = new char[str.length()];
        for(int i=0;i<str.length();i++){
            arrChar[i]=str.charAt(i);
        }

        char text= firstSingleLetter(arrChar,str.length());
        System.out.println(text);

    }
    public static char firstSingleLetter(char text[], int n){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(text[i]==text[j] && i!=j){
                    count=0;
                    break;
                }
                count++;
            }
            if(count==n){
                return text[i];
            }
        }
        // here 0 means there is no letter which is used single time
        return '0';
    }
}
