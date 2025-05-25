package ga;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: CycleDetector.java */
/* loaded from: classes2.dex */
public final class j {

    /* compiled from: CycleDetector.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ga.b<?> f17725a;

        /* renamed from: b  reason: collision with root package name */
        public final HashSet f17726b = new HashSet();
        public final HashSet c = new HashSet();

        public a(ga.b<?> bVar) {
            this.f17725a = bVar;
        }
    }

    /* compiled from: CycleDetector.java */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final q<?> f17727a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f17728b;

        public b() {
            throw null;
        }

        public b(q qVar, boolean z10) {
            this.f17727a = qVar;
            this.f17728b = z10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!bVar.f17727a.equals(this.f17727a) || bVar.f17728b != this.f17728b) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return ((this.f17727a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f17728b).hashCode();
        }
    }

    public static void a(ArrayList arrayList) {
        boolean z10;
        boolean z11;
        boolean z12;
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i10 = 0;
            if (it.hasNext()) {
                ga.b bVar = (ga.b) it.next();
                a aVar = new a(bVar);
                Iterator it2 = bVar.f17704b.iterator();
                while (it2.hasNext()) {
                    q qVar = (q) it2.next();
                    if (bVar.f17706e == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z13 = !z12;
                    b bVar2 = new b(qVar, z13);
                    if (!hashMap.containsKey(bVar2)) {
                        hashMap.put(bVar2, new HashSet());
                    }
                    Set set = (Set) hashMap.get(bVar2);
                    if (!set.isEmpty() && !z13) {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", qVar));
                    }
                    set.add(aVar);
                }
            } else {
                for (Set<a> set2 : hashMap.values()) {
                    for (a aVar2 : set2) {
                        for (k kVar : aVar2.f17725a.c) {
                            if (kVar.c == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                if (kVar.f17730b == 2) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                Set<a> set3 = (Set) hashMap.get(new b(kVar.f17729a, z11));
                                if (set3 != null) {
                                    for (a aVar3 : set3) {
                                        aVar2.f17726b.add(aVar3);
                                        aVar3.c.add(aVar2);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                for (Set set4 : hashMap.values()) {
                    hashSet.addAll(set4);
                }
                HashSet hashSet2 = new HashSet();
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    a aVar4 = (a) it3.next();
                    if (aVar4.c.isEmpty()) {
                        hashSet2.add(aVar4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    a aVar5 = (a) hashSet2.iterator().next();
                    hashSet2.remove(aVar5);
                    i10++;
                    Iterator it4 = aVar5.f17726b.iterator();
                    while (it4.hasNext()) {
                        a aVar6 = (a) it4.next();
                        aVar6.c.remove(aVar5);
                        if (aVar6.c.isEmpty()) {
                            hashSet2.add(aVar6);
                        }
                    }
                }
                if (i10 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it5 = hashSet.iterator();
                while (it5.hasNext()) {
                    a aVar7 = (a) it5.next();
                    if (!aVar7.c.isEmpty() && !aVar7.f17726b.isEmpty()) {
                        arrayList2.add(aVar7.f17725a);
                    }
                }
                throw new DependencyCycleException(arrayList2);
            }
        }
    }
}
