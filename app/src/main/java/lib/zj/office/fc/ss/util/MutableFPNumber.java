package lib.zj.office.fc.ss.util;

import java.math.BigInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class MutableFPNumber {
    private static final int C_64 = 64;
    private static final int MIN_PRECISION = 72;
    private int _binaryExponent;
    private BigInteger _significand;
    private static final BigInteger BI_MIN_BASE = new BigInteger("0B5E620F47FFFE666", 16);
    private static final BigInteger BI_MAX_BASE = new BigInteger("0E35FA9319FFFE000", 16);

    /* loaded from: classes3.dex */
    public static final class Rounder {
        private static final BigInteger[] HALF_BITS;

        static {
            BigInteger[] bigIntegerArr = new BigInteger[33];
            long j10 = 1;
            for (int i10 = 1; i10 < 33; i10++) {
                bigIntegerArr[i10] = BigInteger.valueOf(j10);
                j10 <<= 1;
            }
            HALF_BITS = bigIntegerArr;
        }

        private Rounder() {
        }

        public static BigInteger round(BigInteger bigInteger, int i10) {
            if (i10 < 1) {
                return bigInteger;
            }
            return bigInteger.add(HALF_BITS[i10]);
        }
    }

    /* loaded from: classes3.dex */
    public static final class TenPower {
        private static final BigInteger FIVE = new BigInteger("5");
        private static final TenPower[] _cache = new TenPower[350];
        public final BigInteger _divisor;
        public final int _divisorShift;
        public final BigInteger _multiplicand;
        public final int _multiplierShift;

        private TenPower(int i10) {
            BigInteger pow = FIVE.pow(i10);
            int bitLength = pow.bitLength();
            BigInteger divide = BigInteger.ONE.shiftLeft(bitLength + 80).divide(pow);
            int bitLength2 = divide.bitLength() - 80;
            this._divisor = divide.shiftRight(bitLength2);
            this._divisorShift = -((bitLength - bitLength2) + i10 + 80);
            int bitLength3 = pow.bitLength() - 68;
            if (bitLength3 > 0) {
                this._multiplierShift = i10 + bitLength3;
                this._multiplicand = pow.shiftRight(bitLength3);
                return;
            }
            this._multiplierShift = i10;
            this._multiplicand = pow;
        }

        public static TenPower getInstance(int i10) {
            TenPower[] tenPowerArr = _cache;
            TenPower tenPower = tenPowerArr[i10];
            if (tenPower == null) {
                TenPower tenPower2 = new TenPower(i10);
                tenPowerArr[i10] = tenPower2;
                return tenPower2;
            }
            return tenPower;
        }
    }

    public MutableFPNumber(BigInteger bigInteger, int i10) {
        this._significand = bigInteger;
        this._binaryExponent = i10;
    }

    private void mulShift(BigInteger bigInteger, int i10) {
        BigInteger multiply;
        this._significand = this._significand.multiply(bigInteger);
        this._binaryExponent += i10;
        int bitLength = (multiply.bitLength() - 72) & (-32);
        if (bitLength > 0) {
            this._significand = this._significand.shiftRight(bitLength);
            this._binaryExponent += bitLength;
        }
    }

    public MutableFPNumber copy() {
        return new MutableFPNumber(this._significand, this._binaryExponent);
    }

    public ExpandedDouble createExpandedDouble() {
        return new ExpandedDouble(this._significand, this._binaryExponent);
    }

    public NormalisedDecimal createNormalisedDecimal(int i10) {
        int intValue = this._significand.intValue();
        return new NormalisedDecimal(this._significand.shiftRight((64 - this._binaryExponent) - 1).longValue(), (intValue << (this._binaryExponent - 39)) & 16777088, i10);
    }

    public int get64BitNormalisedExponent() {
        return (this._significand.bitLength() + this._binaryExponent) - 64;
    }

    public boolean isAboveMinRep() {
        if (this._significand.compareTo(BI_MIN_BASE.shiftLeft(this._significand.bitLength() - 64)) > 0) {
            return true;
        }
        return false;
    }

    public boolean isBelowMaxRep() {
        if (this._significand.compareTo(BI_MAX_BASE.shiftLeft(this._significand.bitLength() - 64)) < 0) {
            return true;
        }
        return false;
    }

    public void multiplyByPowerOfTen(int i10) {
        TenPower tenPower = TenPower.getInstance(Math.abs(i10));
        if (i10 < 0) {
            mulShift(tenPower._divisor, tenPower._divisorShift);
        } else {
            mulShift(tenPower._multiplicand, tenPower._multiplierShift);
        }
    }

    public void normalise64bit() {
        int bitLength = this._significand.bitLength();
        int i10 = bitLength - 64;
        if (i10 == 0) {
            return;
        }
        if (i10 >= 0) {
            this._binaryExponent += i10;
            if (i10 > 32) {
                int i11 = (i10 - 1) & 16777184;
                this._significand = this._significand.shiftRight(i11);
                i10 -= i11;
                bitLength -= i11;
            }
            if (i10 >= 1) {
                BigInteger round = Rounder.round(this._significand, i10);
                this._significand = round;
                if (round.bitLength() > bitLength) {
                    i10++;
                    this._binaryExponent++;
                }
                this._significand = this._significand.shiftRight(i10);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException("Not enough precision");
    }
}
