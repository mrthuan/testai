package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* compiled from: Limit.kt */
/* loaded from: classes.dex */
public final class m implements d<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f20130a;

    public m(Ref$ObjectRef ref$ObjectRef) {
        this.f20130a = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.flow.d
    public final Object emit(Object obj, kotlin.coroutines.c<? super tf.d> cVar) {
        this.f20130a.element = obj;
        throw new AbortFlowException(this);
    }
}
