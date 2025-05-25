package wf;

import kotlin.coroutines.CoroutineContext;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes.dex */
public final class a implements kotlin.coroutines.c<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f31210a = new a();

    @Override // kotlin.coroutines.c
    public final CoroutineContext getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // kotlin.coroutines.c
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
