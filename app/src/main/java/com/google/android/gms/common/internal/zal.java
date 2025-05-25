package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zal {

    /* renamed from: a  reason: collision with root package name */
    public final SparseIntArray f11276a;

    /* renamed from: b  reason: collision with root package name */
    public final GoogleApiAvailabilityLight f11277b;

    public zal() {
        this(GoogleApiAvailability.f10882d);
    }

    @ResultIgnorabilityUnspecified
    public final int a(Context context, Api.Client client) {
        Preconditions.j(context);
        Preconditions.j(client);
        int i10 = 0;
        if (!client.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = client.getMinApkVersion();
        SparseIntArray sparseIntArray = this.f11276a;
        int i11 = sparseIntArray.get(minApkVersion, -1);
        if (i11 == -1) {
            int i12 = 0;
            while (true) {
                if (i12 < sparseIntArray.size()) {
                    int keyAt = sparseIntArray.keyAt(i12);
                    if (keyAt > minApkVersion && sparseIntArray.get(keyAt) == 0) {
                        break;
                    }
                    i12++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 == -1) {
                i11 = this.f11277b.c(context, minApkVersion);
            } else {
                i11 = i10;
            }
            sparseIntArray.put(minApkVersion, i11);
        }
        return i11;
    }

    public zal(GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.f11276a = new SparseIntArray();
        Preconditions.j(googleApiAvailabilityLight);
        this.f11277b = googleApiAvailabilityLight;
    }
}
