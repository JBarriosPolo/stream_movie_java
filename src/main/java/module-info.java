module io.github.jbarriospolo.movie.movie {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens io.github.jbarriospolo.movie.movie to javafx.fxml;
    exports io.github.jbarriospolo.movie.movie;
}