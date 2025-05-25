package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: FragmentState.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class m0 implements Parcelable {
    public static final Parcelable.Creator<m0> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f3870a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3871b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3872d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3873e;

    /* renamed from: f  reason: collision with root package name */
    public final String f3874f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3875g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3876h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f3877i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f3878j;

    /* renamed from: k  reason: collision with root package name */
    public final int f3879k;

    /* renamed from: l  reason: collision with root package name */
    public final String f3880l;

    /* renamed from: m  reason: collision with root package name */
    public final int f3881m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f3882n;

    /* compiled from: FragmentState.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<m0> {
        @Override // android.os.Parcelable.Creator
        public final m0 createFromParcel(Parcel parcel) {
            return new m0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final m0[] newArray(int i10) {
            return new m0[i10];
        }
    }

    public m0(Fragment fragment) {
        this.f3870a = fragment.getClass().getName();
        this.f3871b = fragment.f3673f;
        this.c = fragment.f3681n;
        this.f3872d = fragment.f3690w;
        this.f3873e = fragment.f3691x;
        this.f3874f = fragment.f3692y;
        this.f3875g = fragment.B;
        this.f3876h = fragment.f3680m;
        this.f3877i = fragment.A;
        this.f3878j = fragment.f3693z;
        this.f3879k = fragment.O.ordinal();
        this.f3880l = fragment.f3676i;
        this.f3881m = fragment.f3677j;
        this.f3882n = fragment.J;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f3870a);
        sb2.append(" (");
        sb2.append(this.f3871b);
        sb2.append(")}:");
        if (this.c) {
            sb2.append(" fromLayout");
        }
        int i10 = this.f3873e;
        if (i10 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i10));
        }
        String str = this.f3874f;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.f3875g) {
            sb2.append(" retainInstance");
        }
        if (this.f3876h) {
            sb2.append(" removing");
        }
        if (this.f3877i) {
            sb2.append(" detached");
        }
        if (this.f3878j) {
            sb2.append(" hidden");
        }
        String str2 = this.f3880l;
        if (str2 != null) {
            sb2.append(" targetWho=");
            sb2.append(str2);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f3881m);
        }
        if (this.f3882n) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f3870a);
        parcel.writeString(this.f3871b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.f3872d);
        parcel.writeInt(this.f3873e);
        parcel.writeString(this.f3874f);
        parcel.writeInt(this.f3875g ? 1 : 0);
        parcel.writeInt(this.f3876h ? 1 : 0);
        parcel.writeInt(this.f3877i ? 1 : 0);
        parcel.writeInt(this.f3878j ? 1 : 0);
        parcel.writeInt(this.f3879k);
        parcel.writeString(this.f3880l);
        parcel.writeInt(this.f3881m);
        parcel.writeInt(this.f3882n ? 1 : 0);
    }

    public m0(Parcel parcel) {
        this.f3870a = parcel.readString();
        this.f3871b = parcel.readString();
        this.c = parcel.readInt() != 0;
        this.f3872d = parcel.readInt();
        this.f3873e = parcel.readInt();
        this.f3874f = parcel.readString();
        this.f3875g = parcel.readInt() != 0;
        this.f3876h = parcel.readInt() != 0;
        this.f3877i = parcel.readInt() != 0;
        this.f3878j = parcel.readInt() != 0;
        this.f3879k = parcel.readInt();
        this.f3880l = parcel.readString();
        this.f3881m = parcel.readInt();
        this.f3882n = parcel.readInt() != 0;
    }
}
