package edu.indiana.cs.c212.paint.gui.panel;

import edu.indiana.cs.c212.paint.gui.Controls;
import edu.indiana.cs.c212.paint.gui.drawable.DrawableShape;
import edu.indiana.cs.c212.paint.gui.drawable.impl.DrawableRectangle;
import edu.indiana.cs.c212.paint.gui.drawable.impl.DrawableSquare;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@SuppressWarnings("serial")
public class ShapePanel extends JPanel {

    public static final String TICK_MARK = "\u2714";
    public static final String BLANK     = "   ";
    private ShapeType           shapeType;
    private List<ShapeType>     shapeTypeList;
    private List<JButton>       buttonList;
    private List<JLabel>        labelList;
    private ShapeButtonListener shapeButtonListener;
    private Controls            controls;

    public ShapePanel(Controls controls) {
        this.controls = controls;

        JPanel shapeBox = makeShapeBox("Shapes");
        shapeBox = addButtonsAndLabels(shapeBox);
        setDefaultShapeType();
        add(shapeBox);
    }

    public boolean isFreehand() {
        return (shapeType == ShapeType.NOSHAPE);
    }

    public DrawableShape getBrushShape(Point point) {
        return null;
        // return new DrawableCircle(point, controls.getPenWidth()); //FIXME
        // here's an interesting alternative: square brushes!
        // return new DrawableSquare(point, 2 * controls.getPenWidth());
    }

    public DrawableShape getShape(Point from, Point to) {
        DrawableShape shape = null;

        switch (shapeType) {
            case LINE: {
                // shape = new DrawableLine(from, to); //FIXME
                break;
            }
            case RECTANGLE: {
                shape = new DrawableRectangle(from, to);
                break;
            }
            case SQUARE: {
                shape = new DrawableSquare(from, to);
                break;
            }
            case ELLIPSE: {
                // shape = new DrawableEllipse(from, to);  //FIXME
                break;
            }
            case CIRCLE: {
                //shape = new DrawableCircle(from, to);  //FIXME
                break;
            }
        }

        return shape;
    }

    private JPanel makeShapeBox(String string) {
        JPanel panel = new JPanel();
        Border border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        TitledBorder title = BorderFactory.createTitledBorder(border, string);
        title.setTitleJustification(TitledBorder.CENTER);
        panel.setBorder(title);
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        return panel;
    }

    private JPanel addButtonsAndLabels(JPanel shapeBox) {
        shapeButtonListener = new ShapeButtonListener();
        shapeTypeList = new ArrayList<>();
        buttonList = new ArrayList<>();
        labelList = new ArrayList<>();
        for (ShapeType shapeType : ShapeType.values()) {
            JButton button = new JButton(shapeType.name());
            JLabel label = new JLabel(BLANK);
            JPanel panel = makeButtonPanel(button, label);
            shapeBox.add(panel);
            shapeTypeList.add(shapeType);
            buttonList.add(button);
            labelList.add(label);
        }

        return shapeBox;
    }

    private void setDefaultShapeType() {
        labelList.get(0).setText(TICK_MARK);
        shapeType = shapeTypeList.get(0);
    }

    private JPanel makeButtonPanel(JButton button, JLabel label) {
        button.addActionListener(shapeButtonListener);
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);

        return panel;
    }

    private enum ShapeType {
        NOSHAPE, LINE, RECTANGLE, SQUARE, ELLIPSE, CIRCLE
    }

    private class ShapeButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) {
            JButton clickedButton = (JButton) actionEvent.getSource();
            Iterator<JLabel> labelIterator = labelList.iterator();
            Iterator<ShapeType> shapeTypeIterator = shapeTypeList.iterator();
            for (JButton button : buttonList) {
                JLabel label = labelIterator.next();
                ShapeType buttonShapeType = shapeTypeIterator.next();
                label.setText(BLANK);
                if (button.equals(clickedButton)) {
                    label.setText(TICK_MARK);
                    shapeType = buttonShapeType;
                }
            }
        }
    }
}
