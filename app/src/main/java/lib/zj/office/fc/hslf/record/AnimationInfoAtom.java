package lib.zj.office.fc.hslf.record;

import androidx.appcompat.view.menu.d;
import java.io.OutputStream;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class AnimationInfoAtom extends RecordAtom {
    public static final int AnimateBg = 16384;
    public static final int Automatic = 4;
    public static final int Hide = 4096;
    public static final int Play = 256;
    public static final int Reverse = 1;
    public static final int Sound = 16;
    public static final int StopSound = 64;
    public static final int Synchronous = 1024;
    private byte[] _header;
    private byte[] _recdata;

    public AnimationInfoAtom() {
        this._recdata = new byte[28];
        byte[] bArr = new byte[8];
        this._header = bArr;
        LittleEndian.putShort(bArr, 0, (short) 1);
        LittleEndian.putShort(this._header, 2, (short) getRecordType());
        LittleEndian.putInt(this._header, 4, this._recdata.length);
    }

    public int getDelayTime() {
        return LittleEndian.getInt(this._recdata, 12);
    }

    public int getDimColor() {
        return LittleEndian.getInt(this._recdata, 0);
    }

    public boolean getFlag(int i10) {
        if ((i10 & getMask()) != 0) {
            return true;
        }
        return false;
    }

    public int getMask() {
        return LittleEndian.getInt(this._recdata, 4);
    }

    public int getOrderID() {
        return LittleEndian.getInt(this._recdata, 16);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RecordTypes.AnimationInfoAtom.typeID;
    }

    public int getSlideCount() {
        return LittleEndian.getInt(this._recdata, 18);
    }

    public int getSoundIdRef() {
        return LittleEndian.getInt(this._recdata, 8);
    }

    public void setDelayTime(int i10) {
        LittleEndian.putInt(this._recdata, 12, i10);
    }

    public void setDimColor(int i10) {
        LittleEndian.putInt(this._recdata, 0, i10);
    }

    public void setFlag(int i10, boolean z10) {
        int i11;
        int mask = getMask();
        if (z10) {
            i11 = i10 | mask;
        } else {
            i11 = (~i10) & mask;
        }
        setMask(i11);
    }

    public void setMask(int i10) {
        LittleEndian.putInt(this._recdata, 4, i10);
    }

    public void setOrderID(int i10) {
        LittleEndian.putInt(this._recdata, 16, i10);
    }

    public void setSlideCount(int i10) {
        LittleEndian.putInt(this._recdata, 18, i10);
    }

    public void setSoundIdRef(int i10) {
        LittleEndian.putInt(this._recdata, 8, i10);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("AnimationInfoAtom\n");
        stringBuffer.append("\tDimColor: " + getDimColor() + "\n");
        int mask = getMask();
        StringBuilder e10 = d.e("\tMask: ", mask, ", 0x");
        e10.append(Integer.toHexString(mask));
        e10.append("\n");
        stringBuffer.append(e10.toString());
        stringBuffer.append("\t  Reverse: " + getFlag(1) + "\n");
        stringBuffer.append("\t  Automatic: " + getFlag(4) + "\n");
        stringBuffer.append("\t  Sound: " + getFlag(16) + "\n");
        stringBuffer.append("\t  StopSound: " + getFlag(64) + "\n");
        stringBuffer.append("\t  Play: " + getFlag(256) + "\n");
        stringBuffer.append("\t  Synchronous: " + getFlag(1024) + "\n");
        stringBuffer.append("\t  Hide: " + getFlag(4096) + "\n");
        stringBuffer.append("\t  AnimateBg: " + getFlag(16384) + "\n");
        stringBuffer.append("\tSoundIdRef: " + getSoundIdRef() + "\n");
        stringBuffer.append("\tDelayTime: " + getDelayTime() + "\n");
        stringBuffer.append("\tOrderID: " + getOrderID() + "\n");
        stringBuffer.append("\tSlideCount: " + getSlideCount() + "\n");
        return stringBuffer.toString();
    }

    public void writeOut(OutputStream outputStream) {
        outputStream.write(this._header);
        outputStream.write(this._recdata);
    }

    public AnimationInfoAtom(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        int i12 = i11 - 8;
        byte[] bArr3 = new byte[i12];
        this._recdata = bArr3;
        System.arraycopy(bArr, i10 + 8, bArr3, 0, i12);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }
}
