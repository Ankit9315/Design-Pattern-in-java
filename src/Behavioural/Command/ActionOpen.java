package Behavioural.Command;

public class ActionOpen implements ActionListenerCommand{

	private Document doc;

	public ActionOpen(Document doc) {
		this.doc = doc;
	}

	@Override
	public void executor() {
		doc.open();
	}
}
