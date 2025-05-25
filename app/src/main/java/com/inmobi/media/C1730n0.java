package com.inmobi.media;

/* renamed from: com.inmobi.media.n0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1730n0 extends AbstractRunnableC1690k1 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AbstractC1846w0 f15329d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f15330e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ G1 f15331f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f15332g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f15333h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1730n0(AbstractC1846w0 abstractC1846w0, String str, G1 g12, String str2, String str3) {
        super(abstractC1846w0);
        this.f15329d = abstractC1846w0;
        this.f15330e = str;
        this.f15331f = g12;
        this.f15332g = str2;
        this.f15333h = str3;
    }

    @Override // com.inmobi.media.AbstractRunnableC1690k1
    public final void a() {
        AbstractC1846w0 abstractC1846w0 = (AbstractC1846w0) this.f15248b.get();
        if (abstractC1846w0 != null) {
            try {
                C1646h m10 = abstractC1846w0.m();
                if (m10 != null && kotlin.jvm.internal.g.a(m10.s(), this.f15330e)) {
                    String blob = m10.F();
                    G1 g12 = this.f15331f;
                    String jsCallbackNamespace = this.f15332g;
                    String callback = this.f15333h;
                    S9 s92 = (S9) g12;
                    s92.getClass();
                    kotlin.jvm.internal.g.e(jsCallbackNamespace, "jsCallbackNamespace");
                    kotlin.jvm.internal.g.e(callback, "callback");
                    kotlin.jvm.internal.g.e(blob, "blob");
                    A4 a42 = s92.f14665j;
                    if (a42 != null) {
                        String TAG = S9.O0;
                        kotlin.jvm.internal.g.d(TAG, "TAG");
                        ((B4) a42).a(TAG, "retrievedBlob");
                    }
                    s92.a(jsCallbackNamespace, callback + '(' + blob + ");");
                    A4 a43 = this.f15329d.f15531j;
                    if (a43 != null) {
                        String e10 = AbstractC1846w0.e();
                        kotlin.jvm.internal.g.d(e10, "<get-TAG>(...)");
                        ((B4) a43).c(e10, "Returning blob ".concat(blob));
                        return;
                    }
                    return;
                }
                A4 a44 = this.f15329d.f15531j;
                if (a44 != null) {
                    String e11 = AbstractC1846w0.e();
                    kotlin.jvm.internal.g.d(e11, "<get-TAG>(...)");
                    ((B4) a44).c(e11, "Returning blob as empty string");
                }
                G1 g13 = this.f15331f;
                String jsCallbackNamespace2 = this.f15332g;
                String callback2 = this.f15333h;
                S9 s93 = (S9) g13;
                s93.getClass();
                kotlin.jvm.internal.g.e(jsCallbackNamespace2, "jsCallbackNamespace");
                kotlin.jvm.internal.g.e(callback2, "callback");
                A4 a45 = s93.f14665j;
                if (a45 != null) {
                    String TAG2 = S9.O0;
                    kotlin.jvm.internal.g.d(TAG2, "TAG");
                    ((B4) a45).a(TAG2, "retrievedBlob");
                }
                s93.a(jsCallbackNamespace2, callback2.concat("();"));
            } catch (Exception e12) {
                A4 a46 = this.f15329d.f15531j;
                if (a46 != null) {
                    String e13 = AbstractC1846w0.e();
                    kotlin.jvm.internal.g.d(e13, "<get-TAG>(...)");
                    ((B4) a46).a(e13, "Exception while getBlob", e12);
                }
                Q4 q42 = Q4.f14590a;
                Q4.c.a(AbstractC1863x4.a(e12, "event"));
            }
        }
    }
}
