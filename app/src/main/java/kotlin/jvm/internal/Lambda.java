package kotlin.jvm.internal;

import java.io.Serializable;

/* compiled from: Lambda.kt */
/* loaded from: classes.dex */
public abstract class Lambda<R> implements f<R>, Serializable {
    private final int arity;

    public Lambda(int i10) {
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.f
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        i.f19949a.getClass();
        String a10 = j.a(this);
        g.d(a10, "renderLambdaToString(this)");
        return a10;
    }
}
