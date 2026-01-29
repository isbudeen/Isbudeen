import java.util.Scanner;
public class condition {

       Scanner sc = new Scanner(System.in);
        int day;
        public void caseMatch(){
            System.out.println("Enter day");
            day =  sc.nextInt();

            //Switch -> Changes from one to another Case
            switch(day){
                case 1 :
                    System.out.println("Day "+ day + " is Sunday");
                    break;
                case 2 :
                    System.out.println("Day "+ day + " is Monday");
                    break;
                case 3 :
                    System.out.println("Day "+ day + " is Tuesday");
                    break;
                case 4 :
                    System.out.println("Day "+ day + " is Wednesday");
                    break;
                case 5 :
                    System.out.println("Day "+ day + " is Thursday");
                    break;
                case 6 :
                    System.out.println("Day "+ day + " is Friday");
                    break;
                case 7 :
                    System.out.println("Day "+ day + " is Saturday");
                    break;

                default:
                    System.out.println("Valid day not passed");

            }


        }
        public static void main(String[] args) {
            condition cs = new condition();
            cs.caseMatch();
        }
    }

