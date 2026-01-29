public class TwoDimensionArray {
    int [][] matrix={{1,2,3,4,5},{6,7,8,9,0},{7,6,4,3,2}};
    public void ArrayMat()
    {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        TwoDimensionArray arm=new TwoDimensionArray();
        arm.ArrayMat();
    }
}
