package kotlin.collections;

import java.util.AbstractList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.b;

/* compiled from: AbstractMutableList.kt */
/* loaded from: classes.dex */
public abstract class c<E> extends AbstractList<E> implements List<E>, dg.c {
    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i10) {
        e eVar = (e) this;
        b.a aVar = b.Companion;
        int i11 = eVar.c;
        aVar.getClass();
        b.a.a(i10, i11);
        if (i10 == ge.a.A(eVar)) {
            if (!eVar.isEmpty()) {
                int d10 = eVar.d(ge.a.A(eVar) + eVar.f19925a);
                Object[] objArr = eVar.f19926b;
                E e10 = (E) objArr[d10];
                objArr[d10] = null;
                eVar.c--;
                return e10;
            }
            throw new NoSuchElementException("ArrayDeque is empty.");
        } else if (i10 == 0) {
            return (E) eVar.removeFirst();
        } else {
            int d11 = eVar.d(eVar.f19925a + i10);
            Object[] objArr2 = eVar.f19926b;
            E e11 = (E) objArr2[d11];
            if (i10 < (eVar.c >> 1)) {
                int i12 = eVar.f19925a;
                if (d11 >= i12) {
                    f.y(objArr2, i12 + 1, objArr2, i12, d11);
                } else {
                    f.y(objArr2, 1, objArr2, 0, d11);
                    Object[] objArr3 = eVar.f19926b;
                    objArr3[0] = objArr3[objArr3.length - 1];
                    int i13 = eVar.f19925a;
                    f.y(objArr3, i13 + 1, objArr3, i13, objArr3.length - 1);
                }
                Object[] objArr4 = eVar.f19926b;
                int i14 = eVar.f19925a;
                objArr4[i14] = null;
                eVar.f19925a = eVar.c(i14);
            } else {
                int d12 = eVar.d(ge.a.A(eVar) + eVar.f19925a);
                if (d11 <= d12) {
                    Object[] objArr5 = eVar.f19926b;
                    f.y(objArr5, d11, objArr5, d11 + 1, d12 + 1);
                } else {
                    Object[] objArr6 = eVar.f19926b;
                    f.y(objArr6, d11, objArr6, d11 + 1, objArr6.length);
                    Object[] objArr7 = eVar.f19926b;
                    objArr7[objArr7.length - 1] = objArr7[0];
                    f.y(objArr7, 0, objArr7, 1, d12 + 1);
                }
                eVar.f19926b[d12] = null;
            }
            eVar.c--;
            return e11;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((e) this).c;
    }
}
