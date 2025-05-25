package lib.zj.office.fc.hssf.formula.ptg;

import lib.zj.office.fc.hssf.formula.EvaluationWorkbook;
import lib.zj.office.fc.hssf.formula.FormulaRenderingWorkbook;
import lib.zj.office.fc.hssf.formula.SheetNameFormatter;

/* loaded from: classes3.dex */
final class ExternSheetNameResolver {
    private ExternSheetNameResolver() {
    }

    public static String prependSheetName(FormulaRenderingWorkbook formulaRenderingWorkbook, int i10, String str) {
        StringBuffer stringBuffer;
        EvaluationWorkbook.ExternalSheet externalSheet = formulaRenderingWorkbook.getExternalSheet(i10);
        if (externalSheet != null) {
            String workbookName = externalSheet.getWorkbookName();
            String sheetName = externalSheet.getSheetName();
            stringBuffer = new StringBuffer(str.length() + sheetName.length() + workbookName.length() + 4);
            SheetNameFormatter.appendFormat(stringBuffer, workbookName, sheetName);
        } else {
            String sheetNameByExternSheet = formulaRenderingWorkbook.getSheetNameByExternSheet(i10);
            stringBuffer = new StringBuffer(str.length() + sheetNameByExternSheet.length() + 4);
            if (sheetNameByExternSheet.length() < 1) {
                stringBuffer.append("#REF");
            } else {
                SheetNameFormatter.appendFormat(stringBuffer, sheetNameByExternSheet);
            }
        }
        stringBuffer.append('!');
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
