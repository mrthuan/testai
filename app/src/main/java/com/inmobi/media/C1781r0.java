package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.r0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1781r0 extends Lambda implements cg.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractC1846w0 f15398a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1781r0(AbstractC1846w0 abstractC1846w0) {
        super(1);
        this.f15398a = abstractC1846w0;
    }

    @Override // cg.l
    public final Object invoke(Object obj) {
        short s4;
        EnumC1849w3 it = (EnumC1849w3) obj;
        kotlin.jvm.internal.g.e(it, "it");
        AbstractC1846w0 abstractC1846w0 = this.f15398a;
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
        int ordinal = it.ordinal();
        if (ordinal != 0) {
            switch (ordinal) {
                case 12:
                    s4 = 2101;
                    break;
                case 13:
                    s4 = 2102;
                    break;
                case 14:
                    s4 = 2103;
                    break;
                case 15:
                    s4 = 2104;
                    break;
                case 16:
                    s4 = 2105;
                    break;
            }
            abstractC1846w0.a(inMobiAdRequestStatus, true, s4);
            return tf.d.f30009a;
        }
        s4 = 2100;
        abstractC1846w0.a(inMobiAdRequestStatus, true, s4);
        return tf.d.f30009a;
    }
}
