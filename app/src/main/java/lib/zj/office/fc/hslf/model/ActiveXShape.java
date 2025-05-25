package lib.zj.office.fc.hslf.model;

import androidx.activity.s;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import lib.zj.office.fc.codec.CharEncoding;
import lib.zj.office.fc.ddf.EscherClientDataRecord;
import lib.zj.office.fc.ddf.EscherComplexProperty;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherProperties;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.hslf.exceptions.HSLFException;
import lib.zj.office.fc.hslf.record.ExControl;
import lib.zj.office.fc.hslf.record.ExObjList;
import lib.zj.office.fc.hslf.record.OEShapeAtom;
import lib.zj.office.fc.hslf.record.Record;
import lib.zj.office.fc.hslf.record.RecordTypes;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class ActiveXShape extends Picture {
    public static final int DEFAULT_ACTIVEX_THUMBNAIL = -1;

    public ActiveXShape(int i10, int i11) {
        super(i11, (Shape) null);
        setActiveXIndex(i10);
    }

    @Override // lib.zj.office.fc.hslf.model.Picture, lib.zj.office.fc.hslf.model.Shape
    public void afterInsert(Sheet sheet) {
        ExControl exControl;
        getExControl().getExControlAtom().setSlideId(sheet._getSheetNumber());
        try {
            ((EscherOptRecord) s.F(this._escherContainer, -4085)).addEscherProperty(new EscherComplexProperty(EscherProperties.GROUPSHAPE__SHAPENAME, false, ((exControl.getProgId() + "-" + getControlIndex()) + (char) 0).getBytes(CharEncoding.UTF_16LE)));
        } catch (UnsupportedEncodingException e10) {
            throw new HSLFException(e10);
        }
    }

    @Override // lib.zj.office.fc.hslf.model.Picture
    public EscherContainerRecord createSpContainer(int i10, boolean z10) {
        EscherContainerRecord createSpContainer = super.createSpContainer(i10, z10);
        this._escherContainer = createSpContainer;
        return createSpContainer;
    }

    public int getControlIndex() {
        OEShapeAtom oEShapeAtom = (OEShapeAtom) getClientDataRecord(RecordTypes.OEShapeAtom.typeID);
        if (oEShapeAtom != null) {
            return oEShapeAtom.getOptions();
        }
        return -1;
    }

    public ExControl getExControl() {
        Record[] childRecords;
        int controlIndex = getControlIndex();
        ExObjList exObjList = (ExObjList) getSheet().getSlideShow().getDocumentRecord().findFirstOfType(RecordTypes.ExObjList.typeID);
        if (exObjList != null) {
            for (Record record : exObjList.getChildRecords()) {
                if (record instanceof ExControl) {
                    ExControl exControl = (ExControl) record;
                    if (exControl.getExOleObjAtom().getObjID() == controlIndex) {
                        return exControl;
                    }
                }
            }
        }
        return null;
    }

    public void setActiveXIndex(int i10) {
        Iterator<EscherRecord> childIterator = getSpContainer().getChildIterator();
        while (childIterator.hasNext()) {
            EscherRecord next = childIterator.next();
            if (next.getRecordId() == -4079) {
                LittleEndian.putInt(((EscherClientDataRecord) next).getRemainingData(), 8, i10);
            }
        }
    }

    public ActiveXShape(EscherContainerRecord escherContainerRecord, Shape shape) {
        super(escherContainerRecord, shape);
    }

    public void setProperty(String str, String str2) {
    }
}
