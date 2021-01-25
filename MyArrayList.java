import java.util.Arrays;

public class MyArrayList implements IList {

	private int[] data;
	private int sz;
	private static final int DEFAULT_SIZE = 5;
	private int maxSize = DEFAULT_SIZE;

	public MyArrayList() {
		super();
		this.sz = 0;
		data = new int[maxSize];
	}

	public MyArrayList(int sz) {
		super();
		this.sz = sz;
		if (sz > maxSize)
			maxSize = sz;

		data = new int[maxSize];
	}

	private void resizeCapacity() {
		int newSize = maxSize * 2;
		data = Arrays.copyOf(data, newSize);
		maxSize = newSize;
	}

	@Override
	public void add(int value) {
		if (sz == maxSize) {
			resizeCapacity();
		}
		data[sz++] = value;
	}

	@Override
	public void add(int index, int value) {
		if (index >= 0 && index <= sz) {
			if (sz == maxSize) {
				resizeCapacity();
			}

			for (int i = sz; i >= index; i--) {
				data[i + 1] = data[i];
			}

			data[index] = value;
			sz++;
		}

	}

	@Override
	public void clear() {
		data = null;
		sz = 0;
		maxSize = DEFAULT_SIZE;
		data = new int[maxSize];
	}

	@Override
	public int indexOf(int value) {
		for (int i = 0; i < sz; i++) {
			if (data[i] == value)
				return i;
		}
		return -1;
	}

	@Override
	public int get(int index) {
		if (index >= 0 && index < sz) {
			return data[index];
		}
		return -1;
	}

	@Override
	public int remove(int index) {
		int val = -1;
		if (index >= 0 && index < sz) {
			val = data[index];
			for (int i = index; i < sz; i++) {
				data[i] = data[i + 1];
			}
			sz--;

			if (sz * 2 == maxSize) {
				maxSize = maxSize / 2;
				data = Arrays.copyOf(data, maxSize);
			}
		}
		return val;
	}

	@Override
	public int size() {
		return sz;
	}

	@Override
	public int getCapacity() {
		return maxSize;
	}

	@Override
	public String toString() {
		String outputString = "[";
		for (int i = 0; i < sz; i++) {
			outputString += String.valueOf(data[i]) + ", ";
		}
		outputString = outputString.substring(0, outputString.length() - 2) + "]";
		return outputString;
	}

	@Override
	public void insertBefore(int sVal, int value) {
		int index = this.indexOf(sVal);

		if (sz == maxSize) {
			resizeCapacity();
		}

		if (index >= 0) {
			for (int i = sz; i >= index; i--) {
				data[i + 1] = data[i];
			}

		} else {
			index = sz;
		}

		data[index] = value;
		sz++;
	}

	@Override
	public void insertAfter(int sVal, int value) {
		int index = this.indexOf(sVal);

		if (sz == maxSize) {
			resizeCapacity();
		}

		if (index >= 0) {
			for (int i = sz; i >= index + 1; i--) {
				data[i + 1] = data[i];
			}
			index++;

		} else {
			index = sz;
		}

		data[index] = value;
		sz++;
	}

	@Override
	public void replace(int index, int value) {
		if (index >= 0 && index < sz) {
			data[index] = value;
		}
	}

	@Override
	public void replaceAll(int sVal, int Value) {
		for (int i = 0; i < sz; i++) {
			if (data[i] == sVal)
				data[i] = Value;
		}

	}

}
