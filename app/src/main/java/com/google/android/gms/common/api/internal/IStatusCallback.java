package com.google.android.gms.common.api.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public interface IStatusCallback extends IInterface {

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    /* loaded from: classes.dex */
    public static abstract class Stub extends com.google.android.gms.internal.base.zab implements IStatusCallback {
        public Stub() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @Override // com.google.android.gms.internal.base.zab
        public final boolean zaa(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                com.google.android.gms.internal.base.zac.zab(parcel);
                u((Status) com.google.android.gms.internal.base.zac.zaa(parcel, Status.CREATOR));
                return true;
            }
            return false;
        }
    }

    void u(Status status);
}
