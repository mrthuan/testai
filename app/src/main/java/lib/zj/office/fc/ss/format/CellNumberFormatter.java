package lib.zj.office.fc.ss.format;

import android.support.v4.media.session.h;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.util.Collections;
import java.util.Formatter;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.regex.Matcher;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import lib.zj.office.fc.ss.format.CellFormatPart;
import lib.zj.pdfeditor.Annotation;

/* loaded from: classes3.dex */
public class CellNumberFormatter extends CellFormatter {
    private Special afterFractional;
    private Special afterInteger;
    private DecimalFormat decimalFmt;
    private Special decimalPoint;
    private String denominatorFmt;
    private List<Special> denominatorSpecials;
    private final String desc;
    private Special exponent;
    private List<Special> exponentDigitSpecials;
    private List<Special> exponentSpecials;
    private List<Special> fractionalSpecials;
    private boolean improperFraction;
    private boolean integerCommas;
    private List<Special> integerSpecials;
    private int maxDenominator;
    private Special numerator;
    private String numeratorFmt;
    private List<Special> numeratorSpecials;
    private String printfFmt;
    private double scale;
    private Special slash;
    private final List<Special> specials;
    static final CellFormatter SIMPLE_NUMBER = new CellFormatter("General") { // from class: lib.zj.office.fc.ss.format.CellNumberFormatter.1
        @Override // lib.zj.office.fc.ss.format.CellFormatter
        public void formatValue(StringBuffer stringBuffer, Object obj) {
            if (obj == null) {
                return;
            }
            if (obj instanceof Number) {
                if (((Number) obj).doubleValue() % 1.0d == 0.0d) {
                    CellNumberFormatter.SIMPLE_INT.formatValue(stringBuffer, obj);
                    return;
                } else {
                    CellNumberFormatter.SIMPLE_FLOAT.formatValue(stringBuffer, obj);
                    return;
                }
            }
            CellTextFormatter.SIMPLE_TEXT.formatValue(stringBuffer, obj);
        }

        @Override // lib.zj.office.fc.ss.format.CellFormatter
        public void simpleValue(StringBuffer stringBuffer, Object obj) {
            formatValue(stringBuffer, obj);
        }
    };
    private static final CellFormatter SIMPLE_INT = new CellNumberFormatter("#");
    private static final CellFormatter SIMPLE_FLOAT = new CellNumberFormatter("#.#");

    /* loaded from: classes3.dex */
    public class NumPartHandler implements CellFormatPart.PartHandler {
        private char insertSignForExponent;

        public /* synthetic */ NumPartHandler(CellNumberFormatter cellNumberFormatter, int i10) {
            this();
        }

        @Override // lib.zj.office.fc.ss.format.CellFormatPart.PartHandler
        public String handlePart(Matcher matcher, String str, CellFormatType cellFormatType, StringBuffer stringBuffer) {
            int length = stringBuffer.length();
            char charAt = str.charAt(0);
            if (charAt != '#') {
                if (charAt == '%') {
                    CellNumberFormatter.this.scale *= 100.0d;
                } else if (charAt != '?') {
                    if (charAt != 'E' && charAt != 'e') {
                        switch (charAt) {
                            case '.':
                                if (CellNumberFormatter.this.decimalPoint == null && CellNumberFormatter.this.specials.size() > 0) {
                                    List list = CellNumberFormatter.this.specials;
                                    CellNumberFormatter cellNumberFormatter = CellNumberFormatter.this;
                                    Special special = new Special('.', length);
                                    cellNumberFormatter.decimalPoint = special;
                                    list.add(special);
                                    break;
                                }
                                break;
                            case '/':
                                if (CellNumberFormatter.this.slash == null && CellNumberFormatter.this.specials.size() > 0) {
                                    CellNumberFormatter cellNumberFormatter2 = CellNumberFormatter.this;
                                    cellNumberFormatter2.numerator = cellNumberFormatter2.previousNumber();
                                    if (CellNumberFormatter.this.numerator == CellNumberFormatter.firstDigit(CellNumberFormatter.this.specials)) {
                                        CellNumberFormatter.this.improperFraction = true;
                                    }
                                    List list2 = CellNumberFormatter.this.specials;
                                    CellNumberFormatter cellNumberFormatter3 = CellNumberFormatter.this;
                                    Special special2 = new Special('.', length);
                                    cellNumberFormatter3.slash = special2;
                                    list2.add(special2);
                                    break;
                                }
                                break;
                            case '0':
                                break;
                            default:
                                return null;
                        }
                    } else if (CellNumberFormatter.this.exponent == null && CellNumberFormatter.this.specials.size() > 0) {
                        List list3 = CellNumberFormatter.this.specials;
                        CellNumberFormatter cellNumberFormatter4 = CellNumberFormatter.this;
                        Special special3 = new Special('.', length);
                        cellNumberFormatter4.exponent = special3;
                        list3.add(special3);
                        this.insertSignForExponent = str.charAt(1);
                        return str.substring(0, 1);
                    }
                }
                return str;
            }
            if (this.insertSignForExponent != 0) {
                CellNumberFormatter.this.specials.add(new Special(this.insertSignForExponent, length));
                stringBuffer.append(this.insertSignForExponent);
                this.insertSignForExponent = (char) 0;
                length++;
            }
            for (int i10 = 0; i10 < str.length(); i10++) {
                CellNumberFormatter.this.specials.add(new Special(str.charAt(i10), length + i10));
            }
            return str;
        }

        private NumPartHandler() {
        }
    }

    /* loaded from: classes3.dex */
    public static class Special {

        /* renamed from: ch  reason: collision with root package name */
        final char f20681ch;
        int pos;

        public Special(char c, int i10) {
            this.f20681ch = c;
            this.pos = i10;
        }

        public String toString() {
            return OperatorName.SHOW_TEXT_LINE + this.f20681ch + "' @ " + this.pos;
        }
    }

    /* loaded from: classes3.dex */
    public static class StringMod implements Comparable<StringMod> {
        public static final int AFTER = 2;
        public static final int BEFORE = 1;
        public static final int REPLACE = 3;
        Special end;
        boolean endInclusive;

        /* renamed from: op  reason: collision with root package name */
        final int f20682op;
        final Special special;
        boolean startInclusive;
        CharSequence toAdd;

        public /* synthetic */ StringMod(Special special, CharSequence charSequence, int i10, int i11) {
            this(special, charSequence, i10);
        }

        public boolean equals(Object obj) {
            try {
                if (compareTo((StringMod) obj) != 0) {
                    return false;
                }
                return true;
            } catch (RuntimeException unused) {
                return false;
            }
        }

        public int hashCode() {
            return this.special.hashCode() + this.f20682op;
        }

        private StringMod(Special special, CharSequence charSequence, int i10) {
            this.special = special;
            this.toAdd = charSequence;
            this.f20682op = i10;
        }

        @Override // java.lang.Comparable
        public int compareTo(StringMod stringMod) {
            int i10 = this.special.pos - stringMod.special.pos;
            return i10 != 0 ? i10 : this.f20682op - stringMod.f20682op;
        }

        public StringMod(Special special, boolean z10, Special special2, boolean z11, char c) {
            this(special, z10, special2, z11);
            this.toAdd = c + "";
        }

        public StringMod(Special special, boolean z10, Special special2, boolean z11) {
            this.special = special;
            this.startInclusive = z10;
            this.end = special2;
            this.endInclusive = z11;
            this.f20682op = 3;
            this.toAdd = "";
        }
    }

    public CellNumberFormatter(String str) {
        super(str);
        int interpretPrecision;
        int i10;
        char c;
        this.scale = 1.0d;
        LinkedList linkedList = new LinkedList();
        this.specials = linkedList;
        StringBuffer parseFormat = CellFormatPart.parseFormat(str, CellFormatType.NUMBER, new NumPartHandler(this, 0));
        if ((this.decimalPoint != null || this.exponent != null) && this.slash != null) {
            this.slash = null;
            this.numerator = null;
        }
        interpretCommas(parseFormat);
        if (this.decimalPoint == null) {
            interpretPrecision = 0;
            i10 = 0;
        } else {
            interpretPrecision = interpretPrecision();
            i10 = interpretPrecision + 1;
            if (interpretPrecision == 0) {
                linkedList.remove(this.decimalPoint);
                this.decimalPoint = null;
            }
        }
        boolean z10 = true;
        if (interpretPrecision == 0) {
            this.fractionalSpecials = Collections.emptyList();
        } else {
            this.fractionalSpecials = linkedList.subList(linkedList.indexOf(this.decimalPoint) + 1, fractionalEnd());
        }
        Special special = this.exponent;
        if (special == null) {
            this.exponentSpecials = Collections.emptyList();
        } else {
            int indexOf = linkedList.indexOf(special);
            this.exponentSpecials = specialsFor(indexOf, 2);
            this.exponentDigitSpecials = specialsFor(indexOf + 2);
        }
        if (this.slash == null) {
            this.numeratorSpecials = Collections.emptyList();
            this.denominatorSpecials = Collections.emptyList();
        } else {
            Special special2 = this.numerator;
            if (special2 == null) {
                this.numeratorSpecials = Collections.emptyList();
            } else {
                this.numeratorSpecials = specialsFor(linkedList.indexOf(special2));
            }
            List<Special> specialsFor = specialsFor(linkedList.indexOf(this.slash) + 1);
            this.denominatorSpecials = specialsFor;
            if (specialsFor.isEmpty()) {
                this.numeratorSpecials = Collections.emptyList();
            } else {
                this.maxDenominator = maxValue(this.denominatorSpecials);
                this.numeratorFmt = singleNumberFormat(this.numeratorSpecials);
                this.denominatorFmt = singleNumberFormat(this.denominatorSpecials);
            }
        }
        this.integerSpecials = linkedList.subList(0, integerEnd());
        if (this.exponent == null) {
            StringBuffer stringBuffer = new StringBuffer("%0");
            stringBuffer.append(calculateIntegerPartWidth() + i10);
            stringBuffer.append('.');
            stringBuffer.append(interpretPrecision);
            stringBuffer.append("f");
            this.printfFmt = stringBuffer.toString();
        } else {
            StringBuffer stringBuffer2 = new StringBuffer();
            List<Special> list = this.integerSpecials;
            if (list.size() == 1) {
                stringBuffer2.append(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
                z10 = false;
            } else {
                for (Special special3 : list) {
                    if (isDigitFmt(special3)) {
                        if (z10) {
                            c = '#';
                        } else {
                            c = '0';
                        }
                        stringBuffer2.append(c);
                        z10 = false;
                    }
                }
            }
            if (this.fractionalSpecials.size() > 0) {
                stringBuffer2.append('.');
                for (Special special4 : this.fractionalSpecials) {
                    if (isDigitFmt(special4)) {
                        if (!z10) {
                            stringBuffer2.append('0');
                        }
                        z10 = false;
                    }
                }
            }
            stringBuffer2.append('E');
            List<Special> list2 = this.exponentSpecials;
            placeZeros(stringBuffer2, list2.subList(2, list2.size()));
            this.decimalFmt = new DecimalFormat(stringBuffer2.toString());
        }
        if (this.exponent != null) {
            this.scale = 1.0d;
        }
        this.desc = parseFormat.toString();
    }

    private int calculateIntegerPartWidth() {
        Special next;
        ListIterator<Special> listIterator = this.specials.listIterator();
        int i10 = 0;
        while (listIterator.hasNext() && (next = listIterator.next()) != this.afterInteger) {
            if (isDigitFmt(next)) {
                i10++;
            }
        }
        return i10;
    }

    public static StringMod deleteMod(Special special, boolean z10, Special special2, boolean z11) {
        return new StringMod(special, z10, special2, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Special firstDigit(List<Special> list) {
        for (Special special : list) {
            if (isDigitFmt(special)) {
                return special;
            }
        }
        return null;
    }

    private int fractionalEnd() {
        Special special = this.exponent;
        if (special != null) {
            this.afterFractional = special;
        } else {
            Special special2 = this.numerator;
            if (special2 != null) {
                this.afterInteger = special2;
            } else {
                this.afterFractional = null;
            }
        }
        Special special3 = this.afterFractional;
        if (special3 == null) {
            return this.specials.size();
        }
        return this.specials.indexOf(special3);
    }

    private static boolean hasChar(char c, List<Special>... listArr) {
        for (List<Special> list : listArr) {
            for (Special special : list) {
                if (special.f20681ch == c) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean hasOnly(char c, List<Special>... listArr) {
        for (List<Special> list : listArr) {
            for (Special special : list) {
                if (special.f20681ch != c) {
                    return false;
                }
            }
        }
        return true;
    }

    public static StringMod insertMod(Special special, CharSequence charSequence, int i10) {
        return new StringMod(special, charSequence, i10, 0);
    }

    private int integerEnd() {
        Special special = this.decimalPoint;
        if (special != null) {
            this.afterInteger = special;
        } else {
            Special special2 = this.exponent;
            if (special2 != null) {
                this.afterInteger = special2;
            } else {
                Special special3 = this.numerator;
                if (special3 != null) {
                    this.afterInteger = special3;
                } else {
                    this.afterInteger = null;
                }
            }
        }
        Special special4 = this.afterInteger;
        if (special4 == null) {
            return this.specials.size();
        }
        return this.specials.indexOf(special4);
    }

    private void interpretCommas(StringBuffer stringBuffer) {
        ListIterator<Special> listIterator = this.specials.listIterator(integerEnd());
        int i10 = 0;
        this.integerCommas = false;
        boolean z10 = true;
        while (listIterator.hasPrevious()) {
            if (listIterator.previous().f20681ch != ',') {
                z10 = false;
            } else if (z10) {
                this.scale /= 1000.0d;
            } else {
                this.integerCommas = true;
            }
        }
        if (this.decimalPoint != null) {
            ListIterator<Special> listIterator2 = this.specials.listIterator(fractionalEnd());
            while (listIterator2.hasPrevious() && listIterator2.previous().f20681ch == ',') {
                this.scale /= 1000.0d;
            }
        }
        ListIterator<Special> listIterator3 = this.specials.listIterator();
        while (listIterator3.hasNext()) {
            Special next = listIterator3.next();
            next.pos -= i10;
            if (next.f20681ch == ',') {
                i10++;
                listIterator3.remove();
                stringBuffer.deleteCharAt(next.pos);
            }
        }
    }

    private int interpretPrecision() {
        Special special = this.decimalPoint;
        if (special == null) {
            return -1;
        }
        List<Special> list = this.specials;
        ListIterator<Special> listIterator = list.listIterator(list.indexOf(special));
        if (listIterator.hasNext()) {
            listIterator.next();
        }
        int i10 = 0;
        while (listIterator.hasNext() && isDigitFmt(listIterator.next())) {
            i10++;
        }
        return i10;
    }

    private static boolean isDigitFmt(Special special) {
        char c = special.f20681ch;
        if (c != '0' && c != '?' && c != '#') {
            return false;
        }
        return true;
    }

    private static int maxValue(List<Special> list) {
        return (int) Math.round(Math.pow(10.0d, list.size()) - 1.0d);
    }

    private static void placeZeros(StringBuffer stringBuffer, List<Special> list) {
        for (Special special : list) {
            if (isDigitFmt(special)) {
                stringBuffer.append('0');
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Special previousNumber() {
        List<Special> list = this.specials;
        ListIterator<Special> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            Special previous = listIterator.previous();
            if (isDigitFmt(previous)) {
                while (listIterator.hasPrevious()) {
                    Special previous2 = listIterator.previous();
                    if (previous.pos - previous2.pos > 1 || !isDigitFmt(previous2)) {
                        break;
                    }
                    previous = previous2;
                }
                return previous;
            }
        }
        return null;
    }

    public static StringMod replaceMod(Special special, boolean z10, Special special2, boolean z11, char c) {
        return new StringMod(special, z10, special2, z11, c);
    }

    private static String singleNumberFormat(List<Special> list) {
        return "%0" + list.size() + "d";
    }

    private List<Special> specialsFor(int i10, int i11) {
        if (i10 >= this.specials.size()) {
            return Collections.emptyList();
        }
        int i12 = i11 + i10;
        ListIterator<Special> listIterator = this.specials.listIterator(i12);
        Special next = listIterator.next();
        while (listIterator.hasNext()) {
            Special next2 = listIterator.next();
            if (!isDigitFmt(next2) || next2.pos - next.pos > 1) {
                break;
            }
            i12++;
            next = next2;
        }
        return this.specials.subList(i10, i12 + 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x012f A[Catch: RuntimeException -> 0x0156, TryCatch #0 {RuntimeException -> 0x0156, blocks: (B:49:0x0108, B:51:0x010c, B:54:0x0115, B:56:0x012b, B:58:0x012f, B:60:0x013c, B:55:0x0126), top: B:65:0x0108 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFraction(double r16, java.lang.StringBuffer r18, double r19, java.lang.StringBuffer r21, java.util.Set<lib.zj.office.fc.ss.format.CellNumberFormatter.StringMod> r22) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.ss.format.CellNumberFormatter.writeFraction(double, java.lang.StringBuffer, double, java.lang.StringBuffer, java.util.Set):void");
    }

    private void writeFractional(StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        int length;
        char c;
        if (this.fractionalSpecials.size() > 0) {
            int indexOf = stringBuffer.indexOf(".") + 1;
            if (this.exponent != null) {
                length = stringBuffer.indexOf(Annotation.KEY_E);
            } else {
                length = stringBuffer.length();
            }
            while (true) {
                length--;
                if (length <= indexOf || stringBuffer.charAt(length) != '0') {
                    break;
                }
            }
            ListIterator<Special> listIterator = this.fractionalSpecials.listIterator();
            while (listIterator.hasNext()) {
                Special next = listIterator.next();
                char charAt = stringBuffer.charAt(indexOf);
                if (charAt == '0' && (c = next.f20681ch) != '0' && indexOf >= length) {
                    if (c == '?') {
                        stringBuffer2.setCharAt(next.pos, ' ');
                    }
                } else {
                    stringBuffer2.setCharAt(next.pos, charAt);
                }
                indexOf++;
            }
        }
    }

    private void writeInteger(StringBuffer stringBuffer, StringBuffer stringBuffer2, List<Special> list, Set<StringMod> set, boolean z10) {
        char c;
        boolean z11;
        boolean z12;
        String str;
        char c10;
        char charAt;
        int length;
        int indexOf = stringBuffer.indexOf(".") - 1;
        if (indexOf < 0) {
            if (this.exponent != null && list == this.integerSpecials) {
                length = stringBuffer.indexOf("E");
            } else {
                length = stringBuffer.length();
            }
            indexOf = length - 1;
        }
        int i10 = 0;
        while (i10 < indexOf && ((charAt = stringBuffer.charAt(i10)) == '0' || charAt == ',')) {
            i10++;
        }
        ListIterator<Special> listIterator = list.listIterator(list.size());
        Special special = null;
        int i11 = 0;
        while (listIterator.hasPrevious()) {
            if (indexOf >= 0) {
                c = stringBuffer.charAt(indexOf);
            } else {
                c = '0';
            }
            Special previous = listIterator.previous();
            if (z10 && i11 > 0 && i11 % 3 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c == '0' && (c10 = previous.f20681ch) != '0' && c10 != '?' && indexOf < i10) {
                z12 = false;
            } else {
                if (previous.f20681ch == '?' && indexOf < i10) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i12 = previous.pos;
                if (z12) {
                    c = ' ';
                }
                stringBuffer2.setCharAt(i12, c);
                special = previous;
            }
            if (z11) {
                if (z12) {
                    str = " ";
                } else {
                    str = ",";
                }
                set.add(insertMod(previous, str, 2));
            }
            i11++;
            indexOf--;
        }
        if (indexOf >= 0) {
            int i13 = indexOf + 1;
            StringBuffer stringBuffer3 = new StringBuffer(stringBuffer.substring(0, i13));
            if (z10) {
                while (i13 > 0) {
                    if (i11 > 0 && i11 % 3 == 0) {
                        stringBuffer3.insert(i13, ',');
                    }
                    i11++;
                    i13--;
                }
            }
            set.add(insertMod(special, stringBuffer3, 1));
        }
    }

    private void writeScientific(double d10, StringBuffer stringBuffer, Set<StringMod> set) {
        StringBuffer stringBuffer2 = new StringBuffer();
        FieldPosition fieldPosition = new FieldPosition(1);
        this.decimalFmt.format(d10, stringBuffer2, fieldPosition);
        writeInteger(stringBuffer2, stringBuffer, this.integerSpecials, set, this.integerCommas);
        writeFractional(stringBuffer2, stringBuffer);
        int endIndex = fieldPosition.getEndIndex() + 1;
        char charAt = stringBuffer2.charAt(endIndex);
        if (charAt != '-') {
            stringBuffer2.insert(endIndex, '+');
            charAt = '+';
        }
        Special next = this.exponentSpecials.listIterator(1).next();
        char c = next.f20681ch;
        if (charAt != '-' && c != '+') {
            set.add(deleteMod(next, true, next, true));
        } else {
            set.add(replaceMod(next, true, next, true, charAt));
        }
        writeInteger(new StringBuffer(stringBuffer2.substring(endIndex + 1)), stringBuffer, this.exponentDigitSpecials, set, false);
    }

    private void writeSingleInteger(String str, int i10, StringBuffer stringBuffer, List<Special> list, Set<StringMod> set) {
        StringBuffer stringBuffer2 = new StringBuffer();
        new Formatter(stringBuffer2).format(CellFormatter.LOCALE, str, Integer.valueOf(i10));
        writeInteger(stringBuffer2, stringBuffer, list, set, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016b  */
    @Override // lib.zj.office.fc.ss.format.CellFormatter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void formatValue(java.lang.StringBuffer r18, java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.ss.format.CellNumberFormatter.formatValue(java.lang.StringBuffer, java.lang.Object):void");
    }

    @Override // lib.zj.office.fc.ss.format.CellFormatter
    public void simpleValue(StringBuffer stringBuffer, Object obj) {
        SIMPLE_NUMBER.formatValue(stringBuffer, obj);
    }

    private List<Special> specialsFor(int i10) {
        return specialsFor(i10, 0);
    }

    /* loaded from: classes3.dex */
    public static class Fraction {
        private final int denominator;
        private final int numerator;

        private Fraction(double d10, double d11, int i10, int i11) {
            long j10;
            long j11;
            long j12;
            long j13;
            long j14;
            long floor = (long) Math.floor(d10);
            if (floor <= 2147483647L) {
                if (Math.abs(floor - d10) < d11) {
                    this.numerator = (int) floor;
                    this.denominator = 1;
                    return;
                }
                int i12 = 0;
                double d12 = d10;
                long j15 = 1;
                long j16 = 0;
                int i13 = 1;
                long j17 = 1;
                long j18 = floor;
                boolean z10 = false;
                while (true) {
                    i12 += i13;
                    boolean z11 = z10;
                    double d13 = 1.0d / (d12 - floor);
                    long floor2 = (long) Math.floor(d13);
                    long j19 = floor;
                    j10 = (floor2 * j18) + j17;
                    long j20 = j18;
                    j11 = (floor2 * j15) + j16;
                    if (j10 > 2147483647L || j11 > 2147483647L) {
                        break;
                    }
                    long j21 = floor2;
                    long j22 = j17;
                    double d14 = j10 / j11;
                    if (i12 >= i11 || Math.abs(d14 - d10) <= d11 || j11 >= i10) {
                        z11 = true;
                        j12 = j15;
                        j21 = j19;
                        j13 = j20;
                        j14 = j22;
                    } else {
                        j13 = j10;
                        j12 = j11;
                        j16 = j15;
                        d12 = d13;
                        j14 = j20;
                    }
                    if (z11) {
                        if (i12 >= i11) {
                            throw new RuntimeException("Unable to convert " + d10 + " to fraction after " + i11 + " iterations");
                        } else if (j11 < i10) {
                            this.numerator = (int) j10;
                            this.denominator = (int) j11;
                            return;
                        } else {
                            this.numerator = (int) j13;
                            this.denominator = (int) j12;
                            return;
                        }
                    }
                    j18 = j13;
                    z10 = z11;
                    i13 = 1;
                    floor = j21;
                    long j23 = j12;
                    j17 = j14;
                    j15 = j23;
                }
                throw new RuntimeException("Overflow trying to convert " + d10 + " to fraction (" + j10 + PackagingURIHelper.FORWARD_SLASH_STRING + j11 + ")");
            }
            StringBuilder sb2 = new StringBuilder("Overflow trying to convert ");
            sb2.append(d10);
            sb2.append(" to fraction (");
            throw new IllegalArgumentException(h.e(sb2, floor, "/1)"));
        }

        public int getDenominator() {
            return this.denominator;
        }

        public int getNumerator() {
            return this.numerator;
        }

        public Fraction(double d10, int i10) {
            this(d10, 0.0d, i10, 100);
        }
    }
}
