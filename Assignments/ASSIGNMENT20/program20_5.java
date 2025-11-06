class Logic
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: findSmallestDigit
// Description:find the smallest digit in a given number.
// Input: int
// Output : int
// Author : Atharva Sanjay More
// Date : 4/11/25
//
///////////////////////////////////////////////////////////////////////////////////
{
void findSmallestDigit(int num)
{
    int iDigit = 0;
    int iCompare = 0;
    iCompare=5;

    while(num != 0)
    {
        iDigit = num % 10;
        num = num / 10;

        if(iDigit < iCompare)
        {
            iCompare = iDigit;
        }
    }
    System.out.println(iCompare+"smallest number");
}
}
class program20_5
{
public static void main(String args[])
{
Logic obj = new Logic();
obj.findSmallestDigit(45872);
}
}