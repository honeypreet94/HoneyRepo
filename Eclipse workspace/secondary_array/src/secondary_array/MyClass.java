package secondary_array;

/*public class MyClass {
    static int calculate(int i, int j)
   {
        return 2+i*j;
    }
public static void main(String [] args) {
        int k = MyClass.calculate(5,10);
        System.out.println(k);
    }
}*/


class MyClass {
    static MyClass ref;
    String[] arguments;
    public static void main(String[] args) {
        ref = new MyClass();
        ref.func(args);
    }
    public void func(String[] args) {
        ref.arguments = args;
    }
}

