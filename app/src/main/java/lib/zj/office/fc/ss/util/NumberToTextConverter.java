package lib.zj.office.fc.ss.util;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;

/* loaded from: classes3.dex */
public final class NumberToTextConverter {
    private static final long EXCEL_NAN_BITS = -276939487313920L;
    private static final int MAX_TEXT_LEN = 20;

    private NumberToTextConverter() {
    }

    private static void appendExp(StringBuilder sb2, int i10) {
        if (i10 < 10) {
            sb2.append('0');
            sb2.append((char) (i10 + 48));
            return;
        }
        sb2.append(i10);
    }

    private static void convertToText(StringBuilder sb2, NormalisedDecimal normalisedDecimal) {
        String significantDecimalDigits;
        NormalisedDecimal roundUnits = normalisedDecimal.roundUnits();
        int decimalExponent = roundUnits.getDecimalExponent();
        if (Math.abs(decimalExponent) > 98) {
            significantDecimalDigits = roundUnits.getSignificantDecimalDigitsLastDigitRounded();
            if (significantDecimalDigits.length() == 16) {
                decimalExponent++;
            }
        } else {
            significantDecimalDigits = roundUnits.getSignificantDecimalDigits();
        }
        int countSignifantDigits = countSignifantDigits(significantDecimalDigits);
        if (decimalExponent < 0) {
            formatLessThanOne(sb2, significantDecimalDigits, decimalExponent, countSignifantDigits);
        } else {
            formatGreaterThanOne(sb2, significantDecimalDigits, decimalExponent, countSignifantDigits);
        }
    }

    private static int countSignifantDigits(String str) {
        int length = str.length() - 1;
        while (str.charAt(length) == '0') {
            length--;
            if (length < 0) {
                throw new RuntimeException("No non-zero digits found");
            }
        }
        return length + 1;
    }

    private static void formatGreaterThanOne(StringBuilder sb2, String str, int i10, int i11) {
        if (i10 > 19) {
            sb2.append(str.charAt(0));
            if (i11 > 1) {
                sb2.append('.');
                sb2.append(str.subSequence(1, i11));
            }
            sb2.append("E+");
            appendExp(sb2, i10);
            return;
        }
        int i12 = (i11 - i10) - 1;
        if (i12 > 0) {
            int i13 = i10 + 1;
            sb2.append(str.subSequence(0, i13));
            sb2.append('.');
            sb2.append(str.subSequence(i13, i11));
            return;
        }
        sb2.append(str.subSequence(0, i11));
        for (int i14 = -i12; i14 > 0; i14--) {
            sb2.append('0');
        }
    }

    private static void formatLessThanOne(StringBuilder sb2, String str, int i10, int i11) {
        int i12 = -i10;
        int i13 = i12 - 1;
        if (needsScientificNotation(i13 + 2 + i11)) {
            sb2.append(str.charAt(0));
            if (i11 > 1) {
                sb2.append('.');
                sb2.append(str.subSequence(1, i11));
            }
            sb2.append("E-");
            appendExp(sb2, i12);
            return;
        }
        sb2.append("0.");
        while (i13 > 0) {
            sb2.append('0');
            i13--;
        }
        sb2.append(str.subSequence(0, i11));
    }

    private static boolean needsScientificNotation(int i10) {
        if (i10 > 20) {
            return true;
        }
        return false;
    }

    public static String rawDoubleBitsToText(long j10) {
        boolean z10;
        boolean z11 = false;
        if (j10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            j10 &= Long.MAX_VALUE;
        }
        if (j10 == 0) {
            if (z10) {
                return "-0";
            }
            return PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        }
        ExpandedDouble expandedDouble = new ExpandedDouble(j10);
        if (expandedDouble.getBinaryExponent() < -1022) {
            if (z10) {
                return "-0";
            }
            return PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        }
        if (expandedDouble.getBinaryExponent() == 1024) {
            if (j10 == EXCEL_NAN_BITS) {
                return "3.484840871308E+308";
            }
        } else {
            z11 = z10;
        }
        NormalisedDecimal normaliseBaseTen = expandedDouble.normaliseBaseTen();
        StringBuilder sb2 = new StringBuilder(21);
        if (z11) {
            sb2.append('-');
        }
        convertToText(sb2, normaliseBaseTen);
        return sb2.toString();
    }

    public static String toText(double d10) {
        return rawDoubleBitsToText(Double.doubleToLongBits(d10));
    }
}
