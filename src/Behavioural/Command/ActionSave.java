package Behavioural.Command;

public class ActionSave implements ActionListenerCommand{

	Document doc;

	public ActionSave(Document doc) {
		this.doc = doc;
	}

	@Override
	public void executor() {
		doc.save();
	}
		
}
