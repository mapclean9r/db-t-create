package treeDB.dbTypes;

public class DataInt extends DataInput<Integer> implements Data<Integer> {
    private final int value;
    private final Type type;

    public DataInt(int value) {
        this.type = Type.NUMBER;
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public Type getType() {
        return type;
    }
}