package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* loaded from: classes2.dex */
public final class J implements Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new I();

    /* renamed from: a  reason: collision with root package name */
    public final long f14352a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14353b;
    public Map c;

    /* renamed from: d  reason: collision with root package name */
    public String f14354d;

    /* renamed from: e  reason: collision with root package name */
    public final String f14355e;

    /* renamed from: f  reason: collision with root package name */
    public final String f14356f;

    /* renamed from: g  reason: collision with root package name */
    public String f14357g;

    /* renamed from: h  reason: collision with root package name */
    public String f14358h;

    /* renamed from: i  reason: collision with root package name */
    public String f14359i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f14360j;

    /* renamed from: k  reason: collision with root package name */
    public String f14361k;

    public J(long j10, String str, String str2, String str3, kotlin.jvm.internal.d dVar) {
        this.f14358h = "";
        this.f14359i = "activity";
        this.f14352a = j10;
        this.f14353b = str;
        this.f14355e = str2;
        this.f14353b = str == null ? "" : str;
        this.f14356f = str3;
    }

    public static /* synthetic */ void c() {
    }

    public final String d() {
        String str = this.f14357g;
        kotlin.jvm.internal.g.b(str);
        return str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f14361k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j10 = (J) obj;
        if (this.f14352a == j10.f14352a && kotlin.jvm.internal.g.a(this.f14359i, j10.f14359i) && kotlin.jvm.internal.g.a(this.f14353b, j10.f14353b) && kotlin.jvm.internal.g.a(this.f14355e, j10.f14355e)) {
            return true;
        }
        return false;
    }

    public final Map<String, String> f() {
        return this.c;
    }

    public final long g() {
        return this.f14352a;
    }

    public final String h() {
        return "im";
    }

    public int hashCode() {
        int i10;
        long j10 = this.f14352a;
        int i11 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        String str = this.f14355e;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return this.f14359i.hashCode() + ((i11 + i10) * 30);
    }

    public final String i() {
        return this.f14354d;
    }

    public final String j() {
        return this.f14359i;
    }

    public final long l() {
        return this.f14352a;
    }

    public final String m() {
        return this.f14356f;
    }

    public final String o() {
        return this.f14353b;
    }

    public final boolean p() {
        return this.f14360j;
    }

    public String toString() {
        return String.valueOf(this.f14352a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.g.e(dest, "dest");
        dest.writeLong(this.f14352a);
        dest.writeString(this.f14359i);
        dest.writeString(this.f14355e);
    }

    public final String b() {
        return this.f14355e;
    }

    public final void a(Map<String, String> map) {
        this.c = map;
    }

    public final void b(String str) {
        kotlin.jvm.internal.g.e(str, "<set-?>");
        this.f14359i = str;
    }

    public final String a() {
        return this.f14358h;
    }

    public final void a(String str) {
        kotlin.jvm.internal.g.e(str, "<set-?>");
        this.f14358h = str;
    }

    public J(Parcel parcel, kotlin.jvm.internal.d dVar) {
        this.f14358h = "";
        String str = "activity";
        this.f14359i = "activity";
        this.f14352a = parcel.readLong();
        String readString = parcel.readString();
        if (readString != null && !kotlin.jvm.internal.g.a(readString, "activity") && kotlin.jvm.internal.g.a(readString, "others")) {
            str = "others";
        }
        this.f14359i = str;
        this.f14355e = parcel.readString();
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ void n() {
    }
}
