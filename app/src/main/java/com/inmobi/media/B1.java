package com.inmobi.media;

import android.content.Context;
import android.webkit.WebView;

/* loaded from: classes2.dex */
public abstract class B1 extends WebView {

    /* renamed from: a  reason: collision with root package name */
    public final tf.c f14139a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1(Context context) {
        super(context);
        kotlin.jvm.internal.g.e(context, "context");
        this.f14139a = kotlin.a.a(new A1(this));
    }

    public abstract D5 f();

    public final D5 getLandingPageHandler() {
        return (D5) this.f14139a.getValue();
    }
}
