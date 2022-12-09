import java.util.Calendar;
import java.util.TimeZone;


public class Bronze5_16170 {
	public static void main(String[] args) {
		
		TimeZone utc = TimeZone.getTimeZone("UTC");
		Calendar cal = Calendar.getInstance(utc);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.printf("%02d\n",cal.get(Calendar.MONTH)+1);
		System.out.printf("%02d\n",cal.get(Calendar.DATE));
	}
}
