package lib.zj.office.fc.hwpf.usermodel;

/* loaded from: classes3.dex */
public final class TableIterator {
    int _index;
    int _levelNum;
    Range _range;

    public TableIterator(Range range, int i10) {
        this._range = range;
        this._index = 0;
        this._levelNum = i10;
    }

    public boolean hasNext() {
        int numParagraphs = this._range.numParagraphs();
        while (true) {
            int i10 = this._index;
            if (i10 < numParagraphs) {
                Paragraph paragraph = this._range.getParagraph(i10);
                if (paragraph.isInTable() && paragraph.getTableLevel() == this._levelNum) {
                    return true;
                }
                this._index++;
            } else {
                return false;
            }
        }
    }

    public Table next() {
        int i10;
        int numParagraphs = this._range.numParagraphs();
        int i11 = this._index;
        while (true) {
            int i12 = this._index;
            if (i12 < numParagraphs) {
                Paragraph paragraph = this._range.getParagraph(i12);
                if (!paragraph.isInTable() || paragraph.getTableLevel() < this._levelNum) {
                    break;
                }
                this._index++;
            } else {
                i10 = i11;
                break;
            }
        }
        i10 = this._index;
        return new Table(this._range.getParagraph(i11).getStartOffset(), this._range.getParagraph(i10 - 1).getEndOffset(), this._range, this._levelNum);
    }

    public TableIterator(Range range) {
        this(range, 1);
    }
}
