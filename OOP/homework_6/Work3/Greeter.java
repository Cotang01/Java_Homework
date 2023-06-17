package oop.oop_6_hw.Work3;

public class Greeter {
	
    private GreetingProvider greetingProvider;

    public Greeter(GreetingProvider greetingProvider) {
        this.greetingProvider = greetingProvider;
    }

    public String greet() {
        return greetingProvider.getGreeting();
    }

    public void setFormality(String formality) {
        switch (formality) {
            case "formal":
                greetingProvider = new FormalGreetingProvider();
                break;
            case "casual":
                greetingProvider = new CasualGreetingProvider();
                break;
            case "intimate":
                greetingProvider = new IntimateGreetingProvider();
                break;
            default:
                greetingProvider = null;
                break;
        }
    }
}