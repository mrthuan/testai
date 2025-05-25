package com.facebook.ads.redexgen.X;

import android.util.Pair;

/* loaded from: assets/audience_network.dex */
public abstract class AM {
    public static String[] A00 = {"IexUQhYz8RUJUtV2yarZNq98m", "SqA0rybJc2Jt0Ub7DMrjeUwUZAoVo8qv", "DxKx9aNXAj7QPQdQDSbsmk09wXoOPMXu", "S07tUDZ51Jgo3YfQ92rRpWn9afvBt6KZ", "soNl1VU97OXHQ4CjHAobgeJ4Yx1tI1qy", "ZprKdiaQVhEf0JuCZOvliqNdbLoAvnqm", "6MSYafjKTbgzk4635", "p5W86Vx2FooSJmLWV"};
    public static final AM A01 = new Z8();

    public abstract int A00();

    public abstract int A01();

    public abstract int A04(Object obj);

    public abstract AK A0A(int i10, AK ak2, boolean z10);

    public abstract AL A0D(int i10, AL al2, boolean z10, long j10);

    public int A02(int i10, int i11, boolean z10) {
        switch (i11) {
            case 0:
                if (i10 == A06(z10)) {
                    return -1;
                }
                return i10 + 1;
            case 1:
                return i10;
            case 2:
                if (i10 == A06(z10)) {
                    return A05(z10);
                }
                return i10 + 1;
            default:
                throw new IllegalStateException();
        }
    }

    public final int A03(int i10, AK ak2, AL al2, int i11, boolean z10) {
        int i12 = A09(i10, ak2).A00;
        int windowIndex = A0B(i12, al2).A01;
        if (windowIndex == i10) {
            int A02 = A02(i12, i11, z10);
            String[] strArr = A00;
            String str = strArr[1];
            String str2 = strArr[3];
            int charAt = str.charAt(18);
            int windowIndex2 = str2.charAt(18);
            if (charAt != windowIndex2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[7] = "n5aRHXbmzoQSsyEqE";
            strArr2[6] = "TNiQeaFqL1JGSvg6B";
            if (A02 == -1) {
                return -1;
            }
            int windowIndex3 = A0B(A02, al2).A00;
            return windowIndex3;
        }
        int windowIndex4 = i10 + 1;
        return windowIndex4;
    }

    public int A05(boolean z10) {
        return A0E() ? -1 : 0;
    }

    public int A06(boolean z10) {
        if (A0E()) {
            return -1;
        }
        return A01() - 1;
    }

    public final Pair<Integer, Long> A07(AL al2, AK ak2, int i10, long j10) {
        return A08(al2, ak2, i10, j10, 0L);
    }

    public final Pair<Integer, Long> A08(AL al2, AK ak2, int i10, long j10, long j11) {
        AbstractC0844Hf.A00(i10, 0, A01());
        A0D(i10, al2, false, j11);
        if (j10 == -9223372036854775807L) {
            j10 = al2.A01();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = al2.A00;
        long periodPositionUs = al2.A03() + j10;
        long A07 = A09(i11, ak2).A07();
        while (A07 != -9223372036854775807L && periodPositionUs >= A07 && i11 < al2.A01) {
            periodPositionUs -= A07;
            i11++;
            A07 = A09(i11, ak2).A07();
        }
        return Pair.create(Integer.valueOf(i11), Long.valueOf(periodPositionUs));
    }

    public final AK A09(int i10, AK ak2) {
        return A0A(i10, ak2, false);
    }

    public final AL A0B(int i10, AL al2) {
        return A0C(i10, al2, false);
    }

    public final AL A0C(int i10, AL al2, boolean z10) {
        return A0D(i10, al2, z10, 0L);
    }

    public final boolean A0E() {
        return A01() == 0;
    }

    public final boolean A0F(int i10, AK ak2, AL al2, int i11, boolean z10) {
        return A03(i10, ak2, al2, i11, z10) == -1;
    }
}
