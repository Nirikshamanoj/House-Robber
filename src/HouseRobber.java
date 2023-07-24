import java.util.Scanner;
public class HouseRobber {
    static int findMax(int[] A,int n)
    {
        int sumEven=0,sumOdd=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
                sumEven+=A[i];
            else
                sumOdd+=A[i];
        }
        return Math.max(sumEven,sumOdd);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] A=new int [n];
        for(int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();
        }
        int maximum=findMax(A,n);
        System.out.println(maximum);
    }
}
