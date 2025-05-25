package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class U6 extends Lambda implements cg.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ V6 f14733a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U6(V6 v62) {
        super(1);
        this.f14733a = v62;
    }

    @Override // cg.l
    public final Object invoke(Object obj) {
        EnumC1849w3 it = (EnumC1849w3) obj;
        kotlin.jvm.internal.g.e(it, "it");
        this.f14733a.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE), true, AbstractC1805sb.a(it));
        return tf.d.f30009a;
    }
}
