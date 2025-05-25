package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.DefaultClock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new zab();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    public final int f10801a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f10802b;
    @SafeParcelable.Field
    public final String c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final String f10803d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final String f10804e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final Uri f10805f;
    @SafeParcelable.Field

    /* renamed from: g  reason: collision with root package name */
    public String f10806g;
    @SafeParcelable.Field

    /* renamed from: h  reason: collision with root package name */
    public final long f10807h;
    @SafeParcelable.Field

    /* renamed from: i  reason: collision with root package name */
    public final String f10808i;
    @SafeParcelable.Field

    /* renamed from: j  reason: collision with root package name */
    public final List f10809j;
    @SafeParcelable.Field

    /* renamed from: k  reason: collision with root package name */
    public final String f10810k;
    @SafeParcelable.Field

    /* renamed from: l  reason: collision with root package name */
    public final String f10811l;

    /* renamed from: m  reason: collision with root package name */
    public final HashSet f10812m = new HashSet();

    static {
        DefaultClock defaultClock = DefaultClock.f11371a;
    }

    @SafeParcelable.Constructor
    public GoogleSignInAccount(@SafeParcelable.Param int i10, @SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param Uri uri, @SafeParcelable.Param String str5, @SafeParcelable.Param long j10, @SafeParcelable.Param String str6, @SafeParcelable.Param ArrayList arrayList, @SafeParcelable.Param String str7, @SafeParcelable.Param String str8) {
        this.f10801a = i10;
        this.f10802b = str;
        this.c = str2;
        this.f10803d = str3;
        this.f10804e = str4;
        this.f10805f = uri;
        this.f10806g = str5;
        this.f10807h = j10;
        this.f10808i = str6;
        this.f10809j = arrayList;
        this.f10810k = str7;
        this.f10811l = str8;
    }

    public static GoogleSignInAccount f(String str) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        String optString2 = jSONObject.optString(FacebookMediationAdapter.KEY_ID);
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has("email")) {
            str3 = jSONObject.optString("email");
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        Long valueOf = Long.valueOf(parseLong);
        String string = jSONObject.getString("obfuscatedIdentifier");
        long longValue = valueOf.longValue();
        Preconditions.f(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, str2, str3, str4, uri, null, longValue, string, new ArrayList(hashSet), str5, str6);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        } else {
            str7 = null;
        }
        googleSignInAccount.f10806g = str7;
        return googleSignInAccount;
    }

    @KeepForSdk
    public final HashSet d() {
        HashSet hashSet = new HashSet(this.f10809j);
        hashSet.addAll(this.f10812m);
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f10808i.equals(this.f10808i) || !googleSignInAccount.d().equals(d())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f10808i.hashCode() + 527) * 31) + d().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f10801a);
        SafeParcelWriter.j(parcel, 2, this.f10802b);
        SafeParcelWriter.j(parcel, 3, this.c);
        SafeParcelWriter.j(parcel, 4, this.f10803d);
        SafeParcelWriter.j(parcel, 5, this.f10804e);
        SafeParcelWriter.i(parcel, 6, this.f10805f, i10);
        SafeParcelWriter.j(parcel, 7, this.f10806g);
        SafeParcelWriter.g(parcel, 8, this.f10807h);
        SafeParcelWriter.j(parcel, 9, this.f10808i);
        SafeParcelWriter.n(parcel, 10, this.f10809j);
        SafeParcelWriter.j(parcel, 11, this.f10810k);
        SafeParcelWriter.j(parcel, 12, this.f10811l);
        SafeParcelWriter.p(o10, parcel);
    }
}
