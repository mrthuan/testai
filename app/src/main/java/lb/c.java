package lb;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: GlobalLibraryVersionRegistrar.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static volatile c f20542b;

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f20543a = new HashSet();

    public final Set<d> a() {
        Set<d> unmodifiableSet;
        synchronized (this.f20543a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f20543a);
        }
        return unmodifiableSet;
    }
}
