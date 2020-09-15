package pojo;

public class JuiceMaker {
    private Sourse sourse = null;

    public JuiceMaker(){

    }
    public String makeJuice(){
        String juice = "xxx用户点了一杯" + sourse.getFruit() +sourse.getSugar() + sourse.getSize();
        return juice;
    }

    public void setSourse(Sourse sourse) {
        this.sourse = sourse;
    }
}
