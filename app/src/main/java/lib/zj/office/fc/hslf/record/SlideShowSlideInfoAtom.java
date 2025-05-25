package lib.zj.office.fc.hslf.record;

import java.util.Hashtable;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class SlideShowSlideInfoAtom extends PositionDependentRecordAtom {
    private static long _type = 1017;
    private byte[] _header;
    private byte effectDirection;
    private byte effectType;
    private boolean fAutoAdvance;
    private boolean fCursorVisible;
    private boolean fHidden;
    private boolean fLoopSound;
    private boolean fManualAdvance;
    private boolean fSound;
    private boolean fStopSound;
    private boolean reserved1;
    private boolean reserved2;
    private boolean reserved3;
    private boolean reserved4;
    private boolean reserved5;
    private boolean reserved6;
    private byte reserved7;
    private int slideTime;
    private int soundIdRef;
    private byte speed;
    private byte[] unused;

    public SlideShowSlideInfoAtom(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this.slideTime = LittleEndian.getInt(bArr, i10 + 8);
        this.soundIdRef = LittleEndian.getInt(bArr, i10 + 12);
        this.effectDirection = bArr[i10 + 16];
        this.effectType = bArr[i10 + 17];
        this.speed = bArr[i10 + 20];
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return _type;
    }

    public boolean isValidateTransition() {
        switch (this.effectType) {
            case 0:
                byte b10 = this.effectDirection;
                if (b10 < 0 || b10 > 1) {
                    return false;
                }
                return true;
            case 1:
                return true;
            case 2:
            case 3:
                byte b11 = this.effectDirection;
                if (b11 < 0 || b11 > 1) {
                    return false;
                }
                return true;
            case 4:
                byte b12 = this.effectDirection;
                if (b12 < 0 || b12 > 7) {
                    return false;
                }
                return true;
            case 5:
                if (this.effectDirection != 0) {
                    return false;
                }
                return true;
            case 6:
                if (this.effectDirection != 0) {
                    return false;
                }
                return true;
            case 7:
                byte b13 = this.effectDirection;
                if (b13 < 0 || b13 > 7) {
                    return false;
                }
                return true;
            case 8:
                byte b14 = this.effectDirection;
                if (b14 < 0 || b14 > 1) {
                    return false;
                }
                return true;
            case 9:
                byte b15 = this.effectDirection;
                if (b15 < 4 || b15 > 7) {
                    return false;
                }
                return true;
            case 10:
                byte b16 = this.effectDirection;
                if (b16 < 0 || b16 > 3) {
                    return false;
                }
                return true;
            case 11:
                byte b17 = this.effectDirection;
                if (b17 < 0 || b17 > 1) {
                    return false;
                }
                return true;
            case 12:
            case 14:
            case 15:
            case 16:
            case 24:
            case 25:
            default:
                return false;
            case 13:
                byte b18 = this.effectDirection;
                if (b18 < 0 || b18 > 3) {
                    return false;
                }
                return true;
            case 17:
            case 18:
            case 19:
                if (this.effectDirection != 0) {
                    return false;
                }
                return true;
            case 20:
                byte b19 = this.effectDirection;
                if (b19 < 0 || b19 > 3) {
                    return false;
                }
                return true;
            case 21:
                byte b20 = this.effectDirection;
                if (b20 < 0 || b20 > 1) {
                    return false;
                }
                return true;
            case 22:
            case 23:
                if (this.effectDirection != 0) {
                    return false;
                }
                return true;
            case 26:
                byte b21 = this.effectDirection;
                if ((b21 < 1 || b21 > 4) && b21 != 8) {
                    return false;
                }
                return true;
            case 27:
                if (this.effectDirection != 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }

    @Override // lib.zj.office.fc.hslf.record.PositionDependentRecordAtom, lib.zj.office.fc.hslf.record.PositionDependentRecord
    public void updateOtherRecordReferences(Hashtable<Integer, Integer> hashtable) {
    }
}
