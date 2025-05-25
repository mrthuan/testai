package lib.zj.office.fc.hslf.model;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.activity.s;
import java.util.ArrayList;
import java.util.Arrays;
import lib.zj.office.fc.ddf.EscherArrayProperty;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherProperties;
import lib.zj.office.fc.ddf.EscherSimpleProperty;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.java.awt.b;
import lib.zj.office.java.awt.geom.AffineTransform;
import lib.zj.office.java.awt.geom.GeneralPath;
import lib.zj.office.java.awt.geom.Point2D;
import lib.zj.office.java.awt.geom.Rectangle2D;
import lib.zj.office.java.awt.geom.p;
import ug.a;

/* loaded from: classes3.dex */
public final class Freeform extends AutoShape {
    public static final byte[] SEGMENTINFO_MOVETO = {0, 64};
    public static final byte[] SEGMENTINFO_LINETO = {0, -84};
    public static final byte[] SEGMENTINFO_LINETO2 = {0, -80};
    public static final byte[] SEGMENTINFO_ESCAPE = {1, 0};
    public static final byte[] SEGMENTINFO_ESCAPE1 = {3, 0};
    public static final byte[] SEGMENTINFO_ESCAPE2 = {1, 32};
    public static final byte[] SEGMENTINFO_CUBICTO = {0, -83};
    public static final byte[] SEGMENTINFO_CUBICTO1 = {0, -81};
    public static final byte[] SEGMENTINFO_CUBICTO2 = {0, -77};
    public static final byte[] SEGMENTINFO_CLOSE = {1, 96};
    public static final byte[] SEGMENTINFO_END = {0, Byte.MIN_VALUE};

    public Freeform(EscherContainerRecord escherContainerRecord, Shape shape) {
        super(escherContainerRecord, shape);
    }

    @Override // lib.zj.office.fc.hslf.model.AutoShape, lib.zj.office.fc.hslf.model.TextShape, lib.zj.office.fc.hslf.model.SimpleShape, lib.zj.office.fc.hslf.model.Shape
    public void dispose() {
        super.dispose();
    }

    public a getEndArrowPathAndTail(Rectangle rectangle) {
        return s.C(this._escherContainer, rectangle);
    }

    public Path[] getFreeformPath(Rectangle rectangle, PointF pointF, byte b10, PointF pointF2, byte b11) {
        return s.P(getSpContainer(), rectangle, pointF, b10, pointF2, b11);
    }

    @Override // lib.zj.office.fc.hslf.model.AutoShape, lib.zj.office.fc.hslf.model.Shape
    public b getOutline() {
        GeneralPath path = getPath();
        Rectangle2D anchor2D = getAnchor2D();
        Rectangle2D bounds2D = path.getBounds2D();
        AffineTransform affineTransform = new AffineTransform();
        affineTransform.translate(anchor2D.getX(), anchor2D.getY());
        affineTransform.scale(anchor2D.getWidth() / bounds2D.getWidth(), anchor2D.getHeight() / bounds2D.getHeight());
        return affineTransform.createTransformedShape(path);
    }

    public GeneralPath getPath() {
        int i10;
        EscherOptRecord escherOptRecord = (EscherOptRecord) s.F(this._escherContainer, -4085);
        escherOptRecord.addEscherProperty(new EscherSimpleProperty(EscherProperties.GEOMETRY__SHAPEPATH, 4));
        EscherArrayProperty escherArrayProperty = (EscherArrayProperty) s.H(escherOptRecord, 16709);
        if (escherArrayProperty == null) {
            escherArrayProperty = (EscherArrayProperty) s.H(escherOptRecord, 325);
        }
        EscherArrayProperty escherArrayProperty2 = (EscherArrayProperty) s.H(escherOptRecord, 16710);
        if (escherArrayProperty2 == null) {
            escherArrayProperty2 = (EscherArrayProperty) s.H(escherOptRecord, 326);
        }
        if (escherArrayProperty == null || escherArrayProperty2 == null) {
            return null;
        }
        GeneralPath generalPath = new GeneralPath();
        int numberOfElementsInArray = escherArrayProperty.getNumberOfElementsInArray();
        int numberOfElementsInArray2 = escherArrayProperty2.getNumberOfElementsInArray();
        int i11 = 0;
        int i12 = 0;
        while (i11 < numberOfElementsInArray2 && i12 < numberOfElementsInArray) {
            byte[] element = escherArrayProperty2.getElement(i11);
            if (Arrays.equals(element, s.f1852g)) {
                i10 = i12 + 1;
                byte[] element2 = escherArrayProperty.getElement(i12);
                generalPath.moveTo((LittleEndian.getShort(element2, 0) * 72.0f) / 576.0f, (LittleEndian.getShort(element2, 2) * 72.0f) / 576.0f);
            } else {
                if (!Arrays.equals(element, s.f1858m) && !Arrays.equals(element, s.f1860o)) {
                    if (Arrays.equals(element, s.f1853h)) {
                        i11++;
                        byte[] element3 = escherArrayProperty2.getElement(i11);
                        if (Arrays.equals(element3, s.f1855j)) {
                            i10 = i12 + 1;
                            if (i10 < numberOfElementsInArray) {
                                byte[] element4 = escherArrayProperty.getElement(i12);
                                generalPath.lineTo((LittleEndian.getShort(element4, 0) * 72.0f) / 576.0f, (LittleEndian.getShort(element4, 2) * 72.0f) / 576.0f);
                            }
                        } else if (Arrays.equals(element3, s.f1861p)) {
                            generalPath.closePath();
                        }
                    }
                } else {
                    int i13 = i11 + 1;
                    int i14 = i12 + 1;
                    byte[] element5 = escherArrayProperty.getElement(i12);
                    short s4 = LittleEndian.getShort(element5, 0);
                    short s10 = LittleEndian.getShort(element5, 2);
                    int i15 = i14 + 1;
                    byte[] element6 = escherArrayProperty.getElement(i14);
                    short s11 = LittleEndian.getShort(element6, 0);
                    short s12 = LittleEndian.getShort(element6, 2);
                    int i16 = i15 + 1;
                    byte[] element7 = escherArrayProperty.getElement(i15);
                    generalPath.curveTo((s4 * 72.0f) / 576.0f, (s10 * 72.0f) / 576.0f, (s11 * 72.0f) / 576.0f, (s12 * 72.0f) / 576.0f, (LittleEndian.getShort(element7, 0) * 72.0f) / 576.0f, (LittleEndian.getShort(element7, 2) * 72.0f) / 576.0f);
                    i11 = i13;
                    i12 = i16;
                }
                i11++;
            }
            i12 = i10;
            i11++;
        }
        return generalPath;
    }

    public a getStartArrowPathAndTail(Rectangle rectangle) {
        return s.Z(this._escherContainer, rectangle);
    }

    public void setPath(GeneralPath generalPath) {
        byte[] bArr;
        Rectangle2D bounds2D = generalPath.getBounds2D();
        p pathIterator = generalPath.getPathIterator(new AffineTransform());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z10 = false;
        while (true) {
            boolean isDone = pathIterator.isDone();
            bArr = s.f1853h;
            if (isDone) {
                break;
            }
            double[] dArr = new double[6];
            int a10 = pathIterator.a(dArr);
            if (a10 != 0) {
                byte[] bArr2 = s.f1855j;
                if (a10 != 1) {
                    if (a10 != 3) {
                        if (a10 == 4) {
                            arrayList2.add((Point2D.Double) arrayList2.get(0));
                            arrayList.add(bArr);
                            arrayList.add(bArr2);
                            arrayList.add(bArr);
                            arrayList.add(s.f1861p);
                            z10 = true;
                        }
                    } else {
                        arrayList2.add(new Point2D.Double(dArr[0], dArr[1]));
                        arrayList2.add(new Point2D.Double(dArr[2], dArr[3]));
                        arrayList2.add(new Point2D.Double(dArr[4], dArr[5]));
                        arrayList.add(s.f1858m);
                        arrayList.add(s.f1857l);
                    }
                } else {
                    arrayList2.add(new Point2D.Double(dArr[0], dArr[1]));
                    arrayList.add(bArr);
                    arrayList.add(bArr2);
                }
            } else {
                arrayList2.add(new Point2D.Double(dArr[0], dArr[1]));
                arrayList.add(s.f1852g);
            }
            pathIterator.next();
        }
        if (!z10) {
            arrayList.add(bArr);
        }
        arrayList.add(new byte[]{0, Byte.MIN_VALUE});
        EscherOptRecord escherOptRecord = (EscherOptRecord) s.F(this._escherContainer, -4085);
        escherOptRecord.addEscherProperty(new EscherSimpleProperty(EscherProperties.GEOMETRY__SHAPEPATH, 4));
        EscherArrayProperty escherArrayProperty = new EscherArrayProperty((short) 16709, false, null);
        escherArrayProperty.setNumberOfElementsInArray(arrayList2.size());
        escherArrayProperty.setNumberOfElementsInMemory(arrayList2.size());
        escherArrayProperty.setSizeOfElements(65520);
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Point2D.Double r10 = (Point2D.Double) arrayList2.get(i10);
            byte[] bArr3 = new byte[4];
            LittleEndian.putShort(bArr3, 0, (short) (((r10.getX() - bounds2D.getX()) * 576.0d) / 72.0d));
            LittleEndian.putShort(bArr3, 2, (short) (((r10.getY() - bounds2D.getY()) * 576.0d) / 72.0d));
            escherArrayProperty.setElement(i10, bArr3);
        }
        escherOptRecord.addEscherProperty(escherArrayProperty);
        EscherArrayProperty escherArrayProperty2 = new EscherArrayProperty((short) 16710, false, null);
        escherArrayProperty2.setNumberOfElementsInArray(arrayList.size());
        escherArrayProperty2.setNumberOfElementsInMemory(arrayList.size());
        escherArrayProperty2.setSizeOfElements(2);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            escherArrayProperty2.setElement(i11, (byte[]) arrayList.get(i11));
        }
        escherOptRecord.addEscherProperty(escherArrayProperty2);
        escherOptRecord.addEscherProperty(new EscherSimpleProperty(EscherProperties.GEOMETRY__RIGHT, (int) ((bounds2D.getWidth() * 576.0d) / 72.0d)));
        escherOptRecord.addEscherProperty(new EscherSimpleProperty(EscherProperties.GEOMETRY__BOTTOM, (int) ((bounds2D.getHeight() * 576.0d) / 72.0d)));
        escherOptRecord.sortProperties();
        setAnchor(bounds2D);
    }

    public Freeform(Shape shape) {
        super((EscherContainerRecord) null, shape);
        this._escherContainer = createSpContainer(0, shape instanceof ShapeGroup);
    }

    public Freeform() {
        this(null);
    }
}
