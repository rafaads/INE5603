import java.awt.*;

/**
 * A square that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kolling and David J. Barnes / Alexandre Goncalves Silva
 * @version 1.0  (15 July 2000) / 1.0  (28 September 2015)
 */

public class Retangulo
{
    private Retangulo_ r;
    private String color;
    private boolean isVisible;
    private int temp;

    public Retangulo(double x1, double y1, double x2, double y2, String color, int temp)
    {
        r = new Retangulo_(x1, y1, x2, y2);
        this.color = color;
        isVisible = true;
        this.temp = temp;
        draw();
    }
    
    /**
     * Make this rectangles visible. If it was already visible, do nothing.
     */
    public void makeVisible()
    {
        isVisible = true;
        draw();
    }
    
    /**
     * Make this rectangles invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }
    
    /*
     * Draw the rectangle with current specifications on screen.
     */
    private void draw()
    {
        if (isVisible) {
            int h, w;
            Canvas canvas = Canvas.getCanvas();
            if (r != null) {
                h = Math.abs((int)r.y1 - (int)r.y2);
                w = Math.abs((int)r.x1 - (int)r.x2);
                canvas.draw(this, color, new Rectangle((int)r.x1, 300 - (int)r.y1, w, h));
            }          
            canvas.wait(this.temp);
        }
    }

    /*
     * Erase the square on screen.
     */
    private void erase()
    {
        if (isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}
