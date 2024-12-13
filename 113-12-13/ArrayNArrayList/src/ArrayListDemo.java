import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orenge");

        System.out.println("ArrayList內容" + list);

        String fruit = list.get(1);
        System.out.println("第二個元素是" + list.size());

        list.set(1, "kiwi");
        System.out.println("更新後的ArrayList" + list);

        list.remove(0);
        System.out.println("刪除後的ArrayList" + list);

        int size = list.size();
        System.out.println("ArrayList大小" + size);

        boolean hasKiwi = list.contains("kiwi");
        System.out.println("ArrayList是否包含kiwi" + hasKiwi);


        if (list.isEmpty()) {
            System.out.println("ArrayList是空的");
            for (String item : list) {
                System.out.println(item);
            }
        } else {
            System.out.println("ArrayList不是空的");
        }


    }
}
