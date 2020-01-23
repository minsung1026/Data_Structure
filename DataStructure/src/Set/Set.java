package Set;

public class Set {
	private int size;
	private int[] data;

	public Set () {
		size = 0;
		data = new int[10];
	}

	private boolean isFull() {
		if(data.length == size) {
			return true;
		}
		return false;
	}

	private boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}

	public void addObject(int data) {
		if(isFull()) {
			System.out.println("가방이 가득 찼습니다.");
			return;
		}
		if(searchObject(data)) {
			return;
		}
		this.data[size] = data;
		size = size+1;	}

	public void removeObject(int data) {
		if(isEmpty()) {
			System.out.println("가방이 비어 있습니다.");
			return;
		}
		for(int i = 0; i < size; i++) {
			if(this.data[i] == data) {
				for(int j =i; j< size-1; j++) {
					this.data[j] = this.data[j+1];
				}
				size = size-1;
			}
		}
	}

	public boolean searchObject(int data) {
		for(int i = 0; i < size; i++) {
			if(this.data[i] == data) {
				return true;
			}
		}
		return false;
	}
}
