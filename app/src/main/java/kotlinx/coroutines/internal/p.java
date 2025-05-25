package kotlinx.coroutines.internal;

import com.google.android.play.core.assetpacks.b1;
import kotlin.coroutines.CoroutineContext;

/* compiled from: Scopes.kt */
/* loaded from: classes.dex */
public class p<T> extends kotlinx.coroutines.a<T> implements wf.b {

    /* renamed from: d  reason: collision with root package name */
    public final kotlin.coroutines.c<T> f20196d;

    public p(kotlin.coroutines.c cVar, CoroutineContext coroutineContext) {
        super(coroutineContext, true);
        this.f20196d = cVar;
    }

    @Override // kotlinx.coroutines.c1
    public void C(Object obj) {
        ge.a.O(b1.L(this.f20196d), kotlinx.coroutines.s.a(obj), null);
    }

    @Override // kotlinx.coroutines.c1
    public void D(Object obj) {
        this.f20196d.resumeWith(kotlinx.coroutines.s.a(obj));
    }

    @Override // kotlinx.coroutines.c1
    public final boolean Y() {
        return true;
    }

    @Override // wf.b
    public final wf.b getCallerFrame() {
        kotlin.coroutines.c<T> cVar = this.f20196d;
        if (cVar instanceof wf.b) {
            return (wf.b) cVar;
        }
        return null;
    }
}
