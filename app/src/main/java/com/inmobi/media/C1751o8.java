package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;

/* renamed from: com.inmobi.media.o8  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1751o8 extends AbstractC1711l8 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C1867x8 f15361e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1751o8(C1867x8 c1867x8) {
        super(c1867x8);
        this.f15361e = c1867x8;
    }

    @Override // com.inmobi.media.AbstractC1711l8
    public final View a(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        return new R3(context.getApplicationContext());
    }

    @Override // com.inmobi.media.AbstractC1711l8
    public final void a(View view, W6 asset, AdConfig adConfig) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(asset, "asset");
        kotlin.jvm.internal.g.e(adConfig, "adConfig");
        super.a(view, asset, adConfig);
        if (view instanceof R3) {
            R3 r32 = (R3) view;
            this.f15361e.getClass();
            HashMap hashMap = C1867x8.c;
            r32.setLayoutParams(new ViewGroup.LayoutParams(C1655h8.a(asset.f14788d.f14841a.x), C1655h8.a(asset.f14788d.f14841a.y)));
            r32.setContentMode(asset.f14788d.f14846g);
            r32.setGifImpl((P3) ((C1724m7) asset).f15317y.getValue());
            C1655h8.a(r32, asset.f14788d);
        }
    }

    @Override // com.inmobi.media.AbstractC1711l8
    public final void a(View view) {
        kotlin.jvm.internal.g.e(view, "view");
        if (view instanceof R3) {
            ((R3) view).setGifImpl(null);
            super.a(view);
        }
    }
}
