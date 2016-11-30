package logic;


import java.util.*;

public class CareTaker {
    public ArrayList<Memento> mementoList;

    public CareTaker() {
        mementoList=new ArrayList<Memento>();
    }



    public void add(Memento pMemento)
    {
        this.mementoList.add(pMemento);
    }

    public Memento get(int pIndex)
    {
        
        return mementoList.get(pIndex);
    }

}