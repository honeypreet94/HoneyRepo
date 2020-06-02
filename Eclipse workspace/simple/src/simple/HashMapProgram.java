package simple;

import java.util.HashMap;
import java.util.Map;

public class HashMapProgram {
    public static void main(String arg[])
    {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"a");
        hm.put(2,"b");
        hm.put(3,"c");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+ " " +m.getValue());
        }
    }
}
