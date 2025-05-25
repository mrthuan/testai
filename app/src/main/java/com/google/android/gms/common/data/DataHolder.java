package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@KeepForSdk
@KeepName
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new zaf();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    public final int f11165a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String[] f11166b;
    public Bundle c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final CursorWindow[] f11167d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final int f11168e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final Bundle f11169f;

    /* renamed from: g  reason: collision with root package name */
    public int[] f11170g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f11171h = false;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f11172i = true;

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @KeepForSdk
    /* loaded from: classes.dex */
    public static class Builder {
        public /* synthetic */ Builder() {
            throw null;
        }
    }

    static {
        new ArrayList();
        new HashMap();
    }

    @SafeParcelable.Constructor
    public DataHolder(@SafeParcelable.Param int i10, @SafeParcelable.Param String[] strArr, @SafeParcelable.Param CursorWindow[] cursorWindowArr, @SafeParcelable.Param int i11, @SafeParcelable.Param Bundle bundle) {
        this.f11165a = i10;
        this.f11166b = strArr;
        this.f11167d = cursorWindowArr;
        this.f11168e = i11;
        this.f11169f = bundle;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @KeepForSdk
    public final void close() {
        synchronized (this) {
            if (!this.f11171h) {
                this.f11171h = true;
                int i10 = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f11167d;
                    if (i10 >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i10].close();
                    i10++;
                }
            }
        }
    }

    public final void finalize() {
        boolean z10;
        try {
            if (this.f11172i && this.f11167d.length > 0) {
                synchronized (this) {
                    z10 = this.f11171h;
                }
                if (!z10) {
                    close();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.k(parcel, 1, this.f11166b);
        SafeParcelWriter.m(parcel, 2, this.f11167d, i10);
        SafeParcelWriter.f(parcel, 3, this.f11168e);
        SafeParcelWriter.b(parcel, 4, this.f11169f);
        SafeParcelWriter.f(parcel, 1000, this.f11165a);
        SafeParcelWriter.p(o10, parcel);
        if ((i10 & 1) != 0) {
            close();
        }
    }
}
