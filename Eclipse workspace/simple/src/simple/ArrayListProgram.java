package simple;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProgram {
    public static void main(String arg[])
    {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        Iterator itr=al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
