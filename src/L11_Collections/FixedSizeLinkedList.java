package L11_Collections;

import java.util.LinkedList;

public class FixedSizeLinkedList<B> extends LinkedList{
    private LinkedList<Book> list;
    private int maxSize;

    public FixedSizeLinkedList(int maxSize){
        this.maxSize=maxSize;
        this.list= new LinkedList<>();
    }

//    public void add(Book myBook){
//        if (list.size() >= maxSize){
//            throw new FixedSizeException(maxSize);
//        }
//        list.add(myBook);
//    }

    public boolean offer(Book myBook){
        if (list.size() < maxSize){
            list.add(myBook);
            return true;
        }
        return false;
    }

//    private class FixedSizeException extends Throwable {
//        public FixedSizeException(int maxSize) {
//        }
//    }
}
