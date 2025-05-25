package lib.zj.office.fc.hslf.model;

import androidx.activity.s;
import java.util.List;
import lib.zj.office.fc.ddf.EscherBSERecord;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherProperties;
import lib.zj.office.fc.ddf.EscherProperty;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.ddf.EscherSimpleProperty;
import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.hslf.usermodel.PictureData;
import lib.zj.office.fc.hslf.usermodel.SlideShow;
import lib.zj.office.java.awt.Color;

/* loaded from: classes3.dex */
public final class Fill {
    protected Shape shape;

    public Fill(Shape shape) {
        this.shape = shape;
    }

    public int getFillAngle() {
        return s.I(this.shape.getSpContainer());
    }

    public int getFillFocus() {
        return s.J(this.shape.getSpContainer());
    }

    public int getFillType() {
        return s.K(this.shape.getSpContainer());
    }

    public Color getFillbackColor() {
        return s.L(this.shape.getSpContainer(), this.shape.getSheet(), 2);
    }

    public Color getForegroundColor() {
        return s.O(this.shape.getSpContainer(), this.shape.getSheet(), 2);
    }

    public PictureData getPictureData() {
        EscherProperty H = s.H((EscherOptRecord) s.F(this.shape.getSpContainer(), -4085), 390);
        if (H != null && (H instanceof EscherSimpleProperty)) {
            EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) H;
            SlideShow slideShow = this.shape.getSheet().getSlideShow();
            PictureData[] pictureData = slideShow.getPictureData();
            EscherContainerRecord escherContainerRecord = (EscherContainerRecord) s.F(slideShow.getDocumentRecord().getPPDrawingGroup().getDggContainer(), -4095);
            if (escherContainerRecord != null) {
                List<EscherRecord> childRecords = escherContainerRecord.getChildRecords();
                int propertyValue = escherSimpleProperty.getPropertyValue() & Variant.VT_ILLEGAL;
                if (propertyValue != 0) {
                    EscherBSERecord escherBSERecord = (EscherBSERecord) childRecords.get(propertyValue - 1);
                    for (int i10 = 0; i10 < pictureData.length; i10++) {
                        if (pictureData[i10].getOffset() == escherBSERecord.getOffset()) {
                            return pictureData[i10];
                        }
                    }
                }
            }
        }
        return null;
    }

    public int getRadialGradientPositionType() {
        return s.U(this.shape.getSpContainer());
    }

    public int[] getShaderColors() {
        return s.V(this.shape.getSpContainer());
    }

    public float[] getShaderPositions() {
        return s.W(this.shape.getSpContainer());
    }

    public boolean isShaderPreset() {
        return s.l0(this.shape.getSpContainer());
    }

    public void setBackgroundColor(Color color) {
        EscherOptRecord escherOptRecord = (EscherOptRecord) s.F(this.shape.getSpContainer(), -4085);
        if (color == null) {
            Shape.setEscherProperty(escherOptRecord, EscherProperties.FILL__FILLBACKCOLOR, -1);
        } else {
            Shape.setEscherProperty(escherOptRecord, EscherProperties.FILL__FILLBACKCOLOR, new Color(color.getBlue(), color.getGreen(), color.getRed(), 0).getRGB());
        }
    }

    public void setFillType(int i10) {
        Shape.setEscherProperty((EscherOptRecord) s.F(this.shape.getSpContainer(), -4085), EscherProperties.FILL__FILLTYPE, i10);
    }

    public void setForegroundColor(Color color) {
        EscherOptRecord escherOptRecord = (EscherOptRecord) s.F(this.shape.getSpContainer(), -4085);
        if (color == null) {
            Shape.setEscherProperty(escherOptRecord, EscherProperties.FILL__NOFILLHITTEST, 1376256);
            return;
        }
        Shape.setEscherProperty(escherOptRecord, EscherProperties.FILL__FILLCOLOR, new Color(color.getBlue(), color.getGreen(), color.getRed(), 0).getRGB());
        Shape.setEscherProperty(escherOptRecord, EscherProperties.FILL__NOFILLHITTEST, 1376273);
    }

    public void setPictureData(int i10) {
        Shape.setEscherProperty((EscherOptRecord) s.F(this.shape.getSpContainer(), -4085), (short) 16774, i10);
    }

    public void dispose() {
    }
}
