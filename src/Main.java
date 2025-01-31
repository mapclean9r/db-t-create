import treeDB.Table;
import treeDB.dbTypes.Type;

public class Main {

    public static void main(String[] args) {



        Table table1 = new Table(Type.NUMBER(55), Type.STRING("Big"));

        for (int i = 0; i < table1.getTypeHashMap().size(); i++){
            System.out.println(table1.getTypeHashMap().get(i) + " " + table1.getTypeHashMap().get(i).getValue());
        }

        System.out.println(table1.getTypeHashMap());


    }
}