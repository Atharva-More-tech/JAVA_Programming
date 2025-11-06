class Logic
{
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: sumEvenOddDigits
// Description:  finds the sum of even and odd digits separately 
// Input: int
// Output : int , int
// Author : Atharva Sanjay More
// Date : 3/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void sumEvenOddDigits(int num)
 {
    int iSum1=0,iSum2=0;
    int iDiff=0,iDigit=0;

    while(num != 0 )
    {
        iDigit= num % 10;
    
        if(iDigit % 2 == 0)
        {
            iSum1 = iDigit + iSum1; 
        }
        else
        {
            iSum2 = iDigit + iSum2; 
        }
        num = num / 10;
    } 
    System.out.println(iSum1+"is the Sum of even Digits");
    System.out.println(iSum2+"is the Sum of odd Digits");
    }
}
class program18_4
{
 public static void main(String args[])
 {
    Logic obj = new Logic();
    obj.sumEvenOddDigits(123456);
 }
}