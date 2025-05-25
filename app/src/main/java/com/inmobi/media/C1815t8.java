package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;

/* renamed from: com.inmobi.media.t8  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1815t8 extends AbstractC1711l8 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C1867x8 f15475e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1815t8(C1867x8 c1867x8) {
        super(c1867x8);
        this.f15475e = c1867x8;
    }

    @Override // com.inmobi.media.AbstractC1711l8
    public final View a(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        return new O7(context.getApplicationContext());
    }

    @Override // com.inmobi.media.AbstractC1711l8
    public final void a(View view, W6 asset, AdConfig adConfig) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(asset, "asset");
        kotlin.jvm.internal.g.e(adConfig, "adConfig");
        super.a(view, asset, adConfig);
        if (view instanceof O7) {
            this.f15475e.getClass();
            C1867x8.a((O7) view, asset);
        }
    }

    @Override // com.inmobi.media.AbstractC1711l8
    public final void a(View view) {
        kotlin.jvm.internal.g.e(view, "view");
        if (view instanceof O7) {
            super.a(view);
        }
    }
}
