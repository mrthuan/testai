package m7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class m extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzt f21840a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean equals = "android.intent.action.USER_PRESENT".equals(intent.getAction());
        zzt zztVar = this.f21840a;
        if (equals) {
            zztVar.f10500e = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            zztVar.f10500e = false;
        }
    }
}
