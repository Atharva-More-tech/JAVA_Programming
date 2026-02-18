// Description :accept one number and position from user and on that bit. Return modified number.
// Input : 10 , 3
// Output : 14
import java.util.Scanner;

class program66_3
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

        iNo = iNo | iMask;

        System.out.println("Updated number :"+iNo);


    }
}