
import java.nio.channels.ReadableByteChannel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class PainterController {
    // intance variables for managing Painter state
    private PenSize radius = PenSize.MEDIUM;
    private Paint brushColor = Color.BLACK;
    
 
    // instance variables that refer to GUI components
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

    
    public void initialize() {
        blackbtn.setUserData(Color.BLACK);
        redbtn.setUserData(Color.RED);
        greenbtn.setUserData(Color.GREEN);
        bluebtn.setUserData(Color.BLUE);
        smallbtn.setUserData(PenSize.SMALL);
        mediumbtn.setUserData(PenSize.MEDIUM);
        largebtn.setUserData(PenSize.LARGE);
    }
    
    
    
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

    private enum PenSize {
        SMALL(2),
        MEDIUM(4),
        LARGE(6);

        private final int radius;

        PenSize(int radius) {
            this.radius = radius;
        }

        public int getRadius() {
        return radius;
        }

    };
}
