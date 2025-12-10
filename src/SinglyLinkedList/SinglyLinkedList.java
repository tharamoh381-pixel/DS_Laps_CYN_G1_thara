package SinglyLinkedList;

import javax.xml.soap.Node;

public class SinglyLinkedList<E> {
    private Node<E> head=null;
    private Node<E> tail=null;
    private int size=0;




    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size()==0;
    }




   public void addList(E data){
        Node<E> newNode= new Node(data,head);
        head=newNode;
        if (isEmpty())
            tail=head;
        size++;
   }

   public E getFirst(){
        if(isEmpty()) return null;
        return head.getData();
   }

  public E removeFirst(){
      if(isEmpty()) return null;
      E delete= head.getData();
        head=head.getNext();
        size--;
        if (isEmpty())
            tail=head;

        return delete;
  }
public void addlast(E data){

       Node<E> newNode =new Node(data,null);
       if (isEmpty())
           head=newNode;
       else
           tail.setNext(newNode);
       tail=newNode;
       size++;
}

    public E getLast(){
        if(isEmpty()) return null;
        return tail.getData();
    }

    public E removeLast() {
        if (isEmpty()) return null;
        E delete = tail.getData();
        if (head == tail) {
            head = null;
            tail = null;
        }
        else {
            Node<E> temp = head;
            while (temp.getNext() != temp) {
                temp = temp.getNext();
            }
            temp.setNext(null);
            tail=temp;
        }
        size--;
        return delete;
      }

      public void display(){
        if (isEmpty())
            System.out.println("List is empty");
        Node<E> temp=head;
        while (temp!=null){
            System.out.println(temp.getData()+"------>");
            temp=temp.getNext();
        }
          System.out.println("null\n");
      }

    class Node<E>{
        private E data;
        private Node<E>next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setData(E data) {
            this.data = data;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
