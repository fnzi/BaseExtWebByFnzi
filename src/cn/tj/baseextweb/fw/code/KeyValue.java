package cn.tj.baseextweb.fw.code;

public class KeyValue {

    public String key;
    public String value;

    public KeyValue() {
    }

    public KeyValue(String key, String value) {
        this.key = key;
        this.value = value;
    }

    // public static List<KeyValue> getKeyValues(Class<ColorCode> e) {
    // List<KeyValue> ls = new ArrayList<KeyValue>();
    // for (ColorCode _v : o.values()) {
    // KeyValue kv = new KeyValue(_v.getKey(), _v.getDescription());
    // ls.add(kv);
    // }
    // return ls;
    // }
}
