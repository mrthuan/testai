package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class u0 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final q9.y f13393a = new q9.y("ExtractionForegroundServiceConnection");

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f13394b = new ArrayList();
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public ExtractionForegroundService f13395d;

    /* renamed from: e  reason: collision with root package name */
    public Notification f13396e;

    public u0(Context context) {
        this.c = context;
    }

    public final void a() {
        this.f13393a.a("Stopping foreground installation service.", new Object[0]);
        this.c.unbindService(this);
        ExtractionForegroundService extractionForegroundService = this.f13395d;
        if (extractionForegroundService != null) {
            synchronized (extractionForegroundService) {
                extractionForegroundService.stopForeground(true);
                extractionForegroundService.stopSelf();
            }
        }
        c();
    }

    public final void b(q9.v vVar) {
        synchronized (this.f13394b) {
            this.f13394b.add(vVar);
        }
    }

    public final void c() {
        ArrayList arrayList;
        synchronized (this.f13394b) {
            arrayList = new ArrayList(this.f13394b);
            this.f13394b.clear();
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            q9.v vVar = (q9.v) arrayList.get(i10);
            try {
                Bundle bundle = new Bundle();
                Bundle bundle2 = new Bundle();
                Parcel K = vVar.K();
                int i11 = q9.o.f29130a;
                K.writeInt(1);
                bundle.writeToParcel(K, 0);
                K.writeInt(1);
                bundle2.writeToParcel(K, 0);
                vVar.L0(2, K);
            } catch (RemoteException unused) {
                this.f13393a.b("Could not resolve Play Store service state update callback.", new Object[0]);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f13393a.a("Starting foreground installation service.", new Object[0]);
        ExtractionForegroundService extractionForegroundService = ((t0) iBinder).f13384a;
        this.f13395d = extractionForegroundService;
        extractionForegroundService.startForeground(-1883842196, this.f13396e);
        c();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
