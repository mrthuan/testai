package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.w;

/* compiled from: Scopes.kt */
/* loaded from: classes.dex */
public final class d implements w {

    /* renamed from: a  reason: collision with root package name */
    public final CoroutineContext f20172a;

    public d(CoroutineContext coroutineContext) {
        this.f20172a = coroutineContext;
    }

    @Override // kotlinx.coroutines.w
    public final CoroutineContext n() {
        return this.f20172a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f20172a + ')';
    }
}
