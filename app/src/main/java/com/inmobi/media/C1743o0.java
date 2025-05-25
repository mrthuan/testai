package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.o0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1743o0 extends AbstractRunnableC1690k1 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AbstractC1846w0 f15356d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1743o0(AbstractC1846w0 abstractC1846w0) {
        super(abstractC1846w0);
        this.f15356d = abstractC1846w0;
    }

    @Override // com.inmobi.media.AbstractRunnableC1690k1
    public final void a() {
        HashMap a10;
        AbstractC1846w0 abstractC1846w0 = (AbstractC1846w0) this.f15248b.get();
        if (abstractC1846w0 != null) {
            try {
                byte J = abstractC1846w0.J();
                JSONObject jSONObject = new JSONObject(abstractC1846w0.L());
                AdConfig j10 = abstractC1846w0.j();
                kotlin.jvm.internal.g.b(j10);
                if (abstractC1846w0.y() == null) {
                    a10 = null;
                } else {
                    C1577c0 y10 = abstractC1846w0.y();
                    a10 = K8.a(y10 != null ? y10.h() : null);
                }
                C1682j7 c1682j7 = new C1682j7(J, jSONObject, null, false, j10, a10, null, this.f15356d.f15531j);
                Handler D = this.f15356d.D();
                if (D != null) {
                    D.post(new n0.g(17, c1682j7, this.f15356d));
                }
            } catch (Exception e10) {
                A4 a42 = this.f15356d.f15531j;
                if (a42 != null) {
                    String e11 = AbstractC1846w0.e();
                    kotlin.jvm.internal.g.d(e11, "<get-TAG>(...)");
                    ((B4) a42).a(e11, "Exception for handleInterActive ", e10);
                }
                abstractC1846w0.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 76);
                Q4 q42 = Q4.f14590a;
                Q4.c.a(AbstractC1863x4.a(e10, "event"));
            }
        }
    }

    @Override // com.inmobi.media.AbstractRunnableC1690k1
    public final void c() {
        super.c();
        AbstractC1846w0 abstractC1846w0 = (AbstractC1846w0) this.f15248b.get();
        if (abstractC1846w0 != null) {
            abstractC1846w0.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), true, (short) 40);
        }
    }

    public static final void a(C1682j7 dataModel, AbstractC1846w0 this$0) {
        Set d10;
        boolean b10;
        U9 u92;
        kotlin.jvm.internal.g.e(dataModel, "$dataModel");
        kotlin.jvm.internal.g.e(this$0, "this$0");
        try {
            C1893z8 c1893z8 = dataModel.f15233s;
            C1646h m10 = this$0.m();
            if (c1893z8 == null || this$0.t() == null || m10 == null) {
                return;
            }
            Context t4 = this$0.t();
            kotlin.jvm.internal.g.b(t4);
            byte J = this$0.J();
            d10 = this$0.d(0);
            this$0.f15535n = new S9(t4, J, d10, this$0.n(), false, null, 0L, null, null, null, 496);
            S9 x4 = this$0.x();
            if (x4 != null) {
                x4.setAdType(this$0.I().b());
            }
            S9 x10 = this$0.x();
            if (x10 != null) {
                u92 = this$0.K;
                AdConfig j10 = this$0.j();
                kotlin.jvm.internal.g.b(j10);
                x10.a(u92, j10);
            }
            S9 x11 = this$0.x();
            if (x11 != null) {
                A4 a42 = x11.f14665j;
                if (a42 != null) {
                    String TAG = S9.O0;
                    kotlin.jvm.internal.g.d(TAG, "TAG");
                    ((B4) a42).a(TAG, "disableUrlsToOpenInExternalApp " + x11);
                }
                x11.f14689v = true;
            }
            S9 x12 = this$0.x();
            if (x12 != null) {
                x12.setBlobProvider(this$0);
            }
            S9 x13 = this$0.x();
            if (x13 != null) {
                x13.setPreloadView(true);
            }
            S9 x14 = this$0.x();
            if (x14 != null) {
                x14.setPlacementId(this$0.I().l());
            }
            S9 x15 = this$0.x();
            if (x15 != null) {
                x15.setCreativeId(m10.o());
            }
            S9 x16 = this$0.x();
            if (x16 != null) {
                b10 = this$0.b(0);
                x16.setAllowAutoRedirection(b10);
            }
            AbstractC1846w0.a(this$0, m10, this$0.x());
            if (this$0.T() == 0) {
                this$0.a(true, this$0.x());
            }
            if (kotlin.jvm.internal.g.a("URL", c1893z8.f15707y)) {
                S9 x17 = this$0.x();
                if (x17 != null) {
                    Object obj = c1893z8.f14789e;
                    kotlin.jvm.internal.g.c(obj, "null cannot be cast to non-null type kotlin.String");
                    x17.d((String) obj);
                    return;
                }
                return;
            }
            S9 x18 = this$0.x();
            if (x18 != null) {
                Object obj2 = c1893z8.f14789e;
                kotlin.jvm.internal.g.c(obj2, "null cannot be cast to non-null type kotlin.String");
                x18.c((String) obj2);
            }
        } catch (Exception e10) {
            A4 a43 = this$0.f15531j;
            if (a43 != null) {
                String e11 = AbstractC1846w0.e();
                kotlin.jvm.internal.g.d(e11, "<get-TAG>(...)");
                ((B4) a43).a(e11, "Exception for handleInterActive ", e10);
            }
            this$0.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 76);
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
    }
}
