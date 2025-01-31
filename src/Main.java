import treeDB.Table;
import treeDB.dbTypes.*;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Table<String> table1 = new Table<>(
                Type.TABLE_KEY("firstName", Type.STRING),
                Type.TABLE_KEY("lastName", Type.STRING),
                Type.STRING("r"),
                Type.TABLE_KEY("age", Type.NUMBER)
        );

        HashMap<Integer, DataInput<String>> ihm = table1.getTypeHashMap();
        for (int i = 0; i < ihm.size(); i++){
            System.out.println(i+ ": " +ihm.get(i).getType()+ " | "+
                    "TableType: " + ihm.get(i).getTableType()+
                    " | TableName: " + ihm.get(i).getValue() );
        }


    }
}
