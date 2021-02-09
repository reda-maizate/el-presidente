package event;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class EventList extends ArrayList<Event> {

	public ArrayList<Event> eventList = new ArrayList<Event>();
	
	public EventList(ArrayList<Event> eventList) {
		this.eventList = eventList;
	}
	
	public EventList() {
	}
	
	public void addToEventList(Event ev) {
		this.eventList.add(ev);
	}
	
	public void readFrom(File file) throws FileNotFoundException {
		Scanner scanner = new Scanner(file);
		Event ev = new Event();
		Event evCurr;
		
		while (scanner.hasNext()) {
			String[] line = scanner.nextLine().split(";"); // on fait le job
			evCurr = ev.from(line);
			addToEventList(evCurr);
		}
		scanner.close();
	}
	
	@Override
	public String toString() {
		for(Event e : this.eventList) {
			System.out.println(e.getQuestion()+ " / " + e.getEventId());
		}
		return "nope";
	}
}
