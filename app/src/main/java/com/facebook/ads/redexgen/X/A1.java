package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;

/* loaded from: assets/audience_network.dex */
public final class A1 {
    public final int A00;
    public final long A01;
    public final long A02;
    public final AM A03;
    public final Et A04;
    public final TrackGroupArray A05;
    public final C0828Gp A06;
    public final Object A07;
    public final boolean A08;
    public volatile long A09;
    public volatile long A0A;

    public A1(AM am2, long j10, TrackGroupArray trackGroupArray, C0828Gp c0828Gp) {
        this(am2, null, new Et(0), j10, -9223372036854775807L, 1, false, trackGroupArray, c0828Gp);
    }

    public A1(AM am2, Object obj, Et et, long j10, long j11, int i10, boolean z10, TrackGroupArray trackGroupArray, C0828Gp c0828Gp) {
        this.A03 = am2;
        this.A07 = obj;
        this.A04 = et;
        this.A02 = j10;
        this.A01 = j11;
        this.A0A = j10;
        this.A09 = j10;
        this.A00 = i10;
        this.A08 = z10;
        this.A05 = trackGroupArray;
        this.A06 = c0828Gp;
    }

    public static void A00(A1 a12, A1 a13) {
        a13.A0A = a12.A0A;
        a13.A09 = a12.A09;
    }

    public final A1 A01(int i10) {
        A1 a12 = new A1(this.A03, this.A07, this.A04.A00(i10), this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, a12);
        return a12;
    }

    public final A1 A02(int i10) {
        A1 playbackInfo = new A1(this.A03, this.A07, this.A04, this.A02, this.A01, i10, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final A1 A03(AM am2, Object obj) {
        A1 playbackInfo = new A1(am2, obj, this.A04, this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final A1 A04(Et et, long j10, long j11) {
        long j12 = j11;
        AM am2 = this.A03;
        Object obj = this.A07;
        if (!et.A01()) {
            j12 = -9223372036854775807L;
        }
        return new A1(am2, obj, et, j10, j12, this.A00, this.A08, this.A05, this.A06);
    }

    public final A1 A05(TrackGroupArray trackGroupArray, C0828Gp c0828Gp) {
        A1 playbackInfo = new A1(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, this.A08, trackGroupArray, c0828Gp);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final A1 A06(boolean z10) {
        A1 playbackInfo = new A1(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, z10, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }
}
