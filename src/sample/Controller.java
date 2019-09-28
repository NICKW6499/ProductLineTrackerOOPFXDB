package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.scene.control.ComboBox;

public class Controller {
  final String JDBC_DRIVER = "org.h2.Driver";
  final String DB_URL = "jdbc:h2:./res/ProductionLineDb";

  public Button AddProductButton;
  public Button RecordProductionButton;
  public ComboBox ProductionRecords;

  @FXML
  protected void handleAddProductButtonAction(ActionEvent event) {
    System.out.println("The Product was added");
    productLog();
  }

  @FXML
  protected void handleRecordProductionButtonAction(ActionEvent event) {
    System.out.println("The button works!");
  }

  public void initialize() {

    final String JDBC_DRIVER = "org.h2.Driver";
    final String DB_URL = "jdbc:h2:./res/ProductionLineDb";

    int i;
    for (i = 1; i < 11; i++) {
      ProductionRecords.getItems().add(i);
    }
    ProductionRecords.getSelectionModel().selectFirst();
    ProductionRecords.setEditable(true);
  }

  public void productLog() {

    //  Database credentials
    Connection conn = null;
    Statement stmt = null;

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
}
