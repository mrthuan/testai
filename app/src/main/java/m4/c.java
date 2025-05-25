package m4;

import android.graphics.drawable.Drawable;
import lib.zj.office.fc.hslf.record.SlideAtom;
import p4.j;

/* compiled from: CustomTarget.java */
/* loaded from: classes.dex */
public abstract class c<T> implements g<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f21811a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21812b;
    public l4.b c;

    public c() {
        if (j.g(SlideAtom.USES_MASTER_SLIDE_ID, SlideAtom.USES_MASTER_SLIDE_ID)) {
            this.f21811a = SlideAtom.USES_MASTER_SLIDE_ID;
            this.f21812b = SlideAtom.USES_MASTER_SLIDE_ID;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
    }

    @Override // m4.g
    public final void e(l4.b bVar) {
        this.c = bVar;
    }

    @Override // m4.g
    public final l4.b h() {
        return this.c;
    }

    @Override // m4.g
    public final void j(f fVar) {
        fVar.b(this.f21811a, this.f21812b);
    }

    @Override // i4.g
    public final void onDestroy() {
    }

    @Override // i4.g
    public final void onStart() {
    }

    @Override // i4.g
    public final void onStop() {
    }

    @Override // m4.g
    public final void d(f fVar) {
    }

    @Override // m4.g
    public void f(Drawable drawable) {
    }

    @Override // m4.g
    public final void g(Drawable drawable) {
    }
}
