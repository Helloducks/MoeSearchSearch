module com.example.moesearchsearch {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires java.net.http;


    opens com.example.moesearchsearch to javafx.fxml,com.google.gson;
    exports com.example.moesearchsearch;
    exports com.example.moesearchsearch.Models;
    opens com.example.moesearchsearch.Models to com.google.gson, javafx.fxml;
}