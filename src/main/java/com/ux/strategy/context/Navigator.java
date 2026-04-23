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
        System.out.println("seleccione el tipo de navegacion: 1. Road, 2. PublicTransport, 3. Walking, 4. Flying");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                strategy = new RoadStrategy();
                break;
                case 2:
                    strategy = new PublicTransportStrategy();
                    break;
                    case 3:
                        strategy = new WalkingStrategy();
                        break;
                        case 4:
                            strategy = new FlyStrategy();
                            break;

                            default:
                                System.out.println("Opcion no savlida. Usando RoadStrategy por defecto");
                                strategy = new RoadStrategy();
        }
    }


}
