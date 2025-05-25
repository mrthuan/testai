package lib.zj.office.fc.hssf.record;

import a6.h;
import lib.zj.office.fc.util.LittleEndianOutput;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public final class SupBookRecord extends StandardRecord {
    private static final short SMALL_RECORD_SIZE = 4;
    private static final short TAG_ADD_IN_FUNCTIONS = 14849;
    private static final short TAG_INTERNAL_REFERENCES = 1025;
    public static final short sid = 430;
    private boolean _isAddInFunctions;
    private short field_1_number_of_sheets;
    private String field_2_encoded_url;
    private String[] field_3_sheet_names;

    private SupBookRecord(boolean z10, short s4) {
        this.field_1_number_of_sheets = s4;
        this.field_2_encoded_url = null;
        this.field_3_sheet_names = null;
        this._isAddInFunctions = z10;
    }

    public static SupBookRecord createAddInFunctions() {
        return new SupBookRecord(true, (short) 1);
    }

    public static SupBookRecord createExternalReferences(String str, String[] strArr) {
        return new SupBookRecord(str, strArr);
    }

    public static SupBookRecord createInternalReferences(short s4) {
        return new SupBookRecord(false, s4);
    }

    private static String decodeFileName(String str) {
        return str.substring(1);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        if (!isExternalReferences()) {
            return 4;
        }
        int encodedSize = StringUtil.getEncodedSize(this.field_2_encoded_url) + 2;
        int i10 = 0;
        while (true) {
            String[] strArr = this.field_3_sheet_names;
            if (i10 < strArr.length) {
                encodedSize += StringUtil.getEncodedSize(strArr[i10]);
                i10++;
            } else {
                return encodedSize;
            }
        }
    }

    public short getNumberOfSheets() {
        return this.field_1_number_of_sheets;
    }

    public String[] getSheetNames() {
        return (String[]) this.field_3_sheet_names.clone();
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public String getURL() {
        String str = this.field_2_encoded_url;
        char charAt = str.charAt(0);
        if (charAt != 0) {
            if (charAt != 1) {
                if (charAt != 2) {
                    return str;
                }
                return str.substring(1);
            }
            return decodeFileName(str);
        }
        return str.substring(1);
    }

    public boolean isAddInFunctions() {
        if (this.field_3_sheet_names == null && this._isAddInFunctions) {
            return true;
        }
        return false;
    }

    public boolean isExternalReferences() {
        if (this.field_3_sheet_names != null) {
            return true;
        }
        return false;
    }

    public boolean isInternalReferences() {
        if (this.field_3_sheet_names == null && !this._isAddInFunctions) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        int i10;
        littleEndianOutput.writeShort(this.field_1_number_of_sheets);
        if (isExternalReferences()) {
            StringUtil.writeUnicodeString(littleEndianOutput, this.field_2_encoded_url);
            int i11 = 0;
            while (true) {
                String[] strArr = this.field_3_sheet_names;
                if (i11 < strArr.length) {
                    StringUtil.writeUnicodeString(littleEndianOutput, strArr[i11]);
                    i11++;
                } else {
                    return;
                }
            }
        } else {
            if (this._isAddInFunctions) {
                i10 = 14849;
            } else {
                i10 = 1025;
            }
            littleEndianOutput.writeShort(i10);
        }
    }

    public void setNumberOfSheets(short s4) {
        this.field_1_number_of_sheets = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(SupBookRecord.class.getName());
        stringBuffer.append(" [SUPBOOK ");
        if (isExternalReferences()) {
            stringBuffer.append("External References nSheets=");
            stringBuffer.append((int) this.field_1_number_of_sheets);
            stringBuffer.append(" url=");
            stringBuffer.append(this.field_2_encoded_url);
        } else if (this._isAddInFunctions) {
            stringBuffer.append("Add-In Functions");
        } else {
            stringBuffer.append("Internal References  nSheets= ");
            stringBuffer.append((int) this.field_1_number_of_sheets);
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public SupBookRecord(String str, String[] strArr) {
        this.field_1_number_of_sheets = (short) strArr.length;
        this.field_2_encoded_url = str;
        this.field_3_sheet_names = strArr;
        this._isAddInFunctions = false;
    }

    public SupBookRecord(RecordInputStream recordInputStream) {
        int remaining = recordInputStream.remaining();
        this.field_1_number_of_sheets = recordInputStream.readShort();
        if (remaining > 4) {
            this._isAddInFunctions = false;
            this.field_2_encoded_url = recordInputStream.readString();
            int i10 = this.field_1_number_of_sheets;
            String[] strArr = new String[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                strArr[i11] = recordInputStream.readString();
            }
            this.field_3_sheet_names = strArr;
            return;
        }
        this.field_2_encoded_url = null;
        this.field_3_sheet_names = null;
        short readShort = recordInputStream.readShort();
        if (readShort == 1025) {
            this._isAddInFunctions = false;
        } else if (readShort == 14849) {
            this._isAddInFunctions = true;
            if (this.field_1_number_of_sheets != 1) {
                throw new RuntimeException(h.g(new StringBuilder("Expected 0x0001 for number of sheets field in 'Add-In Functions' but got ("), this.field_1_number_of_sheets, ")"));
            }
        } else {
            throw new RuntimeException("invalid EXTERNALBOOK code (" + Integer.toHexString(readShort) + ")");
        }
    }
}
