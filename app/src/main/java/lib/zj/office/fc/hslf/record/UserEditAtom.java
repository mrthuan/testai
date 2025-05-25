package lib.zj.office.fc.hslf.record;

import java.util.Hashtable;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class UserEditAtom extends PositionDependentRecordAtom {
    public static final int LAST_VIEW_NONE = 0;
    public static final int LAST_VIEW_NOTES = 3;
    public static final int LAST_VIEW_OUTLINE_VIEW = 2;
    public static final int LAST_VIEW_SLIDE_VIEW = 1;
    private static long _type = 4085;
    private byte[] _header;
    private int docPersistRef;
    private int lastUserEditAtomOffset;
    private short lastViewType;
    private int lastViewedSlideID;
    private int maxPersistWritten;
    private int persistPointersOffset;
    private int pptVersion;
    private byte[] reserved;

    public UserEditAtom(byte[] bArr, int i10, int i11) {
        i11 = i11 < 34 ? 34 : i11;
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this.lastViewedSlideID = LittleEndian.getInt(bArr, i10 + 0 + 8);
        this.pptVersion = LittleEndian.getInt(bArr, i10 + 4 + 8);
        this.lastUserEditAtomOffset = LittleEndian.getInt(bArr, i10 + 8 + 8);
        this.persistPointersOffset = LittleEndian.getInt(bArr, i10 + 12 + 8);
        this.docPersistRef = LittleEndian.getInt(bArr, i10 + 16 + 8);
        this.maxPersistWritten = LittleEndian.getInt(bArr, i10 + 20 + 8);
        this.lastViewType = LittleEndian.getShort(bArr, i10 + 24 + 8);
        byte[] bArr3 = new byte[(i11 - 26) - 8];
        this.reserved = bArr3;
        System.arraycopy(bArr, i10 + 26 + 8, bArr3, 0, bArr3.length);
    }

    public int getDocPersistRef() {
        return this.docPersistRef;
    }

    public int getLastUserEditAtomOffset() {
        return this.lastUserEditAtomOffset;
    }

    public short getLastViewType() {
        return this.lastViewType;
    }

    public int getLastViewedSlideID() {
        return this.lastViewedSlideID;
    }

    public int getMaxPersistWritten() {
        return this.maxPersistWritten;
    }

    public int getPersistPointersOffset() {
        return this.persistPointersOffset;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return _type;
    }

    public void setLastUserEditAtomOffset(int i10) {
        this.lastUserEditAtomOffset = i10;
    }

    public void setLastViewType(short s4) {
        this.lastViewType = s4;
    }

    public void setMaxPersistWritten(int i10) {
        this.maxPersistWritten = i10;
    }

    public void setPersistPointersOffset(int i10) {
        this.persistPointersOffset = i10;
    }

    @Override // lib.zj.office.fc.hslf.record.PositionDependentRecordAtom, lib.zj.office.fc.hslf.record.PositionDependentRecord
    public void updateOtherRecordReferences(Hashtable<Integer, Integer> hashtable) {
        int i10 = this.lastUserEditAtomOffset;
        if (i10 != 0) {
            Integer num = hashtable.get(Integer.valueOf(i10));
            if (num != null) {
                this.lastUserEditAtomOffset = num.intValue();
            } else {
                throw new RuntimeException("Couldn't find the new location of the UserEditAtom that used to be at " + this.lastUserEditAtomOffset);
            }
        }
        Integer num2 = hashtable.get(Integer.valueOf(this.persistPointersOffset));
        if (num2 != null) {
            this.persistPointersOffset = num2.intValue();
            return;
        }
        throw new RuntimeException("Couldn't find the new location of the PersistPtr that used to be at " + this.persistPointersOffset);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }
}
