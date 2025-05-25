package eb;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallation;

/* compiled from: GetAuthTokenListener.java */
/* loaded from: classes2.dex */
public final class f implements j {

    /* renamed from: a  reason: collision with root package name */
    public final k f16543a;

    /* renamed from: b  reason: collision with root package name */
    public final TaskCompletionSource<h> f16544b;

    public f(k kVar, TaskCompletionSource<h> taskCompletionSource) {
        this.f16543a = kVar;
        this.f16544b = taskCompletionSource;
    }

    @Override // eb.j
    public final boolean a(com.google.firebase.installations.local.a aVar) {
        boolean z10;
        if (aVar.f() == PersistedInstallation.RegistrationStatus.REGISTERED) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || this.f16543a.a(aVar)) {
            return false;
        }
        String str = aVar.f13606d;
        if (str != null) {
            Long valueOf = Long.valueOf(aVar.f13608f);
            Long valueOf2 = Long.valueOf(aVar.f13609g);
            String str2 = "";
            if (valueOf == null) {
                str2 = "".concat(" tokenExpirationTimestamp");
            }
            if (valueOf2 == null) {
                str2 = a6.h.c(str2, " tokenCreationTimestamp");
            }
            if (str2.isEmpty()) {
                this.f16544b.b(new a(str, valueOf.longValue(), valueOf2.longValue()));
                return true;
            }
            throw new IllegalStateException("Missing required properties:".concat(str2));
        }
        throw new NullPointerException("Null token");
    }

    @Override // eb.j
    public final boolean b(Exception exc) {
        this.f16544b.c(exc);
        return true;
    }
}
