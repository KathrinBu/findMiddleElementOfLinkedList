import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        find(linkedList);
    }
    public static void find(LinkedList<Integer> linkedList){
        Iterator<Integer> current=linkedList.iterator();
        int length=0;
        Iterator<Integer> middle=linkedList.iterator();
        int result=0;

        while (current.hasNext()){
            length= current.next();
            if (length % 2 ==0){
                result= middle.next();
            }
        }
        if (length % 2 == 1){
            result= middle.next();
        }
        System.out.println("длина листа: " + length + "\n"+
                           "средний элемент: " + result);
    }

}
