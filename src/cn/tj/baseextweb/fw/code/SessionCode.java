package cn.tj.baseextweb.fw.code;

public enum SessionCode implements ICodeEnum {

    USER_SESSION_KEY("USER_SESSION_KEY", "user in session key");

    private String description;
    private String key;

    SessionCode(String key, String description) {
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
        System.out.println(SessionCode.USER_SESSION_KEY.getKey());
        System.out.println(SessionCode.USER_SESSION_KEY.getDescription());
    }
}
