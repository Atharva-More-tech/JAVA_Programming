class Logic
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: countFactors
// Description: counts total number of Factors of number.
// Input: int
// Output : int
// Author : Atharva Sanjay More
// Date : 4/11/25
//
///////////////////////////////////////////////////////////////////////////////////
{
void countFactors(int num)
{
    int iCnt=0 ;
    int iCount=0;

    for(iCnt = 1; iCnt< num; iCnt++)

    if((num % iCnt)==0)
    {
        iCount++;
    }
    System.out.println(iCount);

}
}
class program21_4
{
public static void main(String args[])
{
Logic obj = new Logic();
obj.countFactors(20);
}
}