package TwoDArray;

public class DayWiseAttendance {

	public static void main(String[] args) {
		
		 int[][] attendance = {
		            {1, 1, 0, 1, 1},
		            {1, 0, 0, 1, 0},
		            {1, 1, 1, 1, 1}
		        };
		 
		 int totalStudent=attendance.length;
		 int totaldays=attendance[0].length;
		 
		 for(int day=0;day<totaldays;day++)
		 {
			 int presentcount=0;
			 
			 for(int student=0;student<totalStudent;student++)
			 {
				 presentcount+=attendance[student][day];
			 }
			 
			 double avg= (double)presentcount/totalStudent*100;
			 
			 System.out.println("day"+(day+1)+"| present students:"+presentcount+"| Attendance:"+avg+"%");
		 }
	}
}
