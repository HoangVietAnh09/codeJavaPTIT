package codePTIT;

import java.util.Scanner;
import java.util.Stack;

public class J08021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            Stack<Integer> stack = new Stack<>();
            int res = 0;
            int dp[] = new int[s.length()];
            for(int i = 0; i < s.length(); i++) {
                if(stack.empty()) stack.push(i);
                else{
                    if(s.charAt(i) == ')' && s.charAt(stack.lastElement()) == '('){
                        dp[i] = i - stack.lastElement() + 1;
                        if(stack.lastElement() > 0 && s.charAt(stack.lastElement() -1) == ')'){
                            dp[i] += dp[stack.lastElement()-1];
                        }
                        res = Math.max(res, dp[i]);
                        stack.pop();
                    }else stack.push(i);
                }
            }
            System.out.println(res);
        }
    }
}
