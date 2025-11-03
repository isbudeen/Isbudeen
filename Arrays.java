package tasks;

public class Arrays {

        // collection of data
        int [] nums = {1,383,4,5,6,7};
        char [] vowels = {'a','e','i','o','u'};
        String [] names={"Tiger","Lion","Fox","Cow","Cat"};
        // Array is index based
        // index -> length -1

       // int a = 10;
        public void arrayIteration(){
            for(int i = 0; i< nums.length ; i++) {
                System.out.print(nums[i]+" ");

                //nums[0] = 1, nums[1] = 383, num[5] = 7
            }System.out.println(" ");
                for(int j=0;j< vowels.length;j++){
                    System.out.print(vowels[j]+" ");
                              }System.out.println(" ");
            for(int k=0;k<names.length;k++)
            {
                System.out.print(names[k]+" ");

            }System.out.println(" ");
        }

        public static void main(String[] args) {
            Arrays as = new Arrays();
            as.arrayIteration();
        }
    }

