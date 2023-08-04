package com.example.moesearchsearch;

import com.example.moesearchsearch.Models.AnimeInfo;
import com.example.moesearchsearch.Models.ApiResponce;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class MoeHomeController implements Initializable {

    @FXML
    private ImageView imageView;

  
    @FXML
    private TextField URLTextField;

    @FXML
    private Label detailsLable;

    @FXML
    private Label similarityLabel;

    @FXML
    private ListView<AnimeInfo> listView;

    @FXML
    void onClick_Search(ActionEvent event) {
        listView.getItems().clear();
        //imageView.setImage(null);
        String Url = URLTextField.getText();
       ApiResponce apiResponce =  ApiUtility.getDataFromAPI(Url);
        System.out.println(apiResponce.getFrameCount());






        if(apiResponce.getResults() != null) {
            detailsLable.setVisible(false);
            listView.getItems().addAll(apiResponce.getResults());
        }else{
            detailsLable.setVisible(true);
            detailsLable.setText("No Results found");
            throw new NullPointerException("The AnimeInfo is not getting wrapped properpy the array is null");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        detailsLable.setVisible(false);
        similarityLabel.setVisible(false);
        listView.getSelectionModel().selectedItemProperty().addListener(
                (observableValue,oldAni,newAni )->{
                    detailsLable.setVisible(true);
                    similarityLabel.setVisible(true);
                    imageView.setImage(new Image(newAni.getImage()));
                    similarityLabel.setText("Similarity based on URL->"+newAni.getSimilarity());
                    detailsLable.setText(newAni.formatedString());
                }
        );
    }
}
