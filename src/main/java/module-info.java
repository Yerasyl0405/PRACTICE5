module com.example.practice5 {
    requires javafx.controls;
    requires javafx.fxml;
            
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.example.practice5 to javafx.fxml;
    exports com.example.practice5;
}