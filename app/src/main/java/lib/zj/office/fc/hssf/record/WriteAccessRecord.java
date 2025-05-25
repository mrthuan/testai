package lib.zj.office.fc.hssf.record;

import java.util.Arrays;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.LittleEndianOutput;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public final class WriteAccessRecord extends StandardRecord {
    private static final int DATA_SIZE = 112;
    private static final byte[] PADDING;
    private static final byte PAD_CHAR = 32;
    public static final short sid = 92;
    private String field_1_username;

    static {
        byte[] bArr = new byte[112];
        PADDING = bArr;
        Arrays.fill(bArr, (byte) 32);
    }

    public WriteAccessRecord() {
        setUsername("");
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 112;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 92;
    }

    public String getUsername() {
        return this.field_1_username;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        int i10;
        String username = getUsername();
        boolean hasMultibyte = StringUtil.hasMultibyte(username);
        littleEndianOutput.writeShort(username.length());
        littleEndianOutput.writeByte(hasMultibyte ? 1 : 0);
        if (hasMultibyte) {
            StringUtil.putUnicodeLE(username, littleEndianOutput);
        } else {
            StringUtil.putCompressedUnicode(username, littleEndianOutput);
        }
        int length = username.length();
        if (hasMultibyte) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        littleEndianOutput.write(PADDING, 0, 112 - ((length * i10) + 3));
    }

    public void setUsername(String str) {
        int i10;
        boolean hasMultibyte = StringUtil.hasMultibyte(str);
        int length = str.length();
        if (hasMultibyte) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        if (112 - ((length * i10) + 3) >= 0) {
            this.field_1_username = str;
            return;
        }
        throw new IllegalArgumentException("Name is too long: ".concat(str));
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[WRITEACCESS]\n    .name = ");
        stringBuffer.append(this.field_1_username.toString());
        stringBuffer.append("\n[/WRITEACCESS]\n");
        return stringBuffer.toString();
    }

    public WriteAccessRecord(RecordInputStream recordInputStream) {
        String readUnicodeLE;
        int readUShort = recordInputStream.readUShort();
        int readUByte = recordInputStream.readUByte();
        if (readUShort <= 112 && (readUByte & 254) == 0) {
            if ((readUByte & 1) == 0) {
                readUnicodeLE = StringUtil.readCompressedUnicode(recordInputStream, readUShort);
            } else {
                readUnicodeLE = StringUtil.readUnicodeLE(recordInputStream, readUShort);
            }
            this.field_1_username = readUnicodeLE.trim();
            for (int remaining = recordInputStream.remaining(); remaining > 0; remaining--) {
                recordInputStream.readUByte();
            }
            return;
        }
        int remaining2 = recordInputStream.remaining() + 3;
        byte[] bArr = new byte[remaining2];
        LittleEndian.putUShort(bArr, 0, readUShort);
        LittleEndian.putByte(bArr, 2, readUByte);
        recordInputStream.readFully(bArr, 3, remaining2 - 3);
        setUsername(new String(bArr).trim());
    }
}
