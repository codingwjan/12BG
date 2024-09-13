public class KontaktAdresse {
    private String typ;
    private String wert;

    public KontaktAdresse(String typ, String wert) {
        this.typ = typ;
        this.wert = wert;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getWert() {
        return wert;
    }

    public void setWert(String wert) {
        this.wert = wert;
    }
}