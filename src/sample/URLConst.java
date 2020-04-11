package sample;

public class URLConst {
    private String URL;
    private String Programm;


    public URLConst() {
        setURL(URL);
        setProgramm(Programm);
    }

    public void setURL(String URL){
        this.URL = URL;
    }

    public void setProgramm(String programm) {
        this.Programm = programm;
    }

    public String getProgramm() {
        return Programm;
    }

    public String getURL() {
        return URL;
    }
}
