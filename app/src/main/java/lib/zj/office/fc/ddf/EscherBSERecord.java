package lib.zj.office.fc.ddf;

import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class EscherBSERecord extends EscherRecord {
    public static final byte BT_DIB = 7;
    public static final byte BT_EMF = 2;
    public static final byte BT_ERROR = 0;
    public static final byte BT_JPEG = 5;
    public static final byte BT_PICT = 4;
    public static final byte BT_PNG = 6;
    public static final byte BT_UNKNOWN = 1;
    public static final byte BT_WMF = 3;
    public static final String RECORD_DESCRIPTION = "MsofbtBSE";
    public static final short RECORD_ID = -4089;
    private byte[] _remainingData;
    private byte field_10_unused2;
    private byte field_11_unused3;
    private EscherBlipRecord field_12_blipRecord;
    private byte field_1_blipTypeWin32;
    private byte field_2_blipTypeMacOS;
    private byte[] field_3_uid;
    private short field_4_tag;
    private int field_5_size;
    private int field_6_ref;
    private int field_7_offset;
    private byte field_8_usage;
    private byte field_9_name;

    public static String getBlipType(byte b10) {
        switch (b10) {
            case 0:
                return " ERROR";
            case 1:
                return " UNKNOWN";
            case 2:
                return " EMF";
            case 3:
                return " WMF";
            case 4:
                return " PICT";
            case 5:
                return " JPEG";
            case 6:
                return " PNG";
            case 7:
                return " DIB";
            default:
                if (b10 < 32) {
                    return " NotKnown";
                }
                return " Client";
        }
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public void dispose() {
        EscherBlipRecord escherBlipRecord = this.field_12_blipRecord;
        if (escherBlipRecord != null) {
            escherBlipRecord.dispose();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008b  */
    @Override // lib.zj.office.fc.ddf.EscherRecord
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int fillFields(byte[] r6, int r7, lib.zj.office.fc.ddf.EscherRecordFactory r8) {
        /*
            r5 = this;
            int r0 = r5.readHeader(r6, r7)
            int r7 = r7 + 8
            r1 = r6[r7]
            r5.field_1_blipTypeWin32 = r1
            int r1 = r7 + 1
            r1 = r6[r1]
            r5.field_2_blipTypeMacOS = r1
            int r1 = r7 + 2
            r2 = 16
            byte[] r3 = new byte[r2]
            r5.field_3_uid = r3
            r4 = 0
            java.lang.System.arraycopy(r6, r1, r3, r4, r2)
            int r1 = r7 + 18
            short r1 = lib.zj.office.fc.util.LittleEndian.getShort(r6, r1)
            r5.field_4_tag = r1
            int r1 = r7 + 20
            int r1 = lib.zj.office.fc.util.LittleEndian.getInt(r6, r1)
            r5.field_5_size = r1
            int r1 = r7 + 24
            int r1 = lib.zj.office.fc.util.LittleEndian.getInt(r6, r1)
            r5.field_6_ref = r1
            int r1 = r7 + 28
            int r1 = lib.zj.office.fc.util.LittleEndian.getInt(r6, r1)
            r5.field_7_offset = r1
            int r1 = r7 + 32
            r1 = r6[r1]
            r5.field_8_usage = r1
            int r1 = r7 + 33
            r1 = r6[r1]
            r5.field_9_name = r1
            int r1 = r7 + 34
            r1 = r6[r1]
            r5.field_10_unused2 = r1
            int r1 = r7 + 35
            r1 = r6[r1]
            r5.field_11_unused3 = r1
            int r0 = r0 + (-36)
            if (r0 <= 0) goto L76
            int r1 = r7 + 36
            lib.zj.office.fc.ddf.EscherRecord r2 = r8.createRecord(r6, r1)
            boolean r3 = r2 instanceof lib.zj.office.fc.ddf.EscherBlipRecord
            if (r3 == 0) goto L6b
            lib.zj.office.fc.ddf.EscherBlipRecord r2 = (lib.zj.office.fc.ddf.EscherBlipRecord) r2
            r5.field_12_blipRecord = r2
            int r8 = r2.fillFields(r6, r1, r8)
            goto L77
        L6b:
            boolean r3 = r2 instanceof lib.zj.office.fc.ddf.EscherBSERecord
            if (r3 == 0) goto L76
            lib.zj.office.fc.ddf.EscherBSERecord r2 = (lib.zj.office.fc.ddf.EscherBSERecord) r2
            int r6 = r5.fillFields(r6, r1, r8)
            return r6
        L76:
            r8 = r4
        L77:
            int r1 = r8 + 36
            int r1 = r1 + r7
            int r0 = r0 - r8
            byte[] r7 = new byte[r0]
            r5._remainingData = r7
            java.lang.System.arraycopy(r6, r1, r7, r4, r0)
            int r0 = r0 + 8
            int r0 = r0 + 36
            lib.zj.office.fc.ddf.EscherBlipRecord r6 = r5.field_12_blipRecord
            if (r6 != 0) goto L8b
            goto L8f
        L8b:
            int r4 = r6.getRecordSize()
        L8f:
            int r0 = r0 + r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.ddf.EscherBSERecord.fillFields(byte[], int, lib.zj.office.fc.ddf.EscherRecordFactory):int");
    }

    public EscherBlipRecord getBlipRecord() {
        return this.field_12_blipRecord;
    }

    public byte getBlipTypeMacOS() {
        return this.field_2_blipTypeMacOS;
    }

    public byte getBlipTypeWin32() {
        return this.field_1_blipTypeWin32;
    }

    public byte getName() {
        return this.field_9_name;
    }

    public int getOffset() {
        return this.field_7_offset;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public String getRecordName() {
        return "BSE";
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int getRecordSize() {
        int i10;
        EscherBlipRecord escherBlipRecord = this.field_12_blipRecord;
        int i11 = 0;
        if (escherBlipRecord != null) {
            i10 = escherBlipRecord.getRecordSize();
        } else {
            i10 = 0;
        }
        byte[] bArr = this._remainingData;
        if (bArr != null) {
            i11 = bArr.length;
        }
        return i10 + 44 + i11;
    }

    public int getRef() {
        return this.field_6_ref;
    }

    public byte[] getRemainingData() {
        return this._remainingData;
    }

    public int getSize() {
        return this.field_5_size;
    }

    public short getTag() {
        return this.field_4_tag;
    }

    public byte[] getUid() {
        return this.field_3_uid;
    }

    public byte getUnused2() {
        return this.field_10_unused2;
    }

    public byte getUnused3() {
        return this.field_11_unused3;
    }

    public byte getUsage() {
        return this.field_8_usage;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int serialize(int i10, byte[] bArr, EscherSerializationListener escherSerializationListener) {
        int recordSize;
        int i11;
        escherSerializationListener.beforeRecordSerialize(i10, getRecordId(), this);
        if (this._remainingData == null) {
            this._remainingData = new byte[0];
        }
        LittleEndian.putShort(bArr, i10, getOptions());
        LittleEndian.putShort(bArr, i10 + 2, getRecordId());
        if (this._remainingData == null) {
            this._remainingData = new byte[0];
        }
        EscherBlipRecord escherBlipRecord = this.field_12_blipRecord;
        if (escherBlipRecord == null) {
            recordSize = 0;
        } else {
            recordSize = escherBlipRecord.getRecordSize();
        }
        LittleEndian.putInt(bArr, i10 + 4, this._remainingData.length + 36 + recordSize);
        int i12 = i10 + 8;
        bArr[i12] = this.field_1_blipTypeWin32;
        bArr[i10 + 9] = this.field_2_blipTypeMacOS;
        for (int i13 = 0; i13 < 16; i13++) {
            bArr[i10 + 10 + i13] = this.field_3_uid[i13];
        }
        LittleEndian.putShort(bArr, i10 + 26, this.field_4_tag);
        LittleEndian.putInt(bArr, i10 + 28, this.field_5_size);
        LittleEndian.putInt(bArr, i10 + 32, this.field_6_ref);
        LittleEndian.putInt(bArr, i10 + 36, this.field_7_offset);
        bArr[i10 + 40] = this.field_8_usage;
        bArr[i10 + 41] = this.field_9_name;
        bArr[i10 + 42] = this.field_10_unused2;
        bArr[i10 + 43] = this.field_11_unused3;
        EscherBlipRecord escherBlipRecord2 = this.field_12_blipRecord;
        if (escherBlipRecord2 != null) {
            i11 = escherBlipRecord2.serialize(i10 + 44, bArr, new NullEscherSerializationListener());
        } else {
            i11 = 0;
        }
        if (this._remainingData == null) {
            this._remainingData = new byte[0];
        }
        byte[] bArr2 = this._remainingData;
        System.arraycopy(bArr2, 0, bArr, i10 + 44 + i11, bArr2.length);
        int length = i12 + 36 + this._remainingData.length + i11;
        int i14 = length - i10;
        escherSerializationListener.afterRecordSerialize(length, getRecordId(), i14, this);
        return i14;
    }

    public void setBlipRecord(EscherBlipRecord escherBlipRecord) {
        this.field_12_blipRecord = escherBlipRecord;
    }

    public void setBlipTypeMacOS(byte b10) {
        this.field_2_blipTypeMacOS = b10;
    }

    public void setBlipTypeWin32(byte b10) {
        this.field_1_blipTypeWin32 = b10;
    }

    public void setName(byte b10) {
        this.field_9_name = b10;
    }

    public void setOffset(int i10) {
        this.field_7_offset = i10;
    }

    public void setRef(int i10) {
        this.field_6_ref = i10;
    }

    public void setRemainingData(byte[] bArr) {
        this._remainingData = bArr;
    }

    public void setSize(int i10) {
        this.field_5_size = i10;
    }

    public void setTag(short s4) {
        this.field_4_tag = s4;
    }

    public void setUid(byte[] bArr) {
        this.field_3_uid = bArr;
    }

    public void setUnused2(byte b10) {
        this.field_10_unused2 = b10;
    }

    public void setUnused3(byte b10) {
        this.field_11_unused3 = b10;
    }

    public void setUsage(byte b10) {
        this.field_8_usage = b10;
    }

    public String toString() {
        String hex;
        String hex2;
        byte[] bArr = this._remainingData;
        if (bArr == null) {
            hex = null;
        } else {
            hex = HexDump.toHex(bArr, 32);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(EscherBSERecord.class.getName());
        sb2.append(":\n  RecordId: 0x");
        sb2.append(HexDump.toHex((short) RECORD_ID));
        sb2.append("\n  Options: 0x");
        sb2.append(HexDump.toHex(getOptions()));
        sb2.append("\n  BlipTypeWin32: ");
        sb2.append((int) this.field_1_blipTypeWin32);
        sb2.append("\n  BlipTypeMacOS: ");
        sb2.append((int) this.field_2_blipTypeMacOS);
        sb2.append("\n  SUID: ");
        byte[] bArr2 = this.field_3_uid;
        if (bArr2 == null) {
            hex2 = "";
        } else {
            hex2 = HexDump.toHex(bArr2);
        }
        sb2.append(hex2);
        sb2.append("\n  Tag: ");
        sb2.append((int) this.field_4_tag);
        sb2.append("\n  Size: ");
        sb2.append(this.field_5_size);
        sb2.append("\n  Ref: ");
        sb2.append(this.field_6_ref);
        sb2.append("\n  Offset: ");
        sb2.append(this.field_7_offset);
        sb2.append("\n  Usage: ");
        sb2.append((int) this.field_8_usage);
        sb2.append("\n  Name: ");
        sb2.append((int) this.field_9_name);
        sb2.append("\n  Unused2: ");
        sb2.append((int) this.field_10_unused2);
        sb2.append("\n  Unused3: ");
        sb2.append((int) this.field_11_unused3);
        sb2.append("\n  blipRecord: ");
        sb2.append(this.field_12_blipRecord);
        sb2.append("\n  Extra Data:\n");
        sb2.append(hex);
        return sb2.toString();
    }
}
