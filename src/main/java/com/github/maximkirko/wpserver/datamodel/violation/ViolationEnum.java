package com.github.maximkirko.wpserver.datamodel.violation;


import java.util.ArrayList;
import java.util.List;

public enum ViolationEnum {
    ParkingUnderSign ("Парковка в зоне действия запрещающего знака"), //143.1
    ParkingOnCrossing ("Парковка на перекрестке"), //143.4
    ParkingAtBusStop ("Парковка на остановке маршрутных т/с"), //143.5
    ParkingOnBridge ("Парковка на мосту/эстакаде"), //143.6
    ParkingNearRailroad ("Парковка у/на железнодорожных путях"), //143.8
    ParkingOnLeftSide ("Парковка на левой стороне проезжей части"), //143.11
    ParkingOnWalkway ("Парковка на пешеходной дорожке"), //143.14
    ParkingOnGrass ("Парковка на газоне"), //143.15
    ParkingNearShop ("Парковка у дверей магазина"); //143.18

    private final String name;

    private ViolationEnum(String v) {
        name = v;
    }

    public boolean equalsName(String otherName) {
        return (otherName == null) ? false : name.equals(otherName);
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static ViolationEnum getViolation(String s) {

        for (ViolationEnum en : ViolationEnum.values()) {
            if(en.toString().equals(s)) {
                return en;
            }
        }

//        switch (s) {
//            case "Парковка на остановке маршрутных т/с":
//                return ParkingAtBusStop;
//            case "Парковка у/на железнодорожных путях":
//                return ParkingNearRailroad;
//            case "Парковка у дверей магазина":
//                return ParkingNearShop;
//            case "Парковка на мосту/эстакаде":
//                return ParkingOnBridge;
//            case "Парковка на перекрестке":
//                return ParkingOnCrossing;
//            case "Парковка на газоне":
//                return ParkingOnGrass;
//            case "Парковка ны левой стороне проезжей части":
//                return ParkingOnLeftSide;
//            case "Парковка на пешеходной дорожке":
//                return ParkingOnWalkway;
//            case "Парковка в зоне действия запрещающего знака":
//                return ParkingUnderSign;
//        }
        return null;
    }


    public static String getRusViolation(ViolationEnum violationEnum) {

        switch (violationEnum) {
            case ParkingAtBusStop:
                return "Парковка на остановке маршрутных т/с";
            case ParkingNearRailroad:
                return "Парковка у/на железнодорожных путях";
            case ParkingNearShop:
                return "Парковка у дверей магазина";
            case ParkingOnBridge:
                return "Парковка на мосту/эстакаде";
            case ParkingOnCrossing:
                return "Парковка на перекрестке";
            case ParkingOnGrass:
                return "Парковка на газоне";
            case ParkingOnLeftSide:
                return "Парковка ны левой стороне проезжей части";
            case ParkingOnWalkway:
                return "Парковка на пешеходной дорожке";
            case ParkingUnderSign:
                return "Парковка в зоне действия запрещающего знака";
        }
        return "";
    }

    public static List<ViolationEnum> getViolations() {
        List<ViolationEnum> violations = new ArrayList<>();
        violations.add(ParkingAtBusStop);
        violations.add(ParkingNearRailroad);
        violations.add(ParkingNearShop);
        violations.add(ParkingOnBridge);
        violations.add(ParkingOnCrossing);
        violations.add(ParkingOnGrass);
        violations.add(ParkingOnLeftSide);
        violations.add(ParkingOnWalkway);
        violations.add(ParkingUnderSign);

        return violations;
    }
    public static List<String> getRusViolationsList() {
        List<String> violations = new ArrayList<>();

        violations.add("Парковка на остановке маршрутных т/с");
        violations.add("Парковка у/на железнодорожных путях");
        violations.add("Парковка у дверей магазина");
        violations.add("Парковка на мосту/эстакаде");
        violations.add("Парковка на перекрестке");
        violations.add("Парковка на газоне");
        violations.add("Парковка на левой стороне проезжей части");
        violations.add("Парковка на пешеходной дорожке");
        violations.add("Парковка в зоне действия запрещающего знака");

        return violations;
    }
}

    /*

138. Остановка и стоянка транспортных средств разрешаются:
138.1. в специально отведенном месте, обозначенном дорожным знаком «Место стоянки» («Место стоянки такси», «Место отдыха»);
138.2. на правой по ходу движения обочине, а при отсутствии обочины или невозможности остановиться на ней — у края проезжей части дороги параллельно ему, за исключением тех мест, где с помощью дорожных знаков или дорожной разметки допускается иное расположение транспортных средств (вне населенных пунктов разрешается только остановка транспортных средств);
138.3. на левой обочине дороги с односторонним движением, а при ее отсутствии или невозможности остановиться на ней — у левого края проезжей части дороги параллельно ему, за исключением тех мест, где с помощью дорожных знаков или дорожной разметки допускается иное расположение транспортных средств, при наличии там тротуара, непосредственно прилегающего к проезжей части дороги, а в населенных пунктах — также на дороге с одной полосой движения для каждого направления без трамвайных путей посередине (вне населенных пунктов разрешается только остановка транспортных средств).


143. Остановка и стоянка транспортных средств запрещаются:
143.1. в зоне действия соответственно дорожных знаков «Остановка запрещена», «Стоянка запрещена», «Стоянка запрещена по нечетным числам месяца», «Стоянка запрещена по четным числам месяца» и (или) линий горизонтальной дорожной разметки 1.4, 1.10;
143.2. в местах, где расстояние между сплошной линией горизонтальной дорожной разметки (кроме обозначающей край проезжей части дороги) и остановившимся транспортным средством составляет менее 3 метров;
143.3. на пешеходных переходах и ближе 15 метров от них на дороге в обе стороны;
143.4. на перекрестках и ближе 15 метров от края пересекаемой проезжей части дороги (кроме жилых зон), за исключением стороны напротив бокового проезда трехсторонних перекрестков, имеющих сплошную линию горизонтальной дорожной разметки или сплошную разделительную полосу;
143.5. на остановочных пунктах маршрутных транспортных средств и ближе 15 метров от них, кроме случаев остановки для посадки (высадки) пассажиров, если это не создаст препятствия для движения маршрутных транспортных средств;
143.6. на мостах, путепроводах, эстакадах и под ними, кроме специально оборудованных мест для стоянки;
143.7. на полосах разгона и торможения, съездах транспортных развязок в разных уровнях и въездах на них;
143.8. на железнодорожных переездах и ближе 50 метров от них в обе стороны;
143.9. на поворотах дороги, обозначенных дорожными знаками «Опасный поворот», «Опасные повороты», в других местах с ограниченной обзорностью дороги и где видимость дороги менее 100 метров хотя бы в одном направлении движения;
143.10. на проезжей части двухполосной дороги напротив стоящего на противоположной стороне дороги транспортного средства;
143.11. на левой стороне дороги, за исключением случаев, указанных в подпункте 138.3 пункта 138 настоящих Правил;
143.12. на трамвайных путях и в непосредственной близости от них, если это создаст препятствие для движения трамваев;
143.13. в местах, где транспортное средство закроет от других водителей сигналы светофора, дорожные знаки или другие технические средства организации дорожного движения;
143.14. на тротуарах, кроме специально отведенных мест, обозначенных дорожным знаком «Место стоянки» («Место стоянки такси»).
Допускается остановка транспортных средств дорожно-эксплуатационной и коммунальной служб, автомобилей с наклонной белой полосой на бортах, а также других транспортных средств, обслуживающих торговые и другие организации, расположенные непосредственно у тротуаров, на время выполнения работ либо загрузки (разгрузки) транспортного средства при условии обеспечения безопасности дорожного движения;
143.15. на газонах и других участках с зелеными насаждениями;
143.16. на проездах во дворах со стороны, прилегающей к жилой застройке;
143.17. в местах, где стоящее транспортное средство создаст препятствие для движения, работы транспортных средств оперативного назначения и транспортных средств дорожно-эксплуатационной и коммунальной служб (въезды во дворы и выезды из них, проезды в арках, узкие местные проезды, места размещения контейнеров для сбора бытовых отходов и др.);
143.18. ближе 10 метров от служебных дверей магазинов, через которые производятся погрузочно-разгрузочные работы, закрытых ворот, в том числе ворот гаражей.

144. Включение водителем аварийной световой сигнализации при преднамеренной остановке и стоянке в местах, где они запрещены, не освобождает его от ответственности за нарушение требований пункта 143 настоящих Правил.

145. Стоянка запрещается:
145.1. вне населенных пунктов транспортных средств на проезжей части дороги и на обочине;
145.2. транспортных средств с технически допустимой общей массой свыше 3,5 тонны вне специально отведенных мест, обозначенных дорожным знаком «Место стоянки» («Место отдыха»).
146. Запрещается открывать (закрывать) двери транспортного средства или держать их открытыми, если это создаст препятствие для движения других участников дорожного движения.
147. При нарушении водителями правил остановки или стоянки транспортных средств, в результате которого создано препятствие для дорожного движения или возникла угроза безопасности граждан, сотрудники ГАИ вправе произвести принудительную отбуксировку (эвакуацию) таких транспортных средств в порядке, установленном законодательными актами и принятыми в целях их реализации постановлениями Совета Министров Республики Беларусь.
При нарушении водителями правил остановки или стоянки грузовых автомобилей, автобусов, колесных тракторов, самоходных машин сотрудниками ГАИ может быть произведена блокировка колес этих транспортных средств в порядке, установленном законодательными актами и принятыми в целях их реализации постановлениями Совета Министров Республики Беларусь.
 */