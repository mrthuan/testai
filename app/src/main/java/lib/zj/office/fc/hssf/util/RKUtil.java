package lib.zj.office.fc.hssf.util;

/* loaded from: classes3.dex */
public final class RKUtil {
    private RKUtil() {
    }

    public static double decodeNumber(int i10) {
        double longBitsToDouble;
        long j10 = i10 >> 2;
        if ((i10 & 2) == 2) {
            longBitsToDouble = j10;
        } else {
            longBitsToDouble = Double.longBitsToDouble(j10 << 34);
        }
        if ((i10 & 1) == 1) {
            return longBitsToDouble / 100.0d;
        }
        return longBitsToDouble;
    }
}
