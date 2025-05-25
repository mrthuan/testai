package okhttp3;

/* compiled from: ResponseBody.kt */
/* loaded from: classes3.dex */
public final class y extends z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f23467a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f23468b;
    public final /* synthetic */ kk.h c;

    public y(long j10, r rVar, kk.f fVar) {
        this.f23467a = rVar;
        this.f23468b = j10;
        this.c = fVar;
    }

    @Override // okhttp3.z
    public final long c() {
        return this.f23468b;
    }

    @Override // okhttp3.z
    public final r d() {
        return this.f23467a;
    }

    @Override // okhttp3.z
    public final kk.h f() {
        return this.c;
    }
}
