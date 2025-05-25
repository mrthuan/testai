package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.n1;

/* compiled from: ThreadContext.kt */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final CoroutineContext f20202a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f20203b;
    public final n1<Object>[] c;

    /* renamed from: d  reason: collision with root package name */
    public int f20204d;

    public v(CoroutineContext coroutineContext, int i10) {
        this.f20202a = coroutineContext;
        this.f20203b = new Object[i10];
        this.c = new n1[i10];
    }
}
