class Logic
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: printDivisibleBy2and3
// Description: print numbers from 1 to N that are divisible by both 2 and 3.
// Input: int
// Output : int
// Author : Atharva Sanjay More
// Date : 4/11/25
//
///////////////////////////////////////////////////////////////////////////////////
{
void printDivisibleBy2and3(int n)
{
    int iCnt =0;

    for(iCnt = 1; iCnt < n; iCnt++)
    {
        if(iCnt % 2 == 0 && iCnt % 3 == 0)
        {
            System.out.println(iCnt);
        }
    }
}
}
class program21_5
{
public static void main(String args[])
{
Logic obj = new Logic();
obj.printDivisibleBy2and3(30);
}
}