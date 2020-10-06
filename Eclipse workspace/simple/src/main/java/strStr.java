public class strStr {

    public int strStr(String haystack, String needle) {
        int index=-1;
        if(haystack.isEmpty() && needle.isEmpty())
            return 0;
        if(haystack.isEmpty())
            return -1;
        if(needle.isEmpty())
            return 0;
        if(haystack.contains(needle))
        {
            index=haystack.indexOf(needle.charAt(0));
            for(int j=index;j<haystack.length();j++)
            {
                if(haystack.charAt(j)==needle.charAt(0) && (haystack.substring(j,(needle.length()+j)).equals(needle)))
                    return j;
            }

        }
        return index;
    }
    public static void main(String arg[])
    {
        strStr st=new strStr();
        int result=st.strStr("mississippi","pi");
        System.out.println(result);
    }
}
