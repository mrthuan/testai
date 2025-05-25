package com.inmobi.media;

import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class N8 extends Lambda implements cg.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ O8 f14532a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N8(O8 o82) {
        super(1);
        this.f14532a = o82;
    }

    @Override // cg.l
    public final Object invoke(Object obj) {
        H8 it = (H8) obj;
        kotlin.jvm.internal.g.e(it, "it");
        A4 a42 = this.f14532a.f14556b;
        if (a42 != null) {
            ((B4) a42).a("NovatiqDataHandler", "Novatiq hyper id synced");
        }
        return tf.d.f30009a;
    }
}
