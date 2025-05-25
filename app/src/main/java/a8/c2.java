package a8;

import com.google.android.gms.measurement.internal.zzlg;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public abstract class c2 extends b2 {
    public boolean c;

    public c2(zzlg zzlgVar) {
        super(zzlgVar);
        this.f117b.f11898q++;
    }

    public final void n() {
        if (this.c) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void o() {
        if (!this.c) {
            p();
            this.f117b.f11899r++;
            this.c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract void p();
}
