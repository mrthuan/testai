package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.g0;
import java.util.ArrayList;

/* compiled from: FragmentManagerState.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class i0 implements Parcelable {
    public static final Parcelable.Creator<i0> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<String> f3818a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<String> f3819b;
    public b[] c;

    /* renamed from: d  reason: collision with root package name */
    public int f3820d;

    /* renamed from: e  reason: collision with root package name */
    public String f3821e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList<String> f3822f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<c> f3823g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<g0.l> f3824h;

    /* compiled from: FragmentManagerState.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<i0> {
        @Override // android.os.Parcelable.Creator
        public final i0 createFromParcel(Parcel parcel) {
            return new i0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final i0[] newArray(int i10) {
            return new i0[i10];
        }
    }

    public i0() {
        this.f3821e = null;
        this.f3822f = new ArrayList<>();
        this.f3823g = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f3818a);
        parcel.writeStringList(this.f3819b);
        parcel.writeTypedArray(this.c, i10);
        parcel.writeInt(this.f3820d);
        parcel.writeString(this.f3821e);
        parcel.writeStringList(this.f3822f);
        parcel.writeTypedList(this.f3823g);
        parcel.writeTypedList(this.f3824h);
    }

    public i0(Parcel parcel) {
        this.f3821e = null;
        this.f3822f = new ArrayList<>();
        this.f3823g = new ArrayList<>();
        this.f3818a = parcel.createStringArrayList();
        this.f3819b = parcel.createStringArrayList();
        this.c = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f3820d = parcel.readInt();
        this.f3821e = parcel.readString();
        this.f3822f = parcel.createStringArrayList();
        this.f3823g = parcel.createTypedArrayList(c.CREATOR);
        this.f3824h = parcel.createTypedArrayList(g0.l.CREATOR);
    }
}
