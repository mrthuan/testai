package lib.zj.office.fc.hssf.usermodel;

import lib.zj.office.fc.hssf.record.HeaderRecord;
import lib.zj.office.fc.hssf.record.aggregates.PageSettingsBlock;
import lib.zj.office.fc.ss.usermodel.Header;

/* loaded from: classes3.dex */
public final class HSSFHeader extends HeaderFooter implements Header {
    private final PageSettingsBlock _psb;

    public HSSFHeader(PageSettingsBlock pageSettingsBlock) {
        this._psb = pageSettingsBlock;
    }

    @Override // lib.zj.office.fc.hssf.usermodel.HeaderFooter
    public String getRawText() {
        HeaderRecord header = this._psb.getHeader();
        if (header == null) {
            return "";
        }
        return header.getText();
    }

    @Override // lib.zj.office.fc.hssf.usermodel.HeaderFooter
    public void setHeaderFooterText(String str) {
        HeaderRecord header = this._psb.getHeader();
        if (header == null) {
            this._psb.setHeader(new HeaderRecord(str));
            return;
        }
        header.setText(str);
    }
}
