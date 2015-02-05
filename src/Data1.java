import java.util.Calendar;
import java.util.Date;


public class Data1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.currentTimeMillis());
		Date agora = new Date();
		System.out.println(agora);
		
		Date data = new Date(1_000_000_000_000L);
		System.out.println(data);
		/*Métodos8*/
		
		data.getTime();
		data.setTime(1_000_000_000_000l);
		System.out.println(data.compareTo(agora));
		
		Calendar c = Calendar.getInstance();
		c.set(1980, Calendar.FEBRUARY, 12);
		System.out.println(c.getTime());
		

	}

}
