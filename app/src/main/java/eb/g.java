package eb;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallation;

/* compiled from: GetIdListener.java */
/* loaded from: classes2.dex */
public final class g implements j {

    /* renamed from: a  reason: collision with root package name */
    public final TaskCompletionSource<String> f16545a;

    public g(TaskCompletionSource<String> taskCompletionSource) {
        this.f16545a = taskCompletionSource;
    }

    @Override // eb.j
    public final boolean a(com.google.firebase.installations.local.a aVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (aVar.f() == PersistedInstallation.RegistrationStatus.UNREGISTERED) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (aVar.f() == PersistedInstallation.RegistrationStatus.REGISTERED) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                if (aVar.f() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    return false;
                }
            }
        }
        this.f16545a.d(aVar.f13605b);
        return true;
    }

    @Override // eb.j
    public final boolean b(Exception exc) {
        return false;
    }
}
