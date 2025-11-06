class Logic
{
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: sumOfDigits
// Description:program to find the sum of digits of a number.
// Input: int
// Output : int
// Author : Atharva Sanjay More
// Date : 3/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void sumOfDigits(int num)
 {
 int iDigit=0, iSum=0;
    while(num != 0)
    {
        iDigit= num % 10;
        iSum= iSum + iDigit;
        num=num /10;

    }
    System.out.println(iSum); 
    } 
}
class program17_1
{
 public static void main(String args[])
 {
 Logic obj = new Logic();
 obj.sumOfDigits(1234);
 }
}