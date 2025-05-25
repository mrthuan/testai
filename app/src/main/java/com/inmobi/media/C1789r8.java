package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;

/* renamed from: com.inmobi.media.r8  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1789r8 extends AbstractC1711l8 {
    public C1789r8(C1867x8 c1867x8) {
        super(c1867x8);
    }

    @Override // com.inmobi.media.AbstractC1711l8
    public final View a(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.g.d(applicationContext, "getApplicationContext(...)");
        return new Ea(applicationContext);
    }

    @Override // com.inmobi.media.AbstractC1711l8
    public final void a(View view, W6 asset, AdConfig adConfig) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(asset, "asset");
        kotlin.jvm.internal.g.e(adConfig, "adConfig");
        super.a(view, asset, adConfig);
        HashMap hashMap = C1867x8.c;
        C1655h8.a(view, asset.f14788d);
    }
}
