package m7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.ads.internal.util.zzci;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class j extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzci f21837a;

    public j(zzci zzciVar) {
        this.f21837a = zzciVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzci zzciVar = this.f21837a;
        synchronized (zzciVar) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : zzciVar.f10451b.entrySet()) {
                if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                    arrayList.add((BroadcastReceiver) entry.getKey());
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((BroadcastReceiver) arrayList.get(i10)).onReceive(context, intent);
            }
        }
    }
}
