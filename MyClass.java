public class MyClass {

    public static void main(String[] args) {
        MyList ml = new MyList();
        ml.addToStart("1");
        ml.addToStart("2");
        ml.addToStart("3");
        MyList.Node time = ml.head;
        while (time != null) {
            System.out.println(time.value);
            time = time.next;
        }


        ml.reverse();
        time = ml.head;
        while (time != null) {
            System.out.println(time.value);
            time = time.next;
        } 
    }
}

class MyList{

    Node head; //ссылка на первый элемент
    Node tail; //ссылка на последний элемент

    class Node {
       String value;
       Node next;
    }


    public void addToStart(String value) {  //добавление элементов в список
        Node newNode = new Node();
        newNode.value = value;
        if (head != null) {
            newNode.next = head;
        } 
        head = newNode;
    }


    public void reverse() {  //разворот односвязного списка
        if (head.next != null) {
            tail = head;
            Node current = head.next;
            head.next = null;
            while (current != null) {
                Node next = current.next;
                current.next = head;
                head = current;
                current = next;
            }
        }
    }
}