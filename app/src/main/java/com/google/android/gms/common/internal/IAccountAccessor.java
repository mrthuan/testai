package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public interface IAccountAccessor extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    /* loaded from: classes.dex */
    public static abstract class Stub extends zzb implements IAccountAccessor {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f11215a = 0;

        public Stub() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 2) {
                return false;
            }
            throw null;
        }
    }

    Account zzb();
}
