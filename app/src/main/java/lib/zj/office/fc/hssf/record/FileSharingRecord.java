package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public final class FileSharingRecord extends StandardRecord {
    public static final short sid = 91;
    private short field_1_readonly;
    private short field_2_password;
    private byte field_3_username_unicode_options;
    private String field_3_username_value;

    public FileSharingRecord() {
    }

    public static short hashPassword(String str) {
        byte[] bytes = str.getBytes();
        int i10 = 0;
        if (bytes.length > 0) {
            int length = bytes.length;
            while (true) {
                int i11 = length - 1;
                if (length <= 0) {
                    break;
                }
                i10 = bytes[i11] ^ (((i10 >> 14) & 1) | ((i10 << 1) & 32767));
                length = i11;
            }
            i10 = (bytes.length ^ (((i10 >> 14) & 1) | ((i10 << 1) & 32767))) ^ 52811;
        }
        return (short) i10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        FileSharingRecord fileSharingRecord = new FileSharingRecord();
        fileSharingRecord.setReadOnly(this.field_1_readonly);
        fileSharingRecord.setPassword(this.field_2_password);
        fileSharingRecord.setUsername(this.field_3_username_value);
        return fileSharingRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        int length = this.field_3_username_value.length();
        if (length < 1) {
            return 6;
        }
        return length + 7;
    }

    public short getPassword() {
        return this.field_2_password;
    }

    public short getReadOnly() {
        return this.field_1_readonly;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 91;
    }

    public String getUsername() {
        return this.field_3_username_value;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(getReadOnly());
        littleEndianOutput.writeShort(getPassword());
        littleEndianOutput.writeShort(this.field_3_username_value.length());
        if (this.field_3_username_value.length() > 0) {
            littleEndianOutput.writeByte(this.field_3_username_unicode_options);
            StringUtil.putCompressedUnicode(getUsername(), littleEndianOutput);
        }
    }

    public void setPassword(short s4) {
        this.field_2_password = s4;
    }

    public void setReadOnly(short s4) {
        this.field_1_readonly = s4;
    }

    public void setUsername(String str) {
        this.field_3_username_value = str;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer("[FILESHARING]\n    .readonly       = ");
        if (getReadOnly() == 1) {
            str = "true";
        } else {
            str = "false";
        }
        stringBuffer.append(str);
        stringBuffer.append("\n    .password       = ");
        stringBuffer.append(Integer.toHexString(getPassword()));
        stringBuffer.append("\n    .username       = ");
        stringBuffer.append(getUsername());
        stringBuffer.append("\n[/FILESHARING]\n");
        return stringBuffer.toString();
    }

    public FileSharingRecord(RecordInputStream recordInputStream) {
        this.field_1_readonly = recordInputStream.readShort();
        this.field_2_password = recordInputStream.readShort();
        short readShort = recordInputStream.readShort();
        if (readShort > 0) {
            this.field_3_username_unicode_options = recordInputStream.readByte();
            this.field_3_username_value = recordInputStream.readCompressedUnicode(readShort);
            return;
        }
        this.field_3_username_value = "";
    }
}
