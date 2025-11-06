class Logic
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: findLargestDigit
// Description:find the largest digit in a given number.
// Input: int
// Output : int
// Author : Atharva Sanjay More
// Date : 4/11/25
//
///////////////////////////////////////////////////////////////////////////////////
{
void findLargestDigit(int num)
{
    int iDigit = 0;
    int iCompare = 0;

    while(num != 0)
    {
        iDigit = num % 10;
        num = num / 10;
        
        if(iDigit > iCompare)
        {
            iCompare = iDigit;
        }
    }    
            System.out.println(iCompare+"is Largest");
        
    }
}

class program20_4
{
public static void main(String args[])
{
Logic obj = new Logic();
obj.findLargestDigit(83429);
}
}