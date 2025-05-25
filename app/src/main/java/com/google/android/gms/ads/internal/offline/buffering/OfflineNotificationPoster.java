package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzboi;
import com.google.android.gms.internal.ads.zzbsg;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class OfflineNotificationPoster extends Worker {

    /* renamed from: g  reason: collision with root package name */
    public final zzbsg f10265g;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        zzaw zzawVar = zzay.f10107f.f10109b;
        zzboi zzboiVar = new zzboi();
        zzawVar.getClass();
        this.f10265g = zzaw.a(context, zzboiVar);
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a doWork() {
        try {
            this.f10265g.zzj(new ObjectWrapper(getApplicationContext()), new zza(getInputData().b("uri"), getInputData().b("gws_query_id"), getInputData().b("image_url")));
            return new ListenableWorker.a.c();
        } catch (RemoteException unused) {
            return new ListenableWorker.a.C0025a();
        }
    }
}
