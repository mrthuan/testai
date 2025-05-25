package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.f0;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import s7.b;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zao extends GoogleApi implements TelemetryLoggingClient {

    /* renamed from: a  reason: collision with root package name */
    public static final Api f11264a = new Api("ClientTelemetry.API", new b(), new Api.ClientKey());

    public zao(Context context) {
        super(context, f11264a, TelemetryLoggingOptions.f11236b, GoogleApi.Settings.c);
    }

    public final Task<Void> a(final TelemetryData telemetryData) {
        TaskApiCall.Builder builder = new TaskApiCall.Builder(0);
        builder.c = new Feature[]{zaf.zaa};
        builder.f10965b = false;
        builder.f10964a = new RemoteCall() { // from class: com.google.android.gms.common.internal.service.zam
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                Api api = zao.f11264a;
                zai zaiVar = (zai) ((zap) obj).getService();
                Parcel zaa = zaiVar.zaa();
                zac.zac(zaa, TelemetryData.this);
                zaiVar.zad(1, zaa);
                ((TaskCompletionSource) obj2).b(null);
            }
        };
        return doBestEffortWrite(new f0(builder, builder.c, builder.f10965b, builder.f10966d));
    }
}
