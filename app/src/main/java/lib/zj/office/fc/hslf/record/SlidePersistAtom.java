package lib.zj.office.fc.hslf.record;

import java.io.OutputStream;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class SlidePersistAtom extends RecordAtom {
    private static long _type = 1011;
    private byte[] _header;
    private boolean hasShapesOtherThanPlaceholders;
    private int numPlaceholderTexts;
    private int refID;
    private byte[] reservedFields;
    private int slideIdentifier;

    public SlidePersistAtom(byte[] bArr, int i10, int i11) {
        i11 = i11 < 8 ? 8 : i11;
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this.refID = LittleEndian.getInt(bArr, i10 + 8);
        if (LittleEndian.getInt(bArr, i10 + 12) == 4) {
            this.hasShapesOtherThanPlaceholders = true;
        } else {
            this.hasShapesOtherThanPlaceholders = false;
        }
        this.numPlaceholderTexts = LittleEndian.getInt(bArr, i10 + 16);
        this.slideIdentifier = LittleEndian.getInt(bArr, i10 + 20);
        byte[] bArr3 = new byte[i11 - 24];
        this.reservedFields = bArr3;
        System.arraycopy(bArr, i10 + 24, bArr3, 0, bArr3.length);
    }

    public boolean getHasShapesOtherThanPlaceholders() {
        return this.hasShapesOtherThanPlaceholders;
    }

    public int getNumPlaceholderTexts() {
        return this.numPlaceholderTexts;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return _type;
    }

    public int getRefID() {
        return this.refID;
    }

    public int getSlideIdentifier() {
        return this.slideIdentifier;
    }

    public void setRefID(int i10) {
        this.refID = i10;
    }

    public void setSlideIdentifier(int i10) {
        this.slideIdentifier = i10;
    }

    public void writeOut(OutputStream outputStream) {
        int i10;
        outputStream.write(this._header);
        if (this.hasShapesOtherThanPlaceholders) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        Record.writeLittleEndian(this.refID, outputStream);
        Record.writeLittleEndian(i10, outputStream);
        Record.writeLittleEndian(this.numPlaceholderTexts, outputStream);
        Record.writeLittleEndian(this.slideIdentifier, outputStream);
        outputStream.write(this.reservedFields);
    }

    public SlidePersistAtom() {
        byte[] bArr = new byte[8];
        this._header = bArr;
        LittleEndian.putUShort(bArr, 0, 0);
        LittleEndian.putUShort(this._header, 2, (int) _type);
        LittleEndian.putInt(this._header, 4, 20);
        this.hasShapesOtherThanPlaceholders = true;
        this.reservedFields = new byte[4];
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }
}
