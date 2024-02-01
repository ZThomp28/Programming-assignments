import java.util.*;

public class ListDemo1 {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        System.out.println("arrayList: " + arrayList);

//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.printf("arrList[%d] = %d\n", i, arrayList.get(i));
//        }

        Random rand = new Random(3150);
        int k = 3;

        for (int i = 0; i < k; i++) {
            int index = rand.nextInt(arrayList.size()+1);
            int elem = rand.nextInt(10, 100);
            System.out.printf("add(%d, %d)\n", index, elem);
            arrayList.add(index, elem);
            System.out.println("arrayList: " + arrayList);
            System.out.println();
        }

        System.out.printf("add(%d, %d)\n", arrayList.size(), 100);
        arrayList.add(arrayList.size(), 100);
        System.out.println("arrayList: " + arrayList);
        System.out.println();

        for (int i = 0; i < k; i++) {
            int index = rand.nextInt(arrayList.size());
            System.out.printf("remove(%d)\n", index);
            int removed = arrayList.remove(index);
            System.out.println("removed: " + removed);
            System.out.println("arrayList: " + arrayList);
            System.out.println();
        }

        System.out.println("arrayList contains 51: " +  arrayList.contains(51));
        System.out.println("arrayList contains 1000: " +  arrayList.contains(1000));
        System.out.println("first index of 51: " + arrayList.indexOf(51));
        System.out.println("last index of 51: " + arrayList.lastIndexOf(51));
        System.out.println();


        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, arrayList.get(i) * 10);
        }
        System.out.println("arrayList: " + arrayList);
        System.out.println();

        System.out.println("remove the element 1000");
        arrayList.remove((Integer) 1000);
        System.out.println("arrayList: " + arrayList);

        System.out.println();

        String[] colors = {"red", "green", "blue", "yellow", "orange", "gold", "purple", "pink", "black", "white"};

        for (int i = 0; i < 10; i++) {
            linkedList.add(colors[i]);
        }
        System.out.println("linkedList: " + linkedList);
//        for (int i = 0; i < linkedList.size(); i++) {
//            System.out.printf("linkList[%d] = %s\n", i, linkedList.get(i));
//        }

        for (int i = 0; i < k; i++) {
            int index = rand.nextInt(linkedList.size()+1);
            String elem = colors[rand.nextInt(colors.length)];
            System.out.printf("add(%d, %s)\n", index, elem);
            linkedList.add(index, elem);
            System.out.println("linkedList: " + linkedList);
            System.out.println();
        }
        for (int i = 0; i < k; i++) {
            int index = rand.nextInt(arrayList.size());
            System.out.printf("remove(%d)\n", index);
            String removed = linkedList.remove(index);
            System.out.println("removed: " + removed);
            System.out.println("linkedList: " + linkedList);
            System.out.println();
        }

        System.out.println("linkedList contains red: " +  linkedList.contains("red"));
        System.out.println("linkedList contains brown: " +  linkedList.contains("brown"));
        System.out.println("first index of red: " + linkedList.indexOf("red"));
        System.out.println("last index of red: " + linkedList.lastIndexOf("red"));
        System.out.println();
        System.out.println("remove red");
        linkedList.remove("red");
        System.out.println("linkedList: " + linkedList);
        System.out.println();


    }
}
