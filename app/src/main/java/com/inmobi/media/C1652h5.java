package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.h5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1652h5 extends Lambda implements cg.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1666i5 f15125a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1652h5(C1666i5 c1666i5) {
        super(1);
        this.f15125a = c1666i5;
    }

    @Override // cg.l
    public final Object invoke(Object obj) {
        EnumC1849w3 it = (EnumC1849w3) obj;
        kotlin.jvm.internal.g.e(it, "it");
        this.f15125a.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE), true, AbstractC1805sb.a(it));
        return tf.d.f30009a;
    }
}
