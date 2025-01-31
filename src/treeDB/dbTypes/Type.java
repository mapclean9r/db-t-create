package treeDB.dbTypes;

public enum Type {
    STRING("default text"),

    NUMBER(1);

    private Object defaultValue;

    Type(Object defaultValue) {
        this.defaultValue = defaultValue;
    }

    public static Type NUMBER(Object i) {
        Type.NUMBER.setDefaultValue(i);
        return NUMBER;
    }

    public static Type STRING(Object i) {
        Type.STRING.setDefaultValue(i);
        return STRING;
    }

    public void setDefaultValue(Object newValue) {
        this.defaultValue = newValue;
    }

    public Object getValue() {
        return defaultValue;
    }
}