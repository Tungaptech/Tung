package Tuluyen.day5;

public class Kho {

    private long id;
    private String tenQuan;
    private String tenAo;

    public Kho() {

    }

    public Kho(long id, String tenQuan, String tenAo) {
        this.id = id;
        this.tenQuan = tenQuan;
        this.tenAo = tenAo;
    }

    public long getId() {
        return id;
    }

    public String gettenQuan() {
        return tenQuan;
    }

    public String gettenAo() {
        return tenAo;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void settenQuan(String tenQuan) {
        this.tenQuan = tenQuan;
    }

    public void settenAo(String tenAo) {
        this.tenAo = tenAo;
    }
}
