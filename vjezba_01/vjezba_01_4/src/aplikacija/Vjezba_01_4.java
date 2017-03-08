package Aplikacija;

public class Vjezba_01_4{
	public static void main(String args[]){
		Podrska.Interval interval = new Podrska.Interval(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		System.out.println(interval.dajZbroj());
	}
}