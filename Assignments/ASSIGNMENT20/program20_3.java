class Logic
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: checkPerfect
// Description: check whether a number is a perfect number or not.
// Input: int
// Output : the number is perfect
// Author : Atharva Sanjay More
// Date : 4/11/25
//
///////////////////////////////////////////////////////////////////////////////////
{
void checkPerfect(int num)
{
    int iCnt = 0;
    int iSum = 0;

    for(iCnt = 1; iCnt < num; iCnt++)
    {
        if(num % iCnt ==0 )
        {
            iSum  = iSum + iCnt;
        }
    }
        if(iSum == num)
        {
            System.out.println("the number is perfect");
        }
        else
        {
            System.out.println("the number is not perfect");
        }
    
}
}
class program20_3
{
public static void main(String args[])
{
Logic obj = new Logic();
obj.checkPerfect(6);
}
}