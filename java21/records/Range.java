package java21.records;

public record Range(int start, int end) {
    public Range {
        if (end <= start) throw new IllegalArgumentException("End cannot be lesser than start");
    }
}
