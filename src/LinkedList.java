import org.jetbrains.annotations.NotNull;

public class LinkedList<T> {

    private Node<T> first;
    private Node<T> last;


    public LinkedList(){
        first = null;
        last = null;
    }
    public LinkedList( T @NotNull [] dataList)
    {
        for (T data: dataList) {
            this.addNode(data);
        }
    }

    public void addNode(T data){


        if (this.first == null)
        {
            this.first = new Node<>(data);
            this.last = this.first;
            return;
        }

        Node<T> temp = this.first;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node<>(data, temp);
        this.last  =temp.next;
    }

    public void deleteNode(T data){
        Node<T> temp = this.first;

        while (temp.next != null){
            if (temp.getData() == data)
            {
                break;
            }
            temp = temp.next;
        }
        if (temp == this.first)
        {
            this.first = this.first.next;
            return;
        }
        if (temp == this.last){
            this.last = this.last.prev;
            this.last.next = null;
            return;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;


    }
    @Override
    public String toString() {
        StringBuilder Stemp = new StringBuilder();
        Node<T> Ntemp = this.first;
        while (Ntemp != null)
        {
            Stemp.append(Ntemp.getData()).append(" ");
            Ntemp = Ntemp.next;
        }
        return Stemp.toString();
    }

    public String fromLastToFirst()
    {
        StringBuilder Stemp = new StringBuilder();
        Node<T> Ntemp = this.last;
        while (Ntemp != null)
        {
            Stemp.append(Ntemp.getData()).append(" ");
            Ntemp = Ntemp.prev;
        }
        return Stemp.toString();
    }
}
