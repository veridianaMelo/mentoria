import java.text.SimpleDateFormat;
import java.util.Date;


	public class Data {

	int dia;
	int mes;
	int ano;



	public static void main (String [] args){

		Date data= null ;
		String data1 = "dd/MM/yyyy";
		SimpleDateFormat formatas = new SimpleDateFormat(data1 );
		String data4 = formatas.format(data);
		System.out.println(data4);

	}}