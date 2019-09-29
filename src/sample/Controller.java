package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
/*
 *This file is the controller and has most methods stored here.
 * @author: Nicholis Wright
 * */
public class Controller {
  @FXML public Button recordProductionButton;
  @FXML public Button addButton;
  @FXML private ComboBox ComboBox;
  /*
  * @author: Nicholis Wright
  *@param ActionEvent actionEvent: this param passes in the action taking place on the
  product add button
  * */
  public void handleProductAddButton(ActionEvent actionEvent) {
    System.out.println("hopefully this works");
    final String JDBC_DRIVER = "org.h2.Driver";
    final String DB_URL = "jdbc:h2:./H2/RES";

    // data base credentials
    Connection conn;
    Statement stmt;
  }
  /*
  * @author: Nicholis Wright
  *@param ActionEvent actionEvent: this param passes in the action taking place on the
  record product button
  * */
  public void handleRecordProductionButton(ActionEvent actionEvent) {
    System.out.println("hopefully this works");
    final String JDBC_DRIVER = "org.h2.Driver";
    final String DB_URL = "jdbc:h2:./H2/RES";

    // data base credentials
    Connection conn;
    Statement stmt;
  }
  /*
   * @author: Nicholis Wright
   *This method initializes the connection to the data base and inserts items into it.
   * */
  public void DataInsert() {
    final String JDBC_DRIVER = "org.h2.Driver";
    final String DB_URL = "jdbc:h2:./H2/RES";

    // data base credentials
    Connection conn;
    Statement stmt;

    try {
      // STEP 1: Register JDBC driver
      Class.forName(JDBC_DRIVER);

      // STEP 2: Open a connection
      conn = DriverManager.getConnection(DB_URL);

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
   *This method populates the combo box with decimal numbers 1-10
   * */
  public void initialize() {
    ObservableList populateNum = FXCollections.observableArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    ComboBox.setItems(populateNum);
    ComboBox.getSelectionModel().selectFirst();
    ComboBox.setEditable(true);
  }
}
