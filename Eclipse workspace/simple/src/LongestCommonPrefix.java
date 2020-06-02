public class LongestCommonPrefix {

    public static void main(String arg[])
    {
        String strs[]={"aa","ab"};
        int small=strs[0].length();
        String smallest=strs[0];
        for(int i=0;i<strs.length;i++)
        {
            if(small>strs[i].length())
            {
                small=strs[i].length();
                smallest=strs[i];
            }
        }

        System.out.println(smallest);
        int i=0;

        while(smallest!="" && i<strs.length)
        {
            if(strs[i].contains(smallest))
            {
                i++;
            }
            else
            {
                if(smallest.length()!=1)
                {
                    smallest=smallest.substring(0,smallest.length()-1);
                    i=0;
                }
                else
                {
                    smallest="";
                }

            }
        }

        System.out.println(smallest);
    }
}
