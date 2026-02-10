// Description : checks whether 5th and 18th bits are ON or OFF.
// Inputs : 
//          16      -> 5th bit ON, 18th bit OFF
//          131072  -> 5th bit OFF, 18th bit ON
//          131088  -> both bits ON

import java.util.Scanner;

class program64_2
{
    public static void main(String A[]) 
    {
        int iNo = 0, iMask5 = 0, iMask18 = 0 ;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number :");
        iNo = sobj.nextInt();

        iMask5 = 0x00000010;
        iMask18 = 0x00020000;

        if((iNo & iMask5) == iMask5)
        {
            System.out.println("5th bit is ON");
        }
        else
        {
            System.out.println("5th bit is OFF");
        }

        if((iNo & iMask18) == iMask18)
        {
            System.out.println("18th bit is ON");
        }
        else
        {
            System.out.println("18th bit is OFF");
        }

    }
}