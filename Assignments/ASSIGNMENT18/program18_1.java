class Logic
{
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: checkPrime
// Description: Checks whether prime or not
// Input: int
// Output : prime or not
// Author : Atharva Sanjay More
// Date : 3/11/25
//
///////////////////////////////////////////////////////////////////////////////////
void checkPrime(int num)
 {
int iCnt = 0;  

        for (int i = 2; i <= num / 2; i++)
        {
            if (num % i == 0)
            {
                iCnt++;   
                break;
            }
        }
        if (iCnt == 0)
        {
            System.out.println(" it is a Prime number");
        }
        else
        {
            System.out.println(" it is not a Prime number");
        } }
}
class program18_1
{
 public static void main(String args[])
 {
    Logic obj = new Logic();
    obj.checkPrime(11);
 }
}