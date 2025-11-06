class Logic
{
///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: calculateSum
// Description: calculate the sum of first N natural numbers.
// Input: int
// Output : int
// Author :Atharva Sanjay More
// Date : 3/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void calculateSum(int n)
 {
    int iCnt=0;
    int iSum=0;

    for(iCnt = 1; iCnt<=n; iCnt++)
    {
       iSum = iSum + iCnt;
       
    }
    System.out.println(iSum);
    
 }
}
class program16_1
{
 public static void main(String args[])
 {
    Logic obj = new Logic();
    obj.calculateSum(10);
 }
}