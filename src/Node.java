public class Node<T> {

    private T data;

    public Node<T> prev;

    public Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node<T> prev) {
        this.data = data;
        this.prev = prev;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
