package lib.zj.office.fc.hslf.record;

import java.io.OutputStream;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class NotesAtom extends RecordAtom {
    private static long _type = 1009;
    private byte[] _header;
    private boolean followMasterBackground;
    private boolean followMasterObjects;
    private boolean followMasterScheme;
    private byte[] reserved;
    private int slideID;

    public NotesAtom(byte[] bArr, int i10, int i11) {
        i11 = i11 < 8 ? 8 : i11;
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this.slideID = LittleEndian.getInt(bArr, i10 + 8);
        int uShort = LittleEndian.getUShort(bArr, i10 + 12);
        if ((uShort & 4) == 4) {
            this.followMasterBackground = true;
        } else {
            this.followMasterBackground = false;
        }
        if ((uShort & 2) == 2) {
            this.followMasterScheme = true;
        } else {
            this.followMasterScheme = false;
        }
        if ((uShort & 1) == 1) {
            this.followMasterObjects = true;
        } else {
            this.followMasterObjects = false;
        }
        byte[] bArr3 = new byte[i11 - 14];
        this.reserved = bArr3;
        System.arraycopy(bArr, i10 + 14, bArr3, 0, bArr3.length);
    }

    public boolean getFollowMasterBackground() {
        return this.followMasterBackground;
    }

    public boolean getFollowMasterObjects() {
        return this.followMasterObjects;
    }

    public boolean getFollowMasterScheme() {
        return this.followMasterScheme;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return _type;
    }

    public int getSlideID() {
        return this.slideID;
    }

    public void setFollowMasterBackground(boolean z10) {
        this.followMasterBackground = z10;
    }

    public void setFollowMasterObjects(boolean z10) {
        this.followMasterObjects = z10;
    }

    public void setFollowMasterScheme(boolean z10) {
        this.followMasterScheme = z10;
    }

    public void setSlideID(int i10) {
        this.slideID = i10;
    }

    public void writeOut(OutputStream outputStream) {
        short s4;
        outputStream.write(this._header);
        Record.writeLittleEndian(this.slideID, outputStream);
        if (this.followMasterObjects) {
            s4 = (short) 1;
        } else {
            s4 = 0;
        }
        if (this.followMasterScheme) {
            s4 = (short) (s4 + 2);
        }
        if (this.followMasterBackground) {
            s4 = (short) (s4 + 4);
        }
        Record.writeLittleEndian(s4, outputStream);
        outputStream.write(this.reserved);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }
}
