package kotlin.collections;

import java.util.Iterator;

/* compiled from: Sequences.kt */
/* loaded from: classes.dex */
public final class l implements jg.f<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Iterable f19928a;

    public l(Iterable iterable) {
        this.f19928a = iterable;
    }

    @Override // jg.f
    public final Iterator<Object> iterator() {
        return this.f19928a.iterator();
    }
}
