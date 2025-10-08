package lab2;

public abstract class CompPeripherals {
    protected String connectionType;
    protected boolean isDualMode;

    public CompPeripherals(String connectionType, boolean isDualMode) {
    this.connectionType = connectionType;
    this.isDualMode = isDualMode;
    }

    public String switchConnection() {
        if (this.isDualMode == false) {
            return "Переключение невозможно";
        }

        switch (this.connectionType) {
        case "USB": 
        this.connectionType = "Bluetooth"; break;
        case "Bluetooth": 
        this.connectionType = "USB"; break;
        }
        return "Тип подключения изменен на " + this.connectionType;
        
    }

    public abstract String getInfo();

    protected String getConnectionSupport() {
        if (this.isDualMode) {
            if ("USB".equals(this.connectionType)) {
            return "поддерживает два типа подключения; подключен по USB";
        } else {
            return "поддерживает два типа подключения; подключен по Bluetooth";
            }
        } else {
            if ("USB".equals(this.connectionType)) {
                return "поддерживает подключение только по USB";
            } else {
                return "поддерживает подключение только по Bluetooth";
            }
        }
    }

    public String getConnType() {
        return this.connectionType;
    }

    public boolean getIsDualMode() {
        return this.isDualMode;
    }

    public void setConnType(String val) {
        if (val.equals("USB") || val.equals("Bluetooth")) {
            this.connectionType = val;
        }
        else {
            System.out.println("Ошибка. Корректный ввод типа подключения: USB / Bluetooth.");
        }
    }

    public void setIsDualMode(boolean val) {
        this.isDualMode = val;
    }

}



