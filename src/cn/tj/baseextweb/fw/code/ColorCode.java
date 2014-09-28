package cn.tj.baseextweb.fw.code;

import java.util.ArrayList;
import java.util.List;

public enum ColorCode implements ICodeEnum {

    RED("red", "red"), GREEN("green", "green");

    private String description;
    private String key;

    ColorCode(String key, String description) {
        this.description = description;
        this.key = key;
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    public static List<KeyValue> getKeyValues() {
        List<KeyValue> ls = new ArrayList<KeyValue>();
        for (ColorCode _v : values()) {
            KeyValue kv = new KeyValue(_v.getKey(), _v.getDescription());
            ls.add(kv);
        }
        return ls;
    }

    public static void main(String[] args) {
        System.out.println(ColorCode.GREEN.getKey());
        System.out.println(ColorCode.GREEN.getDescription());

        ColorCode.values();
        System.out.println(ColorCode.getKeyValues().size());

        for (KeyValue kv : ColorCode.getKeyValues()) {
            System.out.println(kv.key);
            System.out.println(kv.value);
        }
    }
}
