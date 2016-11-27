package logic;


import java.util.*;

public abstract class Template {

    public Template() {
    }

    protected String filename;

    protected Map<String,String> generalDescription;

    protected ArrayList<String> generalObjectives;

    protected ArrayList<String> specificObjectives;

    protected ArrayList<String> thematicContent;

    protected String methodology;

    protected Map<String,Integer> evaluation;

    protected ArrayList<String> bibliography;

    protected boolean isMethodologyVariable;

    protected boolean isEvaluationVariable;

    protected boolean isBibliographyVariable;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

}