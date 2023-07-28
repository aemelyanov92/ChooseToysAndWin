import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        var ChooseAndWin = new ChooseAndWin();
        var exit = true;
        System.out.println("Для розыгрыша игрушки нажмите r\n" +
                "Для получение выигранной игрушки нажмите g\n" +
                "Для предзаполнения списка игрушек нажмите f\n" +
                "Для добавления игрушки нажмите a\n" +
                "Для выхода нажмите e");
        while (exit){
            String value = in.nextLine();
            if (value.equals("f"))
            {
                ChooseAndWin.fillToys(2);
                System.out.println("Список игрушек предзаполнен");
            }
            else if(value.equals("g")) {
                var toy = ChooseAndWin.getPrize();
                if (toy!=null)
                    System.out.println("Получена игрушка "+toy.getName());
            }
            else if (value.equals("a")){
                System.out.println("Введите имя игрушки");
                String name = in.nextLine();
                ChooseAndWin.addToy(name);
                System.out.println("Игрушка "+name+" добавлена");
            }
            else if (value.equals("r"))
            {
                var toy= ChooseAndWin.rollPrize();
                if(toy!=null)
                    System.out.println("Разыграна игрушка "+toy.getName());
            }
            else if (value.equals("e"))
                System.exit(0);
        }
    }
}