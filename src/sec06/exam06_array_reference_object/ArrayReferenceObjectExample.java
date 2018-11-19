package sec06.exam06_array_reference_object;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java"; // 객체가 같음
		strArray[1] = "Java"; // 객체가 같음
		strArray[2] = new String("Java"); // 다른 객체
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]); //객체 다르니 false
		System.out.println(strArray[0].equals(strArray[2])); //문자열은 같음
		
	}

}
