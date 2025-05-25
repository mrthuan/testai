package com.google.android.gms.measurement.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.measurement.internal.zzhe;
import com.google.android.gms.measurement.internal.zzhf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.2 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class AppMeasurementSdk {

    /* renamed from: a  reason: collision with root package name */
    public final zzef f11513a;

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.2 */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static final class ConditionalUserProperty {
        private ConditionalUserProperty() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.2 */
    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface EventInterceptor extends zzhe {
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.2 */
    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface OnEventListener extends zzhf {
    }

    public AppMeasurementSdk(zzef zzefVar) {
        this.f11513a = zzefVar;
    }
}
