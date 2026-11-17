package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        set1();
        set2a();
        set2b();
        set3();
    }

    // bai tap add 2 phan tu trung cho Set
    private static void set1() {
        Set<String> emails = new HashSet<>();
        System.out.println("Add result: " + emails.add("a@x.com"));
        System.out.println("Add result: " + emails.add("b@x.com"));
        System.out.println("Add result: " + emails.add("a@x.com"));
        // Tôi dự đóan là true true và false
    }

    // bai tap xem thu tu cua cac phan tu trong Set
    private static void set2a() {
        Set<Character> chars = new HashSet<>();
        chars.add('c');
        chars.add('b');
        chars.add('a');
        chars.add('z');
        chars.add('m');
        System.out.println("chars: " + chars + ", Size: " + chars.size());
        // Tôi dự đoán Set sẽ không giữ nguyên thứ tự các phần tử được thêm vào, vì
        // HashSet không duy trì thứ tự chèn.
    }

    // bai tap xem thu tu cua cac phan tu trong Set
    private static void set2b() {
        Set<Character> chars = new LinkedHashSet<>();
        chars.add('c');
        chars.add('b');
        chars.add('a');
        chars.add('z');
        chars.add('m');
        System.out.println("chars: " + chars + ", Size: " + chars.size());
        // Tôi dự đoán Set sẽ giữ nguyên thứ tự các phần tử được thêm vào, vì
        // LinkedHashSet duy trì thứ tự chèn.
    }

    // bai tap so thoi gian
    private static void set3() {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 1000000; i++) {
            list.add("user" + i);
            set.add("user" + i);
        }
        long startL = System.nanoTime();
        list.contains("khong-ton-tai");
        long endL = System.nanoTime();
        System.out.println("Time for List: " + (endL - startL) + " ns");

        long startS = System.nanoTime();
        set.contains("khong-ton-tai");
        long endS = System.nanoTime();
        System.out.println("Time for Set: " + (endS - startS) + " ns");

        // Tôi dự đoán Set sẽ nhanh hơn List 1000000 lần trong việc kiểm tra sự tồn tại
        // của một phần
        // tử, vì Set được tối ưu hóa cho các phép toán tìm kiếm.

    }
}
