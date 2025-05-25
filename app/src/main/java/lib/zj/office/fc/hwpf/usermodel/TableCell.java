package lib.zj.office.fc.hwpf.usermodel;

/* loaded from: classes3.dex */
public final class TableCell extends Range {
    private int _leftEdge;
    private int _levelNum;
    private TableCellDescriptor _tcd;
    private int _width;

    public TableCell(int i10, int i11, TableRow tableRow, int i12, TableCellDescriptor tableCellDescriptor, int i13, int i14) {
        super(i10, i11, tableRow);
        this._tcd = tableCellDescriptor;
        this._leftEdge = i13;
        this._width = i14;
        this._levelNum = i12;
    }

    public BorderCode getBrcBottom() {
        return this._tcd.getBrcBottom();
    }

    public BorderCode getBrcLeft() {
        return this._tcd.getBrcLeft();
    }

    public BorderCode getBrcRight() {
        return this._tcd.getBrcRight();
    }

    public BorderCode getBrcTop() {
        return this._tcd.getBrcTop();
    }

    public TableCellDescriptor getDescriptor() {
        return this._tcd;
    }

    public int getLeftEdge() {
        return this._leftEdge;
    }

    public byte getVertAlign() {
        return this._tcd.getVertAlign();
    }

    public int getWidth() {
        return this._width;
    }

    public boolean isBackward() {
        return this._tcd.isFBackward();
    }

    public boolean isFirstMerged() {
        return this._tcd.isFFirstMerged();
    }

    public boolean isFirstVerticallyMerged() {
        return this._tcd.isFVertRestart();
    }

    public boolean isMerged() {
        return this._tcd.isFMerged();
    }

    public boolean isRotateFont() {
        return this._tcd.isFRotateFont();
    }

    public boolean isVertical() {
        return this._tcd.isFVertical();
    }

    public boolean isVerticallyMerged() {
        return this._tcd.isFVertMerge();
    }
}
