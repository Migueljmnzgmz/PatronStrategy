package com.ux.strategy.Istrategy;

public class FlyStrategy implements RouteStrategy{

    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("calculando ruta de vuelo " + "origen: " + origin + " destino: " + destination);
    }
}
