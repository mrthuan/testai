package lib.zj.office.fc.hssf.usermodel;

import lib.zj.office.fc.hssf.record.HyperlinkRecord;
import lib.zj.office.fc.ss.usermodel.IHyperlink;

/* loaded from: classes3.dex */
public class HSSFHyperlink implements IHyperlink {
    public static final int LINK_DOCUMENT = 2;
    public static final int LINK_EMAIL = 3;
    public static final int LINK_FILE = 4;
    public static final int LINK_URL = 1;
    protected int link_type;
    protected HyperlinkRecord record;

    public HSSFHyperlink(int i10) {
        this.record = null;
        this.link_type = i10;
        HyperlinkRecord hyperlinkRecord = new HyperlinkRecord();
        this.record = hyperlinkRecord;
        if (i10 != 1) {
            if (i10 == 2) {
                hyperlinkRecord.newDocumentLink();
                return;
            } else if (i10 != 3) {
                if (i10 != 4) {
                    return;
                }
                hyperlinkRecord.newFileLink();
                return;
            }
        }
        hyperlinkRecord.newUrlLink();
    }

    @Override // lib.zj.office.fc.usermodel.Hyperlink
    public String getAddress() {
        return this.record.getAddress();
    }

    @Override // lib.zj.office.fc.ss.usermodel.IHyperlink
    public int getFirstColumn() {
        return this.record.getFirstColumn();
    }

    @Override // lib.zj.office.fc.ss.usermodel.IHyperlink
    public int getFirstRow() {
        return this.record.getFirstRow();
    }

    @Override // lib.zj.office.fc.usermodel.Hyperlink
    public String getLabel() {
        return this.record.getLabel();
    }

    @Override // lib.zj.office.fc.ss.usermodel.IHyperlink
    public int getLastColumn() {
        return this.record.getLastColumn();
    }

    @Override // lib.zj.office.fc.ss.usermodel.IHyperlink
    public int getLastRow() {
        return this.record.getLastRow();
    }

    public String getShortFilename() {
        return this.record.getShortFilename();
    }

    public String getTextMark() {
        return this.record.getTextMark();
    }

    @Override // lib.zj.office.fc.usermodel.Hyperlink
    public int getType() {
        return this.link_type;
    }

    @Override // lib.zj.office.fc.usermodel.Hyperlink
    public void setAddress(String str) {
        this.record.setAddress(str);
    }

    @Override // lib.zj.office.fc.ss.usermodel.IHyperlink
    public void setFirstColumn(int i10) {
        this.record.setFirstColumn((short) i10);
    }

    @Override // lib.zj.office.fc.ss.usermodel.IHyperlink
    public void setFirstRow(int i10) {
        this.record.setFirstRow(i10);
    }

    @Override // lib.zj.office.fc.usermodel.Hyperlink
    public void setLabel(String str) {
        this.record.setLabel(str);
    }

    @Override // lib.zj.office.fc.ss.usermodel.IHyperlink
    public void setLastColumn(int i10) {
        this.record.setLastColumn((short) i10);
    }

    @Override // lib.zj.office.fc.ss.usermodel.IHyperlink
    public void setLastRow(int i10) {
        this.record.setLastRow(i10);
    }

    public void setShortFilename(String str) {
        this.record.setShortFilename(str);
    }

    public void setTextMark(String str) {
        this.record.setTextMark(str);
    }

    public HSSFHyperlink(HyperlinkRecord hyperlinkRecord) {
        this.record = hyperlinkRecord;
        if (hyperlinkRecord.isFileLink()) {
            this.link_type = 4;
        } else if (hyperlinkRecord.isDocumentLink()) {
            this.link_type = 2;
        } else if (hyperlinkRecord.getAddress() != null && hyperlinkRecord.getAddress().startsWith("mailto:")) {
            this.link_type = 3;
        } else {
            this.link_type = 1;
        }
    }
}
