package lib.zj.office.fc.hslf.record;

import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class ExOleObjAtom extends RecordAtom {
    public static final int DRAW_ASPECT_DOCPRINT = 8;
    public static final int DRAW_ASPECT_ICON = 4;
    public static final int DRAW_ASPECT_THUMBNAIL = 2;
    public static final int DRAW_ASPECT_VISIBLE = 1;
    public static final int SUBTYPE_CLIPART_GALLERY = 1;
    public static final int SUBTYPE_DEFAULT = 0;
    public static final int SUBTYPE_EQUATION = 6;
    public static final int SUBTYPE_EXCEL = 3;
    public static final int SUBTYPE_EXCEL_CHART = 14;
    public static final int SUBTYPE_GRAPH = 4;
    public static final int SUBTYPE_IMAGE = 9;
    public static final int SUBTYPE_MEDIA_PLAYER = 15;
    public static final int SUBTYPE_NOTEIT = 13;
    public static final int SUBTYPE_ORGANIZATION_CHART = 5;
    public static final int SUBTYPE_POWERPOINT_PRESENTATION = 10;
    public static final int SUBTYPE_POWERPOINT_SLIDE = 11;
    public static final int SUBTYPE_PROJECT = 12;
    public static final int SUBTYPE_SOUND = 8;
    public static final int SUBTYPE_WORDART = 7;
    public static final int SUBTYPE_WORD_TABLE = 2;
    public static final int TYPE_CONTROL = 2;
    public static final int TYPE_EMBEDDED = 0;
    public static final int TYPE_LINKED = 1;
    private byte[] _data;
    private byte[] _header;

    public ExOleObjAtom() {
        byte[] bArr = new byte[8];
        this._header = bArr;
        this._data = new byte[24];
        LittleEndian.putShort(bArr, 0, (short) 1);
        LittleEndian.putShort(this._header, 2, (short) getRecordType());
        LittleEndian.putInt(this._header, 4, this._data.length);
    }

    public int getDrawAspect() {
        return LittleEndian.getInt(this._data, 0);
    }

    public boolean getIsBlank() {
        if (LittleEndian.getInt(this._data, 20) != 0) {
            return true;
        }
        return false;
    }

    public int getObjID() {
        return LittleEndian.getInt(this._data, 8);
    }

    public int getObjStgDataRef() {
        return LittleEndian.getInt(this._data, 16);
    }

    public int getOptions() {
        return LittleEndian.getInt(this._data, 20);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RecordTypes.ExOleObjAtom.typeID;
    }

    public int getSubType() {
        return LittleEndian.getInt(this._data, 12);
    }

    public int getType() {
        return LittleEndian.getInt(this._data, 4);
    }

    public void setDrawAspect(int i10) {
        LittleEndian.putInt(this._data, 0, i10);
    }

    public void setObjID(int i10) {
        LittleEndian.putInt(this._data, 8, i10);
    }

    public void setObjStgDataRef(int i10) {
        LittleEndian.putInt(this._data, 16, i10);
    }

    public void setOptions(int i10) {
        LittleEndian.putInt(this._data, 20, i10);
    }

    public void setSubType(int i10) {
        LittleEndian.putInt(this._data, 12, i10);
    }

    public void setType(int i10) {
        LittleEndian.putInt(this._data, 4, i10);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("ExOleObjAtom\n");
        stringBuffer.append("  drawAspect: " + getDrawAspect() + "\n");
        stringBuffer.append("  type: " + getType() + "\n");
        stringBuffer.append("  objID: " + getObjID() + "\n");
        stringBuffer.append("  subType: " + getSubType() + "\n");
        stringBuffer.append("  objStgDataRef: " + getObjStgDataRef() + "\n");
        stringBuffer.append("  options: " + getOptions() + "\n");
        return stringBuffer.toString();
    }

    public ExOleObjAtom(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        int i12 = i11 - 8;
        byte[] bArr3 = new byte[i12];
        this._data = bArr3;
        System.arraycopy(bArr, i10 + 8, bArr3, 0, i12);
        if (this._data.length >= 24) {
            return;
        }
        throw new IllegalArgumentException("The length of the data for a ExOleObjAtom must be at least 24 bytes, but was only " + this._data.length);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }
}
