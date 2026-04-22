package com.ux.strategy.context;

import com.ux.strategy.Istrategy.*;

public class Navigator {

    public static void main(String[] args) {

        RoadStrategy strategy = new RoadStrategy();
        strategy.buildRoute("Xalapa", "Veracruz");

        strategy = new PublicTransportStrategy();
        strategy.buildRoute("Xalapa", "Veracruz");

        strategy = new WalkingStrategy();
        strategy.buildRoute("Jardin de las esculturas", "Plaza Animas");

        strategy = new FlyStrategy();
        strategy.buildRoute("CDMX", "New York");

        scanner sc = new Scanner(System.in);
        System.out.println
    }


}
