package b9;

import android.graphics.Typeface;

/* compiled from: CancelableFontCallback.java */
/* loaded from: classes2.dex */
public final class a extends r.d {

    /* renamed from: a  reason: collision with root package name */
    public final Typeface f5373a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC0035a f5374b;
    public boolean c;

    /* compiled from: CancelableFontCallback.java */
    /* renamed from: b9.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0035a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0035a interfaceC0035a, Typeface typeface) {
        this.f5373a = typeface;
        this.f5374b = interfaceC0035a;
    }

    @Override // r.d
    public final void f(int i10) {
        if (!this.c) {
            this.f5374b.a(this.f5373a);
        }
    }

    @Override // r.d
    public final void j(Typeface typeface, boolean z10) {
        if (!this.c) {
            this.f5374b.a(typeface);
        }
    }
}
