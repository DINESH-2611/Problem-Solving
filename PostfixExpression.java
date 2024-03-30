package problemsolving;

import java.util.Scanner;
import java.util.Stack;

public class PostfixExpression {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the expression");
        String s=scanner.nextLine();
        int res=evaluateExpression(s);
        System.out.println(res);
    }
    public static int evaluateExpression(String s){
        Stack<Integer> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                stack.push(ch-'0');
            }else{
                int o1=stack.pop();
                int o2=stack.pop();
                int res=calculate(o1,o2,ch);
                stack.push(res);
            }
        }
        return stack.pop();
    }

    private static int calculate(int o1, int o2, char ch) {
        switch (ch){
            case '+':return o1+o2;
            case '-':
                    return o2-o1;
            case '*':return o1*o2;
            case '/':
                    return o2/o1;
            default:
                System.out.println("Invalid operator");
                return -1;
        }
    }
}
