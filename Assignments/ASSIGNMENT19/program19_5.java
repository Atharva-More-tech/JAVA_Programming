class Logic
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: calculatePower
// Description: calculate the power of a number using loops.
// Input: int
// Output :64
// Author : Atharva Sanjay More
// Date : 4/11/25
//
///////////////////////////////////////////////////////////////////////////////////
{
void calculatePower(int base, int exp)
{
    int iCnt = 0;
    int iAns = 1;

    for(iCnt = 0; iCnt <= exp; iCnt++)
    {
        iAns = iAns * base;

    }
        System.out.println(iAns);
}
}
class program19_5
{
public static void main(String args[])
{
Logic obj = new Logic();
obj.calculatePower(2, 5);
}
}