package lib.zj.office.fc.hssf.usermodel;

import lib.zj.office.fc.ss.usermodel.CreationHelper;

/* loaded from: classes3.dex */
public class HSSFCreationHelper implements CreationHelper {
    private HSSFDataFormat dataFormat;
    private HSSFWorkbook workbook;

    public HSSFCreationHelper(HSSFWorkbook hSSFWorkbook) {
        this.workbook = hSSFWorkbook;
        this.dataFormat = new HSSFDataFormat(this.workbook.getWorkbook());
    }

    @Override // lib.zj.office.fc.ss.usermodel.CreationHelper
    public HSSFFormulaEvaluator createFormulaEvaluator() {
        return null;
    }

    @Override // lib.zj.office.fc.ss.usermodel.CreationHelper
    public HSSFClientAnchor createClientAnchor() {
        return new HSSFClientAnchor();
    }

    @Override // lib.zj.office.fc.ss.usermodel.CreationHelper
    public HSSFDataFormat createDataFormat() {
        return this.dataFormat;
    }

    @Override // lib.zj.office.fc.ss.usermodel.CreationHelper
    public HSSFHyperlink createHyperlink(int i10) {
        return new HSSFHyperlink(i10);
    }

    @Override // lib.zj.office.fc.ss.usermodel.CreationHelper
    public HSSFRichTextString createRichTextString(String str) {
        return new HSSFRichTextString(str);
    }
}
