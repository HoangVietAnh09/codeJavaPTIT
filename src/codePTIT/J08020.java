package codePTIT;

import java.util.Scanner;
import java.util.Stack;

public class J08020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if(stack.isEmpty()){
                    stack.push(s.charAt(i));
                }else{
                    if(stack.lastElement() == '(' && s.charAt(i) == ')') stack.pop();
                    else if(stack.lastElement() == '[' && s.charAt(i) == ']') stack.pop();
                    else if(stack.lastElement() == '{' && s.charAt(i) == '}') stack.pop();
                    else stack.push(s.charAt(i));
                }
            }
            if(stack.isEmpty()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
