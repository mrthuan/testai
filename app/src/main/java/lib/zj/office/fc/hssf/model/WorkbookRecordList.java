package lib.zj.office.fc.hssf.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.hssf.record.Record;

/* loaded from: classes3.dex */
public final class WorkbookRecordList implements Iterable<Record> {
    private List<Record> records = new ArrayList();
    private int protpos = 0;
    private int bspos = 0;
    private int tabpos = 0;
    private int fontpos = 0;
    private int xfpos = 0;
    private int backuppos = 0;
    private int namepos = 0;
    private int supbookpos = 0;
    private int externsheetPos = 0;
    private int palettepos = -1;

    public void add(int i10, Record record) {
        this.records.add(i10, record);
        if (getProtpos() >= i10) {
            setProtpos(this.protpos + 1);
        }
        if (getBspos() >= i10) {
            setBspos(this.bspos + 1);
        }
        if (getTabpos() >= i10) {
            setTabpos(this.tabpos + 1);
        }
        if (getFontpos() >= i10) {
            setFontpos(this.fontpos + 1);
        }
        if (getXfpos() >= i10) {
            setXfpos(this.xfpos + 1);
        }
        if (getBackuppos() >= i10) {
            setBackuppos(this.backuppos + 1);
        }
        if (getNamepos() >= i10) {
            setNamepos(this.namepos + 1);
        }
        if (getSupbookpos() >= i10) {
            setSupbookpos(this.supbookpos + 1);
        }
        if (getPalettepos() != -1 && getPalettepos() >= i10) {
            setPalettepos(this.palettepos + 1);
        }
        if (getExternsheetPos() >= i10) {
            setExternsheetPos(getExternsheetPos() + 1);
        }
    }

    public Record get(int i10) {
        return this.records.get(i10);
    }

    public int getBackuppos() {
        return this.backuppos;
    }

    public int getBspos() {
        return this.bspos;
    }

    public int getExternsheetPos() {
        return this.externsheetPos;
    }

    public int getFontpos() {
        return this.fontpos;
    }

    public int getNamepos() {
        return this.namepos;
    }

    public int getPalettepos() {
        return this.palettepos;
    }

    public int getProtpos() {
        return this.protpos;
    }

    public List<Record> getRecords() {
        return this.records;
    }

    public int getSupbookpos() {
        return this.supbookpos;
    }

    public int getTabpos() {
        return this.tabpos;
    }

    public int getXfpos() {
        return this.xfpos;
    }

    @Override // java.lang.Iterable
    public Iterator<Record> iterator() {
        return this.records.iterator();
    }

    public void remove(Object obj) {
        remove(this.records.indexOf(obj));
    }

    public void setBackuppos(int i10) {
        this.backuppos = i10;
    }

    public void setBspos(int i10) {
        this.bspos = i10;
    }

    public void setExternsheetPos(int i10) {
        this.externsheetPos = i10;
    }

    public void setFontpos(int i10) {
        this.fontpos = i10;
    }

    public void setNamepos(int i10) {
        this.namepos = i10;
    }

    public void setPalettepos(int i10) {
        this.palettepos = i10;
    }

    public void setProtpos(int i10) {
        this.protpos = i10;
    }

    public void setRecords(List<Record> list) {
        this.records = list;
    }

    public void setSupbookpos(int i10) {
        this.supbookpos = i10;
    }

    public void setTabpos(int i10) {
        this.tabpos = i10;
    }

    public void setXfpos(int i10) {
        this.xfpos = i10;
    }

    public int size() {
        return this.records.size();
    }

    public void remove(int i10) {
        this.records.remove(i10);
        if (getProtpos() >= i10) {
            setProtpos(this.protpos - 1);
        }
        if (getBspos() >= i10) {
            setBspos(this.bspos - 1);
        }
        if (getTabpos() >= i10) {
            setTabpos(this.tabpos - 1);
        }
        if (getFontpos() >= i10) {
            setFontpos(this.fontpos - 1);
        }
        if (getXfpos() >= i10) {
            setXfpos(this.xfpos - 1);
        }
        if (getBackuppos() >= i10) {
            setBackuppos(this.backuppos - 1);
        }
        if (getNamepos() >= i10) {
            setNamepos(getNamepos() - 1);
        }
        if (getSupbookpos() >= i10) {
            setSupbookpos(getSupbookpos() - 1);
        }
        if (getPalettepos() != -1 && getPalettepos() >= i10) {
            setPalettepos(this.palettepos - 1);
        }
        if (getExternsheetPos() >= i10) {
            setExternsheetPos(getExternsheetPos() - 1);
        }
    }
}
