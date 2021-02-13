package models.event;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EventList extends ArrayList<Event> {

	public ArrayList<Event> eventList = new ArrayList<Event>();
	
	public EventList(ArrayList<Event> eventList) {
		this.eventList = eventList;
	}
	
	public EventList() throws IOException {
		this.readFrom(new File("./Data/Event/Autumn.txt"));
	}
	
	public void addToEventList(Event ev) {
		this.eventList.add(ev);
	}
	
	public void readFrom(File file) throws IOException {
		Scanner scanner = new Scanner(file);
		Event ev = new Event();
		Event evCurr;
		
		while (scanner.hasNext()) {
			String[] line = scanner.nextLine().split(";");
			evCurr = ev.from(line);
			addToEventList(evCurr);
		}
		scanner.close();
	}
	
	public ArrayList<Event> getEventsByType(int type) {
		ArrayList<Event> eventsWithSameType = new ArrayList<Event>();
		for (Event ev : this.eventList) {
			if (ev.getType() == type) {
				eventsWithSameType.add(ev);
			}
		}
		return eventsWithSameType;
	}
	
}
