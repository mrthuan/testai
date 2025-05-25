package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;

/* renamed from: com.inmobi.media.u8  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1828u8 extends AbstractC1711l8 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C1867x8 f15496e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1828u8(C1867x8 c1867x8) {
        super(c1867x8);
        this.f15496e = c1867x8;
    }

    @Override // com.inmobi.media.AbstractC1711l8
    public final View a(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.g.d(applicationContext, "getApplicationContext(...)");
        return new C1641g8(applicationContext);
    }

    @Override // com.inmobi.media.AbstractC1711l8
    public final void a(View view, W6 asset, AdConfig adConfig) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(asset, "asset");
        kotlin.jvm.internal.g.e(adConfig, "adConfig");
        super.a(view, asset, adConfig);
        if (view instanceof C1641g8) {
            C1641g8 c1641g8 = (C1641g8) view;
            this.f15496e.getClass();
            HashMap hashMap = C1867x8.c;
            C1655h8.a(c1641g8, asset.f14788d);
            Object obj = asset.f14805u;
            if (obj instanceof Bitmap) {
                c1641g8.setPosterImage((Bitmap) obj);
            }
            c1641g8.getProgressBar().setVisibility(0);
        }
    }

    @Override // com.inmobi.media.AbstractC1711l8
    public final void a(View view) {
        kotlin.jvm.internal.g.e(view, "view");
        if (view instanceof C1641g8) {
            C1641g8 c1641g8 = (C1641g8) view;
            c1641g8.getProgressBar().setVisibility(8);
            c1641g8.setPosterImage((Bitmap) null);
            c1641g8.getVideoView().f();
            super.a(view);
        }
    }
}
