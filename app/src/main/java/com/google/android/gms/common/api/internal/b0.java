package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class b0 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final GoogleApiManager f10986a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10987b;
    public final ApiKey c;

    /* renamed from: d  reason: collision with root package name */
    public final long f10988d;

    /* renamed from: e  reason: collision with root package name */
    public final long f10989e;

    public b0(GoogleApiManager googleApiManager, int i10, ApiKey apiKey, long j10, long j11) {
        this.f10986a = googleApiManager;
        this.f10987b = i10;
        this.c = apiKey;
        this.f10988d = j10;
        this.f10989e = j11;
    }

    public static ConnectionTelemetryConfiguration a(zabq zabqVar, BaseGmsClient baseGmsClient, int i10) {
        ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration != null && telemetryConfiguration.f11194b) {
            boolean z10 = false;
            int[] iArr = telemetryConfiguration.f11195d;
            if (iArr == null) {
                int[] iArr2 = telemetryConfiguration.f11197f;
                if (iArr2 != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= iArr2.length) {
                            break;
                        } else if (iArr2[i11] == i10) {
                            z10 = true;
                            break;
                        } else {
                            i11++;
                        }
                    }
                    if (z10) {
                        return null;
                    }
                }
            } else {
                int i12 = 0;
                while (true) {
                    if (i12 >= iArr.length) {
                        break;
                    } else if (iArr[i12] == i10) {
                        z10 = true;
                        break;
                    } else {
                        i12++;
                    }
                }
                if (!z10) {
                    return null;
                }
            }
            if (zabqVar.f11120l < telemetryConfiguration.f11196e) {
                return telemetryConfiguration;
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        zabq zabqVar;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j10;
        long j11;
        int i16;
        GoogleApiManager googleApiManager = this.f10986a;
        if (googleApiManager.b()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = RootTelemetryConfigManager.a().f11227a;
            if ((rootTelemetryConfiguration == null || rootTelemetryConfiguration.f11229b) && (zabqVar = (zabq) googleApiManager.f10948j.get(this.c)) != null) {
                Api.Client client = zabqVar.f11111b;
                if (client instanceof BaseGmsClient) {
                    BaseGmsClient baseGmsClient = (BaseGmsClient) client;
                    long j12 = this.f10988d;
                    int i17 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                    boolean z11 = true;
                    if (i17 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                    if (rootTelemetryConfiguration != null) {
                        z10 &= rootTelemetryConfiguration.c;
                        if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                            ConnectionTelemetryConfiguration a10 = a(zabqVar, baseGmsClient, this.f10987b);
                            if (a10 != null) {
                                if (!a10.c || i17 <= 0) {
                                    z11 = false;
                                }
                                i12 = a10.f11196e;
                                z10 = z11;
                            } else {
                                return;
                            }
                        } else {
                            i12 = rootTelemetryConfiguration.f11231e;
                        }
                        i10 = rootTelemetryConfiguration.f11230d;
                        i11 = rootTelemetryConfiguration.f11228a;
                    } else {
                        i10 = 5000;
                        i11 = 0;
                        i12 = 100;
                    }
                    if (task.o()) {
                        i15 = 0;
                        i14 = 0;
                    } else {
                        if (task.m()) {
                            i13 = 100;
                        } else {
                            Exception j13 = task.j();
                            if (j13 instanceof ApiException) {
                                Status status = ((ApiException) j13).getStatus();
                                i13 = status.f10926a;
                                ConnectionResult connectionResult = status.f10928d;
                                if (connectionResult != null) {
                                    i14 = connectionResult.f10876b;
                                    i15 = i13;
                                }
                            } else {
                                i13 = 101;
                            }
                        }
                        i14 = -1;
                        i15 = i13;
                    }
                    if (z10) {
                        j10 = j12;
                        j11 = System.currentTimeMillis();
                        i16 = (int) (SystemClock.elapsedRealtime() - this.f10989e);
                    } else {
                        j10 = 0;
                        j11 = 0;
                        i16 = -1;
                    }
                    c0 c0Var = new c0(new MethodInvocation(this.f10987b, i15, i14, j10, j11, null, null, gCoreServiceId, i16), i11, i10, i12);
                    com.google.android.gms.internal.base.zau zauVar = googleApiManager.f10952n;
                    zauVar.sendMessage(zauVar.obtainMessage(18, c0Var));
                }
            }
        }
    }
}
