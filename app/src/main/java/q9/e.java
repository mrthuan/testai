package q9;

import com.google.android.play.core.assetpacks.s2;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class e implements l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29106a;

    /* renamed from: b  reason: collision with root package name */
    public final m f29107b;

    public /* synthetic */ e(m mVar, int i10) {
        this.f29106a = i10;
        this.f29107b = mVar;
    }

    @Override // q9.m
    public final Object a() {
        int i10 = this.f29106a;
        m mVar = this.f29107b;
        switch (i10) {
            case 0:
                return new d(((s2) mVar).b());
            default:
                return mVar.a();
        }
    }
}
