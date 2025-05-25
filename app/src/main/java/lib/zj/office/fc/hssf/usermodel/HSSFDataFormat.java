package lib.zj.office.fc.hssf.usermodel;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import lib.zj.office.fc.hssf.model.InternalWorkbook;
import lib.zj.office.fc.hssf.record.FormatRecord;
import lib.zj.office.fc.ss.usermodel.BuiltinFormats;
import lib.zj.office.fc.ss.usermodel.DataFormat;

/* loaded from: classes3.dex */
public final class HSSFDataFormat implements DataFormat {
    private static final String[] _builtinFormats = BuiltinFormats.getAll();
    private final Vector<String> _formats = new Vector<>();
    private boolean _movedBuiltins = false;
    private final InternalWorkbook _workbook;

    public HSSFDataFormat(InternalWorkbook internalWorkbook) {
        this._workbook = internalWorkbook;
        for (FormatRecord formatRecord : internalWorkbook.getFormats()) {
            ensureFormatsSize(formatRecord.getIndexCode());
            this._formats.set(formatRecord.getIndexCode(), formatRecord.getFormatString());
        }
    }

    private void ensureFormatsSize(int i10) {
        if (this._formats.size() <= i10) {
            this._formats.setSize(i10 + 1);
        }
    }

    public static short getBuiltinFormat(String str) {
        return (short) BuiltinFormats.getBuiltinFormat(str);
    }

    public static List<String> getBuiltinFormats() {
        return Arrays.asList(_builtinFormats);
    }

    public static String getFormatCode(InternalWorkbook internalWorkbook, short s4) {
        String str;
        if (s4 == -1) {
            return null;
        }
        for (FormatRecord formatRecord : internalWorkbook.getFormats()) {
            if (s4 == formatRecord.getIndexCode()) {
                return formatRecord.getFormatString();
            }
        }
        String[] strArr = _builtinFormats;
        if (strArr.length <= s4 || (str = strArr[s4]) == null) {
            return null;
        }
        return str;
    }

    public static int getNumberOfBuiltinBuiltinFormats() {
        return _builtinFormats.length;
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataFormat
    public short getFormat(String str) {
        if (str.toUpperCase().equals("TEXT")) {
            str = "@";
        }
        if (!this._movedBuiltins) {
            int i10 = 0;
            while (true) {
                String[] strArr = _builtinFormats;
                if (i10 >= strArr.length) {
                    break;
                }
                ensureFormatsSize(i10);
                if (this._formats.get(i10) == null) {
                    this._formats.set(i10, strArr[i10]);
                }
                i10++;
            }
            this._movedBuiltins = true;
        }
        for (int i11 = 0; i11 < this._formats.size(); i11++) {
            if (str.equals(this._formats.get(i11))) {
                return (short) i11;
            }
        }
        short format = this._workbook.getFormat(str, true);
        ensureFormatsSize(format);
        this._formats.set(format, str);
        return format;
    }

    public static String getBuiltinFormat(short s4) {
        return BuiltinFormats.getBuiltinFormat(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataFormat
    public String getFormat(short s4) {
        String str;
        if (this._movedBuiltins) {
            return this._formats.get(s4);
        }
        if (s4 == -1) {
            return null;
        }
        String str2 = this._formats.size() > s4 ? this._formats.get(s4) : null;
        String[] strArr = _builtinFormats;
        return (strArr.length <= s4 || (str = strArr[s4]) == null || str2 != null) ? str2 : str;
    }
}
