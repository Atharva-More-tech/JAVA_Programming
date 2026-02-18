// Description :accept one number from user and toggle contents of first and last nibble of the number. Return modified number.

import java.util.Scanner;

class program66_5
{
    public static void main(String A[])
    {
        long iNo = 0, iMask = 0;
    
        Scanner sobj = new Scanner(System.in);

        System.err.println("Enter the number :");
        iNo = sobj.nextInt();

        iMask = 0xf000000fL;

        iNo = iNo ^ iMask;

        System.out.println("Updated number : "+iNo);
        
    }
}