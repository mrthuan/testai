package hg;

import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: Progressions.kt */
/* loaded from: classes.dex */
public class a implements Iterable<Integer>, dg.a {

    /* renamed from: a  reason: collision with root package name */
    public final int f18326a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18327b;
    public final int c;

    public a(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f18326a = i10;
                this.f18327b = t0.S(i10, i11, i12);
                this.c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override // java.lang.Iterable
    /* renamed from: a */
    public final b iterator() {
        return new b(this.f18326a, this.f18327b, this.c);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f18326a != aVar.f18326a || this.f18327b != aVar.f18327b || this.c != aVar.c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f18326a * 31) + this.f18327b) * 31) + this.c;
    }

    public boolean isEmpty() {
        int i10 = this.c;
        int i11 = this.f18327b;
        int i12 = this.f18326a;
        if (i10 > 0) {
            if (i12 > i11) {
                return true;
            }
        } else if (i12 < i11) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb2;
        int i10 = this.f18327b;
        int i11 = this.f18326a;
        int i12 = this.c;
        if (i12 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append("..");
            sb2.append(i10);
            sb2.append(" step ");
            sb2.append(i12);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append(" downTo ");
            sb2.append(i10);
            sb2.append(" step ");
            sb2.append(-i12);
        }
        return sb2.toString();
    }
}
