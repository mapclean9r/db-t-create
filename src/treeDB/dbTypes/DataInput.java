package treeDB.dbTypes;

public class DataInput<T> implements Data<T> {
    private Type type;
    public DataInput(){}

    @Override
    public T getValue() {
        return null;
    }

    public Type getType() {
        return type;
    }

    public Type getTableType() {
        return type;
    }
}
