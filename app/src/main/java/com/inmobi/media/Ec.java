package com.inmobi.media;

import android.content.Context;
import android.webkit.WebView;

/* loaded from: classes2.dex */
public final class Ec extends WebView {

    /* renamed from: a  reason: collision with root package name */
    public boolean f14239a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ec(Context context) {
        super(context);
        kotlin.jvm.internal.g.e(context, "context");
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        this.f14239a = true;
        super.destroy();
    }
}
