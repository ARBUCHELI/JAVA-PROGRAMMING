/*Using the predefined Java Object called Day, calculate the date of arriving of the Mariner 4, taking into consideration that it traveled 228 days.*/

public class Mariner4
{
	public static void main(String[] args)
	{
		Day mariner4 = new Day(1964, 11, 28);
		mariner4.addDays(228);
		System.out.println(mariner4.toString());
	}
}
