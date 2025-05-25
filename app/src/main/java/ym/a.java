package ym;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.g;

/* compiled from: BlankPageInfo.kt */
/* loaded from: classes3.dex */
public final class a implements Parcelable {
    public static final C0422a CREATOR = new C0422a();

    /* renamed from: a  reason: collision with root package name */
    public Rect f32180a;

    /* renamed from: b  reason: collision with root package name */
    public int f32181b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f32182d;

    /* renamed from: e  reason: collision with root package name */
    public int f32183e;

    /* renamed from: f  reason: collision with root package name */
    public int f32184f;

    /* renamed from: g  reason: collision with root package name */
    public int f32185g;

    /* renamed from: h  reason: collision with root package name */
    public int f32186h;

    /* compiled from: BlankPageInfo.kt */
    /* renamed from: ym.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0422a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            g.e(parcel, "parcel");
            ea.a.p("P2FDYxxs", "iNTmXlYp");
            a aVar = new a();
            aVar.f32180a = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
            aVar.f32181b = parcel.readInt();
            aVar.c = parcel.readInt();
            aVar.f32182d = parcel.readInt();
            aVar.f32183e = parcel.readInt();
            aVar.f32184f = parcel.readInt();
            aVar.f32185g = parcel.readInt();
            aVar.f32186h = parcel.readInt();
            return aVar;
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        g.e(parcel, "parcel");
        parcel.writeParcelable(this.f32180a, i10);
        parcel.writeInt(this.f32181b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.f32182d);
        parcel.writeInt(this.f32183e);
        parcel.writeInt(this.f32184f);
        parcel.writeInt(this.f32185g);
        parcel.writeInt(this.f32186h);
    }
}
