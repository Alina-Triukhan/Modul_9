public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> integerMyArrayList = new MyArrayList<>();

        integerMyArrayList.add(7);
        integerMyArrayList.add(36);
        integerMyArrayList.add(17);
        integerMyArrayList.add(2);
        integerMyArrayList.add(655);


        for (int i = 0; i < integerMyArrayList.size(); i++) {
            System.out.println(integerMyArrayList.get(i));
        }
        System.out.println("4-e: " + integerMyArrayList.get(4));
        integerMyArrayList.remove(3);
        System.out.println("-------------");
        for (int i = 0; i < integerMyArrayList.size(); i++) {
            System.out.println(integerMyArrayList.get(i));
        }
        System.out.println("size: " + integerMyArrayList.size());
        integerMyArrayList.clear();
        System.out.println("size: " + integerMyArrayList.size());
        System.out.println("3-e: " + integerMyArrayList.get(3));

        System.out.println("_______________________________");

        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        myLinkedList.add("0е");
        myLinkedList.add("1е");
        myLinkedList.add("2е");
        myLinkedList.add("3е");
        myLinkedList.add("4е");
        myLinkedList.add("5е");

        System.out.println("Розмір: " + myLinkedList.size());
        System.out.println(myLinkedList);
        myLinkedList.remove(0);
        myLinkedList.remove(3);
        System.out.println("LL1: " + myLinkedList);
        System.out.println("3: " + myLinkedList.get(3));
        System.out.println("1: " + myLinkedList.get(1));
        myLinkedList.clear();
        System.out.println("LL: " + myLinkedList);
        System.out.println("Розмір: " + myLinkedList.size());
    }
}