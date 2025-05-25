package lib.zj.office.fc.hssf.usermodel;

import a0.d;
import b.a;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;

/* loaded from: classes3.dex */
public abstract class HeaderFooter implements lib.zj.office.fc.ss.usermodel.HeaderFooter {

    /* loaded from: classes3.dex */
    public enum MarkupTag {
        SHEET_NAME_FIELD("&A", false),
        DATE_FIELD("&D", false),
        FILE_FIELD("&F", false),
        FULL_FILE_FIELD("&Z", false),
        PAGE_FIELD("&P", false),
        TIME_FIELD("&T", false),
        NUM_PAGES_FIELD("&N", false),
        PICTURE_FIELD("&G", false),
        BOLD_FIELD("&B", true),
        ITALIC_FIELD("&I", true),
        STRIKETHROUGH_FIELD("&S", true),
        SUBSCRIPT_FIELD("&Y", true),
        SUPERSCRIPT_FIELD("&X", true),
        UNDERLINE_FIELD("&U", true),
        DOUBLE_UNDERLINE_FIELD("&E", true);
        
        private final boolean _occursInPairs;
        private final String _representation;

        MarkupTag(String str, boolean z10) {
            this._representation = str;
            this._occursInPairs = z10;
        }

        public String getRepresentation() {
            return this._representation;
        }

        public boolean occursPairs() {
            return this._occursInPairs;
        }
    }

    public static String date() {
        return MarkupTag.DATE_FIELD.getRepresentation();
    }

    public static String endBold() {
        return MarkupTag.BOLD_FIELD.getRepresentation();
    }

    public static String endDoubleUnderline() {
        return MarkupTag.DOUBLE_UNDERLINE_FIELD.getRepresentation();
    }

    public static String endUnderline() {
        return MarkupTag.UNDERLINE_FIELD.getRepresentation();
    }

    public static String file() {
        return MarkupTag.FILE_FIELD.getRepresentation();
    }

    public static String font(String str, String str2) {
        return d.d("&\"", str, ",", str2, OperatorName.SHOW_TEXT_LINE_AND_SPACE);
    }

    public static String fontSize(short s4) {
        return a.c("&", s4);
    }

    public static String numPages() {
        return MarkupTag.NUM_PAGES_FIELD.getRepresentation();
    }

    public static String page() {
        return MarkupTag.PAGE_FIELD.getRepresentation();
    }

    private String[] splitParts() {
        String rawText = getRawText();
        String str = "";
        String str2 = "";
        String str3 = str2;
        while (true) {
            if (rawText.length() > 1) {
                if (rawText.charAt(0) != '&') {
                    break;
                }
                int length = rawText.length();
                char charAt = rawText.charAt(1);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt != 'R') {
                            break;
                        }
                        if (rawText.indexOf("&C") >= 0) {
                            length = Math.min(length, rawText.indexOf("&C"));
                        }
                        if (rawText.indexOf("&L") >= 0) {
                            length = Math.min(length, rawText.indexOf("&L"));
                        }
                        str3 = rawText.substring(2, length);
                        rawText = rawText.substring(length);
                    } else {
                        if (rawText.indexOf("&C") >= 0) {
                            length = Math.min(length, rawText.indexOf("&C"));
                        }
                        if (rawText.indexOf("&R") >= 0) {
                            length = Math.min(length, rawText.indexOf("&R"));
                        }
                        str = rawText.substring(2, length);
                        rawText = rawText.substring(length);
                    }
                } else {
                    if (rawText.indexOf("&L") >= 0) {
                        length = Math.min(length, rawText.indexOf("&L"));
                    }
                    if (rawText.indexOf("&R") >= 0) {
                        length = Math.min(length, rawText.indexOf("&R"));
                    }
                    str2 = rawText.substring(2, length);
                    rawText = rawText.substring(length);
                }
            } else {
                rawText = str2;
                break;
            }
        }
        return new String[]{str, rawText, str3};
    }

    public static String startBold() {
        return MarkupTag.BOLD_FIELD.getRepresentation();
    }

    public static String startDoubleUnderline() {
        return MarkupTag.DOUBLE_UNDERLINE_FIELD.getRepresentation();
    }

    public static String startUnderline() {
        return MarkupTag.UNDERLINE_FIELD.getRepresentation();
    }

    public static String stripFields(String str) {
        String representation;
        int indexOf;
        if (str != null && str.length() != 0) {
            for (MarkupTag markupTag : MarkupTag.values()) {
                while (true) {
                    if (str.indexOf(markupTag.getRepresentation()) > -1) {
                        str = str.substring(0, indexOf) + str.substring(representation.length() + indexOf);
                    }
                }
            }
            return str.replaceAll("\\&\\d+", "").replaceAll("\\&\".*?,.*?\"", "");
        }
        return str;
    }

    public static String tab() {
        return MarkupTag.SHEET_NAME_FIELD.getRepresentation();
    }

    public static String time() {
        return MarkupTag.TIME_FIELD.getRepresentation();
    }

    private void updateHeaderFooterText(String[] strArr) {
        String str = strArr[0];
        String str2 = strArr[1];
        String str3 = strArr[2];
        if (str2.length() < 1 && str.length() < 1 && str3.length() < 1) {
            setHeaderFooterText("");
            return;
        }
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("&C");
        sb2.append(str2);
        sb2.append("&L");
        sb2.append(str);
        sb2.append("&R");
        sb2.append(str3);
        setHeaderFooterText(sb2.toString());
    }

    private void updatePart(int i10, String str) {
        String[] splitParts = splitParts();
        if (str == null) {
            str = "";
        }
        splitParts[i10] = str;
        updateHeaderFooterText(splitParts);
    }

    @Override // lib.zj.office.fc.ss.usermodel.HeaderFooter
    public final String getCenter() {
        return splitParts()[1];
    }

    @Override // lib.zj.office.fc.ss.usermodel.HeaderFooter
    public final String getLeft() {
        return splitParts()[0];
    }

    public abstract String getRawText();

    @Override // lib.zj.office.fc.ss.usermodel.HeaderFooter
    public final String getRight() {
        return splitParts()[2];
    }

    @Override // lib.zj.office.fc.ss.usermodel.HeaderFooter
    public final void setCenter(String str) {
        updatePart(1, str);
    }

    public abstract void setHeaderFooterText(String str);

    @Override // lib.zj.office.fc.ss.usermodel.HeaderFooter
    public final void setLeft(String str) {
        updatePart(0, str);
    }

    @Override // lib.zj.office.fc.ss.usermodel.HeaderFooter
    public final void setRight(String str) {
        updatePart(2, str);
    }
}
