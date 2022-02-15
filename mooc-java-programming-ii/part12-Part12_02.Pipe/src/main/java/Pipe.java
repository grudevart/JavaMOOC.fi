import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

public class Pipe<T> {

	private ArrayList<T> pipeStack;

	public Pipe() {
		pipeStack = new ArrayList<>();
	}

	public void putIntoPipe(T value) {
		pipeStack.add(value);
	}

	public T takeFromPipe() {
		T copy;
		if (!pipeStack.isEmpty()) {
			copy = pipeStack.get(0);
			pipeStack.remove(0);
			return copy;
		}
		return null;
	}

	public boolean isInPipe() {
		return (!pipeStack.isEmpty());
	}
}
