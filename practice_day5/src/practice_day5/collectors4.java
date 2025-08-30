package practice_day5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class collectors4 {

	public static void main(String[] args) {
		
		employee emp=new employee();
		emp.id=1;
		emp.city="nashik";
		
		employee emp2=new employee();
		emp2.id=2;
		emp2.city="pune";
		
		employee emp3=new employee();
		emp3.id=3;
		emp3.city="nashik";
		
	Map<String,List<employee>> m = Arrays.asList(emp,emp2,emp3)
       .stream().collect(Collectors.groupingBy((i)->(i.city)));
	//grouping by use to group the elements based on the condition
	System.out.println(m);
	
	}
}


class employee
{
  int id;
  String city;
  
  @Override
	public String toString() {
		return "id:"+this.id;
	}
}