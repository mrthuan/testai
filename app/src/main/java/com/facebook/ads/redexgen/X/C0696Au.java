package com.facebook.ads.redexgen.X;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* renamed from: com.facebook.ads.redexgen.X.Au  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0696Au {
    public long A00;
    public long A01;
    public long A02;
    public final AudioTimestamp A03 = new AudioTimestamp();
    public final AudioTrack A04;

    public C0696Au(AudioTrack audioTrack) {
        this.A04 = audioTrack;
    }

    public final long A00() {
        return this.A00;
    }

    public final long A01() {
        return this.A03.nanoTime / 1000;
    }

    public final boolean A02() {
        boolean timestamp = this.A04.getTimestamp(this.A03);
        if (timestamp) {
            long j10 = this.A03.framePosition;
            long rawPositionFrames = this.A01;
            if (rawPositionFrames > j10) {
                this.A02++;
            }
            this.A01 = j10;
            long rawPositionFrames2 = this.A02;
            this.A00 = (rawPositionFrames2 << 32) + j10;
        }
        return timestamp;
    }
}
