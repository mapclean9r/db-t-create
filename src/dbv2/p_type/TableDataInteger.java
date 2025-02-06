package dbv2.p_type;

import java.util.HashMap;

public class TableDataInteger {
    private HashMap<Integer, Integer> data = new HashMap<>();
    private final TableType keyType = TableType.INTEGER;
    public TableDataInteger(){

    }

    public TableDataInteger add(Integer data){
        this.data.put(this.data.size(), data);
        return this;
    }

    public HashMap<Integer, Integer> getData() {
        return data;
    }

    public TableType getKeyType() {
        return keyType;
    }
}
