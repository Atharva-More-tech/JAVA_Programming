class Logic
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: productOfDigits
// Description: calculate the product of digits of a number.
// Input: int
// Output : int
// Author : Atharva Sanjay More
// Date : 4/11/25
//
///////////////////////////////////////////////////////////////////////////////////
{
void productOfDigits(int num)
{
    int iDigit = 0;
    int iProduct = 1;

    while(num != 0)
    {
        iDigit = num % 10;
        iProduct = iProduct * iDigit;
        num = num / 10;
    }
        System.out.println(iProduct);
}
}
class program21_1
{
public static void main(String args[])
{
Logic obj = new Logic();
obj.productOfDigits(234);
}
}