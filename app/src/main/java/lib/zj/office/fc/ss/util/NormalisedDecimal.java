package lib.zj.office.fc.ss.util;

import a6.h;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NormalisedDecimal {
    private static final BigDecimal BD_2_POW_24 = new BigDecimal(BigInteger.ONE.shiftLeft(24));
    private static final int C_2_POW_19 = 524288;
    private static final int EXPONENT_OFFSET = 14;
    private static final int FRAC_HALF = 8388608;
    private static final int LOG_BASE_10_OF_2_TIMES_2_POW_20 = 315653;
    private static final long MAX_REP_WHOLE_PART = 1000000000000000L;
    private final int _fractionalPart;
    private final int _relativeDecimalExponent;
    private final long _wholePart;

    public NormalisedDecimal(long j10, int i10, int i11) {
        this._wholePart = j10;
        this._fractionalPart = i10;
        this._relativeDecimalExponent = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r1.isBelowMaxRep() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r1.isAboveMinRep() != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static lib.zj.office.fc.ss.util.NormalisedDecimal create(java.math.BigInteger r2, int r3) {
        /*
            r0 = 49
            if (r3 > r0) goto Lb
            r0 = 46
            if (r3 >= r0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto L18
        Lb:
            r0 = 315653(0x4d105, float:4.42324E-40)
            int r0 = r0 * r3
            r1 = 15204352(0xe80000, float:2.1305835E-38)
            int r1 = r1 - r0
            r0 = 524288(0x80000, float:7.34684E-40)
            int r1 = r1 + r0
            int r0 = r1 >> 20
            int r0 = -r0
        L18:
            lib.zj.office.fc.ss.util.MutableFPNumber r1 = new lib.zj.office.fc.ss.util.MutableFPNumber
            r1.<init>(r2, r3)
            if (r0 == 0) goto L23
            int r2 = -r0
            r1.multiplyByPowerOfTen(r2)
        L23:
            int r2 = r1.get64BitNormalisedExponent()
            switch(r2) {
                case 44: goto L56;
                case 45: goto L56;
                case 46: goto L4f;
                case 47: goto L5c;
                case 48: goto L5c;
                case 49: goto L41;
                case 50: goto L48;
                default: goto L2a;
            }
        L2a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Bad binary exp "
            r3.<init>(r0)
            int r0 = r1.get64BitNormalisedExponent()
            java.lang.String r1 = "."
            java.lang.String r3 = a6.h.g(r3, r0, r1)
            r2.<init>(r3)
            throw r2
        L41:
            boolean r2 = r1.isBelowMaxRep()
            if (r2 == 0) goto L48
            goto L5c
        L48:
            r2 = -1
            r1.multiplyByPowerOfTen(r2)
            int r0 = r0 + 1
            goto L5c
        L4f:
            boolean r2 = r1.isAboveMinRep()
            if (r2 == 0) goto L56
            goto L5c
        L56:
            r2 = 1
            r1.multiplyByPowerOfTen(r2)
            int r0 = r0 + (-1)
        L5c:
            r1.normalise64bit()
            lib.zj.office.fc.ss.util.NormalisedDecimal r2 = r1.createNormalisedDecimal(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.ss.util.NormalisedDecimal.create(java.math.BigInteger, int):lib.zj.office.fc.ss.util.NormalisedDecimal");
    }

    private String getFractionalDigits() {
        if (this._fractionalPart == 0) {
            return PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        }
        return getFractionalPart().toString().substring(2);
    }

    public int compareNormalised(NormalisedDecimal normalisedDecimal) {
        int i10 = this._relativeDecimalExponent - normalisedDecimal._relativeDecimalExponent;
        if (i10 != 0) {
            return i10;
        }
        long j10 = this._wholePart;
        long j11 = normalisedDecimal._wholePart;
        if (j10 > j11) {
            return 1;
        }
        if (j10 < j11) {
            return -1;
        }
        return this._fractionalPart - normalisedDecimal._fractionalPart;
    }

    public BigInteger composeFrac() {
        long j10 = this._wholePart;
        int i10 = this._fractionalPart;
        return new BigInteger(new byte[]{(byte) (j10 >> 56), (byte) (j10 >> 48), (byte) (j10 >> 40), (byte) (j10 >> 32), (byte) (j10 >> 24), (byte) (j10 >> 16), (byte) (j10 >> 8), (byte) (j10 >> 0), (byte) (i10 >> 16), (byte) (i10 >> 8), (byte) (i10 >> 0)});
    }

    public int getDecimalExponent() {
        return this._relativeDecimalExponent + 14;
    }

    public BigDecimal getFractionalPart() {
        return new BigDecimal(this._fractionalPart).divide(BD_2_POW_24);
    }

    public String getSignificantDecimalDigits() {
        return Long.toString(this._wholePart);
    }

    public String getSignificantDecimalDigitsLastDigitRounded() {
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append(this._wholePart + 5);
        sb2.setCharAt(sb2.length() - 1, '0');
        return sb2.toString();
    }

    public ExpandedDouble normaliseBaseTwo() {
        MutableFPNumber mutableFPNumber = new MutableFPNumber(composeFrac(), 39);
        mutableFPNumber.multiplyByPowerOfTen(this._relativeDecimalExponent);
        mutableFPNumber.normalise64bit();
        return mutableFPNumber.createExpandedDouble();
    }

    public NormalisedDecimal roundUnits() {
        long j10 = this._wholePart;
        if (this._fractionalPart >= FRAC_HALF) {
            j10++;
        }
        int i10 = this._relativeDecimalExponent;
        if (j10 < MAX_REP_WHOLE_PART) {
            return new NormalisedDecimal(j10, 0, i10);
        }
        return new NormalisedDecimal(j10 / 10, 0, i10 + 1);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(NormalisedDecimal.class.getName());
        sb2.append(" [");
        String valueOf = String.valueOf(this._wholePart);
        sb2.append(valueOf.charAt(0));
        sb2.append('.');
        sb2.append(valueOf.substring(1));
        sb2.append(' ');
        sb2.append(getFractionalDigits());
        sb2.append("E");
        return h.g(sb2, getDecimalExponent(), "]");
    }
}
