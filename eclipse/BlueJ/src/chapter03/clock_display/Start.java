package chapter03.clock_display;

public class Start {
	public static void main(String[] args) {
		ClockDisplay cd1 = new ClockDisplay(9, 35);
		int i = 0;
		while (i < 10) {
			System.out.println(cd1.getTime());
			cd1.timeTick();
			i++;

		}

	}
}
