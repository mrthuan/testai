package lib.zj.office.fc.hssf.usermodel;

import androidx.activity.s;
import di.e;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherSimpleProperty;
import lib.zj.office.java.awt.Color;

/* loaded from: classes3.dex */
public class HSSFSimpleShape extends HSSFShape {
    public static final short OBJECT_TYPE_COMBO_BOX = 20;
    public static final short OBJECT_TYPE_COMMENT = 25;
    public static final short OBJECT_TYPE_LINE = 1;
    public static final short OBJECT_TYPE_OVAL = 3;
    public static final short OBJECT_TYPE_PICTURE = 8;
    public static final short OBJECT_TYPE_RECTANGLE = 2;

    public HSSFSimpleShape(EscherContainerRecord escherContainerRecord, HSSFShape hSSFShape, HSSFAnchor hSSFAnchor) {
        super(escherContainerRecord, hSSFShape, hSSFAnchor);
    }

    public void processArrow(EscherContainerRecord escherContainerRecord) {
        int i10;
        EscherSimpleProperty escherSimpleProperty;
        EscherOptRecord escherOptRecord = (EscherOptRecord) s.F(escherContainerRecord, -4085);
        if (escherOptRecord != null && (escherSimpleProperty = (EscherSimpleProperty) s.H(escherOptRecord, 464)) != null) {
            i10 = escherSimpleProperty.getPropertyValue();
        } else {
            i10 = 0;
        }
        setStartArrow((byte) i10, s.a0(escherContainerRecord), s.Y(escherContainerRecord));
        setEndArrow((byte) s.D(escherContainerRecord), s.E(escherContainerRecord), s.B(escherContainerRecord));
    }

    public void processLine(EscherContainerRecord escherContainerRecord, e eVar) {
        int propertyValue;
        if (s.h0(escherContainerRecord)) {
            Color S = s.S(escherContainerRecord, eVar, 1);
            if (S != null) {
                setLineStyleColor(S.getRGB());
            } else {
                setNoBorder(true);
            }
            EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) s.H((EscherOptRecord) s.F(escherContainerRecord, -4085), 462);
            if (escherSimpleProperty == null) {
                propertyValue = 0;
            } else {
                propertyValue = escherSimpleProperty.getPropertyValue();
            }
            setLineStyle(propertyValue);
            return;
        }
        setNoBorder(true);
    }

    public void processRotationAndFlip(EscherContainerRecord escherContainerRecord) {
        setRotation((s.G(escherContainerRecord, (short) 4, 0) >> 16) % 360);
        setFilpH(s.M(escherContainerRecord));
        setFlipV(s.N(escherContainerRecord));
    }
}
