package lib.zj.office.fc.hslf.model;

import androidx.activity.s;
import lib.zj.office.fc.ddf.EscherArrayProperty;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherProperties;
import lib.zj.office.fc.ddf.EscherSimpleProperty;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.java.awt.geom.Point2D;

/* loaded from: classes3.dex */
public final class Polygon extends AutoShape {
    public Polygon(EscherContainerRecord escherContainerRecord, Shape shape) {
        super(escherContainerRecord, shape);
    }

    private float findBiggest(float[] fArr) {
        float f10 = Float.MIN_VALUE;
        for (float f11 : fArr) {
            if (f11 > f10) {
                f10 = f11;
            }
        }
        return f10;
    }

    private float findSmallest(float[] fArr) {
        float f10 = Float.MAX_VALUE;
        for (float f11 : fArr) {
            if (f11 < f10) {
                f10 = f11;
            }
        }
        return f10;
    }

    public void setPoints(float[] fArr, float[] fArr2) {
        float findBiggest = findBiggest(fArr);
        float findBiggest2 = findBiggest(fArr2);
        float findSmallest = findSmallest(fArr);
        float findSmallest2 = findSmallest(fArr2);
        EscherOptRecord escherOptRecord = (EscherOptRecord) s.F(this._escherContainer, -4085);
        escherOptRecord.addEscherProperty(new EscherSimpleProperty(EscherProperties.GEOMETRY__RIGHT, (int) (((findBiggest - findSmallest) * 72.0f) / 576.0f)));
        escherOptRecord.addEscherProperty(new EscherSimpleProperty(EscherProperties.GEOMETRY__BOTTOM, (int) (((findBiggest2 - findSmallest2) * 72.0f) / 576.0f)));
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr[i10] = fArr[i10] + (-findSmallest);
            fArr2[i10] = fArr2[i10] + (-findSmallest2);
        }
        int length = fArr.length;
        EscherArrayProperty escherArrayProperty = new EscherArrayProperty(EscherProperties.GEOMETRY__VERTICES, false, new byte[0]);
        int i11 = length + 1;
        escherArrayProperty.setNumberOfElementsInArray(i11);
        escherArrayProperty.setNumberOfElementsInMemory(i11);
        escherArrayProperty.setSizeOfElements(65520);
        for (int i12 = 0; i12 < length; i12++) {
            byte[] bArr = new byte[4];
            LittleEndian.putShort(bArr, 0, (short) ((fArr[i12] * 72.0f) / 576.0f));
            LittleEndian.putShort(bArr, 2, (short) ((fArr2[i12] * 72.0f) / 576.0f));
            escherArrayProperty.setElement(i12, bArr);
        }
        byte[] bArr2 = new byte[4];
        LittleEndian.putShort(bArr2, 0, (short) ((fArr[0] * 72.0f) / 576.0f));
        LittleEndian.putShort(bArr2, 2, (short) ((fArr2[0] * 72.0f) / 576.0f));
        escherArrayProperty.setElement(length, bArr2);
        escherOptRecord.addEscherProperty(escherArrayProperty);
        EscherArrayProperty escherArrayProperty2 = new EscherArrayProperty(EscherProperties.GEOMETRY__SEGMENTINFO, false, null);
        escherArrayProperty2.setSizeOfElements(2);
        int i13 = (length * 2) + 4;
        escherArrayProperty2.setNumberOfElementsInArray(i13);
        escherArrayProperty2.setNumberOfElementsInMemory(i13);
        escherArrayProperty2.setElement(0, new byte[]{0, 64});
        escherArrayProperty2.setElement(1, new byte[]{0, -84});
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = i14 * 2;
            escherArrayProperty2.setElement(i15 + 2, new byte[]{1, 0});
            escherArrayProperty2.setElement(i15 + 3, new byte[]{0, -84});
        }
        escherArrayProperty2.setElement(escherArrayProperty2.getNumberOfElementsInArray() - 2, new byte[]{1, 96});
        escherArrayProperty2.setElement(escherArrayProperty2.getNumberOfElementsInArray() - 1, new byte[]{0, Byte.MIN_VALUE});
        escherOptRecord.addEscherProperty(escherArrayProperty2);
        escherOptRecord.sortProperties();
    }

    public Polygon(Shape shape) {
        super((EscherContainerRecord) null, shape);
        this._escherContainer = createSpContainer(0, shape instanceof ShapeGroup);
    }

    public Polygon() {
        this(null);
    }

    public void setPoints(Point2D[] point2DArr) {
        float[] fArr = new float[point2DArr.length];
        float[] fArr2 = new float[point2DArr.length];
        for (int i10 = 0; i10 < point2DArr.length; i10++) {
            fArr[i10] = (float) point2DArr[i10].getX();
            fArr2[i10] = (float) point2DArr[i10].getY();
        }
        setPoints(fArr, fArr2);
    }
}
