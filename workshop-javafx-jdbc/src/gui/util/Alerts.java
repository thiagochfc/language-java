package gui.util;

/**
 * *****************************************************************************
 *
 * Sistema : Workshop Finalidade : Layout das telas de Alerta Data de criação :
 * 30/12/2018 Autor : Thiago Christopher
 * ============================================================================
 *
 * Alterado por : Finalidade : Autor :
 *
 *****************************************************************************
 */
import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

public class Alerts {

    public static void showAlert(String title, String header, String content, AlertType type) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.show();
    }

    public static Optional<ButtonType> showConfirmation(String title, String content) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        return alert.showAndWait();
    }

}
