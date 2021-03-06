package com.pavdem2012.textgame.textgames;

public class TextGames {

    public static void main(String[] args) {

        // Вывести строки "Паша любит рыбалку", "Обожаю придумывать настойки" и их
        // длину.
        String text1 = "\"Паша любит рыбалку\"";
        String text2 = "\"Обожаю придумывать настойки\"";
        TextGames textGames = new TextGames();
        System.out.println(textGames.getStringWithLength(text1));
        System.out.println(textGames.getStringWithLength(text2));

        // Вывести строку в верхнем регистре, вывести первоначальный вариант. "Перестань
        // кричать"
        String text3 = "\"Перестань кричать\"";
        System.out.println(textGames.getStringWithUpperCase(text3));

        // Вывести строку в нижнем регистре, вывести первоначальный вариант. "ТИХО
        // СКАЗАЛ"
        String text4 = "\"ТИХО СКАЗАЛ\"";
        System.out.println(textGames.getStringWithLowerCase(text4));

        // Убрать пробелы в начале и конце строки. Вывести результат. " Неопрен бяка
        // рвётся сам "
        String text5 = "                        \"Неопрен бяка рвётся сам\"         ";
        System.out.println(textGames.trimString(text5));

        // Найти индекс слова бяка в строке. Вывевсти строку и индекс. "Вино бяка
        // забродило"
        String text6 = "Вино бяка забродило";
        System.out.println(textGames.indexOfSay(text6));

        // Обрезать строку в начале и конце, так чтобы осталось только "Лето
        // закончилось". Изначальный вариант: "бяка Лето закончилось. бяка".
        String text7 = "бяка. Лето закончилось. бяка";
        System.out.println(textGames.subStringWithoutFirstAndLastWords(text7));

        // Вырезать слово бяка из строки. Вывевсти обе строки. "Вино бяка забродило"
        System.out.println(textGames.subStringWithoutWord(text6, " бяка"));

        // Альтернативное решение:
        System.out.println(textGames.subStringWithoutWord2(text6, " бяка"));

        // Заменить в строке все вхождения слова «бяка» на «вырезано цензурой».
        // "Вчера было холодно, бяка. Потому мы остались дома, бяка. А так хотелось
        // купаться, но вода уже бяка.
        String text8 = " \"Вчера было холодно, бяка. Потому мы остались дома, бяка."
                + " А так хотелось купаться, но вода уже бяка.\"";
        System.out.println(textGames.subStringReplacetWord(text8, "бяка", "<Вырезано цензурой>"));
    }

    /**
     * Вывести строки "Паша любит рыбалку", "Обожаю придумывать настойки" и их
     * длину.
     * 
     * @param inputText this is text for processing
     * @return String with a text length information
     */
    public String getStringWithLength(String inputText) {
        String allText = inputText + ". " + "Длина текста: " + inputText.length() + ".\n";
        return allText;
    }

    /**
     * Вывести строку в верхнем регистре, вывести первоначальный вариант. "Перестань
     * кричать"
     * 
     * @param inputText this is text for processing
     * @return String with a text in upper case and initial version of text4
     */
    public String getStringWithUpperCase(String inputText) {
        String allText = "В верхнем регистре: " + inputText.toUpperCase() + ".\nПервоначальный вариант: " + inputText
                + ".\n";
        return allText;
    }

    /**
     * Вывести строку в нижнем регистре, вывести первоначальный вариант. "ТИХО
     * СКАЗАЛ"
     * 
     * @param inputText this is text for processing
     * @return String with a text in lower case and initial version of text4
     */
    public String getStringWithLowerCase(String inputText) {
        String allText = "В нижнем регистре: " + inputText.toLowerCase() + ".\nПервоначальный вариант: " + inputText
                + ".\n";
        return allText;
    }

    /**
     * Убрать пробелы в начале и конце строки. Вывести результат. " Неопрен бяка
     * рвётся сам "
     * 
     * @param inputText this is text for processing
     * @return String without leading and trailing spaces
     */
    public String trimString(String inputText) {
        String allText = "Без пробелов в начале и конце: " + inputText.trim() + ".\nПервоначальный вариант: "
                + inputText + ".\n";
        return allText;
    }

    /**
     * Найти индекс слова бяка в строке. Вывевсти строку и индекс. "Вино бяка
     * забродило"
     * 
     * @param inputText this is text for processing
     * @return initial version of text6 and index of word "бяка"
     */
    public String indexOfSay(String inputText) {
        String allText = "Первоначальный вариант: " + inputText + ".\nИндекс слова бяка: " + inputText.indexOf("бяка");
        return allText;
    }

    /**
     * Обрезать строку в начале и конце, так чтобы осталось только "Лето
     * закончилось". Изначальный вариант: "бяка Лето закончилось. бяка"
     * 
     * @param inputText this is text for processing
     * @return String without leading and trailing "бяка"
     */
    public String subStringWithoutFirstAndLastWords(String inputText) {
        int startNum = inputText.indexOf(" ");
        int endNum = inputText.lastIndexOf(" ");
        String inputTextFiltered = inputText.substring(startNum, endNum).trim();
        String allText = "\nБез бяка в начале и конце: " + inputTextFiltered + "\nПервоначальный вариант: " + inputText
                + ".\n";
        return allText;
    }

    /**
     * Вырезать слово бяка из строки. Вывевсти обе строки. "Вино бяка забродило"
     * 
     * @param inputText this is text for processing
     * @return String without "бяка"
     */
    public String subStringWithoutWord(String inputText, String wordToRemove) {
        String newStr = inputText.replaceAll(wordToRemove, "");
        String allText = "Простой вариант:" + "\nБез " + wordToRemove + ": " + newStr + "\nПервоначальный вариант: "
                + inputText + ".\n";
        return allText;
    }

    /**
     * Альтернативное решение:
     * 
     * @param inputText    this is text for processing
     * @param wordToRemove this is text for remove
     * @return String without "бяка"
     */
    public String subStringWithoutWord2(String inputText, String wordToRemove) {
        int wordIndex = inputText.indexOf(wordToRemove);
        String newStr = inputText.substring(0, wordIndex)
                + inputText.substring(wordIndex + wordToRemove.length(), inputText.length());
        String allText = "Альтернативный вариант:" + "\nБез " + wordToRemove + ": " + newStr
                + "\nПервоначальный вариант: " + inputText + ".\n";
        return allText;
    }

    /**
     * Заменить в строке все вхождения слова «бяка» на «вырезано цензурой»
     * 
     * @param inputText this is text for processing
     * @return String replaced "бяка" to <Вырезано цензурой>
     */
    public String subStringReplacetWord(String inputText, String wordToRemove, String wordToReplace) {
        String replaceWordIndex = inputText.replace(wordToRemove, wordToReplace);
        String allText = wordToRemove + " заменено на " + wordToReplace + ":" + replaceWordIndex
                + "\nПервоначальный вариант:" + inputText + ".\n";
        return allText;
    }
}
