package v8;

import android.view.ViewTreeObserver;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes2.dex */
public final class f implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.floatingactionbutton.g f30775a;

    public f(com.google.android.material.floatingactionbutton.g gVar) {
        this.f30775a = gVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        com.google.android.material.floatingactionbutton.g gVar = this.f30775a;
        float rotation = gVar.f12557v.getRotation();
        if (gVar.f12550o != rotation) {
            gVar.f12550o = rotation;
            gVar.p();
            return true;
        }
        return true;
    }
}
