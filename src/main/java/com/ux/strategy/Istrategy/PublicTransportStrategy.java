package com.ux.strategy.Istrategy;

public class PublicTransportStrategy implements RouteStrategy {

    @Override
    public void buildRoute(String origin, String destination) {

        System.out.println("calculando ruta de transporte publico " + "origen: " + origin + " destino: " + destination);
    }
}
