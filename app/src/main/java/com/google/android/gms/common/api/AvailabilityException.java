package com.google.android.gms.common.api;

import a6.h;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import y.b;
import y.h;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public class AvailabilityException extends Exception {
    private final b zaa;

    public AvailabilityException(b bVar) {
        this.zaa = bVar;
    }

    public ConnectionResult getConnectionResult(GoogleApi<? extends Api.ApiOptions> googleApi) {
        b bVar = this.zaa;
        ApiKey<? extends Api.ApiOptions> apiKey = googleApi.getApiKey();
        Preconditions.a(h.d("The given API (", apiKey.f10930b.c, ") was not part of the availability request."), bVar.getOrDefault(apiKey, null) != 0);
        ConnectionResult connectionResult = (ConnectionResult) this.zaa.getOrDefault(apiKey, null);
        Preconditions.j(connectionResult);
        return connectionResult;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((h.c) this.zaa.keySet()).iterator();
        boolean z10 = true;
        while (true) {
            h.a aVar = (h.a) it;
            if (!aVar.hasNext()) {
                break;
            }
            ApiKey apiKey = (ApiKey) aVar.next();
            ConnectionResult connectionResult = (ConnectionResult) this.zaa.getOrDefault(apiKey, null);
            Preconditions.j(connectionResult);
            z10 &= !connectionResult.f();
            arrayList.add(apiKey.f10930b.c + ": " + String.valueOf(connectionResult));
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }

    public ConnectionResult getConnectionResult(HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        b bVar = this.zaa;
        ApiKey<? extends Api.ApiOptions> apiKey = hasApiKey.getApiKey();
        Preconditions.a(a6.h.d("The given API (", apiKey.f10930b.c, ") was not part of the availability request."), bVar.getOrDefault(apiKey, null) != 0);
        ConnectionResult connectionResult = (ConnectionResult) this.zaa.getOrDefault(apiKey, null);
        Preconditions.j(connectionResult);
        return connectionResult;
    }
}
