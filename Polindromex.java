import java.util.Scanner;
public class Polindromex {
    public void polind()
    {
        int n; int temp;int sum=0;int digit;
        System.out.println("enter the Numer:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
        while(n>0) {
            digit = n % 10;
            sum = (sum * 10) + digit;
            n/=10;
        }
        if(temp==sum)
        {
            System.out.println("It is palindrome");}


        else {
            System.out.println("It is not palindrome");
        }
        }

    public static void main(String[] args) {
        Polindromex obj=new Polindromex();
        obj.polind();
    }

    }

