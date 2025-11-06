class Logic
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: displayFactors
// Description: to display all factors of a given number.
// Input: int
// Output : int
// Author : Atharva Sanjay More
// Date : 4/11/25
//
///////////////////////////////////////////////////////////////////////////////////
{
void displayFactors(int num)
{
    int iCnt = 0;

    for(iCnt =1; iCnt < num; iCnt++)
    {
        if((num % iCnt)== 0)
        {
            System.out.println(iCnt);
        }
    }
}
}
class program21_3
{
public static void main(String args[])
{
Logic obj = new Logic();
obj.displayFactors(12);
}
}