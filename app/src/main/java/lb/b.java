package lb;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* compiled from: DefaultUserAgentPublisher.java */
/* loaded from: classes2.dex */
public final class b implements g {

    /* renamed from: a  reason: collision with root package name */
    public final String f20540a;

    /* renamed from: b  reason: collision with root package name */
    public final c f20541b;

    public b(Set<d> set, c cVar) {
        this.f20540a = b(set);
        this.f20541b = cVar;
    }

    public static String b(Set<d> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<d> it = set.iterator();
        while (it.hasNext()) {
            d next = it.next();
            sb2.append(next.a());
            sb2.append(PackagingURIHelper.FORWARD_SLASH_CHAR);
            sb2.append(next.b());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // lb.g
    public final String a() {
        Set unmodifiableSet;
        c cVar = this.f20541b;
        synchronized (cVar.f20543a) {
            unmodifiableSet = Collections.unmodifiableSet(cVar.f20543a);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.f20540a;
        if (isEmpty) {
            return str;
        }
        return str + ' ' + b(cVar.a());
    }
}
