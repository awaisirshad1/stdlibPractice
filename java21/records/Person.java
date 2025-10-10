package java21.records;

import java.util.List;

public record Person(
        String name, List<String> hobbies
) {

}
