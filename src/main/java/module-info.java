module com.bumhed.guardianangel {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires com.almasb.fxgl.all;

    opens com.bumhed.guardianangel to javafx.fxml;
    exports com.bumhed.guardianangel;
}