package treeDB;

import treeDB.dbTypes.Type;

import java.util.HashMap;

public class Table {
    private final HashMap<Integer, Type> typeHashMap = new HashMap<>();

    public Table(Type... types){
        for (int i = 0; i < types.length; i++){
            typeHashMap.put(i, types[i]);
        }
    }

    public HashMap<Integer, Type> getTypeHashMap() {
        return typeHashMap;
    }


}
