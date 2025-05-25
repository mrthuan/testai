package jg;

import cg.p;
import com.google.android.play.core.assetpacks.b1;
import java.util.Iterator;

/* compiled from: Sequences.kt */
/* loaded from: classes.dex */
public final class i implements f<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f19223a;

    public i(p pVar) {
        this.f19223a = pVar;
    }

    @Override // jg.f
    public final Iterator<Object> iterator() {
        p block = this.f19223a;
        kotlin.jvm.internal.g.e(block, "block");
        g gVar = new g();
        gVar.c = b1.t(block, gVar, gVar);
        return gVar;
    }
}
