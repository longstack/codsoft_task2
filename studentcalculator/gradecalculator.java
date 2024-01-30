package studentcalculator;

public class gradecalculator 
{
	//calculating average of marks
public double averagepercent(int ttlmarks,int subj)
{
	double ans;
	ans=(double)ttlmarks/subj;
	return ans;
	
}
//conditions for grade calculation
public char grade(double avg)
{
	char grade;
    if (avg >= 90) 
    {
        grade = 'A';
    } 
    else if (avg >= 80) 
    {
        grade = 'B';
    }
    else if (avg >= 70) 
    {
        grade = 'C';
    } 
    else if (avg >= 60)
    {
        grade = 'D';
    } 
    else 
    {
        grade = 'F';
    }
    return grade;
    
}

}
