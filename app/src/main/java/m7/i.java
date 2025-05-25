package m7;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.ads.internal.zzu;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class i implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final String f21835a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zzcb f21836b;

    public i(zzcb zzcbVar, String str) {
        this.f21836b = zzcbVar;
        this.f21835a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f21836b) {
            Iterator it = this.f21836b.f10444b.iterator();
            while (it.hasNext()) {
                String str2 = this.f21835a;
                Map map = ((zzbz) it.next()).f10442a;
                if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                    zzu.B.f10557g.zzi().a(false);
                }
            }
        }
    }
}
