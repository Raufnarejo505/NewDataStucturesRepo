import java.util.Scanner;
import java.util.Stack;

public class SingeLinkedList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(str);
        if(checkBrackets(str)==true){
            System.out.println("Given string is balanced via brackets");
        }else{
            System.out.println("Given string is not balanced via brackets");
        }


    }
    public static boolean checkBrackets(String str){
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='[' || str.charAt(i)=='(' || str.charAt(i)=='{'){
                stack.push(str.charAt(i));
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    if(str.charAt(i)=='}' && stack.pop()!='{'){
                        return false;
                    }else if(str.charAt(i)==']' && stack.pop()!='['){
                        return false;
                    }else if(str.charAt(i)==')' && stack.pop()!='('){
                        return false;
                    }
                }
            }
        }
        if(stack.isEmpty()) return true;
        else return false;
    }

}
