package dbv2.p_type;

import java.util.HashMap;

public class TableKey {
    private final String tableName;
    private boolean isPrimary = false;
    private final TableType keyType;
    private HashMap<Integer, TableDataString> dataset = new HashMap<>();
    public TableKey(String tableName, TableType type){
        this.tableName = tableName;
        this.keyType = type;
    }

    public TableKey add(TableDataString tableData){
        if (this.keyType == tableData.getTableType()){
            this.dataset.put(this.dataset.size(), tableData);
        }
        return this;
    }

    public TableKey setAsPrimary(){
        this.isPrimary = true;
        return this;
    }

    public TableType getTableType() {
        return keyType;
    }

    public boolean isPrimary() {
        return isPrimary;
    }

    public String getTableName() {
        return tableName;
    }

    public HashMap<Integer, TableDataString> getDataset() {
        return dataset;
    }
}
