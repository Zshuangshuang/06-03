import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @ClassName: Test
 * @Author: 邹双双
 * Date: 2020/6/3 6:49
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
        collection.add("未来可期");
        collection.add("邹双双要加油呀");
        //利用toArray把Collection转化为数组
        Object[] array = collection.toArray();
        System.out.println(Arrays.toString(array));
        for (String s:collection) {
            System.out.println(s);
        }
        System.out.println(collection.contains("未来可期"));
        collection.remove("邹双双要加油呀");
        System.out.println("==========");
        for (String s:collection) {
            System.out.println(s);
        }
        collection.clear();
        System.out.println("d");
        
    }
}
