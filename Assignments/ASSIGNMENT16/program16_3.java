class Logic
{
///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: checkEvenOdd
// Description: a program to find the factorial of a number using a for loop.
// Input: int
// Output : even or odd
// Author : Atharva Sanjay More
// Date : 3/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void checkEvenOdd(int num)
 {
if(num % 2 == 0)
{
    System.out.println("even Number");
}
else
{
    System.out.println("Odd Number");
}
 }
}
class program16_3
{
 public static void main(String args[])
 {
    Logic obj = new Logic();
    obj.checkEvenOdd(7);
 }
}