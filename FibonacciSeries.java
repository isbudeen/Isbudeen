import java.util.Scanner;

public class FibonacciSeries {
    public void Fiboser() {
        int num;
        int first=0;
        int second=1;
        int next;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Fibonnaci:"+first);
        System.out.println("Fibonnaci:"+second);
        for(int i=2;i<num;i++)
        {
            next=first+second;

            System.out.println("Fibonnaci:"+next);
            first=second;
            second=next;

        }
    }

    public static void main(String[] args) {
        FibonacciSeries obj=new FibonacciSeries();
        obj.Fiboser();

    }
}
