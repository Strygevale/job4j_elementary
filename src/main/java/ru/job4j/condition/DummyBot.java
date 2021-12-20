package ru.job4j.condition;

public class DummyBot {

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Привет, бот");
        System.out.println(rsl);
        rsl = DummyBot.answer("Пока");
        System.out.println(rsl);
        rsl = DummyBot.answer("Как дела");
        System.out.println(rsl);
    }

    public static String answer(String questions) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос";

        if ("Привет, бот".equals(questions)) {
            rsl = "Привет, умник";
        } else if ("Пока".equals(questions)) {
            rsl = "До скорой встречи";
        }
        return rsl;
    }
}
