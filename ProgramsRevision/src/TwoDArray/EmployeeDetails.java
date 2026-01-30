package TwoDArray;

public class EmployeeDetails {

	public static void main(String[] args) {
		int [] [] att= {
				{0,1,1,1,1},
				{1,1,0,0,0},
				{1,0,0,0,0},
				{1,0,1,1,1}
		};
		
		//total attendance of each employee
	System.out.println("total attendance of each employee:");
	for(int i=0;i<att.length ;i++)
	{
		int PresentCount = 0;
		
		for(int j=0;j<att[i].length;j++)
		{
			if(att[i][j]==1)
			{
				PresentCount++;
			}
		}
		
		 System.out.println("Employee"+(i+1)+":"+PresentCount +"days present");
	}

	
	
	//maximum absent employee
	int maxAbsences =0;
	int employeeIndex =0;
	
	for(int i=0;i<att.length ;i++)
	{
		int absenceCount=0;
		
		for(int j=0;j<att[i].length;j++)
		{
			if(att[i][j] == 0)
			{
				absenceCount++;
			}
		}
		
		if(absenceCount>maxAbsences)
		{
			maxAbsences=absenceCount;
			
			employeeIndex=i;
		}
	}
	
	System.out.println("\nEmployee with maximum absences:");
	System.out.println("Employeee "+(employeeIndex +1)+" with " +maxAbsences + " absences");
	
	
	//day with highest overall attendance
	int maxAttendance=0;
	int dayIndex=0;
	
	for(int j=0;j<att[0].length;j++)
	{
		int dayCount=0;
		
		for(int i=0;i<att.length;i++)
		{
			if(att[i][j]==1){
				
				dayCount++;
			}
		}
		
		if(dayCount>maxAttendance)
		{
			maxAttendance=dayCount;
			dayIndex=j;
		}
	}
	
	System.out.println("\nDay With highest overall attendance::");
	
	System.out.println("Day " +(dayIndex +1)+" with "+maxAttendance +" employees present");
 }
}
