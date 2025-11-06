class Logic
{
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: countDigits
// Description: a program to count the number of digits in a given number.
// Input: int
// Output : int
// Author : Atharva Sanjay More
// Date : 3/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void countDigits(int num)
 {
 int iCnt=0;
    int iDigit=0;
    while(num != 0)
    {
        iDigit= num % 10;
        iCnt++;
        num=num /10;

    }
    System.out.println(iCnt); 
    }
}
class program16_5
{
 public static void main(String args[])
 {
    Logic obj = new Logic();
    obj.countDigits(7865);
 }
}