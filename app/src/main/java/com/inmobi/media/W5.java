package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class W5 extends Lambda implements cg.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ X5 f14784a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f14785b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W5(X5 x52, Context context) {
        super(1);
        this.f14784a = x52;
        this.f14785b = context;
    }

    @Override // cg.l
    public final Object invoke(Object obj) {
        Q5 it = (Q5) obj;
        kotlin.jvm.internal.g.e(it, "it");
        X5 x52 = this.f14784a;
        x52.a(this.f14785b, x52.f14835a, it);
        return tf.d.f30009a;
    }
}
