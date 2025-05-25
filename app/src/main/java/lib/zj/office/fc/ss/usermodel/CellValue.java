package lib.zj.office.fc.ss.usermodel;

import a6.h;
import androidx.activity.r;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;

/* loaded from: classes3.dex */
public final class CellValue {
    private final boolean _booleanValue;
    private final int _cellType;
    private final int _errorCode;
    private final double _numberValue;
    private final String _textValue;
    public static final CellValue TRUE = new CellValue(4, 0.0d, true, null, 0);
    public static final CellValue FALSE = new CellValue(4, 0.0d, false, null, 0);

    private CellValue(int i10, double d10, boolean z10, String str, int i11) {
        this._cellType = i10;
        this._numberValue = d10;
        this._booleanValue = z10;
        this._textValue = str;
        this._errorCode = i11;
    }

    public static CellValue getError(int i10) {
        return new CellValue(5, 0.0d, false, null, i10);
    }

    public static CellValue valueOf(boolean z10) {
        if (z10) {
            return TRUE;
        }
        return FALSE;
    }

    public String formatAsString() {
        int i10 = this._cellType;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        return h.g(new StringBuilder("<error unexpected cell type "), this._cellType, ">");
                    }
                    return ErrorEval.getText(this._errorCode);
                } else if (this._booleanValue) {
                    return "TRUE";
                } else {
                    return "FALSE";
                }
            }
            return r.f(new StringBuilder(OperatorName.SHOW_TEXT_LINE_AND_SPACE), this._textValue, '\"');
        }
        return String.valueOf(this._numberValue);
    }

    public boolean getBooleanValue() {
        return this._booleanValue;
    }

    public int getCellType() {
        return this._cellType;
    }

    public byte getErrorValue() {
        return (byte) this._errorCode;
    }

    public double getNumberValue() {
        return this._numberValue;
    }

    public String getStringValue() {
        return this._textValue;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(64);
        stringBuffer.append(CellValue.class.getName());
        stringBuffer.append(" [");
        stringBuffer.append(formatAsString());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public CellValue(double d10) {
        this(0, d10, false, null, 0);
    }

    public CellValue(String str) {
        this(1, 0.0d, false, str, 0);
    }
}
