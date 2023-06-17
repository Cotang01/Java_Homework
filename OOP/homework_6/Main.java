package oop.oop_6_hw;

import oop.oop_6_hw.work1.Square;
import oop.oop_6_hw.work2.AccountXmlReportGenerator;
import oop.oop_6_hw.Work3.FormalGreetingProvider;
import oop.oop_6_hw.Work3.Greeter;
import oop.oop_6_hw.Work3.GreetingProvider;
import oop.oop_6_hw.work1.Rectangle;

public class Main {
    public static void main(String[] args) {
    	
        System.out.println("Hello world!");
        
        // work_1
        System.out.println("========================================");
        Square square1 = new Square(4.5);
        System.out.println(square1.calcArea()); // 4.5 * 4.5 = 20.25
        
        Square square2 = new Square(-4); // -4 превращается в 1
        System.out.println(square2.calcArea()); // 1 * 1 = 1
        
        Rectangle rectangle1 = new Rectangle(21, -4); // -4 превращается в 1
        System.out.println(rectangle1.calcArea()); // 21 * 1 = 21
        System.out.println("========================================");
        
        // work_2
        System.out.println("========================================");
        
        System.out.println("Start of report");
        AccountXmlReportGenerator axrg = new AccountXmlReportGenerator();
        axrg.generateXml();
        System.out.println("...");
        System.out.println("Report has been sent");
        
        System.out.println("========================================");
        
        // work_3
        System.out.println("========================================");
        GreetingProvider greetingProvider = new FormalGreetingProvider();
        Greeter greeter = new Greeter(greetingProvider);
        System.out.println(greeter.greet());
        greeter.setFormality("casual");
        System.out.println(greeter.greet());
        
        Greeter greeter2 = new Greeter(null);
        System.out.println(greeter2);
        greeter2.setFormality("intimate");
        System.out.println(greeter2.greet());
        System.out.println("========================================");
        
    }
}