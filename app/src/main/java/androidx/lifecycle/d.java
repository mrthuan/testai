package androidx.lifecycle;

import java.io.Closeable;
import kotlin.coroutines.CoroutineContext;

/* compiled from: ViewModel.kt */
/* loaded from: classes.dex */
public final class d implements Closeable, kotlinx.coroutines.w {

    /* renamed from: a  reason: collision with root package name */
    public final CoroutineContext f4036a;

    public d(CoroutineContext context) {
        kotlin.jvm.internal.g.e(context, "context");
        this.f4036a = context;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b.b.l(this.f4036a, null);
    }

    @Override // kotlinx.coroutines.w
    public final CoroutineContext n() {
        return this.f4036a;
    }
}
