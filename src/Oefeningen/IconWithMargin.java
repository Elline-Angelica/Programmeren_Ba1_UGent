package Oefeningen;

import javax.swing.*;
import java.awt.*;

public class IconWithMargin implements Icon {

    private Icon icon;
    private int width;
    private int height;

    public IconWithMargin(Icon icon) {
        this.icon = icon;
        this.width = icon.getIconWidth();
        this.height = icon.getIconHeight();
    }

    public void paintIcon(Component c, Graphics g, int x, int y) {
        icon.paintIcon(c,g,
                x + (width-icon.getIconWidth())/2,
                y + (height-icon.getIconHeight())/2
        );
    }

    public int getIconWidth() {
        return width;
    }

    public int getIconHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
