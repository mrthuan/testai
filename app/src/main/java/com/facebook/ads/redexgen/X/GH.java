package com.facebook.ads.redexgen.X;

import lib.zj.office.fc.hslf.record.SlideAtom;

/* loaded from: assets/audience_network.dex */
public final class GH {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final String A07;

    public GH(String str) {
        this(str, Float.MIN_VALUE, Float.MIN_VALUE, SlideAtom.USES_MASTER_SLIDE_ID, SlideAtom.USES_MASTER_SLIDE_ID, Float.MIN_VALUE, SlideAtom.USES_MASTER_SLIDE_ID, Float.MIN_VALUE);
    }

    public GH(String str, float f10, float f11, int i10, int i11, float f12, int i12, float f13) {
        this.A07 = str;
        this.A01 = f10;
        this.A00 = f11;
        this.A05 = i10;
        this.A04 = i11;
        this.A03 = f12;
        this.A06 = i12;
        this.A02 = f13;
    }
}
