package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public final class zzt {

    /* renamed from: a  reason: collision with root package name */
    public final Context f10862a;

    /* renamed from: b  reason: collision with root package name */
    public int f10863b;
    public int c = 0;

    public zzt(Context context) {
        this.f10862a = context;
    }

    public final synchronized int a() {
        int i10 = this.c;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f10862a.getPackageManager();
        if (Wrappers.a(this.f10862a).f11391a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        int i11 = 1;
        if (!PlatformVersion.a()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.c = 2;
            return 2;
        }
        if (PlatformVersion.a()) {
            this.c = 2;
            i11 = 2;
        } else {
            this.c = 1;
        }
        return i11;
    }
}
