import java.util.ArrayList;

public class TodoList {
	
	private ArrayList<String> taskList;
	
	public TodoList() {
		this.taskList = new ArrayList<String>();
	}
	
	public void add(String task) {
		taskList.add(task);
	}
	
	public void print() {
		for(int index = 0; index<taskList.size(); index++) {
			System.out.println(index+1 + ": " + taskList.get(index));
		}
	}
	
	public void remove(int number) {
		taskList.remove(number-1);
	}

}
