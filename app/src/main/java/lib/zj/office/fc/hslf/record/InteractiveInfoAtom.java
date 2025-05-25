package lib.zj.office.fc.hslf.record;

import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class InteractiveInfoAtom extends RecordAtom {
    public static final byte ACTION_CUSTOMSHOW = 7;
    public static final byte ACTION_HYPERLINK = 4;
    public static final byte ACTION_JUMP = 3;
    public static final byte ACTION_MACRO = 1;
    public static final byte ACTION_MEDIA = 6;
    public static final byte ACTION_NONE = 0;
    public static final byte ACTION_OLE = 5;
    public static final byte ACTION_RUNPROGRAM = 2;
    public static final byte JUMP_ENDSHOW = 6;
    public static final byte JUMP_FIRSTSLIDE = 3;
    public static final byte JUMP_LASTSLIDE = 4;
    public static final byte JUMP_LASTSLIDEVIEWED = 5;
    public static final byte JUMP_NEXTSLIDE = 1;
    public static final byte JUMP_NONE = 0;
    public static final byte JUMP_PREVIOUSSLIDE = 2;
    public static final byte LINK_CustomShow = 6;
    public static final byte LINK_FirstSlide = 2;
    public static final byte LINK_LastSlide = 3;
    public static final byte LINK_NULL = -1;
    public static final byte LINK_NextSlide = 0;
    public static final byte LINK_OtherFile = 10;
    public static final byte LINK_OtherPresentation = 9;
    public static final byte LINK_PreviousSlide = 1;
    public static final byte LINK_SlideNumber = 7;
    public static final byte LINK_Url = 8;
    private byte[] _data;
    private byte[] _header;

    public InteractiveInfoAtom() {
        byte[] bArr = new byte[8];
        this._header = bArr;
        this._data = new byte[16];
        LittleEndian.putShort(bArr, 2, (short) getRecordType());
        LittleEndian.putInt(this._header, 4, this._data.length);
    }

    public byte getAction() {
        return this._data[8];
    }

    public byte getFlags() {
        return this._data[11];
    }

    public int getHyperlinkID() {
        return LittleEndian.getInt(this._data, 4);
    }

    public byte getHyperlinkType() {
        return this._data[12];
    }

    public byte getJump() {
        return this._data[10];
    }

    public byte getOleVerb() {
        return this._data[9];
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RecordTypes.InteractiveInfoAtom.typeID;
    }

    public int getSoundRef() {
        return LittleEndian.getInt(this._data, 0);
    }

    public void setAction(byte b10) {
        this._data[8] = b10;
    }

    public void setFlags(byte b10) {
        this._data[11] = b10;
    }

    public void setHyperlinkID(int i10) {
        LittleEndian.putInt(this._data, 4, i10);
    }

    public void setHyperlinkType(byte b10) {
        this._data[12] = b10;
    }

    public void setJump(byte b10) {
        this._data[10] = b10;
    }

    public void setOleVerb(byte b10) {
        this._data[9] = b10;
    }

    public void setSoundRef(int i10) {
        LittleEndian.putInt(this._data, 0, i10);
    }

    public InteractiveInfoAtom(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        int i12 = i11 - 8;
        byte[] bArr3 = new byte[i12];
        this._data = bArr3;
        System.arraycopy(bArr, i10 + 8, bArr3, 0, i12);
        if (this._data.length >= 16) {
            return;
        }
        throw new IllegalArgumentException("The length of the data for a InteractiveInfoAtom must be at least 16 bytes, but was only " + this._data.length);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }
}
