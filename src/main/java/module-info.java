module com.example.to_do_list_1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.to_do_list_1 to javafx.fxml;
    exports com.example.to_do_list_1;
}