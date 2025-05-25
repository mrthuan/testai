package p9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class l extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f23809a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        o9.e eVar = (o9.e) this.f23809a;
        eVar.getClass();
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            eVar.f23810a.a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        eVar.f23810a.a("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            eVar.f23810a.a("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        n nVar = eVar.f23810a;
        nVar.a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        nVar.a("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
        nVar.a("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
        com.google.android.play.core.install.b bVar = new com.google.android.play.core.install.b(intent.getIntExtra("install.status", 0), intent.getIntExtra("error.code", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getStringExtra("package.name"));
        eVar.f23810a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", bVar);
        synchronized (eVar) {
            Iterator it = new HashSet(eVar.f23812d).iterator();
            while (it.hasNext()) {
                ((t9.a) it.next()).a(bVar);
            }
        }
    }
}
