package lib.zj.office.fc.hssf.util;

/* loaded from: classes3.dex */
public class ColumnInfo {
    private int _colWidth;
    private int _firstCol;
    private int _lastCol;
    private boolean hidden;
    private int style;

    public ColumnInfo(int i10, int i11, int i12, int i13, boolean z10) {
        this._firstCol = i10;
        this._lastCol = i11;
        this._colWidth = i12;
        setStyle(i13);
        this.hidden = z10;
    }

    public int getColWidth() {
        return this._colWidth;
    }

    public int getFirstCol() {
        return this._firstCol;
    }

    public int getLastCol() {
        return this._lastCol;
    }

    public int getStyle() {
        return this.style;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    public void setColWidth(int i10) {
        this._colWidth = i10;
    }

    public void setFirstCol(int i10) {
        this._firstCol = i10;
    }

    public void setHidden(boolean z10) {
        this.hidden = z10;
    }

    public void setLastCol(int i10) {
        this._lastCol = i10;
    }

    public void setStyle(int i10) {
        this.style = i10;
    }
}
