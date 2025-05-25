package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Set;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes2.dex */
public final class zzco {
    public static zzcm zza(Context context, String str) {
        String str2;
        String str3;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(PackagingURIHelper.FORWARD_SLASH_STRING, -1);
            int length = split.length;
            if (length == 1) {
                String valueOf = String.valueOf(context.getPackageName());
                str3 = split[0];
                str2 = valueOf.concat("_preferences");
            } else if (length == 2) {
                str2 = split[0];
                str3 = split[1];
            } else {
                return null;
            }
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                return new zzcm(str2, str3);
            }
            return null;
        }
        return null;
    }

    public static void zzb(Context context, Set set) {
        SharedPreferences.Editor zzd;
        zzcn zzcnVar = new zzcn(context);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzcm zza = zza(context, str);
            if (zza != null) {
                zzd = zzcnVar.zzd(zza.zza);
                zzd.remove(zza.zzb);
            } else {
                "clearKeys: unable to process key: ".concat(String.valueOf(str));
            }
        }
        zzcnVar.zzb();
    }
}
