class Logic
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: countEvenOddRange
// Description: count how many even and odd numbers are present between 1 and N.
// Input: int
// Output : int,int
// Author : Atharva Sanjay More
// Date : 4/11/25
//
///////////////////////////////////////////////////////////////////////////////////
{
void countEvenOddRange(int n)
{
    int iCnt = 0;
    int iEven = 0;
    int iOdd = 0;

    for(iCnt = 1 ; iCnt <= n ; iCnt++)
    {
        if(iCnt % 2 == 0)
        {
            iEven++;
        }
        if(iCnt % 2 != 0)
        {
            iOdd++;
        }
    }
    System.out.println(iEven+"the number is even");
    System.out.println(iOdd+"the number is odd");
}
}
class program21_2
{
public static void main(String args[])
{
Logic obj = new Logic();
obj.countEvenOddRange(50);
}
}