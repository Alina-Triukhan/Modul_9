public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> integerMyArrayList = new MyArrayList<>();
        {
            integerMyArrayList.add(0);
            integerMyArrayList.add(1);
            integerMyArrayList.add(2);
            integerMyArrayList.add(3);
            integerMyArrayList.add(4);
            System.out.println(integerMyArrayList);
            integerMyArrayList.get(4);
            System.out.println(integerMyArrayList);
            integerMyArrayList.add(5);
            integerMyArrayList.add(6);
            integerMyArrayList.add(7);
            integerMyArrayList.add(8);
            integerMyArrayList.add(9);
            integerMyArrayList.add(10);
            integerMyArrayList.add(11);
            integerMyArrayList.add(12);
            integerMyArrayList.add(13);
            integerMyArrayList.add(14);
            integerMyArrayList.add(15);
            integerMyArrayList.size();
            System.out.println(integerMyArrayList);
            integerMyArrayList.remove(3);
            System.out.println(integerMyArrayList);
            integerMyArrayList.remove(0);
            integerMyArrayList.remove(0);
            integerMyArrayList.remove(0);
            integerMyArrayList.remove(0);
            integerMyArrayList.remove(0);
            integerMyArrayList.remove(0);
            integerMyArrayList.remove(0);
            integerMyArrayList.remove(0);
            integerMyArrayList.remove(0);
            integerMyArrayList.remove(0);
            integerMyArrayList.remove(0);
            integerMyArrayList.remove(0);
            integerMyArrayList.remove(0);
            System.out.println(integerMyArrayList);
            System.out.println("^^^^^^^^^^^^^^^");
            integerMyArrayList.clear();
            integerMyArrayList.size();
            System.out.println(integerMyArrayList);
            //integerMyArrayList.get(3);
            System.out.println("_______________________________");
        }
        {
            MyLinkedList<String> myLinkedList = new MyLinkedList<>();

            myLinkedList.add("0е");
            myLinkedList.add("1е");
            myLinkedList.add("2е");
            myLinkedList.add("3е");
            myLinkedList.add("4е");
            myLinkedList.add("5е");

            System.out.println("Розмір: " + myLinkedList.size());
            myLinkedList.get(4);
            System.out.println("LL: " + myLinkedList);
            myLinkedList.remove(0);
            myLinkedList.remove(3);
            System.out.println("LL1: " + myLinkedList);
            // System.out.print("3: " + myLinkedList.get(3));
            myLinkedList.get(3);
            myLinkedList.get(1);
            myLinkedList.clear();
            System.out.println("LL2: " + myLinkedList);
            System.out.println("Розмір: " + myLinkedList.size());
            myLinkedList.add("1");
            System.out.println("LL3: " + myLinkedList);
        }
        {
            System.out.println("________________________________________");

            MyQueue<Integer> myQueue = new MyQueue<>();
            myQueue.add(0);
            myQueue.add(1);
            myQueue.add(2);
            System.out.println(myQueue);
            myQueue.size();
            myQueue.peek();
            System.out.println(myQueue);

            myQueue.poll();
            System.out.println(myQueue);
            myQueue.clear();
            System.out.println(myQueue);
            System.out.println("________________________________________");
        }

    }
}