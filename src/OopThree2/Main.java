package OopThree2;

public class Main {
    public static void main(String[] args) {

        Herbivores gazel = new Herbivores("Газель", 4, "Саванна в Автралии", 10, "Трава и коренья");
        Herbivores giraffe = new Herbivores("Жираф", 5, "Африка", 4, "Трава и листья деревьев");
        Herbivores horse = new Herbivores("Лошадь", 7, "Северная Англия", 15, "Овес и траву");
        System.out.println(gazel);
        System.out.println(giraffe);
        System.out.println(horse);
        gazel.graze();
        System.out.println();
        Predators hyena = new Predators("Гиена", 5, "Южная Африка", 9, "Мясо и падаль");
        Predators tiger = new Predators("Тигр", 12, "Китай", 16, "Мясо животных");
        Predators bear = new Predators("Медведь", 14, "Тайга России", 9, "Мясо,ягоды,растения");
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        bear.eat();
        System.out.println();
        System.out.println(gazel.equals(gazel));
        Amphibians allFreshwater = new Amphibians("Уж преснводный", 5, "рыба и лягушки");
        Amphibians frog = new Amphibians("Лягушка", 2, "насекомые");
        System.out.println(allFreshwater);
        System.out.println(frog);
        System.out.println();
        NonFlying peacock = new NonFlying("Павлин", 5, "Австралия", "при помощи ног");
        NonFlying penguin = new NonFlying("Пингвин", 3, "Северный Полюс", "при помощи ног");
        NonFlying birdTo = new NonFlying("Птица До-до", 9, "остров Маврикий", "при помощи ног");
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(birdTo);
        System.out.println();
        Flying gull = new Flying("Чайка", 5, "Италия", "при помощи крыльев");
        Flying albatross = new Flying("Альбатрос", 3, "Франция", "при помощи крыльев");
        Flying falcon = new Flying("Сокол", 9, "Россия", "при помощи крыльев");
        System.out.println(gull);
        System.out.println(albatross);
        System.out.println(falcon);

    }
}
