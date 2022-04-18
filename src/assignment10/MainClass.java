package assignment10;

class MainClass {

    public static void main(String[] args) {
        SList slist = new SList();
        SListIterator slistiterator = slist.iterator();
        System.out.print(slist);
        slistiterator.insertNode("1");
        slistiterator.insertNode("12");
        slistiterator.insertNode("123");
        slistiterator.insertNode("1234");
        System.out.println(slist);
        SListIterator sListIterator = slist.iterator();
        sListIterator.removeNode();
        System.out.println(slist);

    }

}