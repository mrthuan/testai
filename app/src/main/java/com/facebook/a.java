package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.internal.p;
import com.facebook.internal.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AccessToken.kt */
/* loaded from: classes.dex */
public final class a implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    public final Date f9423a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<String> f9424b;
    public final Set<String> c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<String> f9425d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9426e;

    /* renamed from: f  reason: collision with root package name */
    public final AccessTokenSource f9427f;

    /* renamed from: g  reason: collision with root package name */
    public final Date f9428g;

    /* renamed from: h  reason: collision with root package name */
    public final String f9429h;

    /* renamed from: i  reason: collision with root package name */
    public final String f9430i;

    /* renamed from: j  reason: collision with root package name */
    public final Date f9431j;

    /* renamed from: k  reason: collision with root package name */
    public final String f9432k;

    /* renamed from: l  reason: collision with root package name */
    public static final Date f9420l = new Date(Long.MAX_VALUE);

    /* renamed from: m  reason: collision with root package name */
    public static final Date f9421m = new Date();

    /* renamed from: n  reason: collision with root package name */
    public static final AccessTokenSource f9422n = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    public static final Parcelable.Creator<a> CREATOR = new C0139a();

    /* compiled from: AccessToken.kt */
    /* renamed from: com.facebook.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0139a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel source) {
            kotlin.jvm.internal.g.e(source, "source");
            return new a(source);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* compiled from: AccessToken.kt */
    /* loaded from: classes.dex */
    public static final class b {
        public static a a(JSONObject jSONObject) {
            ArrayList w7;
            if (jSONObject.getInt("version") <= 1) {
                String token = jSONObject.getString("token");
                Date date = new Date(jSONObject.getLong("expires_at"));
                JSONArray permissionsArray = jSONObject.getJSONArray("permissions");
                JSONArray declinedPermissionsArray = jSONObject.getJSONArray("declined_permissions");
                JSONArray optJSONArray = jSONObject.optJSONArray("expired_permissions");
                Date date2 = new Date(jSONObject.getLong("last_refresh"));
                String string = jSONObject.getString("source");
                kotlin.jvm.internal.g.d(string, "jsonObject.getString(SOURCE_KEY)");
                AccessTokenSource valueOf = AccessTokenSource.valueOf(string);
                String applicationId = jSONObject.getString("application_id");
                String userId = jSONObject.getString("user_id");
                Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0L));
                String optString = jSONObject.optString("graph_domain", null);
                kotlin.jvm.internal.g.d(token, "token");
                kotlin.jvm.internal.g.d(applicationId, "applicationId");
                kotlin.jvm.internal.g.d(userId, "userId");
                kotlin.jvm.internal.g.d(permissionsArray, "permissionsArray");
                ArrayList w10 = p.w(permissionsArray);
                kotlin.jvm.internal.g.d(declinedPermissionsArray, "declinedPermissionsArray");
                ArrayList w11 = p.w(declinedPermissionsArray);
                if (optJSONArray == null) {
                    w7 = new ArrayList();
                } else {
                    w7 = p.w(optJSONArray);
                }
                return new a(token, applicationId, userId, w10, w11, w7, valueOf, date, date2, date3, optString);
            }
            throw new FacebookException("Unknown AccessToken serialization format.");
        }

        public static a b() {
            return com.facebook.c.f9675f.a().c;
        }

        public static boolean c() {
            a aVar = com.facebook.c.f9675f.a().c;
            if (aVar != null && !new Date().after(aVar.f9423a)) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: AccessToken.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9433a;

        static {
            int[] iArr = new int[AccessTokenSource.values().length];
            try {
                iArr[AccessTokenSource.FACEBOOK_APPLICATION_WEB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccessTokenSource.CHROME_CUSTOM_TAB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccessTokenSource.WEB_VIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9433a = iArr;
        }
    }

    public /* synthetic */ a(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, accessTokenSource, date, date2, date3, "facebook");
    }

    public static String a() {
        throw null;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.f9426e);
        jSONObject.put("expires_at", this.f9423a.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.f9424b));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.c));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.f9425d));
        jSONObject.put("last_refresh", this.f9428g.getTime());
        jSONObject.put("source", this.f9427f.name());
        jSONObject.put("application_id", this.f9429h);
        jSONObject.put("user_id", this.f9430i);
        jSONObject.put("data_access_expiration_time", this.f9431j.getTime());
        String str = this.f9432k;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean a10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (kotlin.jvm.internal.g.a(this.f9423a, aVar.f9423a) && kotlin.jvm.internal.g.a(this.f9424b, aVar.f9424b) && kotlin.jvm.internal.g.a(this.c, aVar.c) && kotlin.jvm.internal.g.a(this.f9425d, aVar.f9425d) && kotlin.jvm.internal.g.a(this.f9426e, aVar.f9426e) && this.f9427f == aVar.f9427f && kotlin.jvm.internal.g.a(this.f9428g, aVar.f9428g) && kotlin.jvm.internal.g.a(this.f9429h, aVar.f9429h) && kotlin.jvm.internal.g.a(this.f9430i, aVar.f9430i) && kotlin.jvm.internal.g.a(this.f9431j, aVar.f9431j)) {
            String str = this.f9432k;
            String str2 = aVar.f9432k;
            if (str == null) {
                if (str2 == null) {
                    a10 = true;
                } else {
                    a10 = false;
                }
            } else {
                a10 = kotlin.jvm.internal.g.a(str, str2);
            }
            if (a10) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f9424b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.f9425d.hashCode();
        int h10 = androidx.activity.f.h(this.f9426e, (hashCode3 + ((hashCode2 + ((hashCode + ((this.f9423a.hashCode() + 527) * 31)) * 31)) * 31)) * 31, 31);
        int hashCode4 = this.f9428g.hashCode();
        int hashCode5 = (this.f9431j.hashCode() + androidx.activity.f.h(this.f9430i, androidx.activity.f.h(this.f9429h, (hashCode4 + ((this.f9427f.hashCode() + h10) * 31)) * 31, 31), 31)) * 31;
        String str = this.f9432k;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode5 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{AccessToken token:ACCESS_TOKEN_REMOVED permissions:[");
        d.h(LoggingBehavior.INCLUDE_ACCESS_TOKENS);
        sb2.append(TextUtils.join(", ", this.f9424b));
        sb2.append("]}");
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g.d(sb3, "builder.toString()");
        return sb3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.g.e(dest, "dest");
        dest.writeLong(this.f9423a.getTime());
        dest.writeStringList(new ArrayList(this.f9424b));
        dest.writeStringList(new ArrayList(this.c));
        dest.writeStringList(new ArrayList(this.f9425d));
        dest.writeString(this.f9426e);
        dest.writeString(this.f9427f.name());
        dest.writeLong(this.f9428g.getTime());
        dest.writeString(this.f9429h);
        dest.writeString(this.f9430i);
        dest.writeLong(this.f9431j.getTime());
        dest.writeString(this.f9432k);
    }

    public a(String accessToken, String applicationId, String userId, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3, String str) {
        kotlin.jvm.internal.g.e(accessToken, "accessToken");
        kotlin.jvm.internal.g.e(applicationId, "applicationId");
        kotlin.jvm.internal.g.e(userId, "userId");
        q.a(accessToken, "accessToken");
        q.a(applicationId, "applicationId");
        q.a(userId, "userId");
        Date date4 = f9420l;
        this.f9423a = date == null ? date4 : date;
        Set<String> unmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        kotlin.jvm.internal.g.d(unmodifiableSet, "unmodifiableSet(if (perm…missions) else HashSet())");
        this.f9424b = unmodifiableSet;
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        kotlin.jvm.internal.g.d(unmodifiableSet2, "unmodifiableSet(\n       …missions) else HashSet())");
        this.c = unmodifiableSet2;
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        kotlin.jvm.internal.g.d(unmodifiableSet3, "unmodifiableSet(\n       …missions) else HashSet())");
        this.f9425d = unmodifiableSet3;
        this.f9426e = accessToken;
        accessTokenSource = accessTokenSource == null ? f9422n : accessTokenSource;
        if (str != null && str.equals("instagram")) {
            int i10 = c.f9433a[accessTokenSource.ordinal()];
            if (i10 == 1) {
                accessTokenSource = AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
            } else if (i10 == 2) {
                accessTokenSource = AccessTokenSource.INSTAGRAM_CUSTOM_CHROME_TAB;
            } else if (i10 == 3) {
                accessTokenSource = AccessTokenSource.INSTAGRAM_WEB_VIEW;
            }
        }
        this.f9427f = accessTokenSource;
        this.f9428g = date2 == null ? f9421m : date2;
        this.f9429h = applicationId;
        this.f9430i = userId;
        this.f9431j = (date3 == null || date3.getTime() == 0) ? date4 : date3;
        this.f9432k = str == null ? "facebook" : str;
    }

    public a(Parcel parcel) {
        AccessTokenSource accessTokenSource;
        kotlin.jvm.internal.g.e(parcel, "parcel");
        this.f9423a = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        kotlin.jvm.internal.g.d(unmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.f9424b = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        kotlin.jvm.internal.g.d(unmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.c = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        kotlin.jvm.internal.g.d(unmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.f9425d = unmodifiableSet3;
        String readString = parcel.readString();
        q.d(readString, "token");
        this.f9426e = readString;
        String readString2 = parcel.readString();
        if (readString2 != null) {
            accessTokenSource = AccessTokenSource.valueOf(readString2);
        } else {
            accessTokenSource = f9422n;
        }
        this.f9427f = accessTokenSource;
        this.f9428g = new Date(parcel.readLong());
        String readString3 = parcel.readString();
        q.d(readString3, "applicationId");
        this.f9429h = readString3;
        String readString4 = parcel.readString();
        q.d(readString4, "userId");
        this.f9430i = readString4;
        this.f9431j = new Date(parcel.readLong());
        this.f9432k = parcel.readString();
    }
}
