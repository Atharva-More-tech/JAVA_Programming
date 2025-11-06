class Logic
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: displayGrade
// Description:  to display the grade of a student based on marks.
// Input: int
// Output :grade A
// Author : Atharva Sanjay More
// Date : 3/11/25
//
///////////////////////////////////////////////////////////////////////////////////
{
void displayGrade(int marks)
{
    int iTotal= 0;

    if(marks >= 90)
    {
        System.out.println("grade A+");
    }
    else if(marks >= 80)
    {
        System.out.println("grade A");
    }
    else if(marks >= 70)
    {
        System.out.println("grade B");
    }
    else if(marks >= 60)
    {
        System.out.println("grade C");
    }
    else if(marks >= 50)
    {
        System.out.println("grade D");
    }
    else
    {
        System.out.println("Fail");
    }
    
}
}
class program19_2
{
public static void main(String args[])
{
Logic obj = new Logic();
obj.displayGrade(82);
}
}