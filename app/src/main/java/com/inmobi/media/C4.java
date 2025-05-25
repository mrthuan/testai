package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class C4 extends Lambda implements cg.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List f14159a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4(ArrayList arrayList) {
        super(1);
        this.f14159a = arrayList;
    }

    @Override // cg.l
    public final Object invoke(Object obj) {
        W4 it = (W4) obj;
        kotlin.jvm.internal.g.e(it, "it");
        this.f14159a.add(new C1554a5(it));
        return tf.d.f30009a;
    }
}
