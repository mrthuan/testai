package com.inmobi.media;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import kotlin.Pair;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.b2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1565b2 {

    /* renamed from: a  reason: collision with root package name */
    public final S9 f14949a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f14950b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final A4 f14951d;

    public C1565b2(S9 renderView, boolean z10, boolean z11, A4 a42) {
        kotlin.jvm.internal.g.e(renderView, "renderView");
        this.f14949a = renderView;
        this.f14950b = z10;
        this.c = z11;
        this.f14951d = a42;
    }

    public final void a() {
        Handler handler;
        ViewGroup viewGroup = (ViewGroup) this.f14949a.getRootView().findViewById(65534);
        if (viewGroup == null || (handler = viewGroup.getHandler()) == null) {
            return;
        }
        handler.post(new l.r(12, this, viewGroup));
    }

    public final Pair b() {
        float f10 = AbstractC1692k3.d().c;
        k9.c cVar = new k9.c(this, 1);
        int i10 = (int) (50 * f10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams.addRule(11);
        return new Pair(cVar, layoutParams);
    }

    public final void c() {
        ViewGroup.LayoutParams layoutParams;
        View findViewById = this.f14949a.getRootView().findViewById(65532);
        RelativeLayout.LayoutParams layoutParams2 = null;
        if (findViewById != null) {
            layoutParams = findViewById.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            layoutParams2 = layoutParams;
        }
        if (layoutParams2 == null) {
            return;
        }
        JSONObject closeAssetArea = this.f14949a.getCloseAssetArea();
        layoutParams2.setMargins(0, closeAssetArea.optInt("top"), closeAssetArea.optInt("right"), 0);
        findViewById.setLayoutParams(layoutParams2);
    }

    public final void d() {
        ViewGroup.LayoutParams layoutParams;
        View findViewById = this.f14949a.getRootView().findViewById(65531);
        RelativeLayout.LayoutParams layoutParams2 = null;
        if (findViewById != null) {
            layoutParams = findViewById.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            layoutParams2 = layoutParams;
        }
        if (layoutParams2 == null) {
            return;
        }
        JSONObject closeAssetArea = this.f14949a.getCloseAssetArea();
        layoutParams2.setMargins(0, closeAssetArea.optInt("top"), closeAssetArea.optInt("right"), 0);
        findViewById.setLayoutParams(layoutParams2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
        if (r2 == null) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.inmobi.media.C1565b2 r10, android.view.ViewGroup r11) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1565b2.a(com.inmobi.media.b2, android.view.ViewGroup):void");
    }

    public static final void a(C1565b2 this$0, View view) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        try {
            this$0.f14949a.a();
        } catch (Exception unused) {
            Z5.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
        }
    }
}
