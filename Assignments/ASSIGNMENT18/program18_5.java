class Logic
{
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: checkSign
// Description:  checks whether a number is positive, negative, or zero 
// Input: int
// Output : positive, negative, or zero 
// Author : Atharva Sanjay More
// Date : 3/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void checkSign(int num)
 {
    if(num > 0)
    {
        System.out.println("Positive");
    }
    else if(num < 0)
    {
        System.out.println("Negative");
    }
    else
    {
        System.out.println("Zero");
    }
 }
}
class program18_5
{
 public static void main(String args[])
 {
 Logic obj = new Logic();
 obj.checkSign(-8);
 }
}