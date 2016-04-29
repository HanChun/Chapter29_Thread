package exe;

import java.util.HashSet;
import java.util.Set; 

public class Maze {

	public static void main(String[] args) {
		Maze a = new Maze();
		a.getStdInput();
		a.show();
		a.go();
		System.out.println("--------------------------");
		a.show();
	}

	private void go() {
		Set path = new HashSet();
		solve = new HashSet();
		go(entry,path);
	}

	private void show() {
		// TODO Auto-generated method stub
		
	}

	private void getStdInput() {
		// TODO Auto-generated method stub
		String[] x = {
				"####B#######"
		};
	}

}
