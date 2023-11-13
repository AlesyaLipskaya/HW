package hw20;
public class User {
    private int id;
    private String name;
    private String email;

    // конструктор
    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // методы для CRUD операций
    public void create() {
        // реализация создания записи в базе данных или другом хранилище
    }

    public int read(int id) {
        // реализация чтения записи из базы данных или другого хранилища по id
        return 1; // замените null на реальную запись
    }

    public void update() {
        // реализация обновления записи в базе данных или другом хранилище
    }

    public void delete() {
        // реализация удаления записи из базы данных или другого хранилища
    }
}