class Logic
{
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: findMin
// Description: program to find the minimum of three numbers.
// Input: int ,int ,int
// Output : int
// Author : Atharva Sanjay More
// Date : 3/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void findMin(int a, int b, int c)
 {
    if(a < b && a < c)
    {
        System.out.println("minimum is:"+a);
    }
    else if(b < a && b < c)
    {
        System.out.println("minimum is:"+b);
    }
    else
    {
        System.out.println("minimum is:"+c);
    }
 }
}
class program17_4
{
 public static void main(String args[])
 {
    Logic obj = new Logic();
    obj.findMin(3, 7, 2);
 }
}