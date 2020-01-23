package Bag;

public class Bag {
	private int[] data;
	private int size;

	public Bag() {

		data = new int[100];
		size = 0;
	}

	private boolean isFull() {
		if(data.length == size) {
			return true;
		}
		else {
			return false;
		}
	}

	private boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public void addObject(int data) {
		if(isFull()) {
			System.out.println("가방이 가득 찼습니다.");
		}
		else {
			this.data[size] = data;
			this.size++;
		}
	}

	public int removeObject(int data) {
		if(isEmpty()) {
			System.out.println("가방에 데이터가 없습니다.");
			return 0;
		}
		
		for(int i = 0; i < size; i ++) {
			if(this.data[i] == data) {
				for(int j = i; j < size-1; j++) {
					this.data[j] = this.data[j+1];
				}
				size --;
				return data;
			}
		}
		
		System.out.println(data + "는 없는 데이터 입니다.");
		return 0;
	}
	
	public boolean searchObject(int data) {
		for(int i = 0; i < size; i ++) {
			if(this.data[i] == data) {
				return true;
			}
		}
		return false;
	}

}
