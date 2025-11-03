

public class ArmstrongNums {
            public void armstrongNum(int num){ // 153

            //Armstrong number -> 327 -> no.of digits = 3, 2, 7 -> power (no .of digits)

            int digits = 0;
            int num2 = num;
            int out = 0;


            int temp = num; //153 // This temp variable stores the input from user to find how many digits
            // count how many digits
            while(temp > 0){
                temp /= 10; // 153/10 = 15, 15/10 = 1 , 1/10 = 0.1 =0 as in int
                digits++; //1+1
            }

            while(num2>0){
                int digit = num2 % 10;
                // 153%10 = 3, 15%10 = 5
                int power = 1; //3,9, 27
                for(int i = 0; i < digits; i++){ //0<3 = true1<3 =true, 2<3 = true, 3<3 = false
                    power *= digit; // 3*1 = 3, 3*3 = 9, 9*3 = 27
                    //5 * 1 = 5, 5*5 = 25, 25 * 5 = 125
                    //
                }

                out += power; // 27 + 125 + 1 =  153
                num2 /= 10; // 153 /10 = 15, 15/10 = 1
            }

            if(num == out){
                System.out.println(num + " is an armstrong number");
            }else {
                System.out.println(num + " is not an armstrong number");
            }


        }

        public static void main(String[] args) {
            ArmstrongNums to = new ArmstrongNums();
            to.armstrongNum(153);
        }
    }



