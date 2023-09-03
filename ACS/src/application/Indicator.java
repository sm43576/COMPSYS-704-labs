package application;

public enum Indicator {
    GREEN("#8fe78d"), ORANGE("#FFC14A"), RED("#ED4C4F"), WHITE("#FFFFFF");

    private String colourCode;

    Indicator(String colourCode) {
        this.colourCode = colourCode;
    }

    public String getColourCode() {
        return this.colourCode;
    }
}