class Logic
{
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: checkPalindrome
// Description: program to check whether a number is a palindrome or not.
// Input: int
// Output : palindrome or not
// Author : Atharva Sanjay More
// Date : 3/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void checkPalindrome(int num)
{
    int iDigit=0;
    int irev=0;
    int iNo=0;
    
    iNo = num;

    while(iNo != 0)
    {
        iDigit= iNo % 10;
        irev = (irev * 10) + iDigit;
        iNo=iNo /10;
    }

    if(num == irev)
    {
        System.out.println("it is palindrome");
    }
    else
    {
        System.out.println("it is not palindrome");
    }
    
}
   
    }  

class program17_2
{
 public static void main(String args[])
 {
    Logic obj = new Logic();
    obj.checkPalindrome(121);
 }
}