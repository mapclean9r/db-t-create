package dbv2;

import dbv2.p_type.TableType;
import dbv2.p_type.TableDataString;
import dbv2.p_type.TableKey;

public class Main {
    public static void main(String[] args) {

        TableKey key1 = new TableKey("firstName", TableType.STRING);

        key1.setAsPrimary().add(
                        new TableDataString().add("e")
                );




    }
}
