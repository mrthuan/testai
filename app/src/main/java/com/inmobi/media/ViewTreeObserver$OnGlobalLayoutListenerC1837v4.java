package com.inmobi.media;

import android.view.ViewTreeObserver;
import com.inmobi.ads.InMobiBanner;

/* renamed from: com.inmobi.media.v4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserver$OnGlobalLayoutListenerC1837v4 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InMobiBanner f15514a;

    public ViewTreeObserver$OnGlobalLayoutListenerC1837v4(InMobiBanner inMobiBanner) {
        this.f15514a = inMobiBanner;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        A4 p10;
        boolean b10;
        try {
            InMobiBanner inMobiBanner = this.f15514a;
            inMobiBanner.f14058i = AbstractC1692k3.a(inMobiBanner.getMeasuredWidth());
            InMobiBanner inMobiBanner2 = this.f15514a;
            inMobiBanner2.f14059j = AbstractC1692k3.a(inMobiBanner2.getMeasuredHeight());
            b10 = this.f15514a.b();
            if (b10) {
                this.f15514a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        } catch (Exception e10) {
            C1834v1 mAdManager$media_release = this.f15514a.getMAdManager$media_release();
            if (mAdManager$media_release != null && (p10 = mAdManager$media_release.p()) != null) {
                String access$getTAG$cp = InMobiBanner.access$getTAG$cp();
                kotlin.jvm.internal.g.d(access$getTAG$cp, "access$getTAG$cp(...)");
                ((B4) p10).a(access$getTAG$cp, "InMobiBanner$1.onGlobalLayout() handler threw unexpected error: ", e10);
            }
        }
    }
}
