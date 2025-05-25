package w3;

import java.util.ArrayList;
import java.util.HashMap;
import w3.k;

/* compiled from: GroupedLinkedMap.java */
/* loaded from: classes.dex */
public final class f<K extends k, V> {

    /* renamed from: a  reason: collision with root package name */
    public final a<K, V> f30943a = new a<>();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f30944b = new HashMap();

    /* compiled from: GroupedLinkedMap.java */
    /* loaded from: classes.dex */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f30945a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList f30946b;
        public a<K, V> c;

        /* renamed from: d  reason: collision with root package name */
        public a<K, V> f30947d;

        public a() {
            this(null);
        }

        public a(K k10) {
            this.f30947d = this;
            this.c = this;
            this.f30945a = k10;
        }
    }

    public final V a(K k10) {
        a aVar;
        int i10;
        HashMap hashMap = this.f30944b;
        a aVar2 = (a) hashMap.get(k10);
        if (aVar2 == null) {
            a aVar3 = new a(k10);
            hashMap.put(k10, aVar3);
            aVar = aVar3;
        } else {
            k10.a();
            aVar = aVar2;
        }
        a<K, V> aVar4 = aVar.f30947d;
        aVar4.c = aVar.c;
        aVar.c.f30947d = aVar4;
        a<K, V> aVar5 = this.f30943a;
        aVar.f30947d = aVar5;
        a<K, V> aVar6 = aVar5.c;
        aVar.c = aVar6;
        aVar6.f30947d = aVar;
        aVar.f30947d.c = aVar;
        ArrayList arrayList = aVar.f30946b;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            return (V) aVar.f30946b.remove(i10 - 1);
        }
        return null;
    }

    public final void b(K k10, V v10) {
        HashMap hashMap = this.f30944b;
        a aVar = (a) hashMap.get(k10);
        if (aVar == null) {
            aVar = new a(k10);
            a<K, V> aVar2 = aVar.f30947d;
            aVar2.c = aVar.c;
            aVar.c.f30947d = aVar2;
            a<K, V> aVar3 = this.f30943a;
            aVar.f30947d = aVar3.f30947d;
            aVar.c = aVar3;
            aVar3.f30947d = aVar;
            aVar.f30947d.c = aVar;
            hashMap.put(k10, aVar);
        } else {
            k10.a();
        }
        if (aVar.f30946b == null) {
            aVar.f30946b = new ArrayList();
        }
        aVar.f30946b.add(v10);
    }

    public final V c() {
        int i10;
        a<K, V> aVar = this.f30943a;
        a aVar2 = aVar.f30947d;
        while (true) {
            V v10 = null;
            if (aVar2.equals(aVar)) {
                return null;
            }
            ArrayList arrayList = aVar2.f30946b;
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                v10 = (V) aVar2.f30946b.remove(i10 - 1);
            }
            if (v10 != null) {
                return v10;
            }
            a<K, V> aVar3 = aVar2.f30947d;
            aVar3.c = aVar2.c;
            aVar2.c.f30947d = aVar3;
            HashMap hashMap = this.f30944b;
            Object obj = aVar2.f30945a;
            hashMap.remove(obj);
            ((k) obj).a();
            aVar2 = aVar2.f30947d;
        }
    }

    public final String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a<K, V> aVar = this.f30943a;
        a aVar2 = aVar.c;
        boolean z10 = false;
        while (!aVar2.equals(aVar)) {
            sb2.append('{');
            sb2.append(aVar2.f30945a);
            sb2.append(':');
            ArrayList arrayList = aVar2.f30946b;
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            sb2.append(i10);
            sb2.append("}, ");
            aVar2 = aVar2.c;
            z10 = true;
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
