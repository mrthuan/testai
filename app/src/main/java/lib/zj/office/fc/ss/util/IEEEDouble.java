package lib.zj.office.fc.ss.util;

/* loaded from: classes3.dex */
final class IEEEDouble {
    public static final int BIASED_EXPONENT_SPECIAL_VALUE = 2047;
    public static final int EXPONENT_BIAS = 1023;
    private static final long EXPONENT_MASK = 9218868437227405312L;
    private static final int EXPONENT_SHIFT = 52;
    public static final long FRAC_ASSUMED_HIGH_BIT = 4503599627370496L;
    public static final long FRAC_MASK = 4503599627370495L;

    public static int getBiasedExponent(long j10) {
        return (int) ((j10 & EXPONENT_MASK) >> 52);
    }
}
