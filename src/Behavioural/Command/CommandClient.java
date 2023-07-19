package Behavioural.Command;

public class CommandClient {

	public static void main(String[] aargs) {
		
		Document doc = new Document();
		
		ActionListenerCommand openCommand = new ActionOpen(doc);
		ActionListenerCommand saveCommand = new ActionSave(doc);
		
		MenuOption menu = new MenuOption(openCommand, saveCommand);
		
		menu.clickOpen();
		menu.clickSave();
	}
}
