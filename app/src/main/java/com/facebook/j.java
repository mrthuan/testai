package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.q;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.tom_roush.fontbox.ttf.NamingTable;
import org.json.JSONObject;

/* compiled from: Profile.kt */
/* loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f9825a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9826b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9827d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9828e;

    /* renamed from: f  reason: collision with root package name */
    public final Uri f9829f;

    /* renamed from: g  reason: collision with root package name */
    public final Uri f9830g;

    /* compiled from: Profile.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel source) {
            kotlin.jvm.internal.g.e(source, "source");
            return new j(source);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i10) {
            return new j[i10];
        }
    }

    public j(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        q.d(str, FacebookMediationAdapter.KEY_ID);
        this.f9825a = str;
        this.f9826b = str2;
        this.c = str3;
        this.f9827d = str4;
        this.f9828e = str5;
        this.f9829f = uri;
        this.f9830g = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        String str5 = this.f9825a;
        if (((str5 == null && ((j) obj).f9825a == null) || kotlin.jvm.internal.g.a(str5, ((j) obj).f9825a)) && ((((str = this.f9826b) == null && ((j) obj).f9826b == null) || kotlin.jvm.internal.g.a(str, ((j) obj).f9826b)) && ((((str2 = this.c) == null && ((j) obj).c == null) || kotlin.jvm.internal.g.a(str2, ((j) obj).c)) && ((((str3 = this.f9827d) == null && ((j) obj).f9827d == null) || kotlin.jvm.internal.g.a(str3, ((j) obj).f9827d)) && ((((str4 = this.f9828e) == null && ((j) obj).f9828e == null) || kotlin.jvm.internal.g.a(str4, ((j) obj).f9828e)) && ((((uri = this.f9829f) == null && ((j) obj).f9829f == null) || kotlin.jvm.internal.g.a(uri, ((j) obj).f9829f)) && (((uri2 = this.f9830g) == null && ((j) obj).f9830g == null) || kotlin.jvm.internal.g.a(uri2, ((j) obj).f9830g)))))))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f9825a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i11 = 527 + i10;
        String str2 = this.f9826b;
        if (str2 != null) {
            i11 = (i11 * 31) + str2.hashCode();
        }
        String str3 = this.c;
        if (str3 != null) {
            i11 = (i11 * 31) + str3.hashCode();
        }
        String str4 = this.f9827d;
        if (str4 != null) {
            i11 = (i11 * 31) + str4.hashCode();
        }
        String str5 = this.f9828e;
        if (str5 != null) {
            i11 = (i11 * 31) + str5.hashCode();
        }
        Uri uri = this.f9829f;
        if (uri != null) {
            i11 = (i11 * 31) + uri.hashCode();
        }
        Uri uri2 = this.f9830g;
        if (uri2 != null) {
            return (i11 * 31) + uri2.hashCode();
        }
        return i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        String str;
        kotlin.jvm.internal.g.e(dest, "dest");
        dest.writeString(this.f9825a);
        dest.writeString(this.f9826b);
        dest.writeString(this.c);
        dest.writeString(this.f9827d);
        dest.writeString(this.f9828e);
        String str2 = null;
        Uri uri = this.f9829f;
        if (uri != null) {
            str = uri.toString();
        } else {
            str = null;
        }
        dest.writeString(str);
        Uri uri2 = this.f9830g;
        if (uri2 != null) {
            str2 = uri2.toString();
        }
        dest.writeString(str2);
    }

    public j(JSONObject jSONObject) {
        this.f9825a = jSONObject.optString(FacebookMediationAdapter.KEY_ID, null);
        this.f9826b = jSONObject.optString("first_name", null);
        this.c = jSONObject.optString("middle_name", null);
        this.f9827d = jSONObject.optString("last_name", null);
        this.f9828e = jSONObject.optString(NamingTable.TAG, null);
        String optString = jSONObject.optString("link_uri", null);
        this.f9829f = optString == null ? null : Uri.parse(optString);
        String optString2 = jSONObject.optString("picture_uri", null);
        this.f9830g = optString2 != null ? Uri.parse(optString2) : null;
    }

    public j(Parcel parcel) {
        this.f9825a = parcel.readString();
        this.f9826b = parcel.readString();
        this.c = parcel.readString();
        this.f9827d = parcel.readString();
        this.f9828e = parcel.readString();
        String readString = parcel.readString();
        this.f9829f = readString == null ? null : Uri.parse(readString);
        String readString2 = parcel.readString();
        this.f9830g = readString2 != null ? Uri.parse(readString2) : null;
    }
}
