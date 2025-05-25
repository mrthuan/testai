package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.inmobi.commons.core.configs.AdConfig;

/* renamed from: com.inmobi.media.p8  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1764p8 extends AbstractC1711l8 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C1867x8 f15378e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1764p8(C1867x8 c1867x8) {
        super(c1867x8);
        this.f15378e = c1867x8;
    }

    @Override // com.inmobi.media.AbstractC1711l8
    public final View a(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        return new ImageView(context.getApplicationContext());
    }

    @Override // com.inmobi.media.AbstractC1711l8
    public final void a(View view, W6 asset, AdConfig adConfig) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(asset, "asset");
        kotlin.jvm.internal.g.e(adConfig, "adConfig");
        super.a(view, asset, adConfig);
        if (view instanceof ImageView) {
            C1867x8.a(this.f15378e, (ImageView) view, asset);
        }
    }

    @Override // com.inmobi.media.AbstractC1711l8
    public final void a(View view) {
        kotlin.jvm.internal.g.e(view, "view");
        if (view instanceof ImageView) {
            ((ImageView) view).setImageDrawable(null);
            super.a(view);
        }
    }
}
