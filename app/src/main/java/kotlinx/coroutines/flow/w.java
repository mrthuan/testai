package kotlinx.coroutines.flow;

/* compiled from: SharedFlow.kt */
/* loaded from: classes.dex */
public final class w extends kotlinx.coroutines.flow.internal.b<v<?>> {

    /* renamed from: a  reason: collision with root package name */
    public long f20148a = -1;

    /* renamed from: b  reason: collision with root package name */
    public kotlinx.coroutines.h f20149b;

    @Override // kotlinx.coroutines.flow.internal.b
    public final boolean a(kotlinx.coroutines.flow.internal.a aVar) {
        v vVar = (v) aVar;
        if (this.f20148a >= 0) {
            return false;
        }
        long j10 = vVar.f20140i;
        if (j10 < vVar.f20141j) {
            vVar.f20141j = j10;
        }
        this.f20148a = j10;
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.b
    public final kotlin.coroutines.c[] b(kotlinx.coroutines.flow.internal.a aVar) {
        long j10 = this.f20148a;
        this.f20148a = -1L;
        this.f20149b = null;
        return ((v) aVar).x(j10);
    }
}
