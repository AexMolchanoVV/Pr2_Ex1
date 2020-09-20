package Author;

public class TestAuthor {
    public static void main(String[] args) {

        Author a1 = new Author("Alex", "abcd@mail.ru",'M');
        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        System.out.println("Пол автора "+a1.getGender());
        System.out.println(a1.toString());
    }
}
