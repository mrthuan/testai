package kotlinx.coroutines.flow.internal;

import cg.q;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SafeCollector.kt */
/* loaded from: classes.dex */
public /* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements q<kotlinx.coroutines.flow.d<? super Object>, Object, kotlin.coroutines.c<? super tf.d>, Object> {
    public static final SafeCollectorKt$emitFun$1 INSTANCE = new SafeCollectorKt$emitFun$1();

    public SafeCollectorKt$emitFun$1() {
        super(3, kotlinx.coroutines.flow.d.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // cg.q
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.flow.d<? super Object> dVar, Object obj, kotlin.coroutines.c<? super tf.d> cVar) {
        return invoke2((kotlinx.coroutines.flow.d<Object>) dVar, obj, cVar);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(kotlinx.coroutines.flow.d<Object> dVar, Object obj, kotlin.coroutines.c<? super tf.d> cVar) {
        return dVar.emit(obj, cVar);
    }
}
