package hg;

import java.util.NoSuchElementException;
import kotlin.collections.p;

/* compiled from: ProgressionIterators.kt */
/* loaded from: classes.dex */
public final class b extends p {

    /* renamed from: a  reason: collision with root package name */
    public final int f18328a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18329b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public int f18330d;

    public b(int i10, int i11, int i12) {
        this.f18328a = i12;
        this.f18329b = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.c = z10;
        this.f18330d = z10 ? i10 : i11;
    }

    @Override // kotlin.collections.p
    public final int a() {
        int i10 = this.f18330d;
        if (i10 == this.f18329b) {
            if (this.c) {
                this.c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f18330d = this.f18328a + i10;
        }
        return i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }
}
