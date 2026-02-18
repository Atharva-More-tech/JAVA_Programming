// Description :accept one number and position from user and off that bit. Return modified number.
// Input : 10 , 2
// Output : 8
import java.util.Scanner;

class program66_2
{
    public static void main(String A[])
    {
        int iNo = 0, iPos = 0, iMask = 0x1 ;
    
        Scanner sobj = new Scanner(System.in);

        System.err.println("Enter the number :");
        iNo = sobj.nextInt();

        System.out.println("Enter the position :");
        iPos = sobj.nextInt();

        iMask = iMask << (iPos -1);

        iNo = iNo & (~iMask);

        System.out.println("Updated number :"+iNo);


    }
}