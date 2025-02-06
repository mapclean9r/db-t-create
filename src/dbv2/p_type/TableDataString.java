package dbv2.p_type;

import java.util.HashMap;

public class TableDataString {
    private HashMap<Integer, String> data = new HashMap<>();
    private final TableType keyType = TableType.STRING;

    public TableDataString(){

    }

    public TableDataString add(String data){
        this.data.put(this.data.size(), data);
        return this;
    }

    public HashMap<Integer, String> getData() {
        return data;
    }

    public TableType getTableType() {
        return keyType;
    }

}
