// Description : accept one number from user and off 7th bit of that number if it is on. Return modified number.
// Input : 79
// Output : 15

import java.util.Scanner;

class program65_1
{
    public static void main(String A[])
    {
        int iNo = 0, iMask = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number :");
        iNo = sobj.nextInt();

        iMask = 0x0000000f;
        
        iNo = iNo |iMask;

        System.out.println("Updated number : "+iNo);

}
}