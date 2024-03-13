public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Александр";
        post.passport = "1234 № 56789101";
        post.patronymic = "Сергеевич";
        post.phone = "+7 (999)-675-12-13";
        post.surname = "Щелоков";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 1;
        post.birthday.year = 1995;
    }
}
