class Logic
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: printReverse
// Description: print numbers from N down to 1 in reverse order.
// Input: int
// Output : 10
//          9
//          8
//          7
//          6
//          5
//          4
//          3
//          2
//          1
// Author : Atharva Sanjay More
// Date : 4/11/25
//
///////////////////////////////////////////////////////////////////////////////////
{
void printReverse(int n)
{
    int iCnt = 0;

    for(iCnt = n ; iCnt >= 1 ; iCnt--)
    {
        System.out.println(iCnt);
    }
}
}
class program20_2
{
public static void main(String args[])
{
Logic obj = new Logic();
obj.printReverse(10);
}
}