public enum Gender {

    MALE("Мужчина"), FEMALE("Женщина");

    private String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
