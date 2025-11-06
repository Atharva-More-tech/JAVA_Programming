class Logic
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: checkDivisible
// Description: check whether a number is divisible by 5 and 11 or not.
// Input: int
// Output :55 is divided by both 5 and 11
// Author : Atharva Sanjay More
// Date : 4/11/25
//
///////////////////////////////////////////////////////////////////////////////////
{
void checkDivisible(int num)
{
    if(num % 5 == 0 && num % 11 ==0)
    {
        System.out.println(num+" is divided by both 5 and 11");
    }
    else
    {
        System.out.println(num+" is not divided by both 5 and 11");
    }
}
}
class program19_3                                   
{
public static void main(String args[])
{
Logic obj = new Logic();
obj.checkDivisible(55);
}
}