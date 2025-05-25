package ia;

import android.os.Bundle;
import android.util.Log;
import com.tom_roush.fontbox.ttf.NamingTable;
import da.a;
import java.util.Locale;

/* compiled from: CrashlyticsAnalyticsListener.java */
/* loaded from: classes2.dex */
public final class b implements a.InterfaceC0195a {

    /* renamed from: a  reason: collision with root package name */
    public ka.b f18478a;

    /* renamed from: b  reason: collision with root package name */
    public ka.b f18479b;

    public final void a(int i10, Bundle bundle) {
        ka.b bVar;
        String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i10), bundle);
        Log.isLoggable("FirebaseCrashlytics", 2);
        String string = bundle.getString(NamingTable.TAG);
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            if ("clx".equals(bundle2.getString("_o"))) {
                bVar = this.f18478a;
            } else {
                bVar = this.f18479b;
            }
            if (bVar != null) {
                bVar.a(bundle2, string);
            }
        }
    }
}
