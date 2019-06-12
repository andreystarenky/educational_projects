package Polyte;
//Imports
        import javafx.event.EventHandler;
        import javafx.scene.Scene;
        import javafx.scene.image.Image;
        import javafx.scene.image.ImageView;
        import javafx.scene.input.MouseEvent;
        import javafx.scene.layout.StackPane;
        import javafx.stage.Stage;

/** <b>Home.java</b> This class is one of 4 locations.It contains many scenes, 
* with a few that allow the user to choose an action to take
* Depending on the action that is taken, future scenes are configured according to the user's response
* <p><pre>
* Variable Name    Variable Type    Description
* window           Stage            Main window to add scenes to
* control          Game             Control class to go back to map to
* num              int              Scene number
* yardWork         boolean          Boolean for first user answer
* toys             boolean          Boolean for second user answer
* scenes           Scene[]          Array of scenes
* back_To_Map      Image            Back to map button
* </pre></P>
* @version 2019.06.09
* <br/>version history<br/>
* 05/24<br/>
* added added scenes until the yardwork question<br/>
* 05/26<br/>
* added the rest of the scenes and the reset<br/>
* @author Jason Li & Andrey Starenky
*/
class Home {
    private final Stage window; //Main window to add scenes to
    private final Game control; //Control class to go back to map to
    private int num;            //Scene number
    private boolean yardWork;   //Boolean for first user answer
    private boolean toys;       //Boolean for second user answer
    private final Scene[] scenes = new Scene[10];   //Array of scenes
    private final Image back_To_Map = new Image(getClass().getResourceAsStream("backToMapButton.png")); //Back to map button

    /** Constructor assigns values to window and control, sets num=0 creates layouts and displays scenes.
     * @param stage to add scenes to
     * @param ctrl class to return to map to
     */
    public Home(Stage stage, Game ctrl){
        window = stage; //Initialize window
        control = ctrl; //Initialize control class
        num=0;          //Defualt initial scene number
        makeLayouts();  //Create all layouts
        play();         //Display scenes
    }

    /**This method displays the next scene in the sequence
    *If the scene number is one right after a user decision, it runs configureLayout() with that number
    *in order to set it up depending on the result of the user selection
    *When it reaches the final scene, it resets the scene number to 0
    */
    private void play(){
        if(num==4||num==5){
            configureLayout(4);    //Configure layout for this scene
        }
        if(num==9) {
            configureLayout(9);    //Configure layout for this scene
        }

        if(num>=scenes.length)
            System.out.println("DONE - F");
        else {
            window.setScene(scenes[num]);   //Set scene

            if(num!=1&&num!=3&&num!=8&&num!=9) {  //Checking that this is not an action scene or the final scene
                window.getScene().setOnKeyPressed(e -> {
                    num++;      //Increase scene #
                    if (num >= scenes.length)
                        System.out.println("DONE");
                    else
                        play();
                });
            }
            if(num==9) {
                num = 0;
            }
        }
    }

    /** This layout makes all the layouts and scenes for this location and puts them in an array called scenes[]
    * It creates all layout apart from those that need to be configured based on a result of user action
    * These are configured through configureLayout()
    * This method also adds options buttons for specific scenes which set a boolean value, used by configureLayout()
    */
    private void makeLayouts(){
        Fader fader = new Fader();
        //Hallway Scene
        StackPane L_hall = new StackPane();     //Pane for this scene
        L_hall.getChildren().add(new ImageView(new Image(getClass().getResourceAsStream("home_arrive.jpg"))));     //Scene image
        toMapAdder(L_hall);
        scenes[0]=new Scene(L_hall,1200,800);   //Create new scene

        StackPane L_class = new StackPane();     //Pane for this scene
        L_class.getChildren().add(new ImageView(new Image(getClass().getResourceAsStream("home_1.jpg"))));     //Scene image
        ImageView continueView = new ImageView(new Image(getClass().getResourceAsStream("home_1a.png")));     //Option Button
        ImageView mapView = new ImageView(new Image(getClass().getResourceAsStream("home_1b.png")));     //Option Button
        fader.fadeButtonMore(continueView);
        fader.fadeButtonMore(mapView);
        continueView.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {  //No action response
                num++;
                play();
                event.consume();
            }
        });
        mapView.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {  //No action response
                num++;
                play();
                event.consume();
            }
        });
        L_class.getChildren().addAll(continueView,mapView);
        toMapAdder(L_class);
        scenes[1]=new Scene(L_class,1200,800);   //Create new scene

        StackPane L_teacher = new StackPane();     //Pane for this scene
        L_teacher.getChildren().add(new ImageView(new Image(getClass().getResourceAsStream("home_doing_good.jpg"))));     //Scene image
        toMapAdder(L_teacher);
        scenes[2]=new Scene(L_teacher,1200,800);   //Create new scene

        StackPane L_yardWork = new StackPane();     //Pane for this scene
        L_yardWork.getChildren().add(new ImageView(new Image(getClass().getResourceAsStream("home_2.jpg"))));     //Scene image
        toMapAdder(L_yardWork);
        ImageView chicken = new ImageView(new Image(getClass().getResourceAsStream("home_2a.png")));     //Option Button
        ImageView steak = new ImageView(new Image(getClass().getResourceAsStream("home_2b.png")));     //Option Button
        fader.fadeButtonMore(chicken);
        fader.fadeButtonMore(steak);
        chicken.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                num++;
                yardWork=true;      //Good response
                play();
                event.consume();
            }
        });
        steak.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                num++;
                yardWork=false;     //Bad response
                play();
                event.consume();
            }
        });

        L_yardWork.getChildren().addAll(chicken,steak);
        scenes[3]=new Scene(L_yardWork,1200,800);   //Create new scene

        StackPane L_food_coming = new StackPane();     //Pane for this scene
        L_food_coming.getChildren().addAll(new ImageView(new Image(getClass().getResourceAsStream("home_enter.jpg"))));     //Scene image
        toMapAdder(L_food_coming);
        scenes[6]=new Scene(L_food_coming,1200,800);   //Create new scene

        StackPane L_food_here = new StackPane();     //Pane for this scene
        L_food_here.getChildren().add(new ImageView(new Image(getClass().getResourceAsStream("home_play.jpg"))));     //Scene image
        toMapAdder(L_food_here);
        scenes[7]=new Scene(L_food_here,1200,800);   //Create new scene

        StackPane L_sister = new StackPane();     //Pane for this scene
        L_sister.getChildren().add(new ImageView(new Image(getClass().getResourceAsStream("home_3.jpg"))));     //Scene image
        toMapAdder(L_sister);
        ImageView sister_bad = new ImageView(new Image(getClass().getResourceAsStream("home_3a.png")));     //Option Button
        ImageView sister_good = new ImageView(new Image(getClass().getResourceAsStream("home_3b.png")));     //Option Button
        fader.fadeButtonMore(sister_bad);
        fader.fadeButtonMore(sister_good);
        sister_bad.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                num++;
                toys=false;     //Bad response
                play();
                event.consume();
            }
        });
        sister_good.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                num++;
                toys=true;      //Good response
                play();
                event.consume();
            }
        });
        L_sister.getChildren().addAll(sister_bad,sister_good);
        scenes[8]=new Scene(L_sister,1200,800);   //Create new scene
    }

    /** method configures layouts for a specific number, depending on an option chosen in a previous scene
    * It checks a specific boolean value depending on the scene number, and configures the layouts based on the value
    * @param n the number of the scene so it knows which layouts to add
    */
    private void configureLayout(int n){
        if(n==4&&!yardWork){    //Previous scene had a negative answer
            StackPane L_a_options = new StackPane();                   //Create layout
            L_a_options.getChildren().add(new ImageView(new Image(getClass().getResourceAsStream("home_2_bad1.jpg"))));
            toMapAdder(L_a_options);
            scenes[4]=new Scene(L_a_options,1200,800);   //Create new scene

            StackPane L_b_options = new StackPane();                   //Create layout
            L_b_options.getChildren().addAll(new ImageView(new Image(getClass().getResourceAsStream("home_2_bad2.jpg"))));
            toMapAdder(L_b_options);
            scenes[5]=new Scene(L_b_options,1200,800);   //Create new scene
        }
        else if(n==4){          //Previous scene had a positive answer
            StackPane L_a_options = new StackPane();                   //Create layout
            L_a_options.getChildren().add(new ImageView(new Image(getClass().getResourceAsStream("home_2_good1.jpg"))));
            toMapAdder(L_a_options);
            scenes[4]=new Scene(L_a_options,1200,800);   //Create new scene

            StackPane L_b_options = new StackPane();                   //Create layout
            L_b_options.getChildren().addAll(new ImageView(new Image(getClass().getResourceAsStream("home_2_good2.jpg"))));
            toMapAdder(L_b_options);
            scenes[5]=new Scene(L_b_options,1200,800);   //Create new scene
        }
        if(n==9){
            if(toys){           //Previous scene had a positive answer
                StackPane L_question = new StackPane();                   //Create layout
                L_question.getChildren().add(new ImageView(new Image(getClass().getResourceAsStream("home_3_good.jpg"))));
                toMapAdder(L_question);
                scenes[9]=new Scene(L_question,1200,800);   //Create new scene
            }
            else{               //Previous scene had a negative answer
                StackPane L_question = new StackPane();                   //Create layout
                L_question.getChildren().add(new ImageView(new Image(getClass().getResourceAsStream("home_3_bad.jpg"))));
                toMapAdder(L_question);
                scenes[9]=new Scene(L_question,1200,800);   //Create new scene
            }
        }
    }

    /** method adds the back to map button to a layout
     * It creates the imageview, adds the fade on hover, and back to map action
     * @param pane layout for the button to be added to
     */
    private void toMapAdder(StackPane pane){
        ImageView backToMap = new ImageView(back_To_Map);
        pane.getChildren().add(backToMap);
        Fader fader = new Fader();
        fader.fadeButton(backToMap);
        backToMap.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println();
                if(num==24)
                    num=0;
                control.toMap();
                event.consume();event.consume();
            }
        });
    }

    /** void reset Resets the location by setting current scene # to 0 */
    public void reset(){
        num=0;
    }
}
