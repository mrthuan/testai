package com.facebook.ads.redexgen.X;

import android.text.Layout;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* loaded from: assets/audience_network.dex */
public final class XF extends C0807Fs {
    public final long A00;
    public final long A01;

    public XF(long j10, long j11, CharSequence charSequence) {
        this(j10, j11, charSequence, null, Float.MIN_VALUE, SlideAtom.USES_MASTER_SLIDE_ID, SlideAtom.USES_MASTER_SLIDE_ID, Float.MIN_VALUE, SlideAtom.USES_MASTER_SLIDE_ID, Float.MIN_VALUE);
    }

    public XF(long j10, long j11, CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12) {
        super(charSequence, alignment, f10, i10, i11, f11, i12, f12);
        this.A01 = j10;
        this.A00 = j11;
    }

    public XF(CharSequence charSequence) {
        this(0L, 0L, charSequence);
    }

    public final boolean A00() {
        return super.A01 == Float.MIN_VALUE && this.A02 == Float.MIN_VALUE;
    }
}
