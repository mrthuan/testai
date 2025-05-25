package lib.zj.office.fc.ss.usermodel;

import a0.a;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.lang.reflect.InvocationTargetException;
import java.math.RoundingMode;
import java.text.DateFormatSymbols;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import lib.zj.office.ss.util.DateUtil;

/* loaded from: classes3.dex */
public class DataFormatter {
    private static final String invalidDateTimeString;
    private final DateFormatSymbols dateSymbols;
    private final DecimalFormatSymbols decimalSymbols;
    private Format defaultNumFormat;
    private boolean emulateCsv;
    private final Map<String, Format> formats;
    private final Format generalDecimalNumFormat;
    private final Format generalWholeNumFormat;
    private static final Pattern numPattern = Pattern.compile("[0#]+");
    private static final Pattern daysAsText = Pattern.compile("([d]{3,})", 2);
    private static final Pattern amPmPattern = Pattern.compile("((A|P)[M/P]*)", 2);
    private static final Pattern specialPatternGroup = Pattern.compile("(\\[\\$[^-\\]]*-[0-9A-Z]+\\])");
    private static final Pattern colorPattern = Pattern.compile("(\\[BLACK\\])|(\\[BLUE\\])|(\\[CYAN\\])|(\\[GREEN\\])|(\\[MAGENTA\\])|(\\[RED\\])|(\\[WHITE\\])|(\\[YELLOW\\])|(\\[COLOR\\s*\\d\\])|(\\[COLOR\\s*[0-5]\\d\\])", 2);

    /* loaded from: classes3.dex */
    public static final class ConstantStringFormat extends Format {

        /* renamed from: df  reason: collision with root package name */
        private static final DecimalFormat f20683df = DataFormatter.createIntegerOnlyFormat("##########");
        private final String str;

        public ConstantStringFormat(String str) {
            this.str = str;
        }

        @Override // java.text.Format
        public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
            stringBuffer.append(this.str);
            return stringBuffer;
        }

        @Override // java.text.Format
        public Object parseObject(String str, ParsePosition parsePosition) {
            return f20683df.parseObject(str, parsePosition);
        }
    }

    static {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 255; i10++) {
            sb2.append('#');
        }
        invalidDateTimeString = sb2.toString();
    }

    public DataFormatter() {
        this(false);
    }

    private String cleanFormatForNumber(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        int i10 = 0;
        if (this.emulateCsv) {
            for (int i11 = 0; i11 < stringBuffer.length(); i11++) {
                char charAt = stringBuffer.charAt(i11);
                if ((charAt == '_' || charAt == '*' || charAt == '?') && (i11 <= 0 || stringBuffer.charAt(i11 - 1) != '\\')) {
                    if (charAt == '?') {
                        stringBuffer.setCharAt(i11, ' ');
                    } else if (i11 < stringBuffer.length() - 1) {
                        if (charAt == '_') {
                            stringBuffer.setCharAt(i11 + 1, ' ');
                        } else {
                            stringBuffer.deleteCharAt(i11 + 1);
                        }
                        stringBuffer.deleteCharAt(i11);
                    }
                }
            }
        } else {
            for (int i12 = 0; i12 < stringBuffer.length(); i12++) {
                char charAt2 = stringBuffer.charAt(i12);
                if ((charAt2 == '_' || charAt2 == '*') && (i12 <= 0 || stringBuffer.charAt(i12 - 1) != '\\')) {
                    if (i12 < stringBuffer.length() - 1) {
                        stringBuffer.deleteCharAt(i12 + 1);
                    }
                    stringBuffer.deleteCharAt(i12);
                }
            }
        }
        while (i10 < stringBuffer.length()) {
            char charAt3 = stringBuffer.charAt(i10);
            if (charAt3 != '\\' && charAt3 != '\"') {
                if (charAt3 == '+' && i10 > 0 && stringBuffer.charAt(i10 - 1) == 'E') {
                    stringBuffer.deleteCharAt(i10);
                }
                i10++;
            } else {
                stringBuffer.deleteCharAt(i10);
            }
            i10--;
            i10++;
        }
        return stringBuffer.toString();
    }

    private Format createDateFormat(String str, double d10) {
        String replaceAll = str.replaceAll("\\\\-", "-").replaceAll("\\\\,", ",").replaceAll("\\\\\\.", ".").replaceAll("\\\\ ", " ").replaceAll("\\\\/", PackagingURIHelper.FORWARD_SLASH_STRING).replaceAll(";@", "").replaceAll("\"/\"", PackagingURIHelper.FORWARD_SLASH_STRING);
        Matcher matcher = amPmPattern.matcher(replaceAll);
        boolean z10 = false;
        boolean z11 = false;
        while (matcher.find()) {
            replaceAll = matcher.replaceAll("@");
            matcher = amPmPattern.matcher(replaceAll);
            z11 = true;
        }
        String replaceAll2 = replaceAll.replaceAll("@", "a");
        Matcher matcher2 = daysAsText.matcher(replaceAll2);
        if (matcher2.find()) {
            replaceAll2 = matcher2.replaceAll(matcher2.group(0).toUpperCase().replaceAll("D", "E"));
        }
        StringBuffer stringBuffer = new StringBuffer();
        char[] charArray = replaceAll2.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        boolean z12 = false;
        boolean z13 = true;
        while (i10 < charArray.length) {
            char c = charArray[i10];
            if (c == '[' && !z12) {
                stringBuffer.append(c);
                z13 = z10;
                z12 = true;
            } else if (c == ']' && z12) {
                stringBuffer.append(c);
                z12 = z10;
            } else if (z12) {
                if (c != 'h' && c != 'H') {
                    if (c != 'm' && c != 'M') {
                        if (c != 's' && c != 'S') {
                            stringBuffer.append(c);
                        } else {
                            stringBuffer.append('s');
                        }
                    } else {
                        stringBuffer.append('m');
                    }
                } else {
                    stringBuffer.append('H');
                }
            } else if (c != 'h' && c != 'H') {
                if (c != 'm' && c != 'M') {
                    if (c != 's' && c != 'S') {
                        if (Character.isLetter(c)) {
                            arrayList.clear();
                            if (c != 'y' && c != 'Y') {
                                if (c != 'd' && c != 'D') {
                                    stringBuffer.append(c);
                                } else {
                                    stringBuffer.append('d');
                                }
                            } else {
                                stringBuffer.append('y');
                            }
                        } else {
                            stringBuffer.append(c);
                        }
                    } else {
                        stringBuffer.append('s');
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            int intValue = ((Integer) arrayList.get(i11)).intValue();
                            if (stringBuffer.charAt(intValue) == 'M') {
                                stringBuffer.replace(intValue, intValue + 1, "m");
                            }
                        }
                        arrayList.clear();
                    }
                    z13 = true;
                } else if (z13) {
                    stringBuffer.append('M');
                    arrayList.add(Integer.valueOf(stringBuffer.length() - 1));
                } else {
                    stringBuffer.append('m');
                }
            } else {
                if (z11) {
                    stringBuffer.append('h');
                } else {
                    stringBuffer.append('H');
                }
                z13 = false;
            }
            i10++;
            z10 = false;
        }
        try {
            return new ExcelStyleDateFormatter(stringBuffer.toString(), this.dateSymbols);
        } catch (IllegalArgumentException unused) {
            return getDefaultFormat(d10);
        }
    }

    public static DecimalFormat createIntegerOnlyFormat(String str) {
        DecimalFormat decimalFormat = new DecimalFormat(str);
        decimalFormat.setParseIntegerOnly(true);
        return decimalFormat;
    }

    private Format createNumberFormat(String str, double d10) {
        try {
            DecimalFormat decimalFormat = new DecimalFormat(cleanFormatForNumber(str), this.decimalSymbols);
            setExcelStyleRoundingMode(decimalFormat);
            return decimalFormat;
        } catch (IllegalArgumentException unused) {
            return getDefaultFormat(d10);
        }
    }

    private Format getFormat(ICell iCell) {
        if (iCell.getCellStyle() == null) {
            return null;
        }
        short dataFormat = iCell.getCellStyle().getDataFormat();
        String dataFormatString = iCell.getCellStyle().getDataFormatString();
        if (dataFormatString == null || dataFormatString.trim().length() == 0) {
            return null;
        }
        return getFormat(iCell.getNumericCellValue(), dataFormat, dataFormatString);
    }

    private String getFormattedDateString(ICell iCell) {
        Format format = getFormat(iCell);
        if (format instanceof ExcelStyleDateFormatter) {
            ((ExcelStyleDateFormatter) format).setDateToBeFormatted(iCell.getNumericCellValue());
        }
        return performDateFormatting(iCell.getDateCellValue(), format);
    }

    private String getFormattedNumberString(ICell iCell) {
        Format format = getFormat(iCell);
        double numericCellValue = iCell.getNumericCellValue();
        if (format == null) {
            return String.valueOf(numericCellValue);
        }
        return format.format(new Double(numericCellValue));
    }

    private static boolean isWholeNumber(double d10) {
        if (d10 == Math.floor(d10)) {
            return true;
        }
        return false;
    }

    private String performDateFormatting(Date date, Format format) {
        if (format != null) {
            return format.format(date);
        }
        return date.toString();
    }

    public static void setExcelStyleRoundingMode(DecimalFormat decimalFormat) {
        setExcelStyleRoundingMode(decimalFormat, RoundingMode.HALF_UP);
    }

    public void addFormat(String str, Format format) {
        this.formats.put(str, format);
    }

    public Format createFormat(ICell iCell) {
        return createFormat(iCell.getNumericCellValue(), iCell.getCellStyle().getDataFormat(), iCell.getCellStyle().getDataFormatString());
    }

    public String formatCellValue(ICell iCell) {
        return formatCellValue(iCell, null);
    }

    public String formatRawCellContents(double d10, int i10, String str) {
        return formatRawCellContents(d10, i10, str, false);
    }

    public Format getDefaultFormat(ICell iCell) {
        return getDefaultFormat(iCell.getNumericCellValue());
    }

    public void setDefaultNumberFormat(Format format) {
        for (Map.Entry<String, Format> entry : this.formats.entrySet()) {
            if (entry.getValue() == this.generalDecimalNumFormat || entry.getValue() == this.generalWholeNumFormat) {
                entry.setValue(format);
            }
        }
        this.defaultNumFormat = format;
    }

    public DataFormatter(boolean z10) {
        this(Locale.getDefault());
        this.emulateCsv = z10;
    }

    private Format getDefaultFormat(double d10) {
        Format format = this.defaultNumFormat;
        if (format != null) {
            return format;
        }
        if (isWholeNumber(d10)) {
            return this.generalWholeNumFormat;
        }
        return this.generalDecimalNumFormat;
    }

    public static void setExcelStyleRoundingMode(DecimalFormat decimalFormat, RoundingMode roundingMode) {
        try {
            decimalFormat.getClass().getMethod("setRoundingMode", RoundingMode.class).invoke(decimalFormat, roundingMode);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Unable to set rounding mode", e10);
        } catch (NoSuchMethodException | SecurityException unused) {
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("Unable to set rounding mode", e11);
        }
    }

    public String formatCellValue(ICell iCell, FormulaEvaluator formulaEvaluator) {
        if (iCell == null) {
            return "";
        }
        int cellType = iCell.getCellType();
        if (cellType == 2) {
            if (formulaEvaluator == null) {
                return iCell.getCellFormula();
            }
            cellType = formulaEvaluator.evaluateFormulaCell(iCell);
        }
        if (cellType != 0) {
            if (cellType != 1) {
                if (cellType != 3) {
                    if (cellType == 4) {
                        return String.valueOf(iCell.getBooleanCellValue());
                    }
                    throw new RuntimeException(a.g("Unexpected celltype (", cellType, ")"));
                }
                return "";
            }
            return iCell.getRichStringCellValue().getString();
        }
        return getFormattedNumberString(iCell);
    }

    public String formatRawCellContents(double d10, int i10, String str, boolean z10) {
        if (DateUtil.isADateFormat(i10, str)) {
            if (DateUtil.isValidExcelDate(d10)) {
                Format format = getFormat(d10, i10, str);
                if (format instanceof ExcelStyleDateFormatter) {
                    ((ExcelStyleDateFormatter) format).setDateToBeFormatted(d10);
                }
                return performDateFormatting(DateUtil.getJavaDate(d10, z10), format);
            } else if (this.emulateCsv) {
                return invalidDateTimeString;
            }
        }
        Format format2 = getFormat(d10, i10, str);
        if (format2 == null) {
            return String.valueOf(d10);
        }
        String format3 = format2.format(new Double(d10));
        return (!format3.contains("E") || format3.contains("E-")) ? format3 : format3.replaceFirst("E", "E+");
    }

    public DataFormatter(Locale locale, boolean z10) {
        this(locale);
        this.emulateCsv = z10;
    }

    private Format createFormat(double d10, int i10, String str) {
        String group;
        int indexOf;
        Matcher matcher = colorPattern.matcher(str);
        while (matcher.find() && (indexOf = str.indexOf((group = matcher.group()))) != -1) {
            String str2 = str.substring(0, indexOf) + str.substring(group.length() + indexOf);
            if (str2.equals(str)) {
                break;
            }
            matcher = colorPattern.matcher(str2);
            str = str2;
        }
        Matcher matcher2 = specialPatternGroup.matcher(str);
        while (matcher2.find()) {
            String group2 = matcher2.group();
            String substring = group2.substring(group2.indexOf(36) + 1, group2.indexOf(45));
            if (substring.indexOf(36) > -1) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(substring.substring(0, substring.indexOf(36)));
                stringBuffer.append('\\');
                stringBuffer.append(substring.substring(substring.indexOf(36), substring.length()));
                substring = stringBuffer.toString();
            }
            str = matcher2.replaceAll(substring);
            matcher2 = specialPatternGroup.matcher(str);
        }
        if (str != null && str.trim().length() != 0) {
            if (DateUtil.isADateFormat(i10, str) && DateUtil.isValidExcelDate(d10)) {
                return createDateFormat(str, d10);
            }
            if (numPattern.matcher(str).find()) {
                return createNumberFormat(str, d10);
            }
            if (this.emulateCsv) {
                return new ConstantStringFormat(cleanFormatForNumber(str));
            }
            return null;
        }
        return getDefaultFormat(d10);
    }

    /* loaded from: classes3.dex */
    public static final class ZipPlusFourFormat extends Format {
        public static final Format instance = new ZipPlusFourFormat();

        /* renamed from: df  reason: collision with root package name */
        private static final DecimalFormat f20686df = DataFormatter.createIntegerOnlyFormat("000000000");

        private ZipPlusFourFormat() {
        }

        public static String format(Number number) {
            String format = f20686df.format(number);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(format.substring(0, 5));
            stringBuffer.append('-');
            stringBuffer.append(format.substring(5, 9));
            return stringBuffer.toString();
        }

        @Override // java.text.Format
        public Object parseObject(String str, ParsePosition parsePosition) {
            return f20686df.parseObject(str, parsePosition);
        }

        @Override // java.text.Format
        public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
            stringBuffer.append(format((Number) obj));
            return stringBuffer;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SSNFormat extends Format {
        public static final Format instance = new SSNFormat();

        /* renamed from: df  reason: collision with root package name */
        private static final DecimalFormat f20685df = DataFormatter.createIntegerOnlyFormat("000000000");

        private SSNFormat() {
        }

        public static String format(Number number) {
            String format = f20685df.format(number);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(format.substring(0, 3));
            stringBuffer.append('-');
            stringBuffer.append(format.substring(3, 5));
            stringBuffer.append('-');
            stringBuffer.append(format.substring(5, 9));
            return stringBuffer.toString();
        }

        @Override // java.text.Format
        public Object parseObject(String str, ParsePosition parsePosition) {
            return f20685df.parseObject(str, parsePosition);
        }

        @Override // java.text.Format
        public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
            stringBuffer.append(format((Number) obj));
            return stringBuffer;
        }
    }

    public DataFormatter(Locale locale) {
        this.emulateCsv = false;
        this.dateSymbols = new DateFormatSymbols(locale);
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(locale);
        this.decimalSymbols = decimalFormatSymbols;
        this.generalWholeNumFormat = new DecimalFormat("#", decimalFormatSymbols);
        this.generalDecimalNumFormat = new DecimalFormat("#.##########", decimalFormatSymbols);
        this.formats = new HashMap();
        Format format = ZipPlusFourFormat.instance;
        addFormat("00000\\-0000", format);
        addFormat("00000-0000", format);
        Format format2 = PhoneFormat.instance;
        addFormat("[<=9999999]###\\-####;\\(###\\)\\ ###\\-####", format2);
        addFormat("[<=9999999]###-####;(###) ###-####", format2);
        addFormat("###\\-####;\\(###\\)\\ ###\\-####", format2);
        addFormat("###-####;(###) ###-####", format2);
        Format format3 = SSNFormat.instance;
        addFormat("000\\-00\\-0000", format3);
        addFormat("000-00-0000", format3);
    }

    private Format getFormat(double d10, int i10, String str) {
        int indexOf = str.indexOf(59);
        int lastIndexOf = str.lastIndexOf(59);
        if (indexOf != -1 && indexOf != lastIndexOf) {
            int indexOf2 = str.indexOf(59, indexOf + 1);
            if (indexOf2 == lastIndexOf) {
                if (d10 == 0.0d) {
                    str = str.substring(lastIndexOf + 1);
                } else {
                    str = str.substring(0, lastIndexOf);
                }
            } else if (d10 == 0.0d) {
                str = str.substring(indexOf2 + 1, lastIndexOf);
            } else {
                str = str.substring(0, indexOf2);
            }
        }
        if (this.emulateCsv && d10 == 0.0d && str.contains("#") && !str.contains(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES)) {
            str = str.replaceAll("#", "");
        }
        Format format = this.formats.get(str);
        if (format != null) {
            return format;
        }
        if (!"General".equalsIgnoreCase(str) && !"@".equals(str)) {
            Format createFormat = createFormat(d10, i10, str);
            this.formats.put(str, createFormat);
            return createFormat;
        } else if (isWholeNumber(d10)) {
            return this.generalWholeNumFormat;
        } else {
            return this.generalDecimalNumFormat;
        }
    }

    /* loaded from: classes3.dex */
    public static final class PhoneFormat extends Format {
        public static final Format instance = new PhoneFormat();

        /* renamed from: df  reason: collision with root package name */
        private static final DecimalFormat f20684df = DataFormatter.createIntegerOnlyFormat("##########");

        private PhoneFormat() {
        }

        public static String format(Number number) {
            String format = f20684df.format(number);
            StringBuffer stringBuffer = new StringBuffer();
            int length = format.length();
            if (length <= 4) {
                return format;
            }
            int i10 = length - 4;
            String substring = format.substring(i10, length);
            int i11 = length - 7;
            String substring2 = format.substring(Math.max(0, i11), i10);
            String substring3 = format.substring(Math.max(0, length - 10), Math.max(0, i11));
            if (substring3 != null && substring3.trim().length() > 0) {
                stringBuffer.append('(');
                stringBuffer.append(substring3);
                stringBuffer.append(") ");
            }
            if (substring2 != null && substring2.trim().length() > 0) {
                stringBuffer.append(substring2);
                stringBuffer.append('-');
            }
            stringBuffer.append(substring);
            return stringBuffer.toString();
        }

        @Override // java.text.Format
        public Object parseObject(String str, ParsePosition parsePosition) {
            return f20684df.parseObject(str, parsePosition);
        }

        @Override // java.text.Format
        public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
            stringBuffer.append(format((Number) obj));
            return stringBuffer;
        }
    }
}
