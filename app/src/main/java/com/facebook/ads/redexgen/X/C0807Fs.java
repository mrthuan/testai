package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.text.Layout;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* renamed from: com.facebook.ads.redexgen.X.Fs  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0807Fs {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Bitmap A0A;
    public final Layout.Alignment A0B;
    public final CharSequence A0C;
    public final boolean A0D;

    public C0807Fs(Bitmap bitmap, float f10, int i10, float f11, int i11, float f12, float f13) {
        this(null, null, bitmap, f11, 0, i11, f10, i10, SlideAtom.USES_MASTER_SLIDE_ID, Float.MIN_VALUE, f12, f13, false, -16777216);
    }

    public C0807Fs(CharSequence charSequence) {
        this(charSequence, null, Float.MIN_VALUE, SlideAtom.USES_MASTER_SLIDE_ID, SlideAtom.USES_MASTER_SLIDE_ID, Float.MIN_VALUE, SlideAtom.USES_MASTER_SLIDE_ID, Float.MIN_VALUE);
    }

    public C0807Fs(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12) {
        this(charSequence, alignment, f10, i10, i11, f11, i12, f12, false, -16777216);
    }

    public C0807Fs(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, int i13, float f13) {
        this(charSequence, alignment, null, f10, i10, i11, f11, i12, i13, f13, f12, Float.MIN_VALUE, false, -16777216);
    }

    public C0807Fs(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13) {
        this(charSequence, alignment, null, f10, i10, i11, f11, i12, SlideAtom.USES_MASTER_SLIDE_ID, Float.MIN_VALUE, f12, Float.MIN_VALUE, z10, i13);
    }

    public C0807Fs(CharSequence charSequence, Layout.Alignment alignment, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14) {
        this.A0C = charSequence;
        this.A0B = alignment;
        this.A0A = bitmap;
        this.A01 = f10;
        this.A06 = i10;
        this.A05 = i11;
        this.A02 = f11;
        this.A07 = i12;
        this.A03 = f13;
        this.A00 = f14;
        this.A0D = z10;
        this.A09 = i14;
        this.A08 = i13;
        this.A04 = f12;
    }
}
