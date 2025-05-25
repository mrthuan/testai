package lib.zj.office.fc.hwpf.usermodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import jh.e;
import kh.b;
import lib.zj.office.fc.ddf.DefaultEscherRecordFactory;
import lib.zj.office.fc.ddf.EscherBSERecord;
import lib.zj.office.fc.ddf.EscherBlipRecord;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherMetafileBlip;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.ddf.EscherSimpleProperty;
import lib.zj.office.fc.ddf.EscherSpRecord;
import lib.zj.office.fc.ddf.EscherTertiaryOptRecord;
import lib.zj.office.fc.hwpf.model.EscherRecordHolder;
import lib.zj.office.fc.hwpf.model.FSPA;
import lib.zj.office.fc.hwpf.model.FSPATable;
import lib.zj.office.system.f;

/* loaded from: classes3.dex */
public class OfficeDrawingsImpl implements OfficeDrawings {
    private final EscherRecordHolder _escherRecordHolder;
    private final FSPATable _fspaTable;
    private final byte[] _mainStream;

    public OfficeDrawingsImpl(FSPATable fSPATable, EscherRecordHolder escherRecordHolder, byte[] bArr) {
        this._fspaTable = fSPATable;
        this._escherRecordHolder = escherRecordHolder;
        this._mainStream = bArr;
    }

    private boolean findEscherShapeRecordContainer(EscherContainerRecord escherContainerRecord, int i10) {
        if (escherContainerRecord.getRecordId() == -4093) {
            Iterator<EscherRecord> it = escherContainerRecord.getChildRecords().iterator();
            if (it.hasNext()) {
                return findEscherShapeRecordContainer((EscherContainerRecord) it.next(), i10);
            }
            return false;
        }
        EscherSpRecord escherSpRecord = (EscherSpRecord) escherContainerRecord.getChildById(EscherSpRecord.RECORD_ID);
        if (escherSpRecord != null && escherSpRecord.getShapeId() == i10) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public EscherContainerRecord getEscherShapeRecordContainer(int i10) {
        for (EscherContainerRecord escherContainerRecord : this._escherRecordHolder.getSpContainers()) {
            if (escherContainerRecord.getRecordId() == -4093) {
                if (findEscherShapeRecordContainer(escherContainerRecord, i10)) {
                    return escherContainerRecord;
                }
            } else {
                EscherSpRecord escherSpRecord = (EscherSpRecord) escherContainerRecord.getChildById(EscherSpRecord.RECORD_ID);
                if (escherSpRecord != null && escherSpRecord.getShapeId() == i10) {
                    return escherContainerRecord;
                }
            }
        }
        return null;
    }

    private OfficeDrawing getOfficeDrawing(FSPA fspa) {
        return new OfficeDrawingImpl(fspa, this);
    }

    public EscherBlipRecord getBitmapRecord(f fVar, int i10) {
        List<? extends EscherContainerRecord> bStoreContainers = this._escherRecordHolder.getBStoreContainers();
        String str = null;
        if (bStoreContainers != null && bStoreContainers.size() == 1) {
            List<EscherRecord> childRecords = bStoreContainers.get(0).getChildRecords();
            if (childRecords.size() < i10) {
                return null;
            }
            EscherRecord escherRecord = childRecords.get(i10 - 1);
            if (escherRecord instanceof EscherBlipRecord) {
                return (EscherBlipRecord) escherRecord;
            }
            if (escherRecord instanceof EscherBSERecord) {
                EscherBSERecord escherBSERecord = (EscherBSERecord) escherRecord;
                EscherBlipRecord blipRecord = escherBSERecord.getBlipRecord();
                if (blipRecord != null) {
                    return blipRecord;
                }
                if (escherBSERecord.getOffset() > 0) {
                    DefaultEscherRecordFactory defaultEscherRecordFactory = new DefaultEscherRecordFactory();
                    EscherRecord createRecord = defaultEscherRecordFactory.createRecord(this._mainStream, escherBSERecord.getOffset());
                    if (createRecord instanceof EscherBlipRecord) {
                        EscherBlipRecord escherBlipRecord = (EscherBlipRecord) createRecord;
                        if (escherBlipRecord instanceof EscherMetafileBlip) {
                            escherBlipRecord.fillFields(this._mainStream, escherBSERecord.getOffset(), defaultEscherRecordFactory);
                            e g10 = fVar.o().g();
                            byte[] picturedata = escherBlipRecord.getPicturedata();
                            g10.getClass();
                            try {
                                str = g10.l(picturedata, 0, picturedata.length);
                            } catch (Exception e10) {
                                g10.f19250e.o().c().a(false, e10);
                            }
                            escherBlipRecord.setTempFilePath(str);
                        } else {
                            int readHeader = escherBlipRecord.readHeader(this._mainStream, escherBSERecord.getOffset());
                            int min = Math.min(64, readHeader);
                            byte[] bArr = new byte[min];
                            int offset = escherBSERecord.getOffset() + 8 + 17;
                            System.arraycopy(this._mainStream, offset, bArr, 0, min);
                            escherBlipRecord.setPictureData(bArr);
                            escherBlipRecord.setTempFilePath(fVar.o().g().l(this._mainStream, offset, readHeader - 17));
                        }
                        return escherBlipRecord;
                    }
                }
            }
        }
        return null;
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.OfficeDrawings
    public OfficeDrawing getOfficeDrawingAt(int i10) {
        FSPA fspaFromCp = this._fspaTable.getFspaFromCp(i10);
        if (fspaFromCp == null) {
            return null;
        }
        return getOfficeDrawing(fspaFromCp);
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.OfficeDrawings
    public Collection<OfficeDrawing> getOfficeDrawings() {
        ArrayList arrayList = new ArrayList();
        for (FSPA fspa : this._fspaTable.getShapes()) {
            arrayList.add(getOfficeDrawing(fspa));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* loaded from: classes3.dex */
    public static class OfficeDrawingImpl implements OfficeDrawing {
        private EscherBlipRecord blipRecord;
        private OfficeDrawingsImpl darwings;
        private FSPA fspa;

        public OfficeDrawingImpl(FSPA fspa, OfficeDrawingsImpl officeDrawingsImpl) {
            this.fspa = fspa;
            this.darwings = officeDrawingsImpl;
        }

        private int getTertiaryPropertyValue(int i10, int i11) {
            EscherContainerRecord escherShapeRecordContainer = this.darwings.getEscherShapeRecordContainer(getShapeId());
            if (escherShapeRecordContainer == null) {
                return i11;
            }
            EscherTertiaryOptRecord escherTertiaryOptRecord = (EscherTertiaryOptRecord) escherShapeRecordContainer.getChildById(EscherTertiaryOptRecord.RECORD_ID);
            if (escherTertiaryOptRecord == null) {
                return i11;
            }
            EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) escherTertiaryOptRecord.lookup(i10);
            if (escherSimpleProperty == null) {
                return i11;
            }
            return escherSimpleProperty.getPropertyValue();
        }

        @Override // lib.zj.office.fc.hwpf.usermodel.OfficeDrawing
        public HWPFShape getAutoShape() {
            EscherContainerRecord escherShapeRecordContainer = this.darwings.getEscherShapeRecordContainer(getShapeId());
            if (escherShapeRecordContainer == null) {
                return null;
            }
            return HWPFShapeFactory.createShape(escherShapeRecordContainer, null);
        }

        @Override // lib.zj.office.fc.hwpf.usermodel.OfficeDrawing
        public byte getHorizontalPositioning() {
            return (byte) getTertiaryPropertyValue(911, 0);
        }

        @Override // lib.zj.office.fc.hwpf.usermodel.OfficeDrawing
        public byte getHorizontalRelative() {
            return (byte) getTertiaryPropertyValue(912, 2);
        }

        @Override // lib.zj.office.fc.hwpf.usermodel.OfficeDrawing
        public byte[] getPictureData(f fVar) {
            EscherOptRecord escherOptRecord;
            EscherSimpleProperty escherSimpleProperty;
            EscherBlipRecord escherBlipRecord = this.blipRecord;
            if (escherBlipRecord == null) {
                EscherContainerRecord escherShapeRecordContainer = this.darwings.getEscherShapeRecordContainer(getShapeId());
                if (escherShapeRecordContainer == null || (escherOptRecord = (EscherOptRecord) escherShapeRecordContainer.getChildById(EscherOptRecord.RECORD_ID)) == null || (escherSimpleProperty = (EscherSimpleProperty) escherOptRecord.lookup(260)) == null) {
                    return null;
                }
                EscherBlipRecord bitmapRecord = this.darwings.getBitmapRecord(fVar, escherSimpleProperty.getPropertyValue());
                this.blipRecord = bitmapRecord;
                if (bitmapRecord == null) {
                    return null;
                }
                return bitmapRecord.getPicturedata();
            }
            return escherBlipRecord.getPicturedata();
        }

        @Override // lib.zj.office.fc.hwpf.usermodel.OfficeDrawing
        public b getPictureEffectInfor() {
            EscherContainerRecord escherShapeRecordContainer = this.darwings.getEscherShapeRecordContainer(getShapeId());
            if (escherShapeRecordContainer == null) {
                return null;
            }
            return b.b.z((EscherOptRecord) escherShapeRecordContainer.getChildById(EscherOptRecord.RECORD_ID));
        }

        @Override // lib.zj.office.fc.hwpf.usermodel.OfficeDrawing
        public int getRectangleBottom() {
            return this.fspa.getYaBottom();
        }

        @Override // lib.zj.office.fc.hwpf.usermodel.OfficeDrawing
        public int getRectangleLeft() {
            return this.fspa.getXaLeft();
        }

        @Override // lib.zj.office.fc.hwpf.usermodel.OfficeDrawing
        public int getRectangleRight() {
            return this.fspa.getXaRight();
        }

        @Override // lib.zj.office.fc.hwpf.usermodel.OfficeDrawing
        public int getRectangleTop() {
            return this.fspa.getYaTop();
        }

        @Override // lib.zj.office.fc.hwpf.usermodel.OfficeDrawing
        public int getShapeId() {
            return this.fspa.getSpid();
        }

        @Override // lib.zj.office.fc.hwpf.usermodel.OfficeDrawing
        public String getTempFilePath(f fVar) {
            if (this.blipRecord == null) {
                getPictureData(fVar);
            }
            EscherBlipRecord escherBlipRecord = this.blipRecord;
            if (escherBlipRecord != null) {
                return escherBlipRecord.getTempFilePath();
            }
            return null;
        }

        @Override // lib.zj.office.fc.hwpf.usermodel.OfficeDrawing
        public byte getVerticalPositioning() {
            return (byte) getTertiaryPropertyValue(913, 0);
        }

        @Override // lib.zj.office.fc.hwpf.usermodel.OfficeDrawing
        public byte getVerticalRelativeElement() {
            return (byte) getTertiaryPropertyValue(914, 2);
        }

        @Override // lib.zj.office.fc.hwpf.usermodel.OfficeDrawing
        public int getWrap() {
            return this.fspa.getWr();
        }

        @Override // lib.zj.office.fc.hwpf.usermodel.OfficeDrawing
        public boolean isAnchorLock() {
            return this.fspa.isFAnchorLock();
        }

        @Override // lib.zj.office.fc.hwpf.usermodel.OfficeDrawing
        public boolean isBelowText() {
            return this.fspa.isFBelowText();
        }

        public String toString() {
            return "OfficeDrawingImpl: " + this.fspa.toString();
        }

        @Override // lib.zj.office.fc.hwpf.usermodel.OfficeDrawing
        public byte[] getPictureData(f fVar, int i10) {
            if (i10 > 0) {
                EscherBlipRecord bitmapRecord = this.darwings.getBitmapRecord(fVar, i10);
                this.blipRecord = bitmapRecord;
                if (bitmapRecord != null) {
                    return bitmapRecord.getPicturedata();
                }
                return null;
            }
            return null;
        }
    }
}
