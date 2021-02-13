package service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import models.event.AnswerList;
import models.event.EventList;


public class Seasons {
	private static ArrayList<EventList> eventsBySeasons = new ArrayList<EventList>();
	private static ArrayList<AnswerList> answersBySeasons = new ArrayList<AnswerList>();
    
    public Seasons() throws IOException {
    	Seasons.readAnswers();
    	Seasons.readEvents();
    }
    
    public static ArrayList<EventList> readEvents() throws IOException {
    	EventList eventAutumn = new EventList();
    	EventList eventSpring = new EventList();
    	EventList eventSummer = new EventList();
    	EventList eventWinter = new EventList();
    	
		eventAutumn.readFrom(new File("./Data/Event/Autumn.txt"));
		eventSpring.readFrom(new File("./Data/Event/Spring.txt"));
		eventSummer.readFrom(new File("./Data/Event/Summer.txt"));
		eventWinter.readFrom(new File("./Data/Event/Winter.txt"));
		
		eventsBySeasons.add(eventAutumn);
		eventsBySeasons.add(eventSpring);
		eventsBySeasons.add(eventSummer);
		eventsBySeasons.add(eventWinter);
		
		return eventsBySeasons;
    }
    
    public static ArrayList<AnswerList> readAnswers() throws IOException {
    	AnswerList answerAutumn = new AnswerList();
    	AnswerList answerSpring = new AnswerList();
    	AnswerList answerSummer = new AnswerList();
    	AnswerList answerWinter = new AnswerList();
    	
		answerAutumn.readFrom(new File("./Data/Answer/AnswerAutumn.txt"));
		answerSpring.readFrom(new File("./Data/Answer/AnswerSpring.txt"));
		answerSummer.readFrom(new File("./Data/Answer/AnswerSummer.txt"));
		answerWinter.readFrom(new File("./Data/Answer/AnswerWinter.txt"));
		
		answersBySeasons.add(answerAutumn);
		answersBySeasons.add(answerSpring);
		answersBySeasons.add(answerSummer);
		answersBySeasons.add(answerWinter);
		
		return answersBySeasons;
    }


	public ArrayList<AnswerList> getAnswersBySeasons() {
		return Seasons.answersBySeasons;
	}

	public ArrayList<EventList> getEventsBySeasons() {
		return Seasons.eventsBySeasons;
	}
    
}

