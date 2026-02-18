// Description : accept one number and position from user and check whether bit at that position is on or off. If bit is one return TURE otherwise return FALSE.
// Input : 10 , 2
// Output : TRUE
import java.util.Scanner;

class program66_1
{
    public static void main(String A[])
    {
        int iNo = 0, iPos = 0, iMask = 0x1 , iResult = 0;
        boolean bRet = false;
    
        Scanner sobj = new Scanner(System.in);

        System.err.println("Enter the number :");
        iNo = sobj.nextInt();

        System.out.println("Enter the position :");
        iPos = sobj.nextInt();

        iMask = iMask << (iPos -1);
        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            bRet = true;
        }
        else
        {
            bRet = false;
        }
        System.out.println("Result : "+bRet);
    }
}