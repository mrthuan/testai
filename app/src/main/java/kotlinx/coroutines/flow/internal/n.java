package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;

/* compiled from: ChannelFlow.kt */
/* loaded from: classes.dex */
public final class n<T> implements kotlin.coroutines.c<T>, wf.b {

    /* renamed from: a  reason: collision with root package name */
    public final kotlin.coroutines.c<T> f20126a;

    /* renamed from: b  reason: collision with root package name */
    public final CoroutineContext f20127b;

    /* JADX WARN: Multi-variable type inference failed */
    public n(kotlin.coroutines.c<? super T> cVar, CoroutineContext coroutineContext) {
        this.f20126a = cVar;
        this.f20127b = coroutineContext;
    }

    @Override // wf.b
    public final wf.b getCallerFrame() {
        kotlin.coroutines.c<T> cVar = this.f20126a;
        if (cVar instanceof wf.b) {
            return (wf.b) cVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.c
    public final CoroutineContext getContext() {
        return this.f20127b;
    }

    @Override // kotlin.coroutines.c
    public final void resumeWith(Object obj) {
        this.f20126a.resumeWith(obj);
    }
}
