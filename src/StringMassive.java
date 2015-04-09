public class StringMassive {
    public static void main(String[] args) {
        String[] Names = {"Юра","Дима","Гриша","Никита","Саша"};
        String[] Greetings = new String[Names.length];
        for (int i = 0; i < 5; i++) {
            Greetings[i] = "Привет, "+Names[i];
            System.out.println(Greetings[i]);
        }
    }
}