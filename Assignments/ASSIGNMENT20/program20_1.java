class Logic
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: printDigits
// Description: to find the sum of all even numbers up to N.
// Input: int
// Output : 30
// Author : Atharva Sanjay More
// Date : 4/11/25
//
///////////////////////////////////////////////////////////////////////////////////
{
 void sumEvenNumbers(int n)
 {
int iCnt=0;
int iSum=0;

    for(iCnt=1; iCnt<=n; iCnt++)
    {
        if(iCnt % 2 == 0)
        {
            iSum= iSum + iCnt;
            
        }
    } 
    System.out.println(iSum);
    }
}
class program20_1
{
 public static void main(String args[])
 {
    Logic obj = new Logic();
    obj.sumEvenNumbers(10);
 }
}