class Logic
{
///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: findFactorial
// Description: program to check whether a given number is even or odd.
// Input: int
// Output : int
// Author : Atharva Sanjay More
// Date : 3/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void findFactorial(int num)
 {
    int iCnt=0;
    int ifact=1;
   for(iCnt=1;iCnt<=num;iCnt++)
   {
    ifact = ifact * iCnt;
   }
 System.out.println(ifact);
 }
 
 
}
class program16_2
{
 public static void main(String args[])
 {
 Logic obj = new Logic();
 obj.findFactorial(5);
 }
}