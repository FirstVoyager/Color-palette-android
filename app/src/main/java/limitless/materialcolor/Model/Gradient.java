package limitless.materialcolor.Model;

public class Gradient {

    private String name;
    private String sCode;
    private String eCode;

    public Gradient(String name, String sCode, String eCode) {
        this.name = name;
        this.sCode = sCode;
        this.eCode = eCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getsCode() {
        return sCode;
    }

    public void setsCode(String sCode) {
        this.sCode = sCode;
    }

    public String geteCode() {
        return eCode;
    }

    public void seteCode(String eCode) {
        this.eCode = eCode;
    }
}
