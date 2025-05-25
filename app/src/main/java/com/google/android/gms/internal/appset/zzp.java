package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.f0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes2.dex */
public final class zzp extends GoogleApi<Api.ApiOptions.NoOptions> implements AppSetIdClient {
    private static final Api.ClientKey<zzd> zza;
    private static final Api.AbstractClientBuilder<zzd, Api.ApiOptions.NoOptions> zzb;
    private static final Api<Api.ApiOptions.NoOptions> zzc;
    private final Context zzd;
    private final GoogleApiAvailabilityLight zze;

    static {
        Api.ClientKey<zzd> clientKey = new Api.ClientKey<>();
        zza = clientKey;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new Api<>("AppSet.API", zznVar, clientKey);
    }

    public zzp(Context context, GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        super(context, zzc, Api.ApiOptions.S0, GoogleApi.Settings.c);
        this.zzd = context;
        this.zze = googleApiAvailabilityLight;
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public final Task<AppSetIdInfo> getAppSetIdInfo() {
        if (this.zze.c(this.zzd, 212800000) == 0) {
            TaskApiCall.Builder builder = new TaskApiCall.Builder(0);
            builder.c = new Feature[]{com.google.android.gms.appset.zze.f10799a};
            builder.f10964a = new RemoteCall() { // from class: com.google.android.gms.internal.appset.zzm
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(Object obj, Object obj2) {
                    ((zzg) ((zzd) obj).getService()).zzc(new com.google.android.gms.appset.zza(null, null), new zzo(zzp.this, (TaskCompletionSource) obj2));
                }
            };
            builder.f10965b = false;
            builder.f10966d = 27601;
            return doRead(new f0(builder, builder.c, builder.f10965b, builder.f10966d));
        }
        return Tasks.d(new ApiException(new Status(17, null, null, null)));
    }
}
