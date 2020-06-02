import java.util.HashMap;
import java.util.Stack;
public class ValidParanthesis {

    public static void main(String arg[])
    {
        String s="(){}[]";
        HashMap<Character,Character> hash=new HashMap<Character, Character>();
        hash.put(')','(');
        hash.put('}','{');
        hash.put(']','[');

        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='{' || s.charAt(i)=='{' || s.charAt(i)=='[')
                stack.push(s.charAt(i));
            else
            {
                if(!stack.isEmpty() && stack.peek()==hash.get(s.charAt(i)))
                    stack.pop();
                else
                {
                    System.out.println("False");
                    break;
                }


            }
        }

        if(stack.isEmpty())
            System.out.println("true");
    }

}
