package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.c;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes.dex */
public abstract class SuspendLambda extends ContinuationImpl implements f<Object> {
    private final int arity;

    public SuspendLambda(int i10, c<Object> cVar) {
        super(cVar);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.f
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public String toString() {
        if (getCompletion() == null) {
            i.f19949a.getClass();
            String a10 = j.a(this);
            g.d(a10, "renderLambdaToString(this)");
            return a10;
        }
        return super.toString();
    }

    public SuspendLambda(int i10) {
        this(i10, null);
    }
}
