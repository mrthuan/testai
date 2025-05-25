package lib.zj.office.fc.ss.usermodel;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.math.RoundingMode;
import java.text.DateFormatSymbols;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public class ExcelStyleDateFormatter extends SimpleDateFormat {
    public static final char HH_BRACKET_SYMBOL = 57361;
    public static final char H_BRACKET_SYMBOL = 57360;
    public static final char LL_BRACKET_SYMBOL = 57367;
    public static final char L_BRACKET_SYMBOL = 57366;
    public static final char MMMMM_START_SYMBOL = 57345;
    public static final char MMMMM_TRUNCATE_SYMBOL = 57346;
    public static final char MM_BRACKET_SYMBOL = 57363;
    public static final char M_BRACKET_SYMBOL = 57362;
    public static final char SS_BRACKET_SYMBOL = 57365;
    public static final char S_BRACKET_SYMBOL = 57364;
    private double dateToBeFormatted;
    private DecimalFormat format1digit;
    private DecimalFormat format2digits;
    private DecimalFormat format3digit;
    private DecimalFormat format4digits;

    public ExcelStyleDateFormatter() {
        this.format1digit = new DecimalFormat(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
        this.format2digits = new DecimalFormat("00");
        this.format3digit = new DecimalFormat(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
        this.format4digits = new DecimalFormat("00");
        DataFormatter.setExcelStyleRoundingMode(this.format1digit, RoundingMode.DOWN);
        DataFormatter.setExcelStyleRoundingMode(this.format2digits, RoundingMode.DOWN);
        DataFormatter.setExcelStyleRoundingMode(this.format3digit);
        DataFormatter.setExcelStyleRoundingMode(this.format4digits);
        this.dateToBeFormatted = 0.0d;
    }

    private static String processFormatPattern(String str) {
        return str.replaceAll("MMMMM", "\ue001MMM\ue002").replaceAll("\\[H\\]", String.valueOf((char) H_BRACKET_SYMBOL)).replaceAll("\\[HH\\]", String.valueOf((char) HH_BRACKET_SYMBOL)).replaceAll("\\[m\\]", String.valueOf((char) M_BRACKET_SYMBOL)).replaceAll("\\[mm\\]", String.valueOf((char) MM_BRACKET_SYMBOL)).replaceAll("\\[s\\]", String.valueOf((char) S_BRACKET_SYMBOL)).replaceAll("\\[ss\\]", String.valueOf((char) SS_BRACKET_SYMBOL)).replaceAll("s.000", "s.S").replaceAll("s.00", "s.\ue017").replaceAll("s.0", "s.\ue016");
    }

    @Override // java.text.SimpleDateFormat, java.text.DateFormat
    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        float floor;
        String stringBuffer2 = super.format(date, stringBuffer, fieldPosition).toString();
        if (stringBuffer2.indexOf(57345) != -1) {
            stringBuffer2 = stringBuffer2.replaceAll("\ue001(\\w)\\w+\ue002", "$1");
        }
        if (stringBuffer2.indexOf(57360) != -1 || stringBuffer2.indexOf(57361) != -1) {
            double d10 = ((float) this.dateToBeFormatted) * 24.0f;
            stringBuffer2 = stringBuffer2.replaceAll(String.valueOf((char) H_BRACKET_SYMBOL), this.format1digit.format(d10)).replaceAll(String.valueOf((char) HH_BRACKET_SYMBOL), this.format2digits.format(d10));
        }
        if (stringBuffer2.indexOf(57362) != -1 || stringBuffer2.indexOf(57363) != -1) {
            double d11 = ((float) this.dateToBeFormatted) * 24.0f * 60.0f;
            stringBuffer2 = stringBuffer2.replaceAll(String.valueOf((char) M_BRACKET_SYMBOL), this.format1digit.format(d11)).replaceAll(String.valueOf((char) MM_BRACKET_SYMBOL), this.format2digits.format(d11));
        }
        if (stringBuffer2.indexOf(57364) != -1 || stringBuffer2.indexOf(57365) != -1) {
            double d12 = (float) (this.dateToBeFormatted * 24.0d * 60.0d * 60.0d);
            stringBuffer2 = stringBuffer2.replaceAll(String.valueOf((char) S_BRACKET_SYMBOL), this.format1digit.format(d12)).replaceAll(String.valueOf((char) SS_BRACKET_SYMBOL), this.format2digits.format(d12));
        }
        if (stringBuffer2.indexOf(57366) != -1 || stringBuffer2.indexOf(57367) != -1) {
            double d13 = this.dateToBeFormatted;
            float floor2 = ((float) ((((d13 - Math.floor(d13)) * 24.0d) * 60.0d) * 60.0d)) - ((int) floor);
            stringBuffer2 = stringBuffer2.replaceAll(String.valueOf((char) L_BRACKET_SYMBOL), this.format3digit.format(10.0f * floor2)).replaceAll(String.valueOf((char) LL_BRACKET_SYMBOL), this.format4digits.format(floor2 * 100.0f));
        }
        return new StringBuffer(stringBuffer2);
    }

    public void setDateToBeFormatted(double d10) {
        this.dateToBeFormatted = d10;
    }

    public ExcelStyleDateFormatter(String str) {
        super(processFormatPattern(str));
        this.format1digit = new DecimalFormat(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
        this.format2digits = new DecimalFormat("00");
        this.format3digit = new DecimalFormat(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
        this.format4digits = new DecimalFormat("00");
        DataFormatter.setExcelStyleRoundingMode(this.format1digit, RoundingMode.DOWN);
        DataFormatter.setExcelStyleRoundingMode(this.format2digits, RoundingMode.DOWN);
        DataFormatter.setExcelStyleRoundingMode(this.format3digit);
        DataFormatter.setExcelStyleRoundingMode(this.format4digits);
        this.dateToBeFormatted = 0.0d;
    }

    public ExcelStyleDateFormatter(String str, DateFormatSymbols dateFormatSymbols) {
        super(processFormatPattern(str), dateFormatSymbols);
        this.format1digit = new DecimalFormat(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
        this.format2digits = new DecimalFormat("00");
        this.format3digit = new DecimalFormat(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
        this.format4digits = new DecimalFormat("00");
        DataFormatter.setExcelStyleRoundingMode(this.format1digit, RoundingMode.DOWN);
        DataFormatter.setExcelStyleRoundingMode(this.format2digits, RoundingMode.DOWN);
        DataFormatter.setExcelStyleRoundingMode(this.format3digit);
        DataFormatter.setExcelStyleRoundingMode(this.format4digits);
        this.dateToBeFormatted = 0.0d;
    }

    public ExcelStyleDateFormatter(String str, Locale locale) {
        super(processFormatPattern(str), locale);
        this.format1digit = new DecimalFormat(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
        this.format2digits = new DecimalFormat("00");
        this.format3digit = new DecimalFormat(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
        this.format4digits = new DecimalFormat("00");
        DataFormatter.setExcelStyleRoundingMode(this.format1digit, RoundingMode.DOWN);
        DataFormatter.setExcelStyleRoundingMode(this.format2digits, RoundingMode.DOWN);
        DataFormatter.setExcelStyleRoundingMode(this.format3digit);
        DataFormatter.setExcelStyleRoundingMode(this.format4digits);
        this.dateToBeFormatted = 0.0d;
    }
}
