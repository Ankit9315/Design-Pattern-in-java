package Behavioural.Memento;

import java.util.List;
import java.util.ArrayList;

public class CareTaker {

	private List<Memento> mementoList = new ArrayList<>();
	
	public void addMemento(Memento state) {
		mementoList.add(state);
	}
	
	public Memento getMemento(int index) {
		return mementoList.get(index);
	}
}
