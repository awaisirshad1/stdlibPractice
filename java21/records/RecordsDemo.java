package java21.records;

import java.util.List;

public class RecordsDemo {
    public static void main(String[] args) {
        Person awais = new Person("Awais", List.of("basketball"));
        System.out.println(awais);

        Range range = new Range(10, 9);
        System.out.println(range);
    }
}
