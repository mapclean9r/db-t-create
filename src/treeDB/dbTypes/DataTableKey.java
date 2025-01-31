package treeDB.dbTypes;


public class DataTableKey extends DataInput<String> implements Data<String> {
    private final String value;
    private final Type type;
    private final Type tableType;
    public DataTableKey(String tableName, Type type){
        this.type = Type.TABLE_KEY;
        this.value = tableName;
        this.tableType = type;
    }

    @Override
    public String getValue() {
        return value;
    }

    public Type getType() {
        return type;
    }

    public Type getTableType() {
        return tableType;
    }
}