package ig;

/* compiled from: KFunction.kt */
/* loaded from: classes.dex */
public interface e<R> extends b<R>, tf.a<R> {
    boolean isExternal();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    @Override // ig.b
    boolean isSuspend();
}
