package zz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class App {


    enum CoffeType {
        americano,
        ice_banila_latte,
        caffe_latte
    };

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("null");
        sb.append(" ");
        sb.append("null2");

        System.out.println(sb);

        Map<String, String> map = new HashMap<>();

        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");

        System.out.println(map);

        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add(1, "new 2");

        System.out.println(list);
        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.stream().forEach(System.out::println);
        list.stream().forEach(t -> {
            System.out.println(t);
        });

        String[] array = new String[4];

        array[0] = "1";
        array[1] = "2";
        array[2] = "3";
        array[3] = "4";

        System.out.println(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.asList(array));

        HashSet<String> set = new HashSet<>(Arrays.asList("G", "o", "o", "d"));
        System.out.println(set);

        System.out.println(CoffeType.americano);

        for (CoffeType type : CoffeType.values()) {
            System.out.println(type);
        }

        final int num1 = 10;
        System.out.println(num1);
    }
}

