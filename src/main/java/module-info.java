module com.example.ud1_exercise1_skell {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ud1_exercise1_skell to javafx.fxml;
    exports com.example.ud1_exercise1_skell;
}