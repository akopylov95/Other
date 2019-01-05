public class Main {

    public static void main(String[] args) {

        String[] wordListOne = {"круглосуточный", "трех-звенный","30000-футовый","взаимный","обоюдный выигрыш",
                                "фронтэнд","на основе веб-технологий","проникающий","умный","шесть сигм",
                                "метод критического пути","динамичный"};

        String[] wordListTwo = {"уполномоченный","трудный","чистый продукт","ориентированный","центральный",
                                "распределенный","кластеризированный","фирменный","нестандартный ум",
                                "позиционированный","сетевой","сфокусированный","использованный с выгодой",
                                "выровненный","нацеленный на","общий","совместный","ускоренный"};

        String[] wortListThree = {  "процесс","пункт разгрузки","выход из положения","тип структуры",
                                    "талант","подход","уровень завоеванного внимания","портал",
                                    "период времени","обзор","образец","пункт следования"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wortListThree.length;

        int randOne = (int) (Math.random() * oneLength);
        int randTwo = (int) (Math.random() * twoLength);
        int randThree = (int) (Math.random() * threeLength);

        String phraze = wordListOne[randOne] + " " + wordListTwo[randTwo] + " " + wortListThree[randThree];

        System.out.println("Всё, что нам нужно, - это " + phraze);
    }
}
