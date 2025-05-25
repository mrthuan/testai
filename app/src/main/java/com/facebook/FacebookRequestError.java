package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.b;
import java.util.Map;
import java.util.Set;

/* compiled from: FacebookRequestError.kt */
/* loaded from: classes.dex */
public final class FacebookRequestError implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    public final int f9409a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9410b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9411d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9412e;

    /* renamed from: f  reason: collision with root package name */
    public final String f9413f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f9414g;

    /* renamed from: h  reason: collision with root package name */
    public final String f9415h;

    /* renamed from: i  reason: collision with root package name */
    public final FacebookException f9416i;

    /* renamed from: j  reason: collision with root package name */
    public static final b f9408j = new b();
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new a();

    /* compiled from: FacebookRequestError.kt */
    /* loaded from: classes.dex */
    public enum Category {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    /* compiled from: FacebookRequestError.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<FacebookRequestError> {
        @Override // android.os.Parcelable.Creator
        public final FacebookRequestError createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.g.e(parcel, "parcel");
            return new FacebookRequestError(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, false);
        }

        @Override // android.os.Parcelable.Creator
        public final FacebookRequestError[] newArray(int i10) {
            return new FacebookRequestError[i10];
        }
    }

    /* compiled from: FacebookRequestError.kt */
    /* loaded from: classes.dex */
    public static final class b {
        public final synchronized com.facebook.internal.b a() {
            com.facebook.internal.f b10 = FetchedAppSettingsManager.b(d.b());
            if (b10 == null) {
                return com.facebook.internal.b.f9753d.a();
            }
            return b10.f9768d;
        }
    }

    public FacebookRequestError(int i10, int i11, int i12, String str, String str2, String str3, String str4, Object obj, FacebookException facebookException, boolean z10) {
        boolean z11;
        com.facebook.internal.b bVar;
        Category category;
        Set<Integer> set;
        Set<Integer> set2;
        Set<Integer> set3;
        this.f9409a = i10;
        this.f9410b = i11;
        this.c = i12;
        this.f9411d = str;
        this.f9412e = str3;
        this.f9413f = str4;
        this.f9414g = obj;
        this.f9415h = str2;
        if (facebookException != null) {
            this.f9416i = facebookException;
            z11 = true;
        } else {
            this.f9416i = new FacebookServiceException(this, a());
            z11 = false;
        }
        b bVar2 = f9408j;
        if (z11) {
            category = Category.OTHER;
        } else {
            synchronized (bVar2) {
                com.facebook.internal.f b10 = FetchedAppSettingsManager.b(d.b());
                if (b10 == null) {
                    bVar = com.facebook.internal.b.f9753d.a();
                } else {
                    bVar = b10.f9768d;
                }
            }
            if (z10) {
                bVar.getClass();
                category = Category.TRANSIENT;
            } else {
                Map<Integer, Set<Integer>> map = bVar.f9755a;
                if (map != null && map.containsKey(Integer.valueOf(i11)) && ((set3 = map.get(Integer.valueOf(i11))) == null || set3.contains(Integer.valueOf(i12)))) {
                    category = Category.OTHER;
                } else {
                    Map<Integer, Set<Integer>> map2 = bVar.c;
                    if (map2 != null && map2.containsKey(Integer.valueOf(i11)) && ((set2 = map2.get(Integer.valueOf(i11))) == null || set2.contains(Integer.valueOf(i12)))) {
                        category = Category.LOGIN_RECOVERABLE;
                    } else {
                        Map<Integer, Set<Integer>> map3 = bVar.f9756b;
                        if (map3 != null && map3.containsKey(Integer.valueOf(i11)) && ((set = map3.get(Integer.valueOf(i11))) == null || set.contains(Integer.valueOf(i12)))) {
                            category = Category.TRANSIENT;
                        } else {
                            category = Category.OTHER;
                        }
                    }
                }
            }
        }
        bVar2.a().getClass();
        if (category == null) {
            return;
        }
        int i13 = b.C0147b.f9757a[category.ordinal()];
    }

    public final String a() {
        String str = this.f9415h;
        if (str == null) {
            FacebookException facebookException = this.f9416i;
            if (facebookException != null) {
                return facebookException.getLocalizedMessage();
            }
            return null;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str = "{HttpStatus: " + this.f9409a + ", errorCode: " + this.f9410b + ", subErrorCode: " + this.c + ", errorType: " + this.f9411d + ", errorMessage: " + a() + "}";
        kotlin.jvm.internal.g.d(str, "StringBuilder(\"{HttpStat…(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        kotlin.jvm.internal.g.e(out, "out");
        out.writeInt(this.f9409a);
        out.writeInt(this.f9410b);
        out.writeInt(this.c);
        out.writeString(this.f9411d);
        out.writeString(a());
        out.writeString(this.f9412e);
        out.writeString(this.f9413f);
    }

    public FacebookRequestError(Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc), false);
    }
}
