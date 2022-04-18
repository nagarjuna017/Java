package assignment10;

class Node {
    String data;
    Node next;
    Node(String data){
        this(data, null);
    }
    Node(String data, Node next){
        this.data=data;
        this.next=next;
    }

    public String toString() {
        if (data == null)
            return "null";
        return data;
    }
};


