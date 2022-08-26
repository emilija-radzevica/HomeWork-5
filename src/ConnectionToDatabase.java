public interface ConnectionToDatabase {
    String DB = "jdbc:mysql://localhost:3306/homework-5";
    String USER = "root";
    String PASS = "MansMySQL2021";

    void connect(String method);

}
