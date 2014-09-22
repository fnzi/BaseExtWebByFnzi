package cn.tj.baseextweb.fw.code;

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

    public static void main(String[] args) {
        System.out.println(ColorCode.GREEN.getKey());
        System.out.println(ColorCode.GREEN.getDescription());
    }
}
