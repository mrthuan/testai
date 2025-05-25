package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.NetworkType;
import androidx.work.a;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import o2.b;
import o2.i;
import p2.j;
import x2.p;
import z2.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class WorkManagerUtil extends zzbq {
    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.L0(iObjectWrapper);
        try {
            j.f(context.getApplicationContext(), new a(new a.C0026a()));
        } catch (IllegalStateException unused) {
        }
        try {
            j e10 = j.e(context);
            e10.getClass();
            ((b) e10.f23629d).a(new y2.b(e10));
            b.a aVar = new b.a();
            aVar.f22676a = NetworkType.CONNECTED;
            o2.b bVar = new o2.b(aVar);
            i.a aVar2 = new i.a(OfflinePingSender.class);
            aVar2.f22693b.f31566j = bVar;
            aVar2.c.add("offline_ping_sender_work");
            e10.b(aVar2.a());
        } catch (IllegalStateException unused2) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(IObjectWrapper iObjectWrapper, String str, String str2) {
        return zzg(iObjectWrapper, new zza(str, str2, ""));
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzg(IObjectWrapper iObjectWrapper, zza zzaVar) {
        Context context = (Context) ObjectWrapper.L0(iObjectWrapper);
        try {
            j.f(context.getApplicationContext(), new a(new a.C0026a()));
        } catch (IllegalStateException unused) {
        }
        b.a aVar = new b.a();
        aVar.f22676a = NetworkType.CONNECTED;
        o2.b bVar = new o2.b(aVar);
        HashMap hashMap = new HashMap();
        hashMap.put("uri", zzaVar.f10267a);
        hashMap.put("gws_query_id", zzaVar.f10268b);
        hashMap.put("image_url", zzaVar.c);
        androidx.work.b bVar2 = new androidx.work.b(hashMap);
        androidx.work.b.c(bVar2);
        i.a aVar2 = new i.a(OfflineNotificationPoster.class);
        p pVar = aVar2.f22693b;
        pVar.f31566j = bVar;
        pVar.f31561e = bVar2;
        aVar2.c.add("offline_notification_work");
        try {
            j.e(context).b(aVar2.a());
            return true;
        } catch (IllegalStateException unused2) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
            return false;
        }
    }
}
