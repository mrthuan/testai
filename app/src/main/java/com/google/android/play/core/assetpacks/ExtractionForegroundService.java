package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public class ExtractionForegroundService extends Service {

    /* renamed from: a  reason: collision with root package name */
    public final t0 f13154a = new t0(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f13154a;
    }
}
