package treeDB.dbTypes;

public enum Type {
    NUMBER(0),
    STRING(""),
    TABLE_KEY("");

    private final Object value;

    Type(Object value) {
        this.value = value;
    }

    public static DataInput<String> TABLE_KEY(String value, Type type) {
        return new DataTableKey(value, type);
    }

    public static DataInput<Integer> NUMBER(int value) {
        return new DataInt(value);
    }

    public static DataInput<String> STRING(String value) {
        return new DataString(value);
    }

    public Object getValue() {
        return value;
    }
}