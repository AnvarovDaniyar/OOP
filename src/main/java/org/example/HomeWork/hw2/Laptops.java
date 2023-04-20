package org.example.HomeWork.hw2;

public class Laptops extends Notebook {
    private String ОперационнаяСистема;
    private String Цвет;

    public Laptops(String название, Integer ОЗУ, Integer объемЖД, String операционнаяСистема, String цвет) {
        super(название, ОЗУ, объемЖД);
        ОперационнаяСистема = операционнаяСистема;
        Цвет = цвет;
    }

    public String getОперационнаяСистема() {
        return ОперационнаяСистема;
    }

    public void setОперационнаяСистема(String операционнаяСистема) {
        ОперационнаяСистема = операционнаяСистема;
    }

    public String getЦвет() {
        return Цвет;
    }

    public void setЦвет(String цвет) {
        Цвет = цвет;
    }
}
