package com.gluonapplication.views;



import com.gluonhq.charm.glisten.animation.BounceInRightTransition;
import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.control.FloatingActionButton;
import com.gluonhq.charm.glisten.mvc.View;
import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class ThirdView extends View {

    public ThirdView() {

        getStylesheets().add(SecondaryView.class.getResource("secondary.css").toExternalForm());

        Label label = new Label("This is Third!");

        VBox controls = new VBox(label);
        controls.setAlignment(Pos.CENTER);

        setCenter(controls);

        setShowTransitionFactory(BounceInRightTransition::new);

        FloatingActionButton floatingActionButton = new FloatingActionButton(MaterialDesignIcon.INFO.text,
                e -> System.out.println("Info"));
        floatingActionButton.showOn(this);
    }

    @Override
    protected void updateAppBar(AppBar appBar) {
        appBar.setNavIcon(MaterialDesignIcon.MENU.button(e -> getAppManager().getDrawer().open()));
        appBar.setTitleText("Third");
        appBar.getActionItems().add(MaterialDesignIcon.FAVORITE.button(e -> System.out.println("Favorite")));
    }

}