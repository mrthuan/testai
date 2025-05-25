// Auto-fixed: added missing class declaration
public class SpreadsheetVersion {
package lib.zj.office.fc.ss;

import com.google.android.gms.common.api.Api;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.ss.util.CellReference;

/* loaded from: classes3.dex */
public enum SpreadsheetVersion {
    EXCEL97(65536, 256, 30, 3, 32767),
    EXCEL2007(1048576, 16384, FunctionEval.FunctionID.EXTERNAL_FUNC, Api.BaseClientBuilder.API_PRIORITY_OTHER, 32767);
    
    private final int _maxColumns;
    private final int _maxCondFormats;
    private final int _maxFunctionArgs;
    private final int _maxRows;
    private final int _maxTextLength;

    SpreadsheetVersion(int i10, int i11, int i12, int i13, int i14) {
        this._maxRows = i10;
        this._maxColumns = i11;
        this._maxFunctionArgs = i12;
        this._maxCondFormats = i13;
        this._maxTextLength = i14;
    }

    public int getLastColumnIndex() {
        return this._maxColumns - 1;
    }

    public String getLastColumnName() {
        return CellReference.convertNumToColString(getLastColumnIndex());
    }

    public int getLastRowIndex() {
        return this._maxRows - 1;
    }

    public int getMaxColumns() {
        return this._maxColumns;
    }

    public int getMaxConditionalFormats() {
        return this._maxCondFormats;
    }

    public int getMaxFunctionArgs() {
        return this._maxFunctionArgs;
    }

    public int getMaxRows() {
        return this._maxRows;
    }

    public int getMaxTextLength() {
        return this._maxTextLength;
    }
}

}
