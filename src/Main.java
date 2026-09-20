public class Main {
    public static void main(String[] args) {
        System.out.println("=== Part A: Factory Method ===");
        Logistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();

        Logistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery();

        System.out.println("\n=== Part B: Abstract Factory ===");
        GUIFactory windowsFactory = new WindowsFactory();
        Button winButton = windowsFactory.createButton();
        Checkbox winCheckbox = windowsFactory.createCheckbox();
        winButton.render();
        winCheckbox.render();

        GUIFactory webFactory = new WebFactory();
        Button webButton = webFactory.createButton();
        Checkbox webCheckbox = webFactory.createCheckbox();
        webButton.render();
        webCheckbox.render();
    }
}