package com.google.android.gms.common.api.internal;

import android.app.NotificationManager;
import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zaaw f11004a;

    public g(zaaw zaawVar) {
        this.f11004a = zaawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zaaw zaawVar = this.f11004a;
        GoogleApiAvailabilityLight googleApiAvailabilityLight = zaawVar.f11054d;
        Context context = zaawVar.c;
        googleApiAvailabilityLight.getClass();
        if (!GooglePlayServicesUtilLight.f10886a.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException unused) {
            }
        }
    }
}
