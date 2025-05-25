package lib.zj.office.fc.hssf.model;

import lib.zj.office.fc.ddf.EscherBoolProperty;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherProperties;
import lib.zj.office.fc.ddf.EscherRGBProperty;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.ddf.EscherSimpleProperty;
import lib.zj.office.fc.ddf.EscherSpRecord;
import lib.zj.office.fc.hssf.record.ObjRecord;
import lib.zj.office.fc.hssf.usermodel.HSSFAnchor;
import lib.zj.office.fc.hssf.usermodel.HSSFComment;
import lib.zj.office.fc.hssf.usermodel.HSSFPolygon;
import lib.zj.office.fc.hssf.usermodel.HSSFShape;
import lib.zj.office.fc.hssf.usermodel.HSSFSimpleShape;
import lib.zj.office.fc.hssf.usermodel.HSSFTextbox;

/* loaded from: classes3.dex */
public abstract class AbstractShape {
    public static AbstractShape createShape(HSSFShape hSSFShape, int i10) {
        AbstractShape lineShape;
        AbstractShape abstractShape;
        if (hSSFShape instanceof HSSFComment) {
            abstractShape = new CommentShape((HSSFComment) hSSFShape, i10);
        } else if (hSSFShape instanceof HSSFTextbox) {
            abstractShape = new TextboxShape((HSSFTextbox) hSSFShape, i10);
        } else if (hSSFShape instanceof HSSFPolygon) {
            abstractShape = new PolygonShape((HSSFPolygon) hSSFShape, i10);
        } else if (hSSFShape instanceof HSSFSimpleShape) {
            HSSFSimpleShape hSSFSimpleShape = (HSSFSimpleShape) hSSFShape;
            int shapeType = hSSFSimpleShape.getShapeType();
            if (shapeType != 1) {
                if (shapeType != 2 && shapeType != 3) {
                    if (shapeType != 8) {
                        if (shapeType == 20) {
                            lineShape = new ComboboxShape(hSSFSimpleShape, i10);
                        } else {
                            throw new IllegalArgumentException("Do not know how to handle this type of shape");
                        }
                    } else {
                        lineShape = new PictureShape(hSSFSimpleShape, i10);
                    }
                } else {
                    lineShape = new SimpleFilledShape(hSSFSimpleShape, i10);
                }
            } else {
                lineShape = new LineShape(hSSFSimpleShape, i10);
            }
            abstractShape = lineShape;
        } else {
            throw new IllegalArgumentException("Unknown shape type");
        }
        EscherSpRecord escherSpRecord = (EscherSpRecord) abstractShape.getSpContainer().getChildById(EscherSpRecord.RECORD_ID);
        if (hSSFShape.getParent() != null) {
            escherSpRecord.setFlags(escherSpRecord.getFlags() | 2);
        }
        return abstractShape;
    }

    public int addStandardOptions(HSSFShape hSSFShape, EscherOptRecord escherOptRecord) {
        int i10;
        escherOptRecord.addEscherProperty(new EscherBoolProperty(EscherProperties.TEXT__SIZE_TEXT_TO_FIT_SHAPE, 524288));
        if (hSSFShape.isNoFill()) {
            escherOptRecord.addEscherProperty(new EscherBoolProperty(EscherProperties.FILL__NOFILLHITTEST, 1114112));
        } else {
            escherOptRecord.addEscherProperty(new EscherBoolProperty(EscherProperties.FILL__NOFILLHITTEST, 65536));
        }
        escherOptRecord.addEscherProperty(new EscherRGBProperty(EscherProperties.FILL__FILLCOLOR, hSSFShape.getFillColor()));
        escherOptRecord.addEscherProperty(new EscherBoolProperty((short) 959, 524288));
        escherOptRecord.addEscherProperty(new EscherRGBProperty(EscherProperties.LINESTYLE__COLOR, hSSFShape.getLineStyleColor()));
        if (hSSFShape.getLineWidth() != 9525) {
            escherOptRecord.addEscherProperty(new EscherSimpleProperty(EscherProperties.LINESTYLE__LINEWIDTH, hSSFShape.getLineWidth()));
            i10 = 6;
        } else {
            i10 = 5;
        }
        if (hSSFShape.getLineStyle() != 0) {
            escherOptRecord.addEscherProperty(new EscherSimpleProperty(EscherProperties.LINESTYLE__LINEDASHING, hSSFShape.getLineStyle()));
            escherOptRecord.addEscherProperty(new EscherSimpleProperty(EscherProperties.LINESTYLE__LINEENDCAPSTYLE, 0));
            if (hSSFShape.getLineStyle() == -1) {
                escherOptRecord.addEscherProperty(new EscherBoolProperty(EscherProperties.LINESTYLE__NOLINEDRAWDASH, 524288));
            } else {
                escherOptRecord.addEscherProperty(new EscherBoolProperty(EscherProperties.LINESTYLE__NOLINEDRAWDASH, 524296));
            }
            i10 += 3;
        }
        escherOptRecord.sortProperties();
        return i10;
    }

    public EscherRecord createAnchor(HSSFAnchor hSSFAnchor) {
        return ConvertAnchor.createAnchor(hSSFAnchor);
    }

    public int getCmoObjectId(int i10) {
        return i10 - 1024;
    }

    public abstract ObjRecord getObjRecord();

    public abstract EscherContainerRecord getSpContainer();
}
