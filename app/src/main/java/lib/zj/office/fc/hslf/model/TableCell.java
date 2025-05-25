package lib.zj.office.fc.hslf.model;

import androidx.activity.s;
import b.a;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherProperties;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.java.awt.geom.Rectangle2D;

/* loaded from: classes3.dex */
public final class TableCell extends TextBox {
    protected static final int DEFAULT_HEIGHT = 40;
    protected static final int DEFAULT_WIDTH = 100;
    private Line borderBottom;
    private Line borderLeft;
    private Line borderRight;
    private Line borderTop;

    public TableCell(EscherContainerRecord escherContainerRecord, Shape shape) {
        super(escherContainerRecord, shape);
    }

    public void anchorBorder(int i10, Line line) {
        Rectangle anchor = getAnchor();
        Rectangle rectangle = new Rectangle();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        rectangle.f20688x = anchor.f20688x;
                        rectangle.f20689y = anchor.f20689y;
                        rectangle.width = 0;
                        rectangle.height = anchor.height;
                    } else {
                        throw new IllegalArgumentException(a.c("Unknown border type: ", i10));
                    }
                } else {
                    rectangle.f20688x = anchor.f20688x;
                    rectangle.f20689y = anchor.f20689y + anchor.height;
                    rectangle.width = anchor.width;
                    rectangle.height = 0;
                }
            } else {
                rectangle.f20688x = anchor.f20688x + anchor.width;
                rectangle.f20689y = anchor.f20689y;
                rectangle.width = 0;
                rectangle.height = anchor.height;
            }
        } else {
            rectangle.f20688x = anchor.f20688x;
            rectangle.f20689y = anchor.f20689y;
            rectangle.width = anchor.width;
            rectangle.height = 0;
        }
        line.setAnchor(rectangle);
    }

    @Override // lib.zj.office.fc.hslf.model.TextBox, lib.zj.office.fc.hslf.model.SimpleShape, lib.zj.office.fc.hslf.model.Shape
    public EscherContainerRecord createSpContainer(boolean z10) {
        EscherContainerRecord createSpContainer = super.createSpContainer(z10);
        this._escherContainer = createSpContainer;
        EscherOptRecord escherOptRecord = (EscherOptRecord) s.F(createSpContainer, -4085);
        Shape.setEscherProperty(escherOptRecord, (short) 128, 0);
        Shape.setEscherProperty(escherOptRecord, EscherProperties.TEXT__SIZE_TEXT_TO_FIT_SHAPE, 131072);
        Shape.setEscherProperty(escherOptRecord, EscherProperties.FILL__NOFILLHITTEST, 1376257);
        Shape.setEscherProperty(escherOptRecord, EscherProperties.SHADOWSTYLE__SHADOWOBSURED, 131072);
        Shape.setEscherProperty(escherOptRecord, EscherProperties.PROTECTION__LOCKAGAINSTGROUPING, 262144);
        return this._escherContainer;
    }

    public Line getBorderBottom() {
        return this.borderBottom;
    }

    public Line getBorderLeft() {
        return this.borderLeft;
    }

    public Line getBorderRight() {
        return this.borderRight;
    }

    public Line getBorderTop() {
        return this.borderTop;
    }

    public void setAnchor(Rectangle rectangle) {
        super.setAnchor((Rectangle2D) rectangle);
        Line line = this.borderTop;
        if (line != null) {
            anchorBorder(1, line);
        }
        Line line2 = this.borderRight;
        if (line2 != null) {
            anchorBorder(2, line2);
        }
        Line line3 = this.borderBottom;
        if (line3 != null) {
            anchorBorder(3, line3);
        }
        Line line4 = this.borderLeft;
        if (line4 != null) {
            anchorBorder(4, line4);
        }
    }

    public void setBorderBottom(Line line) {
        if (line != null) {
            anchorBorder(3, line);
        }
        this.borderBottom = line;
    }

    public void setBorderLeft(Line line) {
        if (line != null) {
            anchorBorder(4, line);
        }
        this.borderLeft = line;
    }

    public void setBorderRight(Line line) {
        if (line != null) {
            anchorBorder(2, line);
        }
        this.borderRight = line;
    }

    public void setBorderTop(Line line) {
        if (line != null) {
            anchorBorder(1, line);
        }
        this.borderTop = line;
    }

    public TableCell(Shape shape) {
        super(shape);
        setShapeType(1);
    }
}
