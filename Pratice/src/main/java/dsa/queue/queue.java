package dsa.queue;

public class queue {

	Queuelist front = null;
	Queuelist rear = null;
	int length = 0;

	class Queuelist {

		int data = 0;
		Queuelist next = null;

		Queuelist(int d) {
			data = d;
		}
	}

	void insertinQueue(queue d, int data) {
		if (d.front == null) {
			Queuelist newnode = new Queuelist(data);
			front = newnode;
			rear = newnode;
			length++;
		} else {
			Queuelist newnode = new Queuelist(data);
			rear.next = newnode;
			rear = newnode;
			length++;

		}

	}

	void dequeue(queue d) {

		if (d.front == null) {
			rear = null;
			length--;
		} else {
			while (d.front != null) {
				int frontdata = d.front.data;
				front = front.next;
				length--;
				System.out.println("Deleted data is " + frontdata);
			}

		}
	}

	void printQueue(queue object) {
		Queuelist temp = front;
		if (temp == null) {
			System.out.println("Queue is empty");
		} else {
			while (temp.next != null) {
				System.out.print(temp.data + "-->");
				temp = temp.next;
			}

			System.out.print(temp.data); // last element of the queue
			System.out.println();
		}

	}

	public static void main(String[] args) {
		queue object = new queue();
		object.insertinQueue(object, 5);
		object.insertinQueue(object, 10);
		object.insertinQueue(object, 15);
		object.insertinQueue(object, 16);
		object.printQueue(object);
		object.dequeue(object);
		object.printQueue(object);
	}
}