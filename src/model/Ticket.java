package model;

public class Ticket {

	private String from;
	private String to;
	private int distance;
	private int noOfTravellers;
	private float total;
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getNoOfTravellers() {
		return noOfTravellers;
	}
	public void setNoOfTravellers(int noOfTravellers) {
		this.noOfTravellers = noOfTravellers;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ticket [from=");
		builder.append(from);
		builder.append(", to=");
		builder.append(to);
		builder.append(", distance=");
		builder.append(distance);
		builder.append(", noOfTravellers=");
		builder.append(noOfTravellers);
		builder.append(", total=");
		builder.append(total);
		builder.append("]");
		return builder.toString();
	}
	public Ticket(String from, String to, int distance, int noOfTravellers, float total) {
		super();
		this.from = from;
		this.to = to;
		this.distance = distance;
		this.noOfTravellers = noOfTravellers;
		this.total = total;
	}
	
	
	
	
	
}
