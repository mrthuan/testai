package lib.zj.office.fc.hwpf.usermodel;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class Table extends Range {
    private ArrayList<TableRow> _rows;
    private boolean _rowsFound;
    private int _tableLevel;

    public Table(int i10, int i11, Range range, int i12) {
        super(i10, i11, range);
        this._rowsFound = false;
        this._tableLevel = i12;
        initRows();
    }

    private void initRows() {
        Paragraph paragraph;
        Paragraph paragraph2;
        if (this._rowsFound) {
            return;
        }
        this._rows = new ArrayList<>();
        int numParagraphs = numParagraphs();
        int i10 = 0;
        while (true) {
            int i11 = i10;
            while (i10 < numParagraphs) {
                paragraph = getParagraph(i11);
                paragraph2 = getParagraph(i10);
                i10++;
                if (!paragraph2.isTableRowEnd() || paragraph2.getTableLevel() != this._tableLevel) {
                }
            }
            this._rowsFound = true;
            return;
            this._rows.add(new TableRow(paragraph.getStartOffset(), paragraph2.getEndOffset(), this, this._tableLevel));
        }
    }

    public TableRow getRow(int i10) {
        initRows();
        return this._rows.get(i10);
    }

    public int getTableLevel() {
        return this._tableLevel;
    }

    public int numRows() {
        initRows();
        return this._rows.size();
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Range
    public void reset() {
        this._rowsFound = false;
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Range
    public int type() {
        return 5;
    }
}
