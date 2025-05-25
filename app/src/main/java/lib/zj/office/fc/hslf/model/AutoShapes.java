package lib.zj.office.fc.hslf.model;

import androidx.activity.s;
import lib.zj.office.fc.ddf.EscherProperties;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.java.awt.b;
import lib.zj.office.java.awt.geom.AffineTransform;
import lib.zj.office.java.awt.geom.Arc2D;
import lib.zj.office.java.awt.geom.Ellipse2D;
import lib.zj.office.java.awt.geom.GeneralPath;
import lib.zj.office.java.awt.geom.Line2D;
import lib.zj.office.java.awt.geom.Rectangle2D;
import lib.zj.office.java.awt.geom.RoundRectangle2D;

/* loaded from: classes3.dex */
public final class AutoShapes {
    protected static ShapeOutline[] shapes;

    static {
        ShapeOutline[] shapeOutlineArr = new ShapeOutline[FunctionEval.FunctionID.EXTERNAL_FUNC];
        shapes = shapeOutlineArr;
        shapeOutlineArr[1] = new ShapeOutline() { // from class: lib.zj.office.fc.hslf.model.AutoShapes.1
            @Override // lib.zj.office.fc.hslf.model.ShapeOutline
            public b getOutline(Shape shape) {
                return new Rectangle2D.Float(0.0f, 0.0f, 21600.0f, 21600.0f);
            }
        };
        shapes[2] = new ShapeOutline() { // from class: lib.zj.office.fc.hslf.model.AutoShapes.2
            @Override // lib.zj.office.fc.hslf.model.ShapeOutline
            public b getOutline(Shape shape) {
                float G = s.G(shape.getSpContainer(), EscherProperties.GEOMETRY__ADJUSTVALUE, 5400);
                return new RoundRectangle2D.Float(0.0f, 0.0f, 21600.0f, 21600.0f, G, G);
            }
        };
        shapes[3] = new ShapeOutline() { // from class: lib.zj.office.fc.hslf.model.AutoShapes.3
            @Override // lib.zj.office.fc.hslf.model.ShapeOutline
            public b getOutline(Shape shape) {
                return new Ellipse2D.Float(0.0f, 0.0f, 21600.0f, 21600.0f);
            }
        };
        shapes[4] = new ShapeOutline() { // from class: lib.zj.office.fc.hslf.model.AutoShapes.4
            @Override // lib.zj.office.fc.hslf.model.ShapeOutline
            public b getOutline(Shape shape) {
                GeneralPath generalPath = new GeneralPath();
                generalPath.moveTo(10800.0f, 0.0f);
                generalPath.lineTo(21600.0f, 10800.0f);
                generalPath.lineTo(10800.0f, 21600.0f);
                generalPath.lineTo(0.0f, 10800.0f);
                generalPath.closePath();
                return generalPath;
            }
        };
        shapes[203] = new ShapeOutline() { // from class: lib.zj.office.fc.hslf.model.AutoShapes.5
            @Override // lib.zj.office.fc.hslf.model.ShapeOutline
            public b getOutline(Shape shape) {
                int G = s.G(shape.getSpContainer(), EscherProperties.GEOMETRY__ADJUSTVALUE, 10800);
                GeneralPath generalPath = new GeneralPath();
                generalPath.moveTo(G, 0.0f);
                generalPath.lineTo(0.0f, 21600.0f);
                generalPath.lineTo(21600.0f, 21600.0f);
                generalPath.closePath();
                return generalPath;
            }
        };
        shapes[204] = new ShapeOutline() { // from class: lib.zj.office.fc.hslf.model.AutoShapes.6
            @Override // lib.zj.office.fc.hslf.model.ShapeOutline
            public b getOutline(Shape shape) {
                GeneralPath generalPath = new GeneralPath();
                generalPath.moveTo(0.0f, 0.0f);
                generalPath.lineTo(21600.0f, 21600.0f);
                generalPath.lineTo(0.0f, 21600.0f);
                generalPath.closePath();
                return generalPath;
            }
        };
        shapes[7] = new ShapeOutline() { // from class: lib.zj.office.fc.hslf.model.AutoShapes.7
            @Override // lib.zj.office.fc.hslf.model.ShapeOutline
            public b getOutline(Shape shape) {
                int G = s.G(shape.getSpContainer(), EscherProperties.GEOMETRY__ADJUSTVALUE, 5400);
                GeneralPath generalPath = new GeneralPath();
                generalPath.moveTo(G, 0.0f);
                generalPath.lineTo(21600.0f, 0.0f);
                generalPath.lineTo(21600 - G, 21600.0f);
                generalPath.lineTo(0.0f, 21600.0f);
                generalPath.closePath();
                return generalPath;
            }
        };
        shapes[8] = new ShapeOutline() { // from class: lib.zj.office.fc.hslf.model.AutoShapes.8
            @Override // lib.zj.office.fc.hslf.model.ShapeOutline
            public b getOutline(Shape shape) {
                int G = s.G(shape.getSpContainer(), EscherProperties.GEOMETRY__ADJUSTVALUE, 5400);
                GeneralPath generalPath = new GeneralPath();
                generalPath.moveTo(0.0f, 0.0f);
                generalPath.lineTo(G, 21600.0f);
                generalPath.lineTo(21600 - G, 21600.0f);
                generalPath.lineTo(21600.0f, 0.0f);
                generalPath.closePath();
                return generalPath;
            }
        };
        shapes[9] = new ShapeOutline() { // from class: lib.zj.office.fc.hslf.model.AutoShapes.9
            @Override // lib.zj.office.fc.hslf.model.ShapeOutline
            public b getOutline(Shape shape) {
                int G = s.G(shape.getSpContainer(), EscherProperties.GEOMETRY__ADJUSTVALUE, 5400);
                GeneralPath generalPath = new GeneralPath();
                float f10 = G;
                generalPath.moveTo(f10, 0.0f);
                float f11 = 21600 - G;
                generalPath.lineTo(f11, 0.0f);
                generalPath.lineTo(21600.0f, 10800.0f);
                generalPath.lineTo(f11, 21600.0f);
                generalPath.lineTo(f10, 21600.0f);
                generalPath.lineTo(0.0f, 10800.0f);
                generalPath.closePath();
                return generalPath;
            }
        };
        shapes[10] = new ShapeOutline() { // from class: lib.zj.office.fc.hslf.model.AutoShapes.10
            @Override // lib.zj.office.fc.hslf.model.ShapeOutline
            public b getOutline(Shape shape) {
                int G = s.G(shape.getSpContainer(), EscherProperties.GEOMETRY__ADJUSTVALUE, 6326);
                GeneralPath generalPath = new GeneralPath();
                float f10 = G;
                generalPath.moveTo(f10, 0.0f);
                float f11 = 21600 - G;
                generalPath.lineTo(f11, 0.0f);
                generalPath.lineTo(21600.0f, f10);
                generalPath.lineTo(21600.0f, f11);
                generalPath.lineTo(f11, 21600.0f);
                generalPath.lineTo(f10, 21600.0f);
                generalPath.lineTo(0.0f, f11);
                generalPath.lineTo(0.0f, f10);
                generalPath.closePath();
                return generalPath;
            }
        };
        shapes[11] = new ShapeOutline() { // from class: lib.zj.office.fc.hslf.model.AutoShapes.11
            @Override // lib.zj.office.fc.hslf.model.ShapeOutline
            public b getOutline(Shape shape) {
                int G = s.G(shape.getSpContainer(), EscherProperties.GEOMETRY__ADJUSTVALUE, 5400);
                GeneralPath generalPath = new GeneralPath();
                float f10 = G;
                generalPath.moveTo(f10, 0.0f);
                float f11 = 21600 - G;
                generalPath.lineTo(f11, 0.0f);
                generalPath.lineTo(f11, f10);
                generalPath.lineTo(21600.0f, f10);
                generalPath.lineTo(21600.0f, f11);
                generalPath.lineTo(f11, f11);
                generalPath.lineTo(f11, 21600.0f);
                generalPath.lineTo(f10, 21600.0f);
                generalPath.lineTo(f10, f11);
                generalPath.lineTo(0.0f, f11);
                generalPath.lineTo(0.0f, f10);
                generalPath.lineTo(f10, f10);
                generalPath.closePath();
                return generalPath;
            }
        };
        shapes[56] = new ShapeOutline() { // from class: lib.zj.office.fc.hslf.model.AutoShapes.12
            @Override // lib.zj.office.fc.hslf.model.ShapeOutline
            public b getOutline(Shape shape) {
                GeneralPath generalPath = new GeneralPath();
                generalPath.moveTo(10800.0f, 0.0f);
                generalPath.lineTo(21600.0f, 8259.0f);
                generalPath.lineTo(17400.0f, 21600.0f);
                generalPath.lineTo(4200.0f, 21600.0f);
                generalPath.lineTo(0.0f, 8259.0f);
                generalPath.closePath();
                return generalPath;
            }
        };
        shapes[67] = new ShapeOutline() { // from class: lib.zj.office.fc.hslf.model.AutoShapes.13
            @Override // lib.zj.office.fc.hslf.model.ShapeOutline
            public b getOutline(Shape shape) {
                int G = s.G(shape.getSpContainer(), EscherProperties.GEOMETRY__ADJUSTVALUE, 16200);
                int G2 = s.G(shape.getSpContainer(), EscherProperties.GEOMETRY__ADJUST2VALUE, 5400);
                GeneralPath generalPath = new GeneralPath();
                float f10 = G;
                generalPath.moveTo(0.0f, f10);
                float f11 = G2;
                generalPath.lineTo(f11, f10);
                generalPath.lineTo(f11, 0.0f);
                float f12 = 21600 - G2;
                generalPath.lineTo(f12, 0.0f);
                generalPath.lineTo(f12, f10);
                generalPath.lineTo(21600.0f, f10);
                generalPath.lineTo(10800.0f, 21600.0f);
                generalPath.closePath();
                return generalPath;
            }
        };
        shapes[68] = new ShapeOutline() { // from class: lib.zj.office.fc.hslf.model.AutoShapes.14
            @Override // lib.zj.office.fc.hslf.model.ShapeOutline
            public b getOutline(Shape shape) {
                int G = s.G(shape.getSpContainer(), EscherProperties.GEOMETRY__ADJUSTVALUE, 5400);
                int G2 = s.G(shape.getSpContainer(), EscherProperties.GEOMETRY__ADJUST2VALUE, 5400);
                GeneralPath generalPath = new GeneralPath();
                float f10 = G;
                generalPath.moveTo(0.0f, f10);
                float f11 = G2;
                generalPath.lineTo(f11, f10);
                generalPath.lineTo(f11, 21600.0f);
                float f12 = 21600 - G2;
                generalPath.lineTo(f12, 21600.0f);
                generalPath.lineTo(f12, f10);
                generalPath.lineTo(21600.0f, f10);
                generalPath.lineTo(10800.0f, 0.0f);
                generalPath.closePath();
                return generalPath;
            }
        };
        shapes[205] = new ShapeOutline() { // from class: lib.zj.office.fc.hslf.model.AutoShapes.15
            @Override // lib.zj.office.fc.hslf.model.ShapeOutline
            public b getOutline(Shape shape) {
                int G = s.G(shape.getSpContainer(), EscherProperties.GEOMETRY__ADJUSTVALUE, 16200);
                int G2 = s.G(shape.getSpContainer(), EscherProperties.GEOMETRY__ADJUST2VALUE, 5400);
                GeneralPath generalPath = new GeneralPath();
                float f10 = G;
                generalPath.moveTo(f10, 0.0f);
                float f11 = G2;
                generalPath.lineTo(f10, f11);
                generalPath.lineTo(0.0f, f11);
                float f12 = 21600 - G2;
                generalPath.lineTo(0.0f, f12);
                generalPath.lineTo(f10, f12);
                generalPath.lineTo(f10, 21600.0f);
                generalPath.lineTo(21600.0f, 10800.0f);
                generalPath.closePath();
                return generalPath;
            }
        };
        shapes[66] = new ShapeOutline() { // from class: lib.zj.office.fc.hslf.model.AutoShapes.16
            @Override // lib.zj.office.fc.hslf.model.ShapeOutline
            public b getOutline(Shape shape) {
                int G = s.G(shape.getSpContainer(), EscherProperties.GEOMETRY__ADJUSTVALUE, 5400);
                int G2 = s.G(shape.getSpContainer(), EscherProperties.GEOMETRY__ADJUST2VALUE, 5400);
                GeneralPath generalPath = new GeneralPath();
                float f10 = G;
                generalPath.moveTo(f10, 0.0f);
                float f11 = G2;
                generalPath.lineTo(f10, f11);
                generalPath.lineTo(21600.0f, f11);
                float f12 = 21600 - G2;
                generalPath.lineTo(21600.0f, f12);
                generalPath.lineTo(f10, f12);
                generalPath.lineTo(f10, 21600.0f);
                generalPath.lineTo(0.0f, 10800.0f);
                generalPath.closePath();
                return generalPath;
            }
        };
        shapes[22] = new ShapeOutline() { // from class: lib.zj.office.fc.hslf.model.AutoShapes.17
            @Override // lib.zj.office.fc.hslf.model.ShapeOutline
            public b getOutline(Shape shape) {
                int G = s.G(shape.getSpContainer(), EscherProperties.GEOMETRY__ADJUSTVALUE, 5400);
                GeneralPath generalPath = new GeneralPath();
                float f10 = G;
                generalPath.append((b) new Arc2D.Float(0.0f, 0.0f, 21600.0f, f10, 0.0f, 180.0f, 0), false);
                int i10 = G / 2;
                float f11 = i10;
                generalPath.moveTo(0.0f, f11);
                float f12 = 21600 - i10;
                generalPath.lineTo(0.0f, f12);
                generalPath.closePath();
                generalPath.append((b) new Arc2D.Float(0.0f, 21600 - G, 21600.0f, f10, 180.0f, 180.0f, 0), false);
                generalPath.moveTo(21600.0f, f12);
                generalPath.lineTo(21600.0f, f11);
                generalPath.append((b) new Arc2D.Float(0.0f, 0.0f, 21600.0f, f10, 180.0f, 180.0f, 0), false);
                generalPath.moveTo(0.0f, f11);
                generalPath.closePath();
                return generalPath;
            }
        };
        shapes[87] = new ShapeOutline() { // from class: lib.zj.office.fc.hslf.model.AutoShapes.18
            @Override // lib.zj.office.fc.hslf.model.ShapeOutline
            public b getOutline(Shape shape) {
                int i10;
                int G = s.G(shape.getSpContainer(), EscherProperties.GEOMETRY__ADJUSTVALUE, 1800);
                int G2 = s.G(shape.getSpContainer(), EscherProperties.GEOMETRY__ADJUST2VALUE, 10800);
                GeneralPath generalPath = new GeneralPath();
                generalPath.moveTo(21600.0f, 0.0f);
                float f10 = G * 2;
                generalPath.append((b) new Arc2D.Float(10800.0f, 0.0f, 21600.0f, f10, 90.0f, 90.0f, 0), false);
                generalPath.moveTo(10800.0f, G);
                generalPath.lineTo(10800.0f, G2 - G);
                generalPath.append((b) new Arc2D.Float(-10800.0f, G2 - i10, 21600.0f, f10, 270.0f, 90.0f, 0), false);
                float f11 = G2;
                generalPath.moveTo(0.0f, f11);
                generalPath.append((b) new Arc2D.Float(-10800.0f, f11, 21600.0f, f10, 0.0f, 90.0f, 0), false);
                generalPath.moveTo(10800.0f, G2 + G);
                generalPath.lineTo(10800.0f, 21600 - G);
                generalPath.append((b) new Arc2D.Float(10800.0f, 21600 - i10, 21600.0f, f10, 180.0f, 90.0f, 0), false);
                return generalPath;
            }
        };
        shapes[88] = new ShapeOutline() { // from class: lib.zj.office.fc.hslf.model.AutoShapes.19
            @Override // lib.zj.office.fc.hslf.model.ShapeOutline
            public b getOutline(Shape shape) {
                int i10;
                int G = s.G(shape.getSpContainer(), EscherProperties.GEOMETRY__ADJUSTVALUE, 1800);
                int G2 = s.G(shape.getSpContainer(), EscherProperties.GEOMETRY__ADJUST2VALUE, 10800);
                GeneralPath generalPath = new GeneralPath();
                generalPath.moveTo(0.0f, 0.0f);
                float f10 = G * 2;
                generalPath.append((b) new Arc2D.Float(-10800.0f, 0.0f, 21600.0f, f10, 0.0f, 90.0f, 0), false);
                generalPath.moveTo(10800.0f, G);
                generalPath.lineTo(10800.0f, G2 - G);
                generalPath.append((b) new Arc2D.Float(10800.0f, G2 - i10, 21600.0f, f10, 180.0f, 90.0f, 0), false);
                float f11 = G2;
                generalPath.moveTo(21600.0f, f11);
                generalPath.append((b) new Arc2D.Float(10800.0f, f11, 21600.0f, f10, 90.0f, 90.0f, 0), false);
                generalPath.moveTo(10800.0f, G2 + G);
                generalPath.lineTo(10800.0f, 21600 - G);
                generalPath.append((b) new Arc2D.Float(-10800.0f, 21600 - i10, 21600.0f, f10, 270.0f, 90.0f, 0), false);
                return generalPath;
            }
        };
        shapes[32] = new ShapeOutline() { // from class: lib.zj.office.fc.hslf.model.AutoShapes.20
            @Override // lib.zj.office.fc.hslf.model.ShapeOutline
            public b getOutline(Shape shape) {
                return new Line2D.Float(0.0f, 0.0f, 21600.0f, 21600.0f);
            }
        };
    }

    public static ShapeOutline getShapeOutline(int i10) {
        return shapes[i10];
    }

    public static b transform(b bVar, Rectangle2D rectangle2D) {
        AffineTransform affineTransform = new AffineTransform();
        affineTransform.translate(rectangle2D.getX(), rectangle2D.getY());
        affineTransform.scale(rectangle2D.getWidth() * 4.6296296204673126E-5d, rectangle2D.getHeight() * 4.6296296204673126E-5d);
        return affineTransform.createTransformedShape(bVar);
    }
}
