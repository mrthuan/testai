package kotlin.text;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: Regex.kt */
/* loaded from: classes.dex */
public /* synthetic */ class Regex$findAll$2 extends FunctionReferenceImpl implements cg.l<e, e> {
    public static final Regex$findAll$2 INSTANCE = new Regex$findAll$2();

    public Regex$findAll$2() {
        super(1, e.class, "next", "next()Lkotlin/text/MatchResult;", 0);
    }

    @Override // cg.l
    public final e invoke(e p02) {
        kotlin.jvm.internal.g.e(p02, "p0");
        return p02.next();
    }
}
