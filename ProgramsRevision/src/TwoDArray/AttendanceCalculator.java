package TwoDArray;

public class AttendanceCalculator {


	    public static void main(String[] args) {

	        int[][] attendance = {
	            {1, 1, 0, 1, 1},
	            {1, 0, 0, 1, 0},
	            {1, 1, 1, 1, 1}
	        };

	        int totalDays = attendance[0].length;

	        for (int i = 0; i < attendance.length; i++) {
	            int totalPresent = 0;

	            for (int j = 0; j < attendance[i].length; j++) {
	                totalPresent += attendance[i][j];
	            }

	            double average = (double) totalPresent / totalDays * 100;

	            System.out.println(
	                "Student " + (i + 1) +
	                " | Total Present: " + totalPresent +
	                " | Average Attendance: " + average + "%"
	            );
	        }
	    }
	}

