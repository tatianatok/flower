public class Main {
    public static void main(String[] args) {
        flower rose = new flower(null, "Голландия", 35.59);
        flower hrizantema = new flower(null, null, 5);
        hrizantema.lifeSpan = 5;
        flower pion = new flower(null, "Англия", 69.9);
        pion.lifeSpan = 1;
        flower gipsophila = new flower(null, "Турция", 19.5);
        gipsophila.lifeSpan = 10;

        printIhfo(rose);
        printIhfo(hrizantema);
        printIhfo(pion);
        printIhfo(gipsophila);

        printCostOfFlouwers(rose, rose, rose,
                hrizantema, hrizantema, hrizantema, hrizantema, hrizantema,
                gipsophila);
    }

    private static void printIhfo(flower flower) {
        System.out.println("Цвет: " + flower.getFlowerColor() +
                ". Страна: " + flower.getCountry() +
                ". Стоимость за штуку: " + flower.cost +
                ". Срок стояния цветка: " + flower.lifeSpan);
    }

    private static void printCostOfFlouwers(flower... flowers) {
        double totalCost = 0;
        int minLifeSpan = Integer.MAX_VALUE;
        for (flower flower : flowers) {
            if (flower.lifeSpan < minLifeSpan) {
                minLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            printIhfo(flower);
        }
        totalCost = totalCost * 1.1;
        System.out.println("Стоимость букета: " + totalCost);
        System.out.println("Срок стояния букета: " + minLifeSpan);
    }
}






