import java.util.Scanner;
public class Primehun {
    public void primeshundr()
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
            if(i%n==0)
            {  n=n+i;
                System.out.println("Print Prime"+n);
            }
    }

    public static void main(String[] args) {
        Primehun obj=new Primehun();
        obj.primeshundr();
    }
}
