package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class IG {
    public static String[] A03 = {"tICFAL4tVN9N09RnRvbve", "jaSc1", "IvrnX7ho1ftONDMTmSFi", "OR9MpsR11Z2GGOOmL2LcTaYcXEhohoKR", "D3KVpbGnPeieQhxvT98TBR9XUfKWbPsR", "YldczgdroHyloTUU", "n2r7gPtS6", "vBEfvOWQetlKE"};
    public long A00;
    public long A01;
    public volatile long A02 = -9223372036854775807L;

    public IG(long j10) {
        A02(j10);
    }

    public static long A00(long j10) {
        return (1000000 * j10) / 90000;
    }

    public static long A01(long j10) {
        return (90000 * j10) / 1000000;
    }

    private final synchronized void A02(long j10) {
        AbstractC0844Hf.A04(this.A02 == -9223372036854775807L);
        this.A00 = j10;
    }

    public final long A03() {
        return this.A00;
    }

    public final long A04() {
        if (this.A02 != -9223372036854775807L) {
            long j10 = this.A02;
            long j11 = this.A01;
            if (A03[6].length() != 9) {
                throw new RuntimeException();
            }
            A03[0] = "S4Uu90kHlMHmRsyiW8kTjIwq7rEI2";
            return j11 + j10;
        } else if (this.A00 != Long.MAX_VALUE) {
            return this.A00;
        } else {
            return -9223372036854775807L;
        }
    }

    public final long A05() {
        if (this.A00 == Long.MAX_VALUE) {
            return 0L;
        }
        if (this.A02 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.A01;
    }

    public final long A06(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.A02 != -9223372036854775807L) {
            this.A02 = j10;
        } else {
            if (this.A00 != Long.MAX_VALUE) {
                this.A01 = this.A00 - j10;
            }
            synchronized (this) {
                this.A02 = j10;
                notifyAll();
            }
        }
        return this.A01 + j10;
    }

    public final long A07(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.A02 != -9223372036854775807L) {
            long A01 = A01(this.A02);
            long closestWrapCount = (4294967296L + A01) / 8589934592L;
            long j11 = ((closestWrapCount - 1) * 8589934592L) + j10;
            long j12 = (8589934592L * closestWrapCount) + j10;
            long lastPts = j11 - A01;
            long abs = Math.abs(lastPts);
            long lastPts2 = j12 - A01;
            if (abs >= Math.abs(lastPts2)) {
                j11 = j12;
            }
            j10 = j11;
        }
        long closestWrapCount2 = A00(j10);
        if (A03[1].length() != 5) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[2] = "xHymioxphqEWgFXMAMEG";
        strArr[7] = "XkLzVUm880jPf";
        return A06(closestWrapCount2);
    }

    public final void A08() {
        this.A02 = -9223372036854775807L;
    }
}
