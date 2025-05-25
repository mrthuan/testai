package kotlinx.coroutines.flow.internal;

import cg.q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: Combine.kt */
/* loaded from: classes.dex */
public final class g {
    public static final Object a(kotlinx.coroutines.flow.c[] cVarArr, cg.a aVar, q qVar, kotlinx.coroutines.flow.d dVar, kotlin.coroutines.c cVar) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(cVarArr, aVar, qVar, dVar, null);
        i iVar = new i(cVar, cVar.getContext());
        Object A = ea.a.A(iVar, iVar, combineKt$combineInternal$2);
        if (A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return A;
        }
        return tf.d.f30009a;
    }
}
