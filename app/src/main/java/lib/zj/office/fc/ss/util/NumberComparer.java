package lib.zj.office.fc.ss.util;

/* loaded from: classes3.dex */
public final class NumberComparer {
    public static int compare(double d10, double d11) {
        boolean z10;
        boolean z11;
        long doubleToLongBits = Double.doubleToLongBits(d10);
        long doubleToLongBits2 = Double.doubleToLongBits(d11);
        int biasedExponent = IEEEDouble.getBiasedExponent(doubleToLongBits);
        int biasedExponent2 = IEEEDouble.getBiasedExponent(doubleToLongBits2);
        if (biasedExponent != 2047) {
            if (biasedExponent2 != 2047) {
                if (doubleToLongBits < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (doubleToLongBits2 < 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 != z11) {
                    if (!z10) {
                        return 1;
                    }
                    return -1;
                }
                int i10 = biasedExponent - biasedExponent2;
                int abs = Math.abs(i10);
                if (abs > 1) {
                    if (z10) {
                        return -i10;
                    }
                    return i10;
                } else if (abs != 1 && doubleToLongBits == doubleToLongBits2) {
                    return 0;
                } else {
                    if (biasedExponent == 0) {
                        if (biasedExponent2 == 0) {
                            return compareSubnormalNumbers(doubleToLongBits & IEEEDouble.FRAC_MASK, IEEEDouble.FRAC_MASK & doubleToLongBits2, z10);
                        }
                        return -compareAcrossSubnormalThreshold(doubleToLongBits2, doubleToLongBits, z10);
                    } else if (biasedExponent2 == 0) {
                        return compareAcrossSubnormalThreshold(doubleToLongBits, doubleToLongBits2, z10);
                    } else {
                        int compareNormalised = ExpandedDouble.fromRawBitsAndExponent(doubleToLongBits, biasedExponent - 1023).normaliseBaseTen().roundUnits().compareNormalised(ExpandedDouble.fromRawBitsAndExponent(doubleToLongBits2, biasedExponent2 - 1023).normaliseBaseTen().roundUnits());
                        if (z10) {
                            return -compareNormalised;
                        }
                        return compareNormalised;
                    }
                }
            }
            throw new IllegalArgumentException("Special double values are not allowed: " + toHex(d10));
        }
        throw new IllegalArgumentException("Special double values are not allowed: " + toHex(d10));
    }

    private static int compareAcrossSubnormalThreshold(long j10, long j11, boolean z10) {
        int i10;
        long j12 = j11 & IEEEDouble.FRAC_MASK;
        if (j12 == 0) {
            if (z10) {
                return -1;
            }
            return 1;
        }
        int i11 = ((j10 & IEEEDouble.FRAC_MASK) > 7L ? 1 : ((j10 & IEEEDouble.FRAC_MASK) == 7L ? 0 : -1));
        if (i11 <= 0 && j12 >= 4503599627370490L) {
            if (i11 == 0 && i10 == 0) {
                return 0;
            }
            if (!z10) {
                return -1;
            }
            return 1;
        } else if (z10) {
            return -1;
        } else {
            return 1;
        }
    }

    private static int compareSubnormalNumbers(long j10, long j11, boolean z10) {
        int i10;
        int i11 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i11 > 0) {
            i10 = 1;
        } else if (i11 < 0) {
            i10 = -1;
        } else {
            i10 = 0;
        }
        if (z10) {
            return -i10;
        }
        return i10;
    }

    private static String toHex(double d10) {
        return "0x" + Long.toHexString(Double.doubleToLongBits(d10)).toUpperCase();
    }
}
