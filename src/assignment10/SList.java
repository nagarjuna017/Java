package assignment10;

class SList {
    Node head = new Node(null);
    public SListIterator iterator() {
        return new SListIterator(head);
    }
    public String toString() {
        if(head==null) {
            return "List is Empty";
        }
        SListIterator iterator = this.iterator();
        StringBuilder s=new StringBuilder();
        while (iterator.hasNext()) {
            s.append(iterator.next() + (iterator.hasNext() ? ", " : ""));
        }
        return ""+s;
    }
};