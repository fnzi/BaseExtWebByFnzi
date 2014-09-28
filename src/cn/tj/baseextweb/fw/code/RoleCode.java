package cn.tj.baseextweb.fw.code;

import java.util.ArrayList;
import java.util.List;

public enum RoleCode implements ICodeEnum {

    ADMIN("admin", "管理员"), USER("user", "用户");

    private String description;
    private String key;

    RoleCode(String key, String description) {
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
        for (RoleCode _v : values()) {
            KeyValue kv = new KeyValue(_v.getKey(), _v.getDescription());
            ls.add(kv);
        }
        return ls;
    }
}
