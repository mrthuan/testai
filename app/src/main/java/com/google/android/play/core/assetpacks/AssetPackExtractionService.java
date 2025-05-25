package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public class AssetPackExtractionService extends Service {

    /* renamed from: a  reason: collision with root package name */
    public z f13153a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f13153a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f13153a = (z) b1.l(getApplicationContext()).f13359b.a();
    }
}
