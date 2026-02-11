// Description : accept one number from user and toogle 7th and 10th bit of that number if it is on. Return modified number.
// Input : 577
// Output : 1

import java.util.Scanner;

class program65_4
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iMask = 0, iMask1 = 0, iMask2 =0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number :");
        iNo = sobj.nextInt();

        iMask1 = 0x00000040;
        iMask2 = 0x00000200;

        iMask = iMask1 | iMask2;
        
        iNo = iNo ^ iMask;

        System.out.println("Updated number : "+iNo);

}
}