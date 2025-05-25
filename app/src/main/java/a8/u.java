package a8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzfa;
import com.google.android.gms.measurement.internal.zzlg;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class u extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final zzlg f331a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f332b;
    public boolean c;

    public u(zzlg zzlgVar) {
        this.f331a = zzlgVar;
    }

    public final void a() {
        zzlg zzlgVar = this.f331a;
        zzlgVar.b();
        zzlgVar.zzaB().m();
        zzlgVar.zzaB().m();
        if (this.f332b) {
            zzlgVar.zzaA().f11720n.a("Unregistering connectivity change receiver");
            this.f332b = false;
            this.c = false;
            try {
                zzlgVar.f11893l.f11773a.unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                zzlgVar.zzaA().f11712f.b(e10, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzlg zzlgVar = this.f331a;
        zzlgVar.b();
        String action = intent.getAction();
        zzlgVar.zzaA().f11720n.b(action, "NetworkBroadcastReceiver received action");
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            zzfa zzfaVar = zzlgVar.f11884b;
            zzlg.C(zzfaVar);
            boolean q5 = zzfaVar.q();
            if (this.c != q5) {
                this.c = q5;
                zzlgVar.zzaB().u(new t(this, q5));
                return;
            }
            return;
        }
        zzlgVar.zzaA().f11715i.b(action, "NetworkBroadcastReceiver received unknown action");
    }
}
