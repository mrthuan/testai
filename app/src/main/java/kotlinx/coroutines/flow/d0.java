package kotlinx.coroutines.flow;

/* compiled from: Emitters.kt */
/* loaded from: classes.dex */
public final class d0 implements d<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f20094a;

    public d0(Throwable th2) {
        this.f20094a = th2;
    }

    @Override // kotlinx.coroutines.flow.d
    public final Object emit(Object obj, kotlin.coroutines.c<? super tf.d> cVar) {
        throw this.f20094a;
    }
}
