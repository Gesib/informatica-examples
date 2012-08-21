package chapter02.naive_ticket_machine;

public class Start {
	public static void main(String[] args) {
		testPrintTicket();
		testDontPrintTicketWithTooLittleMoney();
		testRefundBalance();
	}

	public static void testPrintTicket() {
		TicketMachine bike = new TicketMachine(150);
		bike.insertMoney(150);
		bike.printTicket();
		System.out.println("Wechselgeld: " + bike.refundBalance() + "cent");
	}

	public static void testRefundBalance() {
		TicketMachine tm = new TicketMachine(235);
		tm.insertMoney(300);
		tm.printTicket();
		System.out.println("Preis vom Ticket: " + tm.getPrice() + "cent");
		System.out.println("Wechselgeld: " + tm.refundBalance() + "cent");
		System.out
				.println("Wechselgeld darf aber nur einmal zurückgegeben werden: "
						+ tm.refundBalance() + "cent");
	}

	public static void testDontPrintTicketWithTooLittleMoney() {
		TicketMachine tm = new TicketMachine(235);
		System.out.println("This shouldn't print ticket:");
		tm.printTicket();
	}
}
