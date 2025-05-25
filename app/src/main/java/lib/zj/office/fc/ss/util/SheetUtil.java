package lib.zj.office.fc.ss.util;

import java.awt.font.TextAttribute;
import java.text.AttributedString;
import lib.zj.office.fc.ss.usermodel.CellValue;
import lib.zj.office.fc.ss.usermodel.FormulaEvaluator;
import lib.zj.office.fc.ss.usermodel.ICell;
import lib.zj.office.fc.ss.usermodel.IFont;
import lib.zj.office.fc.ss.usermodel.Sheet;

/* loaded from: classes3.dex */
public class SheetUtil {
    private static final char defaultChar = '0';
    private static final FormulaEvaluator dummyEvaluator = new FormulaEvaluator() { // from class: lib.zj.office.fc.ss.util.SheetUtil.1
        @Override // lib.zj.office.fc.ss.usermodel.FormulaEvaluator
        public CellValue evaluate(ICell iCell) {
            return null;
        }

        @Override // lib.zj.office.fc.ss.usermodel.FormulaEvaluator
        public int evaluateFormulaCell(ICell iCell) {
            return iCell.getCachedFormulaResultType();
        }

        @Override // lib.zj.office.fc.ss.usermodel.FormulaEvaluator
        public ICell evaluateInCell(ICell iCell) {
            return null;
        }

        @Override // lib.zj.office.fc.ss.usermodel.FormulaEvaluator
        public void clearAllCachedResultValues() {
        }

        @Override // lib.zj.office.fc.ss.usermodel.FormulaEvaluator
        public void evaluateAll() {
        }

        @Override // lib.zj.office.fc.ss.usermodel.FormulaEvaluator
        public void notifyDeleteCell(ICell iCell) {
        }

        @Override // lib.zj.office.fc.ss.usermodel.FormulaEvaluator
        public void notifySetFormula(ICell iCell) {
        }

        @Override // lib.zj.office.fc.ss.usermodel.FormulaEvaluator
        public void notifyUpdateCell(ICell iCell) {
        }
    };
    private static final double fontHeightMultiple = 2.0d;

    public static boolean containsCell(HSSFCellRangeAddress hSSFCellRangeAddress, int i10, int i11) {
        if (hSSFCellRangeAddress.getFirstRow() <= i10 && hSSFCellRangeAddress.getLastRow() >= i10 && hSSFCellRangeAddress.getFirstColumn() <= i11 && hSSFCellRangeAddress.getLastColumn() >= i11) {
            return true;
        }
        return false;
    }

    private static void copyAttributes(IFont iFont, AttributedString attributedString, int i10, int i11) {
        attributedString.addAttribute(TextAttribute.FAMILY, iFont.getFontName(), i10, i11);
        attributedString.addAttribute(TextAttribute.SIZE, Float.valueOf(iFont.getFontHeightInPoints()));
        if (iFont.getBoldweight() == 700) {
            attributedString.addAttribute(TextAttribute.WEIGHT, TextAttribute.WEIGHT_BOLD, i10, i11);
        }
        if (iFont.getItalic()) {
            attributedString.addAttribute(TextAttribute.POSTURE, TextAttribute.POSTURE_OBLIQUE, i10, i11);
        }
        if (iFont.getUnderline() == 1) {
            attributedString.addAttribute(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON, i10, i11);
        }
    }

    public static double getColumnWidth(Sheet sheet, int i10, boolean z10) {
        return 0.0d;
    }
}
