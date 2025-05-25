package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.cc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1481cc implements PQ {
    public final /* synthetic */ GL A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.PQ
    public final void A9k() {
        C0804Fn c0804Fn;
        C0783Ei c0783Ei;
        c0804Fn = this.A00.A03;
        String A00 = c0804Fn.A1S().A00();
        if (TextUtils.isEmpty(A00)) {
            return;
        }
        L2 l22 = new L2();
        c0783Ei = this.A00.A04;
        L2.A0M(l22, c0783Ei, L5.A00(A00), this.A00.A6r());
    }

    public C1481cc(GL gl2) {
        this.A00 = gl2;
    }

    @Override // com.facebook.ads.redexgen.X.PQ
    public final void ABp(BN bn2) {
        new Handler(Looper.getMainLooper()).postDelayed(new C1482cd(this, bn2), 1L);
    }

    @Override // com.facebook.ads.redexgen.X.PQ
    public final void AC4() {
    }

    @Override // com.facebook.ads.redexgen.X.PQ
    public final void ADo(View view, MotionEvent motionEvent) {
    }
}
