
import java.util.Iterator;

public class VPIterator implements Iterator {

	private VP vp;

	public VPIterator(VP v) {
		vp = v;
	}

	public VP next() {
		return vp;
	}

	public boolean hasNext() {
		return false;
	}

	public void remove() {

	}
}
