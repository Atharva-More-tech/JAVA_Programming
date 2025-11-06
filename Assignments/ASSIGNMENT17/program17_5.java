class Logic
{
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: printTable
// Description: program to print the multiplication table of a number.
// Input: int
// Output : int
// Author :Atharva Sanjay More
// Date : 3/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void printTable(int num)
 {
    int iCnt=0;
    int iTable=0;

    for(iCnt=1; iCnt<=10; iCnt++)
    {
        iTable = num * iCnt;
        System.out.println(iTable);
    }

 }
}
class program17_5
{
 public static void main(String args[])
 {
    Logic obj = new Logic();
    obj.printTable(5);
 }
}