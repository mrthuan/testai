package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements Api.ApiOptions.Optional, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: k  reason: collision with root package name */
    public static final Scope f10813k;

    /* renamed from: l  reason: collision with root package name */
    public static final Scope f10814l;
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    public final int f10815a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f10816b;
    @SafeParcelable.Field
    public final Account c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final boolean f10817d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final boolean f10818e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final boolean f10819f;
    @SafeParcelable.Field

    /* renamed from: g  reason: collision with root package name */
    public final String f10820g;
    @SafeParcelable.Field

    /* renamed from: h  reason: collision with root package name */
    public final String f10821h;
    @SafeParcelable.Field

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f10822i;
    @SafeParcelable.Field

    /* renamed from: j  reason: collision with root package name */
    public final String f10823j;

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final HashSet f10824a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        public final HashMap f10825b = new HashMap();

        public final void a() {
            HashSet hashSet = this.f10824a;
            if (hashSet.contains(GoogleSignInOptions.f10814l)) {
                Scope scope = GoogleSignInOptions.f10813k;
                if (hashSet.contains(scope)) {
                    hashSet.remove(scope);
                }
            }
            new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, this.f10825b, null);
        }
    }

    static {
        Scope scope = new Scope(1, "profile");
        new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        f10813k = scope3;
        f10814l = new Scope(1, "https://www.googleapis.com/auth/games");
        Builder builder = new Builder();
        HashSet hashSet = builder.f10824a;
        hashSet.add(scope2);
        hashSet.add(scope);
        builder.a();
        Builder builder2 = new Builder();
        HashSet hashSet2 = builder2.f10824a;
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        builder2.a();
        CREATOR = new zae();
    }

    public GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, HashMap hashMap, String str3) {
        this.f10815a = i10;
        this.f10816b = arrayList;
        this.c = account;
        this.f10817d = z10;
        this.f10818e = z11;
        this.f10819f = z12;
        this.f10820g = str;
        this.f10821h = str2;
        this.f10822i = new ArrayList(hashMap.values());
        this.f10823j = str3;
    }

    public final boolean equals(Object obj) {
        String str = this.f10820g;
        ArrayList arrayList = this.f10816b;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.f10822i.isEmpty()) {
                ArrayList arrayList2 = googleSignInOptions.f10822i;
                ArrayList arrayList3 = googleSignInOptions.f10816b;
                if (arrayList2.isEmpty() && arrayList.size() == new ArrayList(arrayList3).size() && arrayList.containsAll(new ArrayList(arrayList3))) {
                    Account account = this.c;
                    Account account2 = googleSignInOptions.c;
                    if (account != null ? account.equals(account2) : account2 == null) {
                        boolean isEmpty = TextUtils.isEmpty(str);
                        String str2 = googleSignInOptions.f10820g;
                        if (isEmpty) {
                            if (TextUtils.isEmpty(str2)) {
                            }
                        } else if (!str.equals(str2)) {
                        }
                        if (this.f10819f == googleSignInOptions.f10819f && this.f10817d == googleSignInOptions.f10817d && this.f10818e == googleSignInOptions.f10818e) {
                            if (TextUtils.equals(this.f10823j, googleSignInOptions.f10823j)) {
                                return true;
                            }
                        }
                    }
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f10816b;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).f10920b);
        }
        Collections.sort(arrayList);
        HashAccumulator hashAccumulator = new HashAccumulator();
        hashAccumulator.a(arrayList);
        hashAccumulator.a(this.c);
        hashAccumulator.a(this.f10820g);
        hashAccumulator.f10828a = (((((hashAccumulator.f10828a * 31) + (this.f10819f ? 1 : 0)) * 31) + (this.f10817d ? 1 : 0)) * 31) + (this.f10818e ? 1 : 0);
        hashAccumulator.a(this.f10823j);
        return hashAccumulator.f10828a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f10815a);
        SafeParcelWriter.n(parcel, 2, new ArrayList(this.f10816b));
        SafeParcelWriter.i(parcel, 3, this.c, i10);
        SafeParcelWriter.a(parcel, 4, this.f10817d);
        SafeParcelWriter.a(parcel, 5, this.f10818e);
        SafeParcelWriter.a(parcel, 6, this.f10819f);
        SafeParcelWriter.j(parcel, 7, this.f10820g);
        SafeParcelWriter.j(parcel, 8, this.f10821h);
        SafeParcelWriter.n(parcel, 9, this.f10822i);
        SafeParcelWriter.j(parcel, 10, this.f10823j);
        SafeParcelWriter.p(o10, parcel);
    }
}
