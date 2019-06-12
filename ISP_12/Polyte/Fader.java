package Polyte;
//Imports
import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/** <b>Fader.java</b> This utility class is responsible for a fading effect to Image buttons when they are moused over 
 * There are two methods with different fading strengths, that, when passed an ImageView to,
 * will add a MouseEvent triggered by the cursor entering the image, resulting in a change in opacity.
 * @version 2019.06.09
 * <pre>
 * version history
 * 05/18 
 * added fadeButton method
 * 05/21
 * added showOnHover
 * 05/23
 * added fadeButtonMore as needed for text images
 * @author Andrey Starenky & Jason Li
 * </pre>
 */
class Fader {
    /** This method will add an EventHandler to an ImageView that is passed to it which 
     * fades the button that is passed to it by setting opacity to 0.8 
     * @param button the button to be faded
     */
    public void fadeButton(ImageView button){
        //Mouse Over Button
        button.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                button.setOpacity(0.8); //Set Opacity to 0.8
                event.consume();
            }
        });
        //Mouse Exit Button
        button.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                button.setOpacity(1);   //Set Opacity to 1
                event.consume();
            }
        });
    }

    /** This method will add an EventHandler to an ImageView that is passed to it which <br/>
     * fades the button that is passed to it by setting opacity to 0.6<br/>
     * @param button button to be faded
     */
    public void fadeButtonMore(ImageView button){
        //Mouse Over Button
        button.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                button.setOpacity(0.6); //Set Opacity to 0.6
                event.consume();
            }
        });
        //Mouse Exit Button
        button.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                button.setOpacity(1);   //Set Opacity to 1
                event.consume();
            }
        });
    }

    /** This method shows images when hovering over them <br/>
     * This is used for images on the map in level 3 to display them when hovering over <br/>
     * @param button button to be faded
     */ 
    public void showOnHover(ImageView button){
        //Mouse Over Button
        button.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            //Show button
            @Override
            public void handle(MouseEvent event) {
                button.setOpacity(1);   //Set opacity to 1
                event.consume();
            }
        });
        //Mouse Exit Button
        button.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            //Hide button
            @Override
            public void handle(MouseEvent event) {
                button.setOpacity(0);   //Set opacity to 0
                event.consume();
            }
        });
    }
}
