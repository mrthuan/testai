package lib.zj.office.fc.hslf.record;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.Vector;
import lib.zj.office.fc.ddf.DefaultEscherRecordFactory;
import lib.zj.office.fc.ddf.EscherBoolProperty;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherDgRecord;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherProperties;
import lib.zj.office.fc.ddf.EscherRGBProperty;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.ddf.EscherSimpleProperty;
import lib.zj.office.fc.ddf.EscherSpRecord;
import lib.zj.office.fc.ddf.EscherSpgrRecord;
import lib.zj.office.fc.ddf.EscherTextboxRecord;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class PPDrawing extends RecordAtom {
    private byte[] _header;
    private long _type;
    private EscherRecord[] childRecords;

    /* renamed from: dg  reason: collision with root package name */
    private EscherDgRecord f20664dg;
    private EscherTextboxWrapper[] textboxWrappers;

    public PPDrawing(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        int i12 = 0;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this._type = LittleEndian.getUShort(this._header, 2);
        byte[] bArr3 = new byte[i11];
        System.arraycopy(bArr, i10, bArr3, 0, i11);
        DefaultEscherRecordFactory defaultEscherRecordFactory = new DefaultEscherRecordFactory();
        Vector vector = new Vector();
        findEscherChildren(defaultEscherRecordFactory, bArr3, 8, i11 - 8, vector);
        this.childRecords = new EscherRecord[vector.size()];
        int i13 = 0;
        while (true) {
            EscherRecord[] escherRecordArr = this.childRecords;
            if (i13 >= escherRecordArr.length) {
                break;
            }
            escherRecordArr[i13] = (EscherRecord) vector.get(i13);
            i13++;
        }
        Vector vector2 = new Vector();
        findEscherTextboxRecord(this.childRecords, vector2);
        this.textboxWrappers = new EscherTextboxWrapper[vector2.size()];
        while (true) {
            EscherTextboxWrapper[] escherTextboxWrapperArr = this.textboxWrappers;
            if (i12 >= escherTextboxWrapperArr.length) {
                return;
            }
            escherTextboxWrapperArr[i12] = (EscherTextboxWrapper) vector2.get(i12);
            i12++;
        }
    }

    private void create() {
        EscherContainerRecord escherContainerRecord = new EscherContainerRecord();
        escherContainerRecord.setRecordId(EscherContainerRecord.DG_CONTAINER);
        escherContainerRecord.setOptions((short) 15);
        EscherDgRecord escherDgRecord = new EscherDgRecord();
        escherDgRecord.setOptions((short) 16);
        escherDgRecord.setNumShapes(1);
        escherContainerRecord.addChildRecord(escherDgRecord);
        EscherContainerRecord escherContainerRecord2 = new EscherContainerRecord();
        escherContainerRecord2.setOptions((short) 15);
        escherContainerRecord2.setRecordId(EscherContainerRecord.SPGR_CONTAINER);
        EscherContainerRecord escherContainerRecord3 = new EscherContainerRecord();
        escherContainerRecord3.setOptions((short) 15);
        escherContainerRecord3.setRecordId(EscherContainerRecord.SP_CONTAINER);
        EscherSpgrRecord escherSpgrRecord = new EscherSpgrRecord();
        escherSpgrRecord.setOptions((short) 1);
        escherContainerRecord3.addChildRecord(escherSpgrRecord);
        EscherSpRecord escherSpRecord = new EscherSpRecord();
        escherSpRecord.setOptions((short) 2);
        escherSpRecord.setFlags(5);
        escherContainerRecord3.addChildRecord(escherSpRecord);
        escherContainerRecord2.addChildRecord(escherContainerRecord3);
        escherContainerRecord.addChildRecord(escherContainerRecord2);
        EscherContainerRecord escherContainerRecord4 = new EscherContainerRecord();
        escherContainerRecord4.setOptions((short) 15);
        escherContainerRecord4.setRecordId(EscherContainerRecord.SP_CONTAINER);
        EscherSpRecord escherSpRecord2 = new EscherSpRecord();
        escherSpRecord2.setOptions((short) 18);
        escherSpRecord2.setFlags(3072);
        escherContainerRecord4.addChildRecord(escherSpRecord2);
        EscherOptRecord escherOptRecord = new EscherOptRecord();
        escherOptRecord.setRecordId(EscherOptRecord.RECORD_ID);
        escherOptRecord.addEscherProperty(new EscherRGBProperty(EscherProperties.FILL__FILLCOLOR, 134217728));
        escherOptRecord.addEscherProperty(new EscherRGBProperty(EscherProperties.FILL__FILLBACKCOLOR, 134217733));
        escherOptRecord.addEscherProperty(new EscherSimpleProperty(EscherProperties.FILL__RECTRIGHT, 10064750));
        escherOptRecord.addEscherProperty(new EscherSimpleProperty(EscherProperties.FILL__RECTBOTTOM, 7778750));
        escherOptRecord.addEscherProperty(new EscherBoolProperty(EscherProperties.FILL__NOFILLHITTEST, 1179666));
        escherOptRecord.addEscherProperty(new EscherBoolProperty(EscherProperties.LINESTYLE__NOLINEDRAWDASH, 524288));
        escherOptRecord.addEscherProperty(new EscherSimpleProperty(EscherProperties.SHAPE__BLACKANDWHITESETTINGS, 9));
        escherOptRecord.addEscherProperty(new EscherSimpleProperty(EscherProperties.SHAPE__BACKGROUNDSHAPE, 65537));
        escherContainerRecord4.addChildRecord(escherOptRecord);
        escherContainerRecord.addChildRecord(escherContainerRecord4);
        this.childRecords = new EscherRecord[]{escherContainerRecord};
    }

    private void findEscherChildren(DefaultEscherRecordFactory defaultEscherRecordFactory, byte[] bArr, int i10, int i11, Vector vector) {
        int i12 = LittleEndian.getInt(bArr, i10 + 4) + 8;
        EscherRecord createRecord = defaultEscherRecordFactory.createRecord(bArr, i10);
        createRecord.fillFields(bArr, i10, defaultEscherRecordFactory);
        vector.add(createRecord);
        int recordSize = createRecord.getRecordSize();
        if (recordSize == i12) {
            i12 = recordSize;
        }
        int i13 = i10 + i12;
        int i14 = i11 - i12;
        if (i14 >= 8) {
            findEscherChildren(defaultEscherRecordFactory, bArr, i13, i14, vector);
        }
    }

    private void findEscherTextboxRecord(EscherRecord[] escherRecordArr, Vector vector) {
        for (int i10 = 0; i10 < escherRecordArr.length; i10++) {
            EscherRecord escherRecord = escherRecordArr[i10];
            if (escherRecord instanceof EscherTextboxRecord) {
                EscherTextboxWrapper escherTextboxWrapper = new EscherTextboxWrapper((EscherTextboxRecord) escherRecord);
                vector.add(escherTextboxWrapper);
                if ("BinaryTagData".equals(escherRecordArr[i10].getRecordName())) {
                    escherTextboxWrapper.setShapeId(escherRecordArr[i10].getRecordId());
                } else {
                    int i11 = i10;
                    while (true) {
                        if (i11 >= 0) {
                            EscherRecord escherRecord2 = escherRecordArr[i11];
                            if (escherRecord2 instanceof EscherSpRecord) {
                                escherTextboxWrapper.setShapeId(((EscherSpRecord) escherRecord2).getShapeId());
                                break;
                            }
                            i11--;
                        }
                    }
                }
            } else if (escherRecord.isContainerRecord()) {
                java.util.List<EscherRecord> childRecords = escherRecordArr[i10].getChildRecords();
                EscherRecord[] escherRecordArr2 = new EscherRecord[childRecords.size()];
                childRecords.toArray(escherRecordArr2);
                findEscherTextboxRecord(escherRecordArr2, vector);
            }
        }
    }

    public void addTextboxWrapper(EscherTextboxWrapper escherTextboxWrapper) {
        EscherTextboxWrapper[] escherTextboxWrapperArr = this.textboxWrappers;
        EscherTextboxWrapper[] escherTextboxWrapperArr2 = new EscherTextboxWrapper[escherTextboxWrapperArr.length + 1];
        System.arraycopy(escherTextboxWrapperArr, 0, escherTextboxWrapperArr2, 0, escherTextboxWrapperArr.length);
        escherTextboxWrapperArr2[this.textboxWrappers.length] = escherTextboxWrapper;
        this.textboxWrappers = escherTextboxWrapperArr2;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
        EscherRecord[] escherRecordArr = this.childRecords;
        if (escherRecordArr != null) {
            for (EscherRecord escherRecord : escherRecordArr) {
                escherRecord.dispose();
            }
        }
        EscherTextboxWrapper[] escherTextboxWrapperArr = this.textboxWrappers;
        if (escherTextboxWrapperArr != null) {
            for (EscherTextboxWrapper escherTextboxWrapper : escherTextboxWrapperArr) {
                escherTextboxWrapper.dispose();
            }
        }
        EscherDgRecord escherDgRecord = this.f20664dg;
        if (escherDgRecord != null) {
            escherDgRecord.dispose();
        }
    }

    @Override // lib.zj.office.fc.hslf.record.RecordAtom, lib.zj.office.fc.hslf.record.Record
    public Record[] getChildRecords() {
        return null;
    }

    public EscherDgRecord getEscherDgRecord() {
        if (this.f20664dg == null) {
            Iterator<EscherRecord> childIterator = ((EscherContainerRecord) this.childRecords[0]).getChildIterator();
            while (true) {
                if (!childIterator.hasNext()) {
                    break;
                }
                EscherRecord next = childIterator.next();
                if (next instanceof EscherDgRecord) {
                    this.f20664dg = (EscherDgRecord) next;
                    break;
                }
            }
        }
        return this.f20664dg;
    }

    public EscherRecord[] getEscherRecords() {
        return this.childRecords;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return this._type;
    }

    public EscherTextboxWrapper[] getTextboxWrappers() {
        return this.textboxWrappers;
    }

    public void writeOut(OutputStream outputStream) {
        int i10 = 0;
        for (int i11 = 0; i11 < this.textboxWrappers.length; i11++) {
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            EscherRecord[] escherRecordArr = this.childRecords;
            if (i12 >= escherRecordArr.length) {
                break;
            }
            i13 += escherRecordArr[i12].getRecordSize();
            i12++;
        }
        LittleEndian.putInt(this._header, 4, i13);
        outputStream.write(this._header);
        byte[] bArr = new byte[i13];
        int i14 = 0;
        while (true) {
            EscherRecord[] escherRecordArr2 = this.childRecords;
            if (i10 < escherRecordArr2.length) {
                i14 += escherRecordArr2[i10].serialize(i14, bArr);
                i10++;
            } else {
                outputStream.write(bArr);
                return;
            }
        }
    }

    public PPDrawing() {
        byte[] bArr = new byte[8];
        this._header = bArr;
        LittleEndian.putUShort(bArr, 0, 15);
        LittleEndian.putUShort(this._header, 2, RecordTypes.PPDrawing.typeID);
        LittleEndian.putInt(this._header, 4, 0);
        this.textboxWrappers = new EscherTextboxWrapper[0];
        create();
    }
}
