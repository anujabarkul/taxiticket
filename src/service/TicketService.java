package service;

import model.Route;
import model.Ticket;

public class TicketService {

	public Ticket generateTicket(Route opRoute, int noOfTravellers) {
		Ticket ticket = null;
		float fair = 0f;
		if (opRoute.getDistance() < 100) {
			fair = 750;
		} else {
			fair = 750 + (opRoute.getDistance() - 100) * 5;
		}
		float total = fair * noOfTravellers;
		ticket = new Ticket(opRoute.getFrom(), opRoute.getTo(), opRoute.getDistance(), noOfTravellers, total);
		return ticket;
	}

	public void printTicket(Ticket ticket) {

		System.out.println(ticket.toString());
	}

}
