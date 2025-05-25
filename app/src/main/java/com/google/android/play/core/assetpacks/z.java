package com.google.android.play.core.assetpacks;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class z extends q9.u {

    /* renamed from: a  reason: collision with root package name */
    public final q9.y f13450a = new q9.y("AssetPackExtractionService");

    /* renamed from: b  reason: collision with root package name */
    public final Context f13451b;
    public final d0 c;

    /* renamed from: d  reason: collision with root package name */
    public final m2 f13452d;

    /* renamed from: e  reason: collision with root package name */
    public final u0 f13453e;

    /* renamed from: f  reason: collision with root package name */
    public final NotificationManager f13454f;

    public z(Context context, d0 d0Var, m2 m2Var, u0 u0Var) {
        this.f13451b = context;
        this.c = d0Var;
        this.f13452d = m2Var;
        this.f13453e = u0Var;
        this.f13454f = (NotificationManager) context.getSystemService("notification");
    }

    @TargetApi(26)
    public final synchronized void L0(String str) {
        if (str == null) {
            str = "File downloads by Play";
        }
        c4.h.y();
        this.f13454f.createNotificationChannel(bb.k.d(str));
    }
}
