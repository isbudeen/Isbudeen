public class DefMethods {
public int addNumbers(int a, int b)
{

    return a+b;
}
int a=100;
int b=200;
public int subNumbers()
{
    return b-a;
}
    public static void main(String[] args) {
        DefMethods obj=new DefMethods();
       int sum= obj.addNumbers(120,15);
        System.out.println(sum);
        System.out.println(obj.subNumbers());
    }
}
