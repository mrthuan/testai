// Auto-fixed: added missing class declaration
public class FontCharset {
package lib.zj.office.fc.ss.usermodel;

import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: classes3.dex */
public enum FontCharset {
    ANSI(0),
    DEFAULT(1),
    SYMBOL(2),
    MAC(77),
    SHIFTJIS(128),
    HANGEUL(129),
    JOHAB(ShapeTypes.DOUBLE_WAVE),
    GB2312(ShapeTypes.FLOW_CHART_INPUT_OUTPUT),
    CHINESEBIG5(ShapeTypes.FLOW_CHART_INTERNAL_STORAGE),
    GREEK(ShapeTypes.ACTION_BUTTON_BLANK),
    TURKISH(ShapeTypes.ACTION_BUTTON_HOME),
    VIETNAMESE(ShapeTypes.ACTION_BUTTON_HELP),
    HEBREW(ShapeTypes.MATH_MINUS),
    ARABIC(ShapeTypes.MATH_MULTIPLY),
    BALTIC(ShapeTypes.CHART_STAR),
    RUSSIAN(204),
    THAI(222),
    EASTEUROPE(238),
    OEM(FunctionEval.FunctionID.EXTERNAL_FUNC);
    
    private static FontCharset[] _table = new FontCharset[256];
    private int charset;

    static {
        FontCharset[] values;
        for (FontCharset fontCharset : values()) {
            _table[fontCharset.getValue()] = fontCharset;
        }
    }

    FontCharset(int i10) {
        this.charset = i10;
    }

    public int getValue() {
        return this.charset;
    }

    public static FontCharset valueOf(int i10) {
        FontCharset[] fontCharsetArr = _table;
        if (i10 >= fontCharsetArr.length) {
            return null;
        }
        return fontCharsetArr[i10];
    }
}

}
