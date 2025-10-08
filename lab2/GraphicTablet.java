package lab2;

public class GraphicTablet extends CompPeripherals {
    private double activeAreaInch;
    
    public GraphicTablet(String connectionType, double activeAreaInch, boolean isDualMode) {
        super(connectionType, isDualMode);
        this.activeAreaInch = activeAreaInch;
    }

    public GraphicTablet() {
        this("USB", 0, false);
    }

    @Override
    public String getInfo() {
        return "Графический планшет: " +
               getConnectionSupport() + 
               ", активная область (в кв.дюймах): " + String.format("%.2f", activeAreaInch);
    }

    public double calculateActiveArea(double widthInches, double heightInches) {
        if (widthInches > 0 && heightInches > 0) {
            this.activeAreaInch = widthInches * heightInches;
            return this.activeAreaInch;
        } else {
            System.out.println("Ошибка: Размеры должны быть положительными.");
            return 0;
        }
    }

    public double calculateActiveArea(int widthMm, int heightMm) {
        if (widthMm > 0 && heightMm > 0) {
            this.activeAreaInch = widthMm * heightMm / Math.pow(25.4, 2);
            return this.activeAreaInch;
        } else {
            System.out.println("Ошибка: Размеры должны быть положительными.");
            return 0;
        }
    }

    public double getActiveAreaInch() {
        return this.activeAreaInch;
    }

    public void setActiveAreaInch(double activeAreaInch) {
        if (activeAreaInch > 0) {
            this.activeAreaInch = activeAreaInch;
        } else {
            System.out.println("Ошибка: Площадь должна быть положительной.");
        }
    }
}
