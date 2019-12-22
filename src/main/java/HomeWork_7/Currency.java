package HomeWork_7;

import java.io.Serializable;

public class Currency implements Serializable {

    private Integer r030;
    private String txt;
    private Double rate;
    private String cc;
    private String exchangedate;

    public Double getRate() {
        return rate;
    }

    public Integer getR030() {
        return r030;
    }

    public String getTxt() {
        return txt;
    }

    public String getCc() {
        return cc;
    }

    public String getExchangedate() {
        return exchangedate;
    }

    public Currency() {
    }

    public Currency(Integer r030, String txt, Double rate, String cc, String exchangedate) {
        this.r030 = r030;
        this.txt = txt;
        this.rate = rate;
        this.cc = cc;
        this.exchangedate = exchangedate;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "r030=" + r030 +
                ", txt='" + txt + '\'' +
                ", rate=" + rate +
                ", cc='" + cc + '\'' +
                ", exchangedate='" + exchangedate + '\'' +
                '}';
    }
}
