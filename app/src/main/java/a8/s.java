package a8;

import com.google.android.gms.measurement.internal.zzge;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public abstract class s extends k {

    /* renamed from: b  reason: collision with root package name */
    public boolean f318b;

    public s(zzge zzgeVar) {
        super(zzgeVar);
        ((zzge) this.f3529a).E++;
    }

    public final void n() {
        if (this.f318b) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void o() {
        if (!this.f318b) {
            if (!p()) {
                ((zzge) this.f3529a).a();
                this.f318b = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract boolean p();
}
