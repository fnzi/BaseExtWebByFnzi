package cn.tj.baseextweb.fw.code;

public enum CodeColor implements ICodeEnum {

    RED("red", 1), GREEN("green", 2);

    private String description;
    private Integer code;

    CodeColor(String description, Integer code) {
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

    public static void main(String[] args) {
        System.out.println(CodeColor.GREEN.getCode());
        System.out.println(CodeColor.GREEN.getDescription());
    }
}
