package v1.leetcode;

import java.util.Iterator;
import java.util.Stack;

/**
 * https://leetcode.com/problems/backspace-string-compare
 */
public class BackSpaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        char[] arr_s = S.toCharArray();
        char[] arr_t = T.toCharArray();

        Stack<Character> stack_s = processString(arr_s);
        Stack<Character> stack_t = processString(arr_t);

        String new_S = remainingString(stack_s);
        String new_T = remainingString(stack_t);
        System.out.println(new_S);
        System.out.println(new_T);

        return new_S.equals(new_T);
    }

    private Stack<Character> processString(char[] arr){
        Stack<Character> stack = new Stack<>();
        for(char c : arr){
            if(c == '#'){
                if(!stack.empty())
                    stack.pop();
            }else{
                stack.push(c);
            }
        }
        return stack;
    }

    private String remainingString(Stack<Character> stack){
        StringBuilder sb = new StringBuilder();

        Iterator<Character> iterator = stack.iterator();
        while(iterator.hasNext()){
            Character c = iterator.next();
            sb.append(c);
        }

        return sb.toString();
    }
}
