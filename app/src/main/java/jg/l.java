package jg;

import java.util.Iterator;

/* compiled from: Iterables.kt */
/* loaded from: classes.dex */
public final class l implements Iterable<Object>, dg.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f19225a;

    public l(kotlin.text.b bVar) {
        this.f19225a = bVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this.f19225a.iterator();
    }
}
