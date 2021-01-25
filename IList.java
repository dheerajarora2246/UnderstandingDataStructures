
public interface IList {
	void add(int value);

	void add(int index, int value);

	void clear();

	int indexOf(int value);

	int get(int index);

	int remove(int index);

	int size();

	int getCapacity();

	String toString();

	void insertBefore(int sVal, int value);

	void insertAfter(int sVal, int value);

	void replace(int index, int value);

	void replaceAll(int sVal, int Value);

}
