class Logic
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: printDigits
// Description: print each digit of a number separately.
// Input: int
// Output :9
//         8
//         7
//         6
// Author : Atharva Sanjay More
// Date : 4/11/25
//
///////////////////////////////////////////////////////////////////////////////////
{
void printDigits(int num)
{
    int iDigit =0;
    int irev =0;
    while(num != 0)
    {
        iDigit = num % 10;
        irev = (irev * 10) + iDigit;
        num = num/10;
    }
    while(irev != 0)
    {
        iDigit= irev % 10;
        System.out.println(iDigit);
        irev=irev /10;
        
    }
}
}
class program19_4
{
public static void main(String args[])
{
Logic obj = new Logic();
obj.printDigits(9876);
}
}