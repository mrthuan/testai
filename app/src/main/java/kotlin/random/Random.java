package kotlin.random;

import ag.a;
import androidx.activity.f;
import fg.a;
import hg.c;
import java.io.Serializable;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.g;
import yf.b;

/* compiled from: Random.kt */
/* loaded from: classes.dex */
public abstract class Random {
    public static final Default Default = new Default(null);

    /* renamed from: a  reason: collision with root package name */
    public static final a f19951a;

    /* compiled from: Random.kt */
    /* loaded from: classes.dex */
    public static final class Default extends Random implements Serializable {

        /* compiled from: Random.kt */
        /* loaded from: classes.dex */
        public static final class Serialized implements Serializable {
            public static final Serialized INSTANCE = new Serialized();
            private static final long serialVersionUID = 0;

            private Serialized() {
            }

            private final Object readResolve() {
                return Random.Default;
            }
        }

        public /* synthetic */ Default(d dVar) {
            this();
        }

        private final Object writeReplace() {
            return Serialized.INSTANCE;
        }

        @Override // kotlin.random.Random
        public int nextBits(int i10) {
            return Random.f19951a.nextBits(i10);
        }

        @Override // kotlin.random.Random
        public boolean nextBoolean() {
            return Random.f19951a.nextBoolean();
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(byte[] array) {
            g.e(array, "array");
            return Random.f19951a.nextBytes(array);
        }

        @Override // kotlin.random.Random
        public double nextDouble() {
            return Random.f19951a.nextDouble();
        }

        @Override // kotlin.random.Random
        public float nextFloat() {
            return Random.f19951a.nextFloat();
        }

        @Override // kotlin.random.Random
        public int nextInt() {
            return Random.f19951a.nextInt();
        }

        @Override // kotlin.random.Random
        public long nextLong() {
            return Random.f19951a.nextLong();
        }

        private Default() {
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(int i10) {
            return Random.f19951a.nextBytes(i10);
        }

        @Override // kotlin.random.Random
        public double nextDouble(double d10) {
            return Random.f19951a.nextDouble(d10);
        }

        @Override // kotlin.random.Random
        public int nextInt(int i10) {
            return Random.f19951a.nextInt(i10);
        }

        @Override // kotlin.random.Random
        public long nextLong(long j10) {
            return Random.f19951a.nextLong(j10);
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(byte[] array, int i10, int i11) {
            g.e(array, "array");
            return Random.f19951a.nextBytes(array, i10, i11);
        }

        @Override // kotlin.random.Random
        public double nextDouble(double d10, double d11) {
            return Random.f19951a.nextDouble(d10, d11);
        }

        @Override // kotlin.random.Random
        public int nextInt(int i10, int i11) {
            return Random.f19951a.nextInt(i10, i11);
        }

        @Override // kotlin.random.Random
        public long nextLong(long j10, long j11) {
            return Random.f19951a.nextLong(j10, j11);
        }
    }

    static {
        boolean z10;
        a bVar;
        b.f32140a.getClass();
        Integer num = a.C0002a.f478a;
        if (num != null && num.intValue() < 34) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            bVar = new gg.a();
        } else {
            bVar = new fg.b();
        }
        f19951a = bVar;
    }

    public static /* synthetic */ byte[] nextBytes$default(Random random, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return random.nextBytes(bArr, i10, i11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
    }

    public abstract int nextBits(int i10);

    public boolean nextBoolean() {
        if (nextBits(1) != 0) {
            return true;
        }
        return false;
    }

    public byte[] nextBytes(byte[] array, int i10, int i11) {
        g.e(array, "array");
        if (new c(0, array.length).b(i10) && new c(0, array.length).b(i11)) {
            if (i10 <= i11) {
                int i12 = (i11 - i10) / 4;
                for (int i13 = 0; i13 < i12; i13++) {
                    int nextInt = nextInt();
                    array[i10] = (byte) nextInt;
                    array[i10 + 1] = (byte) (nextInt >>> 8);
                    array[i10 + 2] = (byte) (nextInt >>> 16);
                    array[i10 + 3] = (byte) (nextInt >>> 24);
                    i10 += 4;
                }
                int i14 = i11 - i10;
                int nextBits = nextBits(i14 * 8);
                for (int i15 = 0; i15 < i14; i15++) {
                    array[i10 + i15] = (byte) (nextBits >>> (i15 * 8));
                }
                return array;
            }
            throw new IllegalArgumentException(f.k("fromIndex (", i10, ") must be not greater than toIndex (", i11, ").").toString());
        }
        throw new IllegalArgumentException(f.n(a0.d.f("fromIndex (", i10, ") or toIndex (", i11, ") are out of range: 0.."), array.length, '.').toString());
    }

    public double nextDouble() {
        return ((nextBits(26) << 27) + nextBits(27)) / 9.007199254740992E15d;
    }

    public float nextFloat() {
        return nextBits(24) / 1.6777216E7f;
    }

    public int nextInt() {
        return nextBits(32);
    }

    public long nextLong() {
        return (nextInt() << 32) + nextInt();
    }

    public double nextDouble(double d10) {
        return nextDouble(0.0d, d10);
    }

    public int nextInt(int i10) {
        return nextInt(0, i10);
    }

    public long nextLong(long j10) {
        return nextLong(0L, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public double nextDouble(double r7, double r9) {
        /*
            r6 = this;
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L8
            r0 = r1
            goto L9
        L8:
            r0 = r2
        L9:
            if (r0 == 0) goto L54
            double r3 = r9 - r7
            boolean r0 = java.lang.Double.isInfinite(r3)
            if (r0 == 0) goto L43
            boolean r0 = java.lang.Double.isInfinite(r7)
            if (r0 != 0) goto L21
            boolean r0 = java.lang.Double.isNaN(r7)
            if (r0 != 0) goto L21
            r0 = r1
            goto L22
        L21:
            r0 = r2
        L22:
            if (r0 == 0) goto L43
            boolean r0 = java.lang.Double.isInfinite(r9)
            if (r0 != 0) goto L31
            boolean r0 = java.lang.Double.isNaN(r9)
            if (r0 != 0) goto L31
            goto L32
        L31:
            r1 = r2
        L32:
            if (r1 == 0) goto L43
            double r0 = r6.nextDouble()
            r2 = 2
            double r2 = (double) r2
            double r4 = r9 / r2
            double r2 = r7 / r2
            double r4 = r4 - r2
            double r4 = r4 * r0
            double r7 = r7 + r4
            double r7 = r7 + r4
            goto L49
        L43:
            double r0 = r6.nextDouble()
            double r0 = r0 * r3
            double r7 = r7 + r0
        L49:
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L53
            r7 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            double r7 = java.lang.Math.nextAfter(r9, r7)
        L53:
            return r7
        L54:
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            java.lang.Double r8 = java.lang.Double.valueOf(r9)
            java.lang.String r7 = o9.d.k(r7, r8)
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.random.Random.nextDouble(double, double):double");
    }

    public int nextInt(int i10, int i11) {
        int nextInt;
        int i12;
        int i13;
        int nextInt2;
        boolean z10;
        if (i11 > i10) {
            int i14 = i11 - i10;
            if (i14 > 0 || i14 == Integer.MIN_VALUE) {
                if (((-i14) & i14) == i14) {
                    i13 = nextBits(31 - Integer.numberOfLeadingZeros(i14));
                } else {
                    do {
                        nextInt = nextInt() >>> 1;
                        i12 = nextInt % i14;
                    } while ((i14 - 1) + (nextInt - i12) < 0);
                    i13 = i12;
                }
                return i10 + i13;
            }
            do {
                nextInt2 = nextInt();
                if (i10 > nextInt2 || nextInt2 >= i11) {
                    z10 = false;
                    continue;
                } else {
                    z10 = true;
                    continue;
                }
            } while (!z10);
            return nextInt2;
        }
        throw new IllegalArgumentException(o9.d.k(Integer.valueOf(i10), Integer.valueOf(i11)).toString());
    }

    public long nextLong(long j10, long j11) {
        long nextLong;
        boolean z10;
        long nextLong2;
        long j12;
        long j13;
        int nextInt;
        if (j11 > j10) {
            long j14 = j11 - j10;
            if (j14 <= 0) {
                do {
                    nextLong = nextLong();
                    if (j10 > nextLong || nextLong >= j11) {
                        z10 = false;
                        continue;
                    } else {
                        z10 = true;
                        continue;
                    }
                } while (!z10);
                return nextLong;
            }
            if (((-j14) & j14) == j14) {
                int i10 = (int) j14;
                int i11 = (int) (j14 >>> 32);
                if (i10 != 0) {
                    nextInt = nextBits(31 - Integer.numberOfLeadingZeros(i10));
                } else if (i11 == 1) {
                    nextInt = nextInt();
                } else {
                    j13 = (nextBits(31 - Integer.numberOfLeadingZeros(i11)) << 32) + (nextInt() & 4294967295L);
                }
                j13 = nextInt & 4294967295L;
            } else {
                do {
                    nextLong2 = nextLong() >>> 1;
                    j12 = nextLong2 % j14;
                } while ((j14 - 1) + (nextLong2 - j12) < 0);
                j13 = j12;
            }
            return j10 + j13;
        }
        throw new IllegalArgumentException(o9.d.k(Long.valueOf(j10), Long.valueOf(j11)).toString());
    }

    public byte[] nextBytes(byte[] array) {
        g.e(array, "array");
        return nextBytes(array, 0, array.length);
    }

    public byte[] nextBytes(int i10) {
        return nextBytes(new byte[i10]);
    }
}
