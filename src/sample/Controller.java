package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

/*
 *This file is the controller and has most methods stored here.
 * @author: Nicholis Wright
 * */

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
    dataInsert();
  }

  /*
  * @author: Nicholis Wright
  *@param ActionEvent actionEvent: this param passes in the action taking place on the
  record product button
  * */

  public void handleRecordProductionButton() {
    System.out.println("hopefully this works");
    dataInsert();
  }

  /*
   * @author: Nicholis Wright
   *This method initializes the connection to the data base and inserts items into it.
   * */

  private void dataInsert() {
    final String jdbc_driver = "org.h2.Driver";
    final String dbUrl = "jdbc:h2:./H2/RES";

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

  /*
   * @author: Nicholis Wright
   *This method populates the combo box with decimal numbers 1-10.
   * @param none: no parameters
   * */

  public void initialize() {
    ObservableList<Integer> populateNum =
        FXCollections.observableArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    comboBox.setItems(populateNum);
    comboBox.getSelectionModel().selectFirst();
    comboBox.setEditable(true);
  }
}
