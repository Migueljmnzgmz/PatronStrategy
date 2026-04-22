package com.ux.strategy.Istrategy;

public class RoadStrategy implements RouteStrategy {

    @Override
    public void buildRoute(String origin, String destination) {

        System.out.println("calculando ruta " + "origen: " + origin + " destino: " + destination);
    }

}
