class Logic

//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: checkLeapYear
// Description:  check whether a given year is a leap year or not.
// Input: int
// Output :its a leap year 
// Author : Atharva Sanjay More
// Date : 3/11/25
//
///////////////////////////////////////////////////////////////////////////////////
{
void checkLeapYear(int year)
{
    if(year %4 == 0)
    {
        System.out.println("its a leap year");

    }
    else
    {
        System.out.println("its not leap year");
    }
}
}
class program19_1
{
public static void main(String args[])
{
Logic obj = new Logic();
obj.checkLeapYear(2024);
}
}