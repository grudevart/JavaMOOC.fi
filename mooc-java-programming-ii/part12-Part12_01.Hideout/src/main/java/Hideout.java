
public class Hideout<T> {

	private T toHide;

	public Hideout() {
		toHide = null;
	}

	public void putIntoHideout(T toHide) {
		if (this.toHide == toHide) {
			return;
		}
		this.toHide = toHide;
	}

	public T takeFromHideout() {
		T copyOfT;
		if (toHide == null) {
			return null;
		}
		copyOfT = toHide;
		toHide = null;
		return copyOfT;
	}

	public boolean isInHideout() {
		if (toHide == null) {
			return false;
		}
		return true;
	}
}
