package lib.zj.office.fc.hssf.usermodel;

import lib.zj.office.fc.hssf.record.FooterRecord;
import lib.zj.office.fc.hssf.record.aggregates.PageSettingsBlock;
import lib.zj.office.fc.ss.usermodel.Footer;

/* loaded from: classes3.dex */
public final class HSSFFooter extends HeaderFooter implements Footer {
    private final PageSettingsBlock _psb;

    public HSSFFooter(PageSettingsBlock pageSettingsBlock) {
        this._psb = pageSettingsBlock;
    }

    @Override // lib.zj.office.fc.hssf.usermodel.HeaderFooter
    public String getRawText() {
        FooterRecord footer = this._psb.getFooter();
        if (footer == null) {
            return "";
        }
        return footer.getText();
    }

    @Override // lib.zj.office.fc.hssf.usermodel.HeaderFooter
    public void setHeaderFooterText(String str) {
        FooterRecord footer = this._psb.getFooter();
        if (footer == null) {
            this._psb.setFooter(new FooterRecord(str));
            return;
        }
        footer.setText(str);
    }
}
