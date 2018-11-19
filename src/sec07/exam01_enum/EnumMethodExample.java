package sec07.exam01_enum;

public class EnumMethodExample {

	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		int ordinal = today.ordinal(); // 순서
		System.out.println(ordinal);
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);  // 빼기
		int result2 = day2.compareTo(day1);

		System.out.println(result1);
		System.out.println(result2);
		
		Week weekDay = Week.valueOf("SUNDAY"); // 문자열 ""와 동일한 값을가진 열거객체를 찾아서 리턴해줌
		if(weekDay == weekDay.SATURDAY|| weekDay == Week.SUNDAY) {
			System.out.println("주말이군요");
			
		}else
			System.out.println("평일이군요");
		Week[] days = Week.values();  // 전부 배열의 항목으로 만듦
		for(Week day : days) {
			System.out.println(day);
			
			
		}
		
		
		
	}

}
