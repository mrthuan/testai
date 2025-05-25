package uf;

import java.util.Comparator;
import kotlin.jvm.internal.g;

/* compiled from: Comparisons.kt */
/* loaded from: classes.dex */
public final class a implements Comparator<Comparable<? super Object>> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f30366a = new a();

    @Override // java.util.Comparator
    public final int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        Comparable<? super Object> a10 = comparable;
        Comparable<? super Object> b10 = comparable2;
        g.e(a10, "a");
        g.e(b10, "b");
        return a10.compareTo(b10);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return b.f30367a;
    }
}
