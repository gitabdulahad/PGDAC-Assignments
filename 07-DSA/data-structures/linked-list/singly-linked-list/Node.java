//Creating a Node class
	public class Node<T> {
		// Initialization of variables
		private T element;
		private Node<T> next;

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

		public T getElement() {
			return element;
		}

	public Node(T element) {
		this.element = element;
		this.next = null;
	}
}
