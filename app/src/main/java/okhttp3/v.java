package okhttp3;

/* compiled from: RequestBody.kt */
/* loaded from: classes3.dex */
public final class v extends w {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f23439a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f23440b;
    public final /* synthetic */ byte[] c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f23441d;

    public v(int i10, int i11, r rVar, byte[] bArr) {
        this.f23439a = rVar;
        this.f23440b = i10;
        this.c = bArr;
        this.f23441d = i11;
    }

    @Override // okhttp3.w
    public final long a() {
        return this.f23440b;
    }

    @Override // okhttp3.w
    public final r b() {
        return this.f23439a;
    }

    @Override // okhttp3.w
    public final void c(kk.g gVar) {
        gVar.e0(this.f23441d, this.f23440b, this.c);
    }
}
