package lib.zj.office.fc.hwpf.usermodel;

import androidx.appcompat.view.menu.d;
import java.util.ArrayList;
import lib.zj.office.fc.hwpf.sprm.SprmBuffer;
import lib.zj.office.fc.hwpf.sprm.TableSprmUncompressor;

/* loaded from: classes3.dex */
public final class TableRow extends Range {
    private static final short SPRM_DXAGAPHALF = -27134;
    private static final short SPRM_DYAROWHEIGHT = -27641;
    private static final short SPRM_FCANTSPLIT = 13315;
    private static final short SPRM_FTABLEHEADER = 13316;
    private static final short SPRM_TJC = 21504;
    private static final char TABLE_CELL_MARK = 7;
    private TableCell[] _cells;
    private boolean _cellsFound;
    int _levelNum;
    private SprmBuffer _papx;
    private TableProperties _tprops;

    public TableRow(int i10, int i11, Table table, int i12) {
        super(i10, i11, table);
        this._cellsFound = false;
        SprmBuffer sprmBuffer = getParagraph(numParagraphs() - 1)._papx;
        this._papx = sprmBuffer;
        this._tprops = TableSprmUncompressor.uncompressTAP(sprmBuffer);
        this._levelNum = i12;
        initCells();
    }

    private void initCells() {
        TableCellDescriptor tableCellDescriptor;
        short s4;
        short s10;
        TableCellDescriptor tableCellDescriptor2;
        short s11;
        short s12;
        if (this._cellsFound) {
            return;
        }
        short itcMac = this._tprops.getItcMac();
        ArrayList arrayList = new ArrayList(itcMac + 1);
        int i10 = 0;
        for (int i11 = 0; i11 < numParagraphs(); i11++) {
            Paragraph paragraph = getParagraph(i11);
            String text = paragraph.text();
            if (((text.length() > 0 && text.charAt(text.length() - 1) == 7) || paragraph.isEmbeddedCellMark()) && paragraph.getTableLevel() == this._levelNum) {
                if (this._tprops.getRgtc() != null && this._tprops.getRgtc().length > arrayList.size()) {
                    tableCellDescriptor2 = this._tprops.getRgtc()[arrayList.size()];
                } else {
                    tableCellDescriptor2 = new TableCellDescriptor();
                }
                if (tableCellDescriptor2 == null) {
                    tableCellDescriptor2 = new TableCellDescriptor();
                }
                TableCellDescriptor tableCellDescriptor3 = tableCellDescriptor2;
                if (this._tprops.getRgdxaCenter() != null && this._tprops.getRgdxaCenter().length > arrayList.size()) {
                    s11 = this._tprops.getRgdxaCenter()[arrayList.size()];
                } else {
                    s11 = 0;
                }
                if (this._tprops.getRgdxaCenter() != null && this._tprops.getRgdxaCenter().length > arrayList.size() + 1) {
                    s12 = this._tprops.getRgdxaCenter()[arrayList.size() + 1];
                } else {
                    s12 = 0;
                }
                int i12 = s12 - s11;
                if (arrayList.size() == 0 || arrayList.size() + 2 >= this._tprops.getRgdxaCenter().length) {
                    i12 -= this._tprops.getTCellSpacingDefault() * 2;
                }
                arrayList.add(new TableCell(getParagraph(i10).getStartOffset(), getParagraph(i11).getEndOffset(), this, this._levelNum, tableCellDescriptor3, s11, i12));
                i10 = i11 + 1;
            }
        }
        if (i10 < numParagraphs() - 1) {
            if (this._tprops.getRgtc() != null && this._tprops.getRgtc().length > arrayList.size()) {
                tableCellDescriptor = this._tprops.getRgtc()[arrayList.size()];
            } else {
                tableCellDescriptor = new TableCellDescriptor();
            }
            TableCellDescriptor tableCellDescriptor4 = tableCellDescriptor;
            if (this._tprops.getRgdxaCenter() != null && this._tprops.getRgdxaCenter().length > arrayList.size()) {
                s4 = this._tprops.getRgdxaCenter()[arrayList.size()];
            } else {
                s4 = 0;
            }
            if (this._tprops.getRgdxaCenter() != null && this._tprops.getRgdxaCenter().length > arrayList.size() + 1) {
                s10 = this._tprops.getRgdxaCenter()[arrayList.size() + 1];
            } else {
                s10 = 0;
            }
            arrayList.add(new TableCell(i10, numParagraphs() - 1, this, this._levelNum, tableCellDescriptor4, s4, s10 - s4));
        }
        if (!arrayList.isEmpty()) {
            TableCell tableCell = (TableCell) d.b(arrayList, 1);
            if (tableCell.numParagraphs() == 1 && tableCell.getParagraph(0).isTableRowEnd()) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        if (arrayList.size() != itcMac) {
            this._tprops.setItcMac((short) arrayList.size());
        }
        this._cells = (TableCell[]) arrayList.toArray(new TableCell[arrayList.size()]);
        this._cellsFound = true;
    }

    public boolean cantSplit() {
        return this._tprops.getFCantSplit();
    }

    public BorderCode getBarBorder() {
        throw new UnsupportedOperationException("not applicable for TableRow");
    }

    public BorderCode getBottomBorder() {
        return this._tprops.getBrcBottom();
    }

    public TableCell getCell(int i10) {
        initCells();
        return this._cells[i10];
    }

    public int getCellSpacingDefault() {
        return this._tprops.getTCellSpacingDefault();
    }

    public int getGapHalf() {
        return this._tprops.getDxaGapHalf();
    }

    public BorderCode getHorizontalBorder() {
        return this._tprops.getBrcHorizontal();
    }

    public BorderCode getLeftBorder() {
        return this._tprops.getBrcLeft();
    }

    public BorderCode getRightBorder() {
        return this._tprops.getBrcRight();
    }

    public int getRowHeight() {
        return this._tprops.getDyaRowHeight();
    }

    public int getRowJustification() {
        return this._tprops.getJc();
    }

    public int getTableIndent() {
        return this._tprops.getTableInIndent();
    }

    public BorderCode getTopBorder() {
        return this._tprops.getBrcBottom();
    }

    public BorderCode getVerticalBorder() {
        return this._tprops.getBrcVertical();
    }

    public boolean isTableHeader() {
        return this._tprops.getFTableHeader();
    }

    public int numCells() {
        initCells();
        return this._cells.length;
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Range
    public void reset() {
        this._cellsFound = false;
    }

    public void setCantSplit(boolean z10) {
        this._tprops.setFCantSplit(z10);
        this._papx.updateSprm(SPRM_FCANTSPLIT, z10 ? (byte) 1 : (byte) 0);
    }

    public void setGapHalf(int i10) {
        this._tprops.setDxaGapHalf(i10);
        this._papx.updateSprm(SPRM_DXAGAPHALF, (short) i10);
    }

    public void setRowHeight(int i10) {
        this._tprops.setDyaRowHeight(i10);
        this._papx.updateSprm(SPRM_DYAROWHEIGHT, (short) i10);
    }

    public void setRowJustification(int i10) {
        short s4 = (short) i10;
        this._tprops.setJc(s4);
        this._papx.updateSprm(SPRM_TJC, s4);
    }

    public void setTableHeader(boolean z10) {
        this._tprops.setFTableHeader(z10);
        this._papx.updateSprm(SPRM_FTABLEHEADER, z10 ? (byte) 1 : (byte) 0);
    }
}
