package Polyte;
//Imports
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/** <b>Game.java</b> This class is the control for level 3, a roleplaying game, which has 4 location: School, Restaurant,
 * Home, and ShoppingMall it has a map with images, and allows the user to choose to explore any of these locations
 * This class creates and manages the objects of classes School, Restaurant, Home, and ShoppingMall.
 * <p>
 * <pre>
 * Variable Name            Variable Type       Description
 * window                   Stage               Main stage/window
 * control                  Main                Control class
 * mapScene                 Scene               Scene for the map
 * school                   School              School object
 * shoppingMall             ShoppingMall        ShoppingMall object
 * home                     Home                Home object
 * restaurant               Restaurant          Restaurant object
 * mapLayout                StackPane           Layout for the map
 * firstTime                boolean             Checks if it's the firsy time loading a level.
 * self                     Game                Self to pass to locations as a control
 * </pre>
 * </p>
 * @version 2019.06.09
 * <pre>
 * version history
 * 05/22
 * added the intro scenes
 * 05/23
 * added map with clickable locations
 * 05/26
 * added home scenarios
 * 05/28
 * added school scenarios
 * 06/01
 * added restaurant scenarios
 * 06/04
 * added mall scenarios
 * </pre>
 * @author Jason Li & Andrey Starenky
 */
class Game {
    private final Stage window;                         //Main stage/window
    private final Main control;                         //Control class
    private Scene mapScene;                             //Scene for the map
    private School school;                              //School object
    private ShoppingMall shoppingMall;                  //ShoppingMall object
    private Home home;                                  //Home object
    private Restaurant restaurant;                      //Restaurant object
    private boolean firstTime;                          //Checks if it is the first time loading a level
    private final Game self = this;                     //Self to pass to locations as a control
    private final StackPane mapLayout=new StackPane();  //Layout for the map

    /** Constructor assigns values to window, control and sets firstTime to true
     * @param stage the main stage
     * @param ctrl the Main Object to call when level is over
     */
    public Game(Stage stage, Main ctrl){
        window=stage;                                   //Initialize window
        control=ctrl;                                   //Initialize contro
        firstTime=true;                                 //Initialize firstTime
    }

    /** This method is called to start the game
     * It displays the first introductory screen, and then calls the next method to show the 2nd intro screen when a button is pressed
     */
    public void start(){
        ImageView intro1 = new ImageView(new Image(getClass().getResourceAsStream("map_intro_1.jpg"))); //Intro 1 image
        intro1.setFitWidth(1200);                       //Set size of intro image
        intro1.setPreserveRatio(true);                  //Preserve image ratio
        StackPane introLayout1=new StackPane();         //Layout for intro image
        introLayout1.getChildren().add(intro1);         //Add intro image
        Scene introScene1 = new Scene(introLayout1,1200,800);   //Create scene for intro image
        window.setScene(introScene1);                   //Set scene to intro scene
        window.getScene().setOnKeyPressed(e -> {        //When a key is pressed, display second intro screen
            intro2();
        });
    }

   /** 
     * This method displays the 2nd intro screen, and then displays the map when any key is pressed
     */
    private void intro2(){
        ImageView intro2 = new ImageView(new Image(getClass().getResourceAsStream("map_intro_2.jpg"))); //Intro 2 image
        intro2.setFitWidth(1200);                       //Set image size
        intro2.setPreserveRatio(true);                  //Preserve image ratio
        StackPane introLayout2=new StackPane();         //Intro2 layout
        introLayout2.getChildren().add(intro2);         //Add image to layout
        Scene introScene2 = new Scene(introLayout2,1200,800);   //Intro2 scene
        window.setScene(introScene2);                   //Set scene to intro2 scene
        window.getScene().setOnKeyPressed(e -> {        //When a key is pressed, go to the map
            map();
        });
    }

  /** This method displays the map with the 4 locations, when clicked on create an instance of that location
    * It also has an larger and highlighted images for every location that show when moused over
    */
    private void map(){
        if(firstTime) {
            ImageView map = new ImageView(new Image(getClass().getResourceAsStream("map.jpg")));    //Map image
            ImageView shoppingMallView = new ImageView(new Image(getClass().getResourceAsStream("shopping_mall.png"))); //Location images
            ImageView restaurantView = new ImageView(new Image(getClass().getResourceAsStream("restaurant.png")));
            ImageView homeView = new ImageView(new Image(getClass().getResourceAsStream("home.png")));
            ImageView schoolView = new ImageView(new Image(getClass().getResourceAsStream("school.png")));
            ImageView menuView = new ImageView(new Image(getClass().getResourceAsStream("backToMenuButton.png")));      //Back to menu button
            map.setFitWidth(1200);                      //Set sizes of images
            shoppingMallView.setFitWidth(1200);
            restaurantView.setFitWidth(1200);
            homeView.setFitWidth(1200);
            schoolView.setFitWidth(1200);
            menuView.setFitWidth(1200);
            map.setPreserveRatio(true);                 //Preserve ratios of images
            shoppingMallView.setPreserveRatio(true);
            restaurantView.setPreserveRatio(true);
            schoolView.setPreserveRatio(true);
            homeView.setPreserveRatio(true);
            menuView.setPreserveRatio(true);
            shoppingMallView.setOpacity(0);             //Set the location images to invisible
            restaurantView.setOpacity(0);
            homeView.setOpacity(0);
            schoolView.setOpacity(0);
            Fader fader = new Fader();                  //Create a fader object
            fader.showOnHover(shoppingMallView);        //Display each location image when hovered over
            fader.showOnHover(restaurantView);
            fader.showOnHover(homeView);
            fader.showOnHover(schoolView);
            fader.fadeButton(menuView);                 //Fade menu button on hover
            StackPane subLayout = new StackPane();      //Layout for the map
            subLayout.getChildren().addAll(map, shoppingMallView, restaurantView, homeView, schoolView, menuView);  //Add images
            mapLayout.getChildren().addAll(subLayout);  //Add the map layout
            //Create a school object when clicked
            schoolView.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                        school = new School(window, self);
                    event.consume();
                }
            });
            //Create a restaurant object when clicked
            restaurantView.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                        restaurant = new Restaurant(window, self);
                    event.consume();
                }
            });
            //Create a home object when clicked
            homeView.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                        home = new Home(window, self);
                    event.consume();
                }
            });
            //Create a shopping mall when clicked
            shoppingMallView.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                        shoppingMall = new ShoppingMall(window, self);
                    event.consume();
                }
            });
            //Go back to menu when clicked
            menuView.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    control.finishLevel();
                    event.consume();
                }
            });

            mapScene = new Scene(mapLayout, 1200, 800); //Create a scene for the map
        }
        window.setScene(mapScene);      //Set the window to the map scene
        firstTime=false;                //Set first time to false
    }

  /** This method is called by one of the locations when they want to return back to the map or when the level is finished.
    * It displays the map and sets all the locations to null
    * The locations are reset upon exit for memory management purposes
    */
    public void toMap(){
            school = null;          //Set school to null
            restaurant = null;      //Set restaurant to null
            home = null;            //Set home to null
            shoppingMall = null;    //Set shoppingMall to null
        System.gc();                //GARBAGE COLLECTION to decrease memory usage
        window.setScene(mapScene);  //Set the scene to the map scene
    }
}
