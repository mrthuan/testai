package com.google.android.play.core.assetpacks;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class e0 implements q9.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13220a;

    /* renamed from: b  reason: collision with root package name */
    public final q9.m f13221b;
    public final q9.m c;

    public /* synthetic */ e0(q9.l lVar, q9.l lVar2, int i10) {
        this.f13220a = i10;
        this.f13221b = lVar;
        this.c = lVar2;
    }

    @Override // q9.m
    public final Object a() {
        int i10 = this.f13220a;
        q9.m mVar = this.c;
        q9.m mVar2 = this.f13221b;
        switch (i10) {
            case 0:
                return new d0(((s2) mVar2).b(), (w1) mVar.a());
            default:
                return new y1((d0) mVar2.a(), new q9.k(androidx.activity.s.j(mVar)));
        }
    }
}
