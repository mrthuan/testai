package lib.zj.office.ss.util.format;

import a0.d;
import b.b;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Pattern;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import ni.a;

/* loaded from: classes3.dex */
public final class NumericFormatter {

    /* renamed from: b  reason: collision with root package name */
    public static final NumericFormatter f20969b = new NumericFormatter();
    public static final Pattern c = Pattern.compile("((A|P)[M/P]*)", 2);

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f20970d = Pattern.compile("(\\[BLACK\\])|(\\[BLUE\\])|(\\[CYAN\\])|(\\[GREEN\\])|(\\[MAGENTA\\])|(\\[RED\\])|(\\[WHITE\\])|(\\[YELLOW\\])|(\\[COLOR\\s*\\d\\])|(\\[COLOR\\s*[0-5]\\d\\])", 2);

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f20971a = new HashMap();

    public NumericFormatter() {
        Format format = ZipPlusFourFormat.instance;
        a("00000\\-0000", format);
        a("00000-0000", format);
        Format format2 = PhoneFormat.instance;
        a("[<=9999999]###\\-####;\\(###\\)\\ ###\\-####", format2);
        a("[<=9999999]###-####;(###) ###-####", format2);
        a("###\\-####;\\(###\\)\\ ###\\-####", format2);
        a("###-####;(###) ###-####", format2);
        a("[<=9999999]000\\-0000;\\(000\\)\\ 000\\-0000", format2);
        a("[<=9999999]000-0000;(000) 000-0000", format2);
        a("000\\-0000;\\(000\\)\\ 000\\-0000", format2);
        a("000-0000;(000) 000-0000", format2);
        Format format3 = SSNFormat.instance;
        a("000\\-00\\-0000", format3);
        a("000-00-0000", format3);
    }

    public static String b(String str) {
        if (str != null) {
            return str.replaceAll("\\\\-", "-").replaceAll("\\\\,", ",").replaceAll("\\\\\\.", ".").replaceAll("\\\\ ", " ").replaceAll("\\\\/", PackagingURIHelper.FORWARD_SLASH_STRING).replaceAll("\"/\"", PackagingURIHelper.FORWARD_SLASH_STRING).replace("_-", " ").replace("_(", " ").replace("_)", "").replace("\\(", "(").replace("\\)", ")").replace("\\", "").replace("_", "");
        }
        return str;
    }

    public static String d(String str, Date date) {
        try {
            return new a(i(str)).c(date);
        } catch (Exception unused) {
            return new a("m/d/yy").c(date);
        }
    }

    public static String e(String str) {
        int indexOf = str.indexOf("[");
        int indexOf2 = str.indexOf("]");
        while (indexOf >= 0 && indexOf2 >= 0) {
            String substring = str.substring(indexOf, indexOf2 + 1);
            int indexOf3 = substring.indexOf("$");
            if (indexOf3 >= 0) {
                int indexOf4 = substring.indexOf(45);
                if (indexOf4 < 0) {
                    indexOf4 = substring.indexOf("]");
                }
                String substring2 = substring.substring(indexOf3 + 1, indexOf4);
                if (substring2 != null) {
                    return substring2;
                }
            }
            str = str.replace(substring, "");
            indexOf = str.indexOf("[");
            indexOf2 = str.indexOf("]");
        }
        return null;
    }

    public static short f(String str) {
        int length = str.length();
        if (str.length() != 0 && !str.equalsIgnoreCase("General")) {
            if ("@".equals(str)) {
                return (short) 11;
            }
            if (str.replace("?/", "").length() < length) {
                return (short) 9;
            }
            if (str.indexOf(42) > -1) {
                return (short) 8;
            }
            String i10 = i(str);
            if (i10.length() != 0 && !i10.equalsIgnoreCase("General")) {
                String replace = i10.replace("E+", "");
                boolean z10 = false;
                int i11 = 0;
                while (true) {
                    if (i11 >= 19) {
                        break;
                    } else if (replace.indexOf("GyMdkHmsSEDFwWahKzZ".charAt(i11)) > -1) {
                        z10 = true;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (z10) {
                    return (short) 10;
                }
                return (short) 7;
            }
        }
        return (short) 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (r0.length() == 8) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean g(java.lang.String r4) {
        /*
            java.lang.String r0 = "["
            int r0 = r4.indexOf(r0)
            java.lang.String r1 = "]"
            int r1 = r4.indexOf(r1)
            r2 = 1
            if (r0 < 0) goto L27
            if (r1 < 0) goto L27
            int r1 = r1 + r2
            java.lang.String r0 = r4.substring(r0, r1)
            java.lang.String r1 = "$"
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L27
            int r1 = r0.length()
            r3 = 8
            if (r1 != r3) goto L27
            goto L28
        L27:
            r0 = 0
        L28:
            if (r0 == 0) goto L46
            r1 = 59
            int r1 = r4.indexOf(r1)
            if (r1 < 0) goto L46
            java.lang.String r4 = r4.substring(r1)
            int r0 = r4.indexOf(r0)
            if (r0 <= 0) goto L46
            int r0 = r0 - r2
            char r4 = r4.charAt(r0)
            r0 = 45
            if (r4 != r0) goto L46
            return r2
        L46:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.ss.util.format.NumericFormatter.g(java.lang.String):boolean");
    }

    public static String h(String str) {
        int indexOf = str.indexOf("[");
        int indexOf2 = str.indexOf("]");
        while (indexOf >= 0 && indexOf2 >= 0) {
            str = str.replace(str.substring(indexOf, indexOf2 + 1), "");
            indexOf = str.indexOf("[");
            indexOf2 = str.indexOf("]");
        }
        return str;
    }

    public static String i(String str) {
        String j10 = j(str);
        boolean z10 = false;
        while (c.matcher(j10).find()) {
            z10 = true;
        }
        StringBuffer stringBuffer = new StringBuffer();
        char[] charArray = j10.toCharArray();
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        boolean z12 = true;
        for (char c10 : charArray) {
            if (c10 == '[' && !z11) {
                stringBuffer.append(c10);
                z12 = false;
                z11 = true;
            } else if (c10 == ']' && z11) {
                stringBuffer.append(c10);
                z11 = false;
            } else if (z11) {
                if (c10 != 'h' && c10 != 'H') {
                    if (c10 != 'm' && c10 != 'M') {
                        if (c10 != 's' && c10 != 'S') {
                            stringBuffer.append(c10);
                        } else {
                            stringBuffer.append('s');
                        }
                    } else {
                        stringBuffer.append('m');
                    }
                } else {
                    stringBuffer.append('H');
                }
            } else if (c10 != 'h' && c10 != 'H') {
                if (c10 != 'm' && c10 != 'M') {
                    if (c10 != 's' && c10 != 'S') {
                        if ((c10 >= 'a' && c10 <= 'z') || (c10 >= 'A' && c10 <= 'Z')) {
                            arrayList.clear();
                            if (c10 != 'y' && c10 != 'Y') {
                                if (c10 != 'd' && c10 != 'D') {
                                    stringBuffer.append(c10);
                                } else {
                                    stringBuffer.append('d');
                                }
                            } else {
                                stringBuffer.append('y');
                            }
                        } else {
                            stringBuffer.append(c10);
                        }
                    } else {
                        stringBuffer.append('s');
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            int intValue = ((Integer) arrayList.get(i10)).intValue();
                            if (stringBuffer.charAt(intValue) == 'M') {
                                stringBuffer.replace(intValue, intValue + 1, "m");
                            }
                        }
                        arrayList.clear();
                    }
                    z12 = true;
                } else if (z12) {
                    stringBuffer.append('M');
                    arrayList.add(Integer.valueOf(stringBuffer.length() - 1));
                } else {
                    stringBuffer.append('m');
                }
            } else {
                if (z10) {
                    stringBuffer.append('h');
                } else {
                    stringBuffer.append('H');
                }
                z12 = false;
            }
        }
        String stringBuffer2 = stringBuffer.toString();
        int indexOf = stringBuffer2.indexOf(91);
        while (indexOf > -1) {
            int indexOf2 = stringBuffer2.indexOf(93);
            stringBuffer2 = stringBuffer2.substring(0, indexOf) + stringBuffer2.substring(indexOf2 + 1, stringBuffer2.length());
            indexOf = stringBuffer2.indexOf(91);
        }
        return stringBuffer2;
    }

    public static String j(String str) {
        String str2 = "";
        String replace = str.replace(";@", "");
        int indexOf = replace.indexOf(34);
        while (indexOf >= 0) {
            String substring = replace.substring(0, indexOf);
            String substring2 = replace.substring(indexOf + 1, replace.length());
            int indexOf2 = substring2.indexOf(34);
            if (indexOf2 >= 0) {
                substring = b(substring);
            }
            StringBuilder g10 = d.g(str2, substring);
            g10.append(substring2.substring(0, indexOf2));
            str2 = g10.toString();
            replace = substring2.substring(indexOf2 + 1, substring2.length());
            indexOf = replace.indexOf(34);
        }
        StringBuilder k10 = a0.a.k(str2);
        k10.append(b(replace));
        return k10.toString();
    }

    public final void a(String str, Format format) {
        this.f20971a.put(str, format);
    }

    public final String c(String str, double d10, short s4) {
        int indexOf;
        int indexOf2;
        String format;
        double d11 = d10;
        Format format2 = (Format) this.f20971a.get(str);
        if (format2 != null) {
            return format2.format(Double.valueOf(d10));
        }
        String j10 = j(str);
        int i10 = 0;
        String str2 = "";
        try {
            switch (s4) {
                case 6:
                case 11:
                    String valueOf = String.valueOf(d10);
                    if (!valueOf.contains("E") && (indexOf2 = valueOf.indexOf(46)) > 0 && valueOf.length() - indexOf2 > 10) {
                        valueOf = valueOf.substring(0, indexOf2 + 10);
                    }
                    if (valueOf != null && valueOf.length() > 1 && !valueOf.contains("E") && valueOf.charAt(valueOf.length() - 1) == '0' && (indexOf = valueOf.indexOf(46)) > 0) {
                        char[] charArray = valueOf.toCharArray();
                        int length = charArray.length - 1;
                        while (length > indexOf && charArray[length] == '0') {
                            length--;
                        }
                        if (charArray[length] == '.') {
                            length--;
                        }
                        str2 = String.valueOf(charArray, 0, length + 1);
                        break;
                    } else {
                        str2 = valueOf;
                        break;
                    }
                    break;
                case 7:
                    String e10 = e(j10);
                    boolean g10 = g(j10);
                    String h10 = h(j10);
                    if (d11 < 0.0d) {
                        String[] split = h10.split(";");
                        if (split.length == 2 && split[0].equals(split[1])) {
                            d11 = -d11;
                        }
                    }
                    DecimalFormat decimalFormat = new DecimalFormat(h10, DecimalFormatSymbols.getInstance(Locale.US));
                    if (d11 > 0.0d) {
                        d11 += 1.0E-9d;
                    } else if (d11 < 0.0d) {
                        d11 -= 1.0E-9d;
                    }
                    format = decimalFormat.format(Double.valueOf(d11));
                    if (e10 != null) {
                        if (format.charAt(0) == '(') {
                            str2 = "(" + e10 + format.substring(1);
                            break;
                        } else if (d11 < 0.0d && g10) {
                            str2 = "-" + e10 + format.replace("-", "");
                            break;
                        } else {
                            str2 = e10.concat(format);
                            break;
                        }
                    }
                    str2 = format;
                    break;
                case 8:
                    String e11 = e(j10);
                    boolean g11 = g(j10);
                    String h11 = h(j10);
                    if (d11 > 0.0d) {
                        d11 += 1.0E-9d;
                    } else if (d11 < 0.0d) {
                        d11 -= 1.0E-9d;
                    }
                    format = b.t(h11, d11);
                    if (e11 != null) {
                        if (d11 < 0.0d && g11) {
                            str2 = "-" + e11 + format.replace("-", "");
                            break;
                        } else {
                            str2 = e11.concat(format);
                            break;
                        }
                    }
                    str2 = format;
                    break;
                case 9:
                    String format3 = new FractionalFormat(j10).format(Double.valueOf(d10));
                    if (format3.length() == 0) {
                        str2 = String.valueOf(0);
                        break;
                    } else {
                        str2 = format3;
                        break;
                    }
            }
            return str2;
        } catch (IllegalArgumentException unused) {
            if (j10.replace(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES, "").replace("-", "").length() == 0) {
                StringBuilder sb2 = new StringBuilder(new DecimalFormat(j10.replace("-", ""), DecimalFormatSymbols.getInstance(Locale.US)).format(Double.valueOf(d11)));
                String[] split2 = j10.split("-");
                for (int length2 = split2.length - 1; length2 > 0; length2--) {
                    int length3 = split2[length2].length() + i10;
                    sb2.insert(sb2.length() - length3, "-");
                    i10 = length3 + 1;
                }
                return sb2.toString();
            }
            return String.valueOf(d11);
        }
    }

    /* loaded from: classes3.dex */
    public static final class ZipPlusFourFormat extends Format {

        /* renamed from: a  reason: collision with root package name */
        public static final DecimalFormat f20974a;
        public static final Format instance = new ZipPlusFourFormat();

        static {
            DecimalFormat decimalFormat = new DecimalFormat("000000000", DecimalFormatSymbols.getInstance(Locale.US));
            decimalFormat.setParseIntegerOnly(true);
            f20974a = decimalFormat;
        }

        private ZipPlusFourFormat() {
        }

        public static String format(Number number) {
            String format = f20974a.format(number);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(format.substring(0, 5));
            stringBuffer.append('-');
            stringBuffer.append(format.substring(5, 9));
            return stringBuffer.toString();
        }

        @Override // java.text.Format
        public Object parseObject(String str, ParsePosition parsePosition) {
            return f20974a.parseObject(str, parsePosition);
        }

        @Override // java.text.Format
        public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
            stringBuffer.append(format((Number) obj));
            return stringBuffer;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SSNFormat extends Format {

        /* renamed from: a  reason: collision with root package name */
        public static final DecimalFormat f20973a;
        public static final Format instance = new SSNFormat();

        static {
            DecimalFormat decimalFormat = new DecimalFormat("000000000", DecimalFormatSymbols.getInstance(Locale.US));
            decimalFormat.setParseIntegerOnly(true);
            f20973a = decimalFormat;
        }

        private SSNFormat() {
        }

        public static String format(Number number) {
            String format = f20973a.format(number);
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
            return f20973a.parseObject(str, parsePosition);
        }

        @Override // java.text.Format
        public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
            stringBuffer.append(format((Number) obj));
            return stringBuffer;
        }
    }

    /* loaded from: classes3.dex */
    public static final class PhoneFormat extends Format {

        /* renamed from: a  reason: collision with root package name */
        public static final DecimalFormat f20972a;
        public static final Format instance = new PhoneFormat();

        static {
            DecimalFormat decimalFormat = new DecimalFormat("##########", DecimalFormatSymbols.getInstance(Locale.US));
            decimalFormat.setParseIntegerOnly(true);
            f20972a = decimalFormat;
        }

        private PhoneFormat() {
        }

        public static String format(Number number) {
            String format = f20972a.format(number);
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
            return f20972a.parseObject(str, parsePosition);
        }

        @Override // java.text.Format
        public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
            stringBuffer.append(format((Number) obj));
            return stringBuffer;
        }
    }
}
