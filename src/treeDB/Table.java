package treeDB;

import treeDB.dbTypes.DataInput;
import treeDB.dbTypes.Type;

import java.util.ArrayList;
import java.util.HashMap;

public class Table<String> {
    private final HashMap<Integer, DataInput<String>> typeHashMap = new HashMap<>();

    //fix ;*(  |  or not :D

    @SafeVarargs
    public Table(DataInput<String>... types) {
        ArrayList<DataInput<String>> cleanData = new ArrayList<>();
        for (DataInput<String> type : types) {
            if (type.getType() != null &&
                    type.getType().equals(Type.TABLE_KEY)) {
                cleanData.add(type);
            }
        }

        for(int i = 0; i < cleanData.size(); i++) {
                typeHashMap.put(i, cleanData.get(i));
        }
    }

    public HashMap<Integer, DataInput<String>> getTypeHashMap() {
        return typeHashMap;
    }
}
