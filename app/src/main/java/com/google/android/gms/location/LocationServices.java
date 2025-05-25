package com.google.android.gms.location;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.zzaf;
import com.google.android.gms.internal.location.zzz;
import y7.b;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public class LocationServices {

    /* renamed from: a  reason: collision with root package name */
    public static final Api<Api.ApiOptions.NoOptions> f11464a;

    /* renamed from: b  reason: collision with root package name */
    public static final Api.ClientKey<com.google.android.gms.internal.location.zzaz> f11465b;

    static {
        Api.ClientKey<com.google.android.gms.internal.location.zzaz> clientKey = new Api.ClientKey<>();
        f11465b = clientKey;
        f11464a = new Api<>("LocationServices.API", new b(), clientKey);
        new zzz();
        new zzaf();
        new com.google.android.gms.internal.location.zzbi();
    }

    private LocationServices() {
    }

    public static com.google.android.gms.internal.location.zzaz a(GoogleApiClient googleApiClient) {
        boolean z10;
        boolean z11 = true;
        if (googleApiClient != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.a("GoogleApiClient parameter is required.", z10);
        com.google.android.gms.internal.location.zzaz zzazVar = (com.google.android.gms.internal.location.zzaz) googleApiClient.h(f11465b);
        if (zzazVar == null) {
            z11 = false;
        }
        Preconditions.l("GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.", z11);
        return zzazVar;
    }
}
