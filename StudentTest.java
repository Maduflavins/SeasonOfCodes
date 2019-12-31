public class StudentTest{
	public static void main(String[] args){
		Student acct1 = new Student("John", 90.0);
		Student acct2 = new Student("Jane", 75.2);

		System.out.printf("%s's average is: %s%n", acct1.getName(), acct1.getLetterGrade());
		System.out.printf("%s's average is: %s%n", acct2.getName(), acct2.getLetterGrade());
	}
}