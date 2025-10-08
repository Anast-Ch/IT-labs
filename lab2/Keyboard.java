package lab2;

public class Keyboard extends CompPeripherals {
    private String layout;
    
    public Keyboard(String connectionType, String layout, boolean isDualMode) {
        super(connectionType, isDualMode);
        this.layout = layout;
    }

    public Keyboard () {
        this("USB", "ENG", true);
    }

    @Override
    public String getInfo() {
        return "Клавиатура: " +
               getConnectionSupport() + 
               "; раскладка: " + layout;
    }

    public String switchLayout(){
        switch (this.layout) {
            case "RU":
            this.layout = "ENG"; break;
            case "ENG":
            this.layout = "RU"; break;
        }
        return "Раскладка изменена на " + this.layout;
    }

    public String getLayout() {
        return this.layout;
    }

    public void setLayout(String val) {
        if (val.equals("RU") || val.equals("ENG")) {
            this.layout = val;
        }
        else {
            System.out.println("Ошибка. Корректный ввод: RU / ENG.");
        }
    }
}
