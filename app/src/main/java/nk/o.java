package nk;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import qk.w;

/* compiled from: StaggeredDelimiterProcessor.java */
/* loaded from: classes3.dex */
public final class o implements tk.a {

    /* renamed from: a  reason: collision with root package name */
    public final char f22576a;

    /* renamed from: b  reason: collision with root package name */
    public int f22577b = 0;
    public final LinkedList<tk.a> c = new LinkedList<>();

    public o(char c) {
        this.f22576a = c;
    }

    @Override // tk.a
    public final int a(e eVar, e eVar2) {
        return g(eVar.f22517g).a(eVar, eVar2);
    }

    @Override // tk.a
    public final void b(w wVar, w wVar2, int i10) {
        g(i10).b(wVar, wVar2, i10);
    }

    @Override // tk.a
    public final char c() {
        return this.f22576a;
    }

    @Override // tk.a
    public final int d() {
        return this.f22577b;
    }

    @Override // tk.a
    public final char e() {
        return this.f22576a;
    }

    public final void f(tk.a aVar) {
        boolean z10;
        int d10;
        int d11 = aVar.d();
        LinkedList<tk.a> linkedList = this.c;
        ListIterator<tk.a> listIterator = linkedList.listIterator();
        do {
            if (listIterator.hasNext()) {
                d10 = listIterator.next().d();
                if (d11 > d10) {
                    listIterator.previous();
                    listIterator.add(aVar);
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            if (!z10) {
                linkedList.add(aVar);
                this.f22577b = d11;
                return;
            }
            return;
        } while (d11 != d10);
        throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f22576a + "' and minimum length " + d11);
    }

    public final tk.a g(int i10) {
        LinkedList<tk.a> linkedList = this.c;
        Iterator<tk.a> it = linkedList.iterator();
        while (it.hasNext()) {
            tk.a next = it.next();
            if (next.d() <= i10) {
                return next;
            }
        }
        return linkedList.getFirst();
    }
}
