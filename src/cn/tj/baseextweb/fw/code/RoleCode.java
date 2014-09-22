package cn.tj.baseextweb.fw.code;

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
}
