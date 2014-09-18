package cn.tj.baseextweb.fw.code;

public enum CodeRole implements ICodeEnum {

    ADMIN("管理员", 1), USER("用户", 2);

    private String description;
    private Integer code;

    CodeRole(String description, Integer code) {
        this.description = description;
        this.code = code;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
