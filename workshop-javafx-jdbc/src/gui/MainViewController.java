package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

/*******************************************************************************
 * 
 * Sistema          : Workshop
 * Finalidade       : Classe responsável pelo controller da MainView
 * Data de criação  : 30/12/2018
 * Autor            : Thiago Christopher
 * ============================================================================
 * 
 * Alterado por     :
 * Finalidade       :
 * Autor            :
 * 
 ******************************************************************************/

public class MainViewController implements Initializable {
    
    @FXML
    private MenuItem menuItemSeller;
    
    @FXML
    private MenuItem menuItemDepartment;
    
    @FXML
    private MenuItem menuItemAbout;
    
    @FXML
    public void onMenuItemSellerAction() {
        System.out.println("onMenuItemSellerAction");
    }
    
    @FXML
    public void onMenuItemDepartmentAction() {
        System.out.println("onMenuItemDepartmentAction");
    }
    
    @FXML
    public void onMenuItemAboutAction() {
        System.out.println("onMenuItemAboutAction");
    }
    
    @Override
    public void initialize(URL uri, ResourceBundle rb) {
    }
    
}
