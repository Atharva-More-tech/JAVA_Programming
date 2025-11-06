class Logic
{
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: findMax
// Description: program to find the maximum of two numbers.
// Input: int,int
// Output : int
// Author : Atharva Sanjay More
// Date : 3/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void findMax(int a, int b)
 {
    if(a > b)
    {
        System.out.println("maximum is:"+a);
    }
    else
    {
        System.out.println("maximum is:"+b);
    }
     }
}
class program17_3
{
 public static void main(String args[])
 {
 Logic obj = new Logic();
 obj.findMax(20, 15);
 }
}