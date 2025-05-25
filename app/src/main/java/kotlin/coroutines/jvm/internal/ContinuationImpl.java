package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import kotlin.jvm.internal.g;
import wf.a;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes.dex */
public abstract class ContinuationImpl extends BaseContinuationImpl {
    private final CoroutineContext _context;
    private transient c<Object> intercepted;

    public ContinuationImpl(c<Object> cVar, CoroutineContext coroutineContext) {
        super(cVar);
        this._context = coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.c
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        g.b(coroutineContext);
        return coroutineContext;
    }

    public final c<Object> intercepted() {
        c<Object> cVar = this.intercepted;
        if (cVar == null) {
            d dVar = (d) getContext().get(d.a.f19936a);
            if (dVar == null || (cVar = dVar.f(this)) == null) {
                cVar = this;
            }
            this.intercepted = cVar;
        }
        return cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        c<?> cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            CoroutineContext context = getContext();
            int i10 = d.f19935b1;
            CoroutineContext.a aVar = context.get(d.a.f19936a);
            g.b(aVar);
            ((d) aVar).c(cVar);
        }
        this.intercepted = a.f31210a;
    }

    public ContinuationImpl(c<Object> cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
