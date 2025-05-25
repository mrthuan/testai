package lib.zj.office.fc.hslf.record;

import java.util.Hashtable;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class VisualShapeAtom extends PositionDependentRecordAtom {
    public static final int ET_ShapeType = 1;
    public static final int ET_SoundType = 2;
    public static long RECORD_ID = 11003;
    public static final int TVET_AllTextRange = 8;
    public static final int TVET_Audio = 3;
    public static final int TVET_ChartElement = 5;
    public static final int TVET_Page = 1;
    public static final int TVET_Shape = 0;
    public static final int TVET_ShapeOnly = 6;
    public static final int TVET_TextRange = 2;
    public static final int TVET_Video = 4;
    private byte[] _header;
    private int animType;
    private int data1;
    private int data2;
    private int refType;
    private int shapeIdRef;

    public VisualShapeAtom(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this.animType = LittleEndian.getInt(bArr, i10 + 8);
        this.refType = LittleEndian.getInt(bArr, i10 + 12);
        this.shapeIdRef = LittleEndian.getInt(bArr, i10 + 16);
        this.data1 = LittleEndian.getInt(bArr, i10 + 20);
        this.data2 = LittleEndian.getInt(bArr, i10 + 24);
    }

    public int getData1() {
        return this.data1;
    }

    public int getData2() {
        return this.data2;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RECORD_ID;
    }

    public int getTargetElementID() {
        return this.shapeIdRef;
    }

    public int getTargetElementType() {
        return this.animType;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }

    @Override // lib.zj.office.fc.hslf.record.PositionDependentRecordAtom, lib.zj.office.fc.hslf.record.PositionDependentRecord
    public void updateOtherRecordReferences(Hashtable<Integer, Integer> hashtable) {
    }
}
