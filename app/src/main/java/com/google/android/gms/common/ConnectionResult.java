package com.google.android.gms.common;

import a0.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class ConnectionResult extends AbstractSafeParcelable {
    public static final int SUCCESS = 0;
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    public final int f10875a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final int f10876b;
    @SafeParcelable.Field
    public final PendingIntent c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final String f10877d;
    @ShowFirstParty
    @KeepForSdk

    /* renamed from: e  reason: collision with root package name */
    public static final ConnectionResult f10874e = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new zzb();

    public ConnectionResult() {
        throw null;
    }

    @SafeParcelable.Constructor
    public ConnectionResult(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param PendingIntent pendingIntent, @SafeParcelable.Param String str) {
        this.f10875a = i10;
        this.f10876b = i11;
        this.c = pendingIntent;
        this.f10877d = str;
    }

    public static String h(int i10) {
        if (i10 != 99) {
            if (i10 != 1500) {
                switch (i10) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i10) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            default:
                                return a.g("UNKNOWN_ERROR_CODE(", i10, ")");
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public final boolean d() {
        if (this.f10876b != 0 && this.c != null) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        if (this.f10876b == connectionResult.f10876b && Objects.a(this.c, connectionResult.c) && Objects.a(this.f10877d, connectionResult.f10877d)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (this.f10876b == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10876b), this.c, this.f10877d});
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.a(h(this.f10876b), "statusCode");
        toStringHelper.a(this.c, "resolution");
        toStringHelper.a(this.f10877d, PglCryptUtils.KEY_MESSAGE);
        return toStringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f10875a);
        SafeParcelWriter.f(parcel, 2, this.f10876b);
        SafeParcelWriter.i(parcel, 3, this.c, i10);
        SafeParcelWriter.j(parcel, 4, this.f10877d);
        SafeParcelWriter.p(o10, parcel);
    }

    public ConnectionResult(int i10) {
        this(1, i10, null, null);
    }

    public ConnectionResult(int i10, PendingIntent pendingIntent) {
        this(1, i10, pendingIntent, null);
    }
}
