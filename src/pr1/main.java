package pr1;

public class main {
    public static void main(String[] args) {
        String[] mass = new String[]{"abc", "abccccd", "asdasd", "qwerty", "a"};
        Consumer<String[]> array = str -> a(mass);
        array.accept(mass);
    }

    public static void a(String[] mass){
        int str_max = 0;
        int countOfUniqueChars = 0;
        int str_num = 0;
        for (int j = 0; j < mass.length; j++) {
            for (int i = 0; i <= mass[j].length(); i++) {
                String lowerCase = mass[j].toLowerCase();
                char characters[] = lowerCase.toCharArray();
                countOfUniqueChars = mass[j].length();
                for (int u = 0; u < characters.length; u++) {
                    if (u != lowerCase.indexOf(characters[u])) {
                        countOfUniqueChars--;
                    }
                }
            }
            if (countOfUniqueChars > str_max) {
                str_max = countOfUniqueChars;
                str_num = j;
            }
        }
        System.out.println(mass[str_num]);
    }
}
