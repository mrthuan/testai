package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: SafeCollector.kt */
/* loaded from: classes.dex */
public final class k implements kotlin.coroutines.c<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final k f20122a = new k();

    /* renamed from: b  reason: collision with root package name */
    public static final EmptyCoroutineContext f20123b = EmptyCoroutineContext.INSTANCE;

    @Override // kotlin.coroutines.c
    public final CoroutineContext getContext() {
        return f20123b;
    }

    @Override // kotlin.coroutines.c
    public final void resumeWith(Object obj) {
    }
}
