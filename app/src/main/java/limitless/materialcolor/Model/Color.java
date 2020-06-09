package limitless.materialcolor.Model;

public class Color {
    private String name;
    private String code;
    private boolean isFavorite = false;

    public Color() {

    }

    public Color(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
