package lib.zj.office.fc.hslf.model;

import androidx.activity.s;
import java.io.UnsupportedEncodingException;
import java.util.List;
import lib.zj.office.fc.codec.CharEncoding;
import lib.zj.office.fc.ddf.EscherBSERecord;
import lib.zj.office.fc.ddf.EscherComplexProperty;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherProperties;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.ddf.EscherSimpleProperty;
import lib.zj.office.fc.ddf.EscherSpRecord;
import lib.zj.office.fc.hslf.exceptions.HSLFException;
import lib.zj.office.fc.hslf.usermodel.PictureData;
import lib.zj.office.java.awt.Rectangle;

/* loaded from: classes3.dex */
public class Picture extends SimpleShape {
    public static final byte DIB = 7;
    public static final int EMF = 2;
    public static final int JPEG = 5;
    public static final int PICT = 4;
    public static final int PNG = 6;
    public static final int WMF = 3;

    public Picture(int i10) {
        this(i10, (Shape) null);
    }

    @Override // lib.zj.office.fc.hslf.model.Shape
    public void afterInsert(Sheet sheet) {
        super.afterInsert(sheet);
        EscherBSERecord escherBSERecord = getEscherBSERecord();
        escherBSERecord.setRef(escherBSERecord.getRef() + 1);
        if (getAnchor().equals(new Rectangle())) {
            setDefaultSize();
        }
    }

    public EscherContainerRecord createSpContainer(int i10, boolean z10) {
        EscherContainerRecord createSpContainer = super.createSpContainer(z10);
        this._escherContainer = createSpContainer;
        createSpContainer.setOptions((short) 15);
        ((EscherSpRecord) this._escherContainer.getChildById(EscherSpRecord.RECORD_ID)).setOptions((short) 1202);
        EscherOptRecord escherOptRecord = (EscherOptRecord) s.F(this._escherContainer, -4085);
        Shape.setEscherProperty(escherOptRecord, EscherProperties.PROTECTION__LOCKAGAINSTGROUPING, 8388736);
        Shape.setEscherProperty(escherOptRecord, (short) 16644, i10);
        return this._escherContainer;
    }

    public EscherBSERecord getEscherBSERecord() {
        EscherContainerRecord escherContainerRecord = (EscherContainerRecord) s.F(getSheet().getSlideShow().getDocumentRecord().getPPDrawingGroup().getDggContainer(), -4095);
        if (escherContainerRecord == null) {
            return null;
        }
        List<EscherRecord> childRecords = escherContainerRecord.getChildRecords();
        int pictureIndex = getPictureIndex();
        if (pictureIndex == 0) {
            return null;
        }
        return (EscherBSERecord) childRecords.get(pictureIndex - 1);
    }

    public EscherOptRecord getEscherOptRecord() {
        return (EscherOptRecord) s.F(this._escherContainer, -4085);
    }

    public PictureData getPictureData() {
        PictureData[] pictureData = getSheet().getSlideShow().getPictureData();
        EscherBSERecord escherBSERecord = getEscherBSERecord();
        if (escherBSERecord != null) {
            for (int i10 = 0; i10 < pictureData.length; i10++) {
                if (pictureData[i10].getOffset() == escherBSERecord.getOffset()) {
                    return pictureData[i10];
                }
            }
            return null;
        }
        return null;
    }

    public int getPictureIndex() {
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) s.H((EscherOptRecord) s.F(this._escherContainer, -4085), 260);
        if (escherSimpleProperty == null) {
            return 0;
        }
        return escherSimpleProperty.getPropertyValue();
    }

    public String getPictureName() {
        EscherComplexProperty escherComplexProperty = (EscherComplexProperty) s.H((EscherOptRecord) s.F(this._escherContainer, -4085), 261);
        if (escherComplexProperty != null) {
            try {
                String str = new String(escherComplexProperty.getComplexData(), CharEncoding.UTF_16LE);
                int indexOf = str.indexOf(0);
                if (indexOf != -1) {
                    return str.substring(0, indexOf);
                }
                return str;
            } catch (UnsupportedEncodingException e10) {
                throw new HSLFException(e10);
            }
        }
        return null;
    }

    public void setPictureName(String str) {
        EscherOptRecord escherOptRecord = (EscherOptRecord) s.F(this._escherContainer, -4085);
        try {
            escherOptRecord.addEscherProperty(new EscherComplexProperty(EscherProperties.BLIP__BLIPFILENAME, false, (str + (char) 0).getBytes(CharEncoding.UTF_16LE)));
        } catch (UnsupportedEncodingException e10) {
            throw new HSLFException(e10);
        }
    }

    public Picture(int i10, Shape shape) {
        super(null, shape);
        this._escherContainer = createSpContainer(i10, shape instanceof ShapeGroup);
    }

    public Picture(EscherContainerRecord escherContainerRecord, Shape shape) {
        super(escherContainerRecord, shape);
    }

    public void setDefaultSize() {
    }
}
