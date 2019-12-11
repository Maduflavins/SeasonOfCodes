public class IntegerValue{
	public static void main(String[] args){
		char firstNo = 'A';
		char secondNo = 'B';
		char thirdNo = 'C';
		char fourthNo = 'a';
		char fifthNo = 'b';
		char sixthNo = 'c';
		char seventhNo = '0';
		char eightNo = '1';
		char ninthNo = '2';
		char tenthNo = '$';
		char eleventh = '*';
		char twelveth = '+';
		char thirteenth = '/';

		int value1 = (int) firstNo;
		int value2 = (int) secondNo;
		int value3 = (int) thirdNo;
		int value4 = (int) fourthNo;
		int value5 = (int) fifthNo;
		int value6 = (int) sixthNo;
		int value7 = (int) seventhNo;
		int value8 = (int) eightNo;
		int value9 = (int) ninthNo;
		int value10 = (int) tenthNo;
		int value11 = (int) eleventh;
		int value12= (int) twelveth;
		int value13 = (int) thirteenth;
		System.out.println("Values of some unicode characters: ");
		System.out.printf("%c:%d,%n%c:%d,%n%c:%d,%n%c:%d,%n%c:%d,%n%c:%d",firstNo,value1,secondNo,value2,thirdNo,value3,fourthNo,value4,fifthNo,value5,sixthNo,value6);
		System.out.printf("%n%c:%d,%n%c:%d,%n%c:%d,%n%c:%d,%n%c:%d,%n%c:%d",seventhNo,value7,eightNo,value8,ninthNo,value9,tenthNo,value10,eleventh,value11,twelveth,value12);
		System.out.printf("%n%c:%d",thirteenth,value13);
	
	}
}
