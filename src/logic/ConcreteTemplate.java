package logic;


import java.util.*;

public class ConcreteTemplate extends Template {

    public ConcreteTemplate() {
    }

    private ArrayList<Object> templateState;
    


    public void setState() {
        // TODO implement here
    }

    public List<Object> getState() {
        // TODO implement here
        return templateState;
    }

    public Memento saveStateToMemento() {
        ArrayList<Object> currentState=new ArrayList<>();
        
        currentState.add(this.bibliography);
        currentState.add(this.evaluation);
        currentState.add(this.filename);
        currentState.add(this.generalDescription);
        currentState.add(this.generalObjectives);
        currentState.add(this.isBibliographyVariable);
        currentState.add(this.isEvaluationVariable);
        currentState.add(this.isMethodologyVariable);
        currentState.add(this.methodology);
        currentState.add(this.specificObjectives);
        currentState.add(this.thematicContent);
        
        Memento memento=new Memento(currentState);
        
        return memento;
    }

    public void getStateFromMemento() {
        // TODO implement here
    }

}