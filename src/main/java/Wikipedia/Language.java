package Wikipedia;

public enum Language {
    EN("en"),
    UK("uk"),
    ES("es"),
    DE("de");

    private String code;

    Language(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
