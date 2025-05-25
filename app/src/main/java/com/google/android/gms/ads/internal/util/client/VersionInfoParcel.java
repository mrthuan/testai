package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes.dex */
public final class VersionInfoParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VersionInfoParcel> CREATOR = new zzs();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final String f10345a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final int f10346b;
    @SafeParcelable.Field
    public final int c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final boolean f10347d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final boolean f10348e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public VersionInfoParcel(boolean r9, int r10, int r11, boolean r12) {
        /*
            r8 = this;
            if (r9 == 0) goto L5
            java.lang.String r0 = "0"
            goto L7
        L5:
            java.lang.String r0 = "1"
        L7:
            java.lang.String r1 = "afma-sdk-a-v"
            java.lang.String r2 = "."
            java.lang.StringBuilder r1 = a0.d.f(r1, r10, r2, r11, r2)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            r2 = r8
            r4 = r10
            r5 = r11
            r6 = r9
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.client.VersionInfoParcel.<init>(boolean, int, int, boolean):void");
    }

    public static VersionInfoParcel d() {
        return new VersionInfoParcel(12451000, 12451000, true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.j(parcel, 2, this.f10345a);
        SafeParcelWriter.f(parcel, 3, this.f10346b);
        SafeParcelWriter.f(parcel, 4, this.c);
        SafeParcelWriter.a(parcel, 5, this.f10347d);
        SafeParcelWriter.a(parcel, 6, this.f10348e);
        SafeParcelWriter.p(o10, parcel);
    }

    public VersionInfoParcel(int i10, int i11, boolean z10) {
        this(z10, i10, i11, false);
    }

    public VersionInfoParcel(int i10, boolean z10) {
        this(true, 242402000, i10, z10);
    }

    @SafeParcelable.Constructor
    public VersionInfoParcel(@SafeParcelable.Param String str, @SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param boolean z10, @SafeParcelable.Param boolean z11) {
        this.f10345a = str;
        this.f10346b = i10;
        this.c = i11;
        this.f10347d = z10;
        this.f10348e = z11;
    }
}
