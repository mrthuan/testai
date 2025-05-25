package com.inmobi.media;

import android.view.ViewTreeObserver;
import com.inmobi.ads.InMobiAudio;

/* renamed from: com.inmobi.media.r4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserver$OnGlobalLayoutListenerC1785r4 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InMobiAudio f15403a;

    public ViewTreeObserver$OnGlobalLayoutListenerC1785r4(InMobiAudio inMobiAudio) {
        this.f15403a = inMobiAudio;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean b10;
        try {
            InMobiAudio inMobiAudio = this.f15403a;
            inMobiAudio.f14049f = AbstractC1692k3.a(inMobiAudio.getMeasuredWidth());
            InMobiAudio inMobiAudio2 = this.f15403a;
            inMobiAudio2.f14050g = AbstractC1692k3.a(inMobiAudio2.getMeasuredHeight());
            b10 = this.f15403a.b();
            if (b10) {
                this.f15403a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        } catch (Exception unused) {
            Z5.a((byte) 1, "InMobiAudio", "InMobiAudio$1.onGlobalLayout() handler threw unexpected error");
        }
    }
}
