package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public abstract class zad extends com.google.android.gms.internal.base.zab implements zae {
    public zad() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return false;
                    }
                    com.google.android.gms.internal.base.zac.zab(parcel);
                    u0((Status) com.google.android.gms.internal.base.zac.zaa(parcel, Status.CREATOR));
                } else {
                    com.google.android.gms.internal.base.zac.zab(parcel);
                    w((Status) com.google.android.gms.internal.base.zac.zaa(parcel, Status.CREATOR), (ModuleInstallIntentResponse) com.google.android.gms.internal.base.zac.zaa(parcel, ModuleInstallIntentResponse.CREATOR));
                }
            } else {
                com.google.android.gms.internal.base.zac.zab(parcel);
                O((Status) com.google.android.gms.internal.base.zac.zaa(parcel, Status.CREATOR), (ModuleInstallResponse) com.google.android.gms.internal.base.zac.zaa(parcel, ModuleInstallResponse.CREATOR));
            }
        } else {
            com.google.android.gms.internal.base.zac.zab(parcel);
            R((Status) com.google.android.gms.internal.base.zac.zaa(parcel, Status.CREATOR), (ModuleAvailabilityResponse) com.google.android.gms.internal.base.zac.zaa(parcel, ModuleAvailabilityResponse.CREATOR));
        }
        return true;
    }
}
