module no.malde.topbite {
  requires javafx.controls;
  requires javafx.fxml;


  opens no.malde.topbite to javafx.fxml;
  exports no.malde.topbite;
  exports no.malde.topbite.controller;
  opens no.malde.topbite.controller to javafx.fxml;
}