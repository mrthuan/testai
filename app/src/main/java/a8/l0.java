package a8;

import com.google.android.gms.measurement.internal.zzge;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public abstract class l0 extends androidx.core.content.e {

    /* renamed from: b  reason: collision with root package name */
    public boolean f219b;

    public l0(zzge zzgeVar) {
        super(zzgeVar);
        ((zzge) this.f3529a).E++;
    }

    public abstract boolean n();

    public final void o() {
        if (this.f219b) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void p() {
        if (!this.f219b) {
            if (!n()) {
                ((zzge) this.f3529a).a();
                this.f219b = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
