package jb;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;

/* compiled from: Metadata.java */
/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final Context f19146a;

    /* renamed from: b  reason: collision with root package name */
    public String f19147b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public int f19148d;

    /* renamed from: e  reason: collision with root package name */
    public int f19149e = 0;

    public p(Context context) {
        this.f19146a = context;
    }

    public static String c(z9.e eVar) {
        eVar.a();
        String str = eVar.c.f32322e;
        if (str != null) {
            return str;
        }
        eVar.a();
        String str2 = eVar.c.f32320b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final synchronized String a() {
        if (this.f19147b == null) {
            e();
        }
        return this.f19147b;
    }

    public final synchronized String b() {
        if (this.c == null) {
            e();
        }
        return this.c;
    }

    public final boolean d() {
        int i10;
        synchronized (this) {
            i10 = this.f19149e;
            if (i10 == 0) {
                PackageManager packageManager = this.f19146a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    i10 = 0;
                } else {
                    if (!PlatformVersion.a()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f19149e = 1;
                            i10 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                        this.f19149e = 2;
                        i10 = 2;
                    } else {
                        if (PlatformVersion.a()) {
                            this.f19149e = 2;
                        } else {
                            this.f19149e = 1;
                        }
                        i10 = this.f19149e;
                    }
                }
            }
        }
        if (i10 != 0) {
            return true;
        }
        return false;
    }

    public final synchronized void e() {
        PackageInfo packageInfo;
        try {
            packageInfo = this.f19146a.getPackageManager().getPackageInfo(this.f19146a.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.toString();
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.f19147b = Integer.toString(packageInfo.versionCode);
            this.c = packageInfo.versionName;
        }
    }
}
