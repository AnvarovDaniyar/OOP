package org.example.HomeWork.hw2;

public abstract class Notebook {
    private String Название;
    private Integer ОЗУ;
    private Integer ОбъемЖД;

    public Notebook(String название, Integer ОЗУ, Integer объемЖД) {
        Название = название;
        this.ОЗУ = ОЗУ;
        ОбъемЖД = объемЖД;
    }

    public String getНазвание() {
        return Название;
    }

    public void setНазвание(String название) {
        Название = название;
    }

    public Integer getОЗУ() {
        return ОЗУ;
    }

    public void setОЗУ(Integer ОЗУ) {
        this.ОЗУ = ОЗУ;
    }

    public Integer getОбъемЖД() {
        return ОбъемЖД;
    }

    public void setОбъемЖД(Integer объемЖД) {
        ОбъемЖД = объемЖД;
    }
}
