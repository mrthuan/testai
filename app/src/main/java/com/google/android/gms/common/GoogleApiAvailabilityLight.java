package com.google.android.gms.common;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes.dex */
public class GoogleApiAvailabilityLight {
    @KeepForSdk

    /* renamed from: a  reason: collision with root package name */
    public static final int f10883a;

    /* renamed from: b  reason: collision with root package name */
    public static final GoogleApiAvailabilityLight f10884b;

    static {
        AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.f10886a;
        f10883a = 12451000;
        f10884b = new GoogleApiAvailabilityLight();
    }

    @ShowFirstParty
    @KeepForSdk
    public static int a(Context context) {
        AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.f10886a;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public Intent b(Context context, int i10, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        } else if (context != null && DeviceProperties.c(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else {
            StringBuilder sb2 = new StringBuilder("gcore_");
            sb2.append(f10883a);
            sb2.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb2.append(str);
            }
            sb2.append("-");
            if (context != null) {
                sb2.append(context.getPackageName());
            }
            sb2.append("-");
            if (context != null) {
                try {
                    sb2.append(Wrappers.a(context).c(0, context.getPackageName()).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            String sb3 = sb2.toString();
            Intent intent3 = new Intent("android.intent.action.VIEW");
            Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(FacebookMediationAdapter.KEY_ID, "com.google.android.gms");
            if (!TextUtils.isEmpty(sb3)) {
                appendQueryParameter.appendQueryParameter("pcampaignid", sb3);
            }
            intent3.setData(appendQueryParameter.build());
            intent3.setPackage("com.android.vending");
            intent3.addFlags(524288);
            return intent3;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:1|2|3|4|(4:8|24|15|(2:17|(2:19|20))(2:22|23))|38|(4:40|(3:42|(1:48)(1:46)|47)|49|(12:51|(1:53)(1:106)|54|(2:102|103)(1:56)|57|58|59|(1:61)(2:(2:72|(1:74))|(7:80|(1:82)(1:99)|(1:84)|(1:86)(4:87|(2:93|94)|89|(1:91)(1:92))|63|(1:(1:66)(1:67))|(1:69)(1:70))(1:79))|62|63|(0)|(0)(0)))|107|(0)(0)|54|(0)(0)|57|58|59|(0)(0)|62|63|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0153, code lost:
        java.lang.String.valueOf(r3).concat(" requires Google Play services, but they are missing.");
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x016c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x016d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ea  */
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int c(android.content.Context r9, int r10) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleApiAvailabilityLight.c(android.content.Context, int):int");
    }
}
