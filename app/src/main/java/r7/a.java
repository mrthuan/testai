package r7;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.internal.common.zzd;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SuppressLint({"HandlerLeak"})
/* loaded from: classes.dex */
public final class a extends zau {

    /* renamed from: a  reason: collision with root package name */
    public final Context f29468a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ GoogleApiAvailability f29469b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(com.google.android.gms.common.GoogleApiAvailability r1, android.content.Context r2) {
        /*
            r0 = this;
            r0.f29469b = r1
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto Ld
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            goto L11
        Ld:
            android.os.Looper r1 = android.os.Looper.myLooper()
        L11:
            r0.<init>(r1)
            android.content.Context r1 = r2.getApplicationContext()
            r0.f29468a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.a.<init>(com.google.android.gms.common.GoogleApiAvailability, android.content.Context):void");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        PendingIntent activity;
        boolean z10 = true;
        if (message.what != 1) {
            return;
        }
        GoogleApiAvailability googleApiAvailability = this.f29469b;
        Context context = this.f29468a;
        int d10 = googleApiAvailability.d(context);
        AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.f10886a;
        if (d10 != 1 && d10 != 2 && d10 != 3 && d10 != 9) {
            z10 = false;
        }
        if (z10) {
            Intent b10 = googleApiAvailability.b(context, d10, "n");
            if (b10 == null) {
                activity = null;
            } else {
                activity = PendingIntent.getActivity(context, 0, b10, zzd.zza | 134217728);
            }
            googleApiAvailability.i(context, d10, activity);
        }
    }
}
