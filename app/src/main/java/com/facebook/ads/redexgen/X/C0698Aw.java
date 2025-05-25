package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;
import com.inmobi.commons.core.configs.TelemetryConfig;

/* renamed from: com.facebook.ads.redexgen.X.Aw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0698Aw {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public final C0696Au A05;

    public C0698Aw(AudioTrack audioTrack) {
        if (IK.A02 >= 19) {
            this.A05 = new C0696Au(audioTrack);
            A05();
            return;
        }
        this.A05 = null;
        A00(3);
    }

    private void A00(int i10) {
        this.A00 = i10;
        switch (i10) {
            case 0:
                this.A03 = 0L;
                this.A01 = -1L;
                this.A02 = System.nanoTime() / 1000;
                this.A04 = TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL;
                return;
            case 1:
                this.A04 = TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL;
                return;
            case 2:
            case 3:
                this.A04 = 10000000L;
                return;
            case 4:
                this.A04 = 500000L;
                return;
            default:
                throw new IllegalStateException();
        }
    }

    public final long A01() {
        if (this.A05 != null) {
            return this.A05.A00();
        }
        return -1L;
    }

    public final long A02() {
        if (this.A05 != null) {
            return this.A05.A01();
        }
        return -9223372036854775807L;
    }

    public final void A03() {
        if (this.A00 == 4) {
            A05();
        }
    }

    public final void A04() {
        A00(4);
    }

    public final void A05() {
        if (this.A05 != null) {
            A00(0);
        }
    }

    public final boolean A06() {
        return this.A00 == 1 || this.A00 == 2;
    }

    public final boolean A07() {
        return this.A00 == 2;
    }

    public final boolean A08(long j10) {
        if (this.A05 == null || j10 - this.A03 < this.A04) {
            return false;
        }
        this.A03 = j10;
        boolean A02 = this.A05.A02();
        switch (this.A00) {
            case 0:
                if (A02) {
                    long A01 = this.A05.A01();
                    long timestampPositionFrames = this.A02;
                    if (A01 >= timestampPositionFrames) {
                        this.A01 = this.A05.A00();
                        A00(1);
                        return A02;
                    }
                    return false;
                } else if (j10 - this.A02 <= 500000) {
                    return A02;
                } else {
                    A00(3);
                    return A02;
                }
            case 1:
                if (A02) {
                    long A00 = this.A05.A00();
                    long timestampPositionFrames2 = this.A01;
                    if (A00 > timestampPositionFrames2) {
                        A00(2);
                        return A02;
                    }
                    return A02;
                }
                A05();
                return A02;
            case 2:
                if (!A02) {
                    A05();
                    return A02;
                }
                return A02;
            case 3:
                if (A02) {
                    A05();
                    return A02;
                }
                return A02;
            case 4:
                return A02;
            default:
                throw new IllegalStateException();
        }
    }
}
