package hw20;
public class Main {
    public static void main(String[] args) {
        // создание нового пользователя
        User user = new User(1, "Alesya", "alesya@yandex.by");

        // сохранение пользователя в базу данных
        user.create();

        // чтение пользователя из базы данных по id
        User retrievedUser = user;

        // обновление данных пользователя
        retrievedUser.setName("Alesya Lipskaya");
        retrievedUser.setEmail("l1pskayaalesya@yandex.by");
        retrievedUser.update();

        // удаление пользователя
        retrievedUser.delete();
    }
}