
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class PainterController {

    @FXML
    private RadioButton blackbtn;

    @FXML
    private RadioButton bluebtn;

    @FXML
    private Button clearbtn;

    @FXML
    private ToggleGroup colorToggleGroup;

    @FXML
    private Pane drawingAreaPane;

    @FXML
    private RadioButton greenbtn;

    @FXML
    private RadioButton largebtn;

    @FXML
    private RadioButton mediumbtn;

    @FXML
    private RadioButton redbtn;

    @FXML
    private ToggleGroup sizeToggleGroup;

    @FXML
    private RadioButton smallbtn;

    @FXML
    private Button undobtn;

    @FXML
    void clearButtonPressed(ActionEvent event) {

    }

    @FXML
    void colorRadioButtonSelected(ActionEvent event) {

    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {

    }

    @FXML
    void sizeRadioButtonSelected(ActionEvent event) {

    }

    @FXML
    void undoButtonPressed(ActionEvent event) {

    }

}
