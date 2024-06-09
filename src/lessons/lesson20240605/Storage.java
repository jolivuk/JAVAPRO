package lessons.lesson20240605;

class Storage {
    Node head;
    public void append(int value) {
        Node item = new Node();
        item.value = value;
        if (head == null) {
            head = item;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = item;
        }
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
