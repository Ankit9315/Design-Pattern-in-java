package Behavioural.Command;

public class MenuOption {

	private ActionListenerCommand openCommand;
	private ActionListenerCommand saveCommand;
	
	public MenuOption(ActionListenerCommand openCommand, ActionListenerCommand saveCommand) {
		this.openCommand = openCommand;
		this.saveCommand = saveCommand;
	}
	
	public void clickOpen() {
		openCommand.executor();
	}
	
	public void clickSave() {
		saveCommand.executor();
	}
}
