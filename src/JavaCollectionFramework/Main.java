//package JavaCollectionFramework;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // ArrayList
        // In 3 me se koi bhi tarika chal jayega 
        // ArrayList<Integer> list = new ArrayList<>();
        // List<Integer> list = new ArrayList<>();
        // Collection<Integer> collection = new ArrayList<>();


        //add
        // list.add(10); // add the value of end of the array
        // list.add(20); // 10 ke just baad 20 bhi add ho jayega
        // System.out.println(list);
        // list.add(40);
        // System.out.println(list);


        // remove
        // list.remove(0);
        // System.out.println(list);


        // //addAll
        // List<Integer> list2  = new ArrayList<>();
        // list2.add(101);
        // list2.add(102);

        // list.addAll(list2); // yha list ke andar list 2 ke saare element push kar do
        // System.out.println(list);

        // list.removeAll(list2); // isse list se list2 ke saare element remove ho jayega
        // System.out.println(list);

        // System.out.println(list.size()); // Print the list size

        // System.out.println("printing list 2: " + list2);
        // list2.clear(); // isse list2 ke saare element clear ho jayega yani remove ho jayega
        // System.out.println(list2.size()); // ab list 2 ki size 0 aayegi


        // // i want to traverse list using iterator
        // Iterator<Integer> iterator = list.iterator();

        // while (iterator.hasNext()) {
        //     System.out.println("Element :" + iterator.next());
        // }


        // List<Integer> list3 = new ArrayList<>();
        // list3.add(11);
        // list3.add(12);
        // list3.add(13);
        // System.out.println(list3.get(0)); // isse 0 index vali value fetch hogi
        // System.out.println("Before set: " + list3);
        // list3.set(0,100); // isse 0 index par 11 ke place par 100 set ho jayega
        // System.out.println("After set: " + list3); 


        // toArray hamare list wale collection ko Array me convert karta hai
    //     Object[] arr = list3.toArray();
    //     for(Object obj: arr){
    //         System.out.println(obj);
    //     }


    // // contains // isse ye check hota hai ki ye value hamare input ke anadr present hai to true nhi to false

    // System.out.println(list3.contains(100));
    // System.out.println(list3.contains(1001));


    // list.add(12);
    // list.add(6);
    // System.out.println("Printing Entire list " + list);

    // Collections.sort(list); // Sort the ArrayList
    // System.out.println("Printing Entire list " + list);

    // ArrayList<Integer> newList = (ArrayList<Integer>)list.clone(); // puarni list ka clone ban gya
    // System.out.println("Printing Entire newList " +newList);

    // System.out.println(newList.isEmpty()); // if new list is empty then return true otherwise return false
    // list.add(30);
    // list.add(24);
    // list.add(30);

    // System.out.println(newList.indexOf(40)); // indexOf use to find the any value index
    // System.out.println(list);
    // System.out.println(list.lastIndexOf(30));


    // LinkedList<Integer> ll = new LinkedList<>();
    // ll.add(10);
    // System.out.println(ll);
    // ll.addFirst(1); // isse LinkedList ke first position par 1 value add ho jayegi
    // System.out.println(ll);
    // ll.addLast(5); //   isse LinkedList ke Last position par 5 value add ho jayegi
    // System.out.println(ll);

    // ll.removeFirst();
    // System.out.println(ll); // isse LinkedList ke first index ki value remove ho jayegi
    // ll.removeLast();
    // System.out.println(ll);  // isse LinkedList ke Last index ki value remove ho jayegi

    // System.out.println(ll.getFirst()); // isse left most index ki value  yani 1 position ki value fetch hogi

    // System.out.println(ll.getLast());// isse right most index ki value yani last index ki value fetch hogi

    // System.out.println(ll.peek()); // return the first element of the LinkedList

    // System.out.println("Before poll " + ll);
    // System.out.println("Polling " + ll.poll());
    // System.out.println("After Poll" + ll);


    // Stack Methods
    Stack<Integer> st= new Stack<>();
    st.push(10);
    System.out.println(st);

    st.push(11);
    System.out.println(st);

    st.push(12);
    System.out.println(st);

    st.pop();
    System.out.println(st);

    System.out.println(st.peek());

    System.out.println(st.search(12));

    System.out.println(st.search(11));

    System.out.println(st.empty());



    }
    
}
