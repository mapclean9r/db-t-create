package treeDB.dbTypes;

public class DataString extends DataInput<String> implements Data<String> {
    private final String value;
    private final Type type;
    public DataString(String value){
        this.type = Type.STRING;
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

    public Type getType() {
        return type;
    }
}
