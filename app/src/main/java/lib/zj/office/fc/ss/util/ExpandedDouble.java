package lib.zj.office.fc.ss.util;

import java.math.BigInteger;

/* loaded from: classes3.dex */
final class ExpandedDouble {
    private static final BigInteger BI_FRAC_MASK = BigInteger.valueOf(IEEEDouble.FRAC_MASK);
    private static final BigInteger BI_IMPLIED_FRAC_MSB = BigInteger.valueOf(IEEEDouble.FRAC_ASSUMED_HIGH_BIT);
    private final int _binaryExponent;
    private final BigInteger _significand;

    public ExpandedDouble(long j10) {
        int i10 = (int) (j10 >> 52);
        if (i10 == 0) {
            BigInteger and = BigInteger.valueOf(j10).and(BI_FRAC_MASK);
            int bitLength = 64 - and.bitLength();
            this._significand = and.shiftLeft(bitLength);
            this._binaryExponent = ((i10 & IEEEDouble.BIASED_EXPONENT_SPECIAL_VALUE) - 1023) - bitLength;
            return;
        }
        this._significand = getFrac(j10);
        this._binaryExponent = (i10 & IEEEDouble.BIASED_EXPONENT_SPECIAL_VALUE) - 1023;
    }

    public static ExpandedDouble fromRawBitsAndExponent(long j10, int i10) {
        return new ExpandedDouble(getFrac(j10), i10);
    }

    private static BigInteger getFrac(long j10) {
        return BigInteger.valueOf(j10).and(BI_FRAC_MASK).or(BI_IMPLIED_FRAC_MSB).shiftLeft(11);
    }

    public int getBinaryExponent() {
        return this._binaryExponent;
    }

    public BigInteger getSignificand() {
        return this._significand;
    }

    public NormalisedDecimal normaliseBaseTen() {
        return NormalisedDecimal.create(this._significand, this._binaryExponent);
    }

    public ExpandedDouble(BigInteger bigInteger, int i10) {
        if (bigInteger.bitLength() == 64) {
            this._significand = bigInteger;
            this._binaryExponent = i10;
            return;
        }
        throw new IllegalArgumentException("bad bit length");
    }
}
