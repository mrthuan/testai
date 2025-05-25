package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes.dex */
public final class CoroutineContextKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z10) {
        boolean b10 = b(coroutineContext);
        boolean b11 = b(coroutineContext2);
        if (!b10 && !b11) {
            return coroutineContext.plus(coroutineContext2);
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(emptyCoroutineContext, new cg.p<CoroutineContext, CoroutineContext.a, CoroutineContext>() { // from class: kotlinx.coroutines.CoroutineContextKt$foldCopies$folded$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [T, kotlin.coroutines.CoroutineContext] */
            @Override // cg.p
            public final CoroutineContext invoke(CoroutineContext coroutineContext4, CoroutineContext.a aVar) {
                if (aVar instanceof t) {
                    if (ref$ObjectRef.element.get(aVar.getKey()) == null) {
                        t tVar = (t) aVar;
                        if (z10) {
                            tVar = tVar.q();
                        }
                        return coroutineContext4.plus(tVar);
                    }
                    Ref$ObjectRef<CoroutineContext> ref$ObjectRef2 = ref$ObjectRef;
                    ref$ObjectRef2.element = ref$ObjectRef2.element.minusKey(aVar.getKey());
                    return coroutineContext4.plus(((t) aVar).Q());
                }
                return coroutineContext4.plus(aVar);
            }
        });
        if (b11) {
            ref$ObjectRef.element = ((CoroutineContext) ref$ObjectRef.element).fold(emptyCoroutineContext, new cg.p<CoroutineContext, CoroutineContext.a, CoroutineContext>() { // from class: kotlinx.coroutines.CoroutineContextKt$foldCopies$1
                @Override // cg.p
                public final CoroutineContext invoke(CoroutineContext coroutineContext4, CoroutineContext.a aVar) {
                    if (aVar instanceof t) {
                        return coroutineContext4.plus(((t) aVar).q());
                    }
                    return coroutineContext4.plus(aVar);
                }
            });
        }
        return coroutineContext3.plus((CoroutineContext) ref$ObjectRef.element);
    }

    public static final boolean b(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.fold(Boolean.FALSE, new cg.p<Boolean, CoroutineContext.a, Boolean>() { // from class: kotlinx.coroutines.CoroutineContextKt$hasCopyableElements$1
            public final Boolean invoke(boolean z10, CoroutineContext.a aVar) {
                return Boolean.valueOf(z10 || (aVar instanceof t));
            }

            @Override // cg.p
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, CoroutineContext.a aVar) {
                return invoke(bool.booleanValue(), aVar);
            }
        })).booleanValue();
    }

    public static final CoroutineContext c(w wVar, CoroutineContext coroutineContext) {
        CoroutineContext a10 = a(wVar.n(), coroutineContext, true);
        lg.b bVar = j0.f20206a;
        if (a10 != bVar && a10.get(d.a.f19936a) == null) {
            return a10.plus(bVar);
        }
        return a10;
    }

    public static final q1<?> d(kotlin.coroutines.c<?> cVar, CoroutineContext coroutineContext, Object obj) {
        boolean z10;
        q1<?> q1Var = null;
        if (!(cVar instanceof wf.b)) {
            return null;
        }
        if (coroutineContext.get(r1.f20230a) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return null;
        }
        wf.b bVar = (wf.b) cVar;
        while (true) {
            if (!(bVar instanceof f0) && (bVar = bVar.getCallerFrame()) != null) {
                if (bVar instanceof q1) {
                    q1Var = (q1) bVar;
                    break;
                }
            } else {
                break;
            }
        }
        if (q1Var != null) {
            q1Var.n0(coroutineContext, obj);
        }
        return q1Var;
    }
}
