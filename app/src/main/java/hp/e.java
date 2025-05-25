package hp;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: RotationObserver.java */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Context> f18396a;

    /* renamed from: b  reason: collision with root package name */
    public d f18397b;
    public int c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f18398d = -1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18399e = false;

    static {
        ea.a.p("HW9FYQ1pWG4VYjllB3YNcg==", "LGux62uk");
    }

    public e(Context context) {
        this.f18396a = new WeakReference<>(context);
        d dVar = new d(this, context);
        this.f18397b = dVar;
        if (dVar.canDetectOrientation()) {
            this.f18397b.enable();
        }
    }

    public final Context a() {
        WeakReference<Context> weakReference = this.f18396a;
        if (weakReference != null && weakReference.get() != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void b(int i10) {
        Activity l10;
        Context a10 = a();
        if (a10 != null && (l10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.l(a10)) != null) {
            try {
                l10.setRequestedOrientation(i10);
            } catch (Exception e10) {
                e10.printStackTrace();
                dp.a.a().getClass();
                dp.a.d(a10, e10);
            }
        }
    }

    public final void c() {
        d dVar = this.f18397b;
        if (dVar != null && dVar.canDetectOrientation()) {
            this.f18397b.enable();
            return;
        }
        Context a10 = a();
        if (a10 != null) {
            d dVar2 = new d(this, a10);
            this.f18397b = dVar2;
            if (dVar2.canDetectOrientation()) {
                this.f18397b.enable();
            }
        }
    }

    public final void d() {
        d dVar = this.f18397b;
        if (dVar != null) {
            dVar.disable();
        }
    }
}
