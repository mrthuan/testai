package com.inmobi.media;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;

/* renamed from: com.inmobi.media.s8  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1802s8 extends AbstractC1711l8 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C1867x8 f15447e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1802s8(C1867x8 c1867x8) {
        super(c1867x8);
        this.f15447e = c1867x8;
    }

    @Override // com.inmobi.media.AbstractC1711l8
    public final View a(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        return new C1683j8(context.getApplicationContext());
    }

    @Override // com.inmobi.media.AbstractC1711l8
    public final void a(View view, W6 asset, AdConfig adConfig) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(asset, "asset");
        kotlin.jvm.internal.g.e(adConfig, "adConfig");
        super.a(view, asset, adConfig);
        if (view instanceof TextView) {
            C1867x8.a(this.f15447e, (TextView) view, asset);
        }
    }

    @Override // com.inmobi.media.AbstractC1711l8
    public final void a(View view) {
        kotlin.jvm.internal.g.e(view, "view");
        if (view instanceof TextView) {
            HashMap hashMap = C1867x8.c;
            TextView textView = (TextView) view;
            textView.setTypeface(Typeface.DEFAULT, 0);
            textView.setPaintFlags(textView.getPaintFlags() & (-17));
            textView.setPaintFlags(textView.getPaintFlags() & (-9));
            super.a(view);
        }
    }
}
