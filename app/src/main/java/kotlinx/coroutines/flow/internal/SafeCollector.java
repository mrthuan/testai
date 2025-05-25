package kotlinx.coroutines.flow.internal;

import cg.p;
import cg.q;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.y0;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* compiled from: SafeCollector.kt */
/* loaded from: classes.dex */
public final class SafeCollector<T> extends ContinuationImpl implements kotlinx.coroutines.flow.d<T> {
    public final CoroutineContext collectContext;
    public final int collectContextSize;
    public final kotlinx.coroutines.flow.d<T> collector;
    private kotlin.coroutines.c<? super tf.d> completion;
    private CoroutineContext lastEmissionContext;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector(kotlinx.coroutines.flow.d<? super T> dVar, CoroutineContext coroutineContext) {
        super(k.f20122a, EmptyCoroutineContext.INSTANCE);
        this.collector = dVar;
        this.collectContext = coroutineContext;
        this.collectContextSize = ((Number) coroutineContext.fold(0, new p<Integer, CoroutineContext.a, Integer>() { // from class: kotlinx.coroutines.flow.internal.SafeCollector$collectContextSize$1
            public final Integer invoke(int i10, CoroutineContext.a aVar) {
                return Integer.valueOf(i10 + 1);
            }

            @Override // cg.p
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, CoroutineContext.a aVar) {
                return invoke(num.intValue(), aVar);
            }
        })).intValue();
    }

    @Override // kotlinx.coroutines.flow.d
    public Object emit(T t4, kotlin.coroutines.c<? super tf.d> cVar) {
        try {
            Object h10 = h(cVar, t4);
            if (h10 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return h10;
            }
            return tf.d.f30009a;
        } catch (Throwable th2) {
            this.lastEmissionContext = new h(cVar.getContext(), th2);
            throw th2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, wf.b
    public wf.b getCallerFrame() {
        kotlin.coroutines.c<? super tf.d> cVar = this.completion;
        if (cVar instanceof wf.b) {
            return (wf.b) cVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.c
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.lastEmissionContext;
        if (coroutineContext == null) {
            return EmptyCoroutineContext.INSTANCE;
        }
        return coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object h(kotlin.coroutines.c<? super tf.d> cVar, T t4) {
        CoroutineContext context = cVar.getContext();
        b.b.s(context);
        CoroutineContext coroutineContext = this.lastEmissionContext;
        if (coroutineContext != context) {
            if (!(coroutineContext instanceof h)) {
                if (((Number) context.fold(0, new p<Integer, CoroutineContext.a, Integer>(this) { // from class: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$checkContext$result$1
                    final /* synthetic */ SafeCollector<?> $this_checkContext;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                        this.$this_checkContext = this;
                    }

                    @Override // cg.p
                    public /* bridge */ /* synthetic */ Integer invoke(Integer num, CoroutineContext.a aVar) {
                        return invoke(num.intValue(), aVar);
                    }

                    public final Integer invoke(int i10, CoroutineContext.a aVar) {
                        CoroutineContext.b<?> key = aVar.getKey();
                        CoroutineContext.a aVar2 = this.$this_checkContext.collectContext.get(key);
                        int i11 = y0.f20276d1;
                        if (key != y0.b.f20277a) {
                            return Integer.valueOf(aVar != aVar2 ? SlideAtom.USES_MASTER_SLIDE_ID : i10 + 1);
                        }
                        y0 y0Var = (y0) aVar2;
                        y0 y0Var2 = (y0) aVar;
                        while (true) {
                            if (y0Var2 != null) {
                                if (y0Var2 == y0Var || !(y0Var2 instanceof kotlinx.coroutines.internal.p)) {
                                    break;
                                }
                                y0Var2 = y0Var2.getParent();
                            } else {
                                y0Var2 = null;
                                break;
                            }
                        }
                        if (y0Var2 == y0Var) {
                            if (y0Var != null) {
                                i10++;
                            }
                            return Integer.valueOf(i10);
                        }
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + y0Var2 + ", expected child of " + y0Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                })).intValue() == this.collectContextSize) {
                    this.lastEmissionContext = context;
                } else {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.collectContext + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
            } else {
                throw new IllegalStateException(kotlin.text.f.C("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((h) coroutineContext).f20120a + ", but then emission attempt of value '" + t4 + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
        }
        this.completion = cVar;
        q<kotlinx.coroutines.flow.d<Object>, Object, kotlin.coroutines.c<? super tf.d>, Object> qVar = SafeCollectorKt.f20109a;
        kotlinx.coroutines.flow.d<T> dVar = this.collector;
        kotlin.jvm.internal.g.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object invoke = qVar.invoke(dVar, t4, this);
        if (!kotlin.jvm.internal.g.a(invoke, CoroutineSingletons.COROUTINE_SUSPENDED)) {
            this.completion = null;
        }
        return invoke;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public Object invokeSuspend(Object obj) {
        Throwable m16exceptionOrNullimpl = Result.m16exceptionOrNullimpl(obj);
        if (m16exceptionOrNullimpl != null) {
            this.lastEmissionContext = new h(getContext(), m16exceptionOrNullimpl);
        }
        kotlin.coroutines.c<? super tf.d> cVar = this.completion;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
