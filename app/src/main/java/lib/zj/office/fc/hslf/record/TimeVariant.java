package lib.zj.office.fc.hslf.record;

import java.util.Hashtable;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public class TimeVariant extends PositionDependentRecordAtom {
    public static final byte TPID_AfterEffect = 13;
    public static final byte TPID_Display = 2;
    public static final byte TPID_EffectDir = 10;
    public static final byte TPID_EffectType = 11;
    public static final byte TPID_HideWhenStopped = 18;
    public static final byte TPID_MasterPos = 5;
    public static final byte TPID_MediaMute = 23;
    public static final byte TPID_PlaceholderNode = 21;
    public static final byte TPID_SlaveType = 6;
    public static final byte TPID_SlideCount = 15;
    public static final byte TPID__EffectID = 9;
    public static final byte TPID__EffectNodeType = 20;
    public static final byte TPID__EventFilter = 17;
    public static final byte TPID__GroupID = 19;
    public static final byte TPID__MediaVolume = 22;
    public static final byte TPID__TimeFilter = 16;
    public static final byte TPID__ZoomToFullScreen = 26;
    private static final byte TVT_Bool = 0;
    private static final byte TVT_Int = 1;
    private static final byte TVT_String = 3;
    private static final byte TVT_TVT_Float = 2;
    public static final byte TimeEffectType__ActionVerb = 5;
    public static final byte TimeEffectType__Emphasis = 3;
    public static final byte TimeEffectType__Entrance = 1;
    public static final byte TimeEffectType__Exit = 2;
    public static final byte TimeEffectType__MediaCommand = 6;
    public static final byte TimeEffectType__MotionPath = 4;
    private static long _type = 61762;
    private byte[] _header;
    private int tpID;
    private Object value;

    public TimeVariant(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this.tpID = (LittleEndian.getShort(this._header, 0) & 65520) >> 4;
        byte b10 = bArr[i10 + 8];
        if (b10 != 0) {
            if (b10 != 1) {
                if (b10 != 2) {
                    if (b10 == 3) {
                        int i12 = LittleEndian.getInt(this._header, 4) - 1;
                        byte[] bArr3 = new byte[i12];
                        System.arraycopy(bArr, i10 + 9, bArr3, 0, i12);
                        this.value = StringUtil.getFromUnicodeLE(bArr3);
                        return;
                    }
                    return;
                }
                this.value = Float.valueOf(LittleEndian.getFloat(bArr, i10 + 9));
                return;
            }
            this.value = Integer.valueOf(LittleEndian.getInt(bArr, i10 + 9));
            return;
        }
        this.value = Boolean.valueOf(bArr[i10 + 9] == 1);
    }

    public int getAttributeType() {
        return this.tpID;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return _type;
    }

    public Object getValue() {
        return this.value;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }

    @Override // lib.zj.office.fc.hslf.record.PositionDependentRecordAtom, lib.zj.office.fc.hslf.record.PositionDependentRecord
    public void updateOtherRecordReferences(Hashtable<Integer, Integer> hashtable) {
    }
}
