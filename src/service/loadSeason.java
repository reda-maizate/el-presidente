package service;

import java.io.File;
import java.io.FileNotFoundException;

import event.AnswerList;
import event.EventList;


public class loadSeason {
    
    public loadSeason() {}
    
    public void read() {
    	EventList eventAutumn = new EventList();
    	EventList eventSpring = new EventList();
    	EventList eventSummer = new EventList();
    	EventList eventWinter = new EventList();
    	
    	AnswerList answerAutumn = new AnswerList();
    	AnswerList answerSpring = new AnswerList();
    	AnswerList answerSummer = new AnswerList();
    	AnswerList answerWinter = new AnswerList();
    	
    	try {
    		eventAutumn.readFrom(new File("./Data/Event/Autumn.txt"));
    		eventSpring.readFrom(new File("./Data/Event/Spring.txt"));
    		eventSummer.readFrom(new File("./Data/Event/Summer.txt"));
    		eventWinter.readFrom(new File("./Data/Event/Winter.txt"));
    		
    		answerAutumn.readFrom(new File("./Data/Answer/AnswerAutumn.txt"));
    		answerSpring.readFrom(new File("./Data/Answer/AnswerSpring.txt"));
    		answerSummer.readFrom(new File("./Data/Answer/AnswerSummer.txt"));
    		answerWinter.readFrom(new File("./Data/Answer/AnswerWinter.txt"));
    	} catch (FileNotFoundException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    }
    
    
    
}

