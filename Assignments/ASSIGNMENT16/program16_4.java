class Logic
{
///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: reverseNumber
// Description: program to reverse a number.
// Input: int
// Output : int
// Author : Atharva Sanjay More
// Date : 3/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void reverseNumber(int num)
 {
    
    int iDigit=0;
    int irev= 0;
    while(num != 0)
    {
        iDigit= num % 10;
        irev = (irev * 10) + iDigit;
        num=num /10;
        System.out.println(irev);
    }
 }
}
class program16_4
{
 public static void main(String args[])
 {
    Logic obj = new Logic();
    obj.reverseNumber(1234);
 }
}