package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* renamed from: com.facebook.ads.redexgen.X.Ek  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0784Ek extends C1343aL {
    public InterfaceC1072Qg A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final void A04(NativeAdLayout nativeAdLayout, C1314Zs c1314Zs, NativeAd nativeAd, JW jw) {
        OU ou = new OU(c1314Zs);
        MediaView mediaView = new MediaView(c1314Zs);
        AdOptionsView adOptionsView = new AdOptionsView(c1314Zs, nativeAd, nativeAdLayout);
        jw.A09(adOptionsView, 28);
        this.A00 = new TE(c1314Zs, nativeAd, jw, W7.A0L(nativeAd.getInternalNativeAd()).A17(), ou, mediaView, adOptionsView);
        M3.A0M(nativeAdLayout, jw.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, ou, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.C5Y, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
