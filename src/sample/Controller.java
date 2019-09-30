package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

/*
 * This is the controller file which controls the program.
 * @author: Nicholis Wright
 * */
// error says it can be package private but it cannot
public class Controller {

  public Button addButton;
  public Button recordProductionButton;
  @FXML private ComboBox<Integer> comboBox;

  /*
  * @author: Nicholis Wright
  *@param ActionEvent actionEvent: this param passes in the action taking place on the
  product add button
  * */

  public void handleProductAddButton() {
    System.out.println("hopefully this works");
    test();
  }

  /*
  * @author: Nicholis Wright
  *@param ActionEvent actionEvent: this param passes in the action taking place on the
  record product button
  * */

  public void handleRecordProductionButton() {
    System.out.println("hopefully this works");
    test();
  }

  /*
   * @author: Nicholis Wright
   *This method populates the combo box with decimal numbers 1-10.
   * @param none: no parameters
   * */
  public void initialize() {
    for (int i = 0; i <= 10; i++) {
      comboBox.getItems().add(i);
    }
    comboBox.getSelectionModel().selectFirst();
    comboBox.setEditable(true);
  }

  private void test() {
    final String jdbc_driver = "org.h2.Driver";
    final String dbUrl = "jdbc:h2:./res/Production";

    // data base credentials
    Connection conn;
    Statement stmt;

    try {
      // STEP 1: Register JDBC driver
      Class.forName(jdbc_driver);

      // STEP 2: Open a connection
      conn = DriverManager.getConnection(dbUrl);

      // STEP 3: Execute a query
      stmt = conn.createStatement();

      // this inserts the name, manufacturer, and type into product of the database
      String sql =
          "INSERT INTO PRODUCT(NAME,MANUFACTURER, TYPE) VALUES ( 'iPod', 'Apple', 'AUDIO')";

      stmt.executeUpdate(sql);

      // STEP 4: Clean-up environment
      stmt.close();
      conn.close();

      // catches/handles exception errors
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
  }
}
