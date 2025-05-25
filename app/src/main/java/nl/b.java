package nl;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: FileModel.kt */
/* loaded from: classes3.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f22581a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22582b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f22583d;

    /* renamed from: e  reason: collision with root package name */
    public final long f22584e;

    /* renamed from: f  reason: collision with root package name */
    public final long f22585f;

    /* renamed from: g  reason: collision with root package name */
    public final String f22586g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f22587h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f22588i;

    /* renamed from: j  reason: collision with root package name */
    public final long f22589j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f22590k;

    /* renamed from: l  reason: collision with root package name */
    public final long f22591l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f22592m;

    /* renamed from: n  reason: collision with root package name */
    public int f22593n;

    /* renamed from: o  reason: collision with root package name */
    public int f22594o;

    /* renamed from: p  reason: collision with root package name */
    public int f22595p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f22596q;

    /* compiled from: FileModel.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            kotlin.jvm.internal.g.e(parcel, "parcel");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            long readLong2 = parcel.readLong();
            long readLong3 = parcel.readLong();
            String readString4 = parcel.readString();
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            long readLong4 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            long readLong5 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            return new b(readLong, readString, readString2, readString3, readLong2, readLong3, readString4, z10, z11, readLong4, z12, readLong5, z13, readInt, readInt2, readInt3, z14);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(long j10, String str, String str2, String str3, long j11, long j12, String str4, boolean z10, boolean z11, long j13, boolean z12, long j14, boolean z13, int i10, int i11, int i12, boolean z14) {
        kotlin.jvm.internal.g.e(str, ea.a.p("QmEbaA==", "J72oemp4"));
        kotlin.jvm.internal.g.e(str2, ea.a.p("AGEUZSNpTWgNeHQ=", "7Dnyt9pl"));
        kotlin.jvm.internal.g.e(str3, ea.a.p("IWFcZS5pQ2g1dT5FDXQ=", "PWvwdipX"));
        kotlin.jvm.internal.g.e(str4, ea.a.p("KWldZS15R2U=", "ciXWTIbl"));
        this.f22581a = j10;
        this.f22582b = str;
        this.c = str2;
        this.f22583d = str3;
        this.f22584e = j11;
        this.f22585f = j12;
        this.f22586g = str4;
        this.f22587h = z10;
        this.f22588i = z11;
        this.f22589j = j13;
        this.f22590k = z12;
        this.f22591l = j14;
        this.f22592m = z13;
        this.f22593n = i10;
        this.f22594o = i11;
        this.f22595p = i12;
        this.f22596q = z14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f22581a == bVar.f22581a && kotlin.jvm.internal.g.a(this.f22582b, bVar.f22582b) && kotlin.jvm.internal.g.a(this.c, bVar.c) && kotlin.jvm.internal.g.a(this.f22583d, bVar.f22583d) && this.f22584e == bVar.f22584e && this.f22585f == bVar.f22585f && kotlin.jvm.internal.g.a(this.f22586g, bVar.f22586g) && this.f22587h == bVar.f22587h && this.f22588i == bVar.f22588i && this.f22589j == bVar.f22589j && this.f22590k == bVar.f22590k && this.f22591l == bVar.f22591l && this.f22592m == bVar.f22592m && this.f22593n == bVar.f22593n && this.f22594o == bVar.f22594o && this.f22595p == bVar.f22595p && this.f22596q == bVar.f22596q) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        long j10 = this.f22581a;
        int h10 = androidx.activity.f.h(this.f22583d, androidx.activity.f.h(this.c, androidx.activity.f.h(this.f22582b, ((int) (j10 ^ (j10 >>> 32))) * 31, 31), 31), 31);
        long j11 = this.f22584e;
        long j12 = this.f22585f;
        int h11 = androidx.activity.f.h(this.f22586g, (((h10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31, 31);
        int i10 = 1;
        boolean z10 = this.f22587h;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int i12 = (h11 + i11) * 31;
        boolean z11 = this.f22588i;
        int i13 = z11;
        if (z11 != 0) {
            i13 = 1;
        }
        long j13 = this.f22589j;
        int i14 = (((i12 + i13) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        boolean z12 = this.f22590k;
        int i15 = z12;
        if (z12 != 0) {
            i15 = 1;
        }
        long j14 = this.f22591l;
        int i16 = (((i14 + i15) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        boolean z13 = this.f22592m;
        int i17 = z13;
        if (z13 != 0) {
            i17 = 1;
        }
        int i18 = (((((((i16 + i17) * 31) + this.f22593n) * 31) + this.f22594o) * 31) + this.f22595p) * 31;
        boolean z14 = this.f22596q;
        if (!z14) {
            i10 = z14 ? 1 : 0;
        }
        return i18 + i10;
    }

    public final String toString() {
        boolean z10 = this.f22592m;
        int i10 = this.f22593n;
        int i11 = this.f22594o;
        int i12 = this.f22595p;
        boolean z11 = this.f22596q;
        return "FileModel(id=" + this.f22581a + ", path=" + this.f22582b + ", nameWithExt=" + this.c + ", nameWithoutExt=" + this.f22583d + ", lastModified=" + this.f22584e + ", size=" + this.f22585f + ", fileType=" + this.f22586g + ", isLock=" + this.f22587h + ", isFavorite=" + this.f22588i + ", favoriteDate=" + this.f22589j + ", isRecent=" + this.f22590k + ", recentDate=" + this.f22591l + ", isNotificationNotFinish=" + z10 + ", notificationId=" + i10 + ", pageCount=" + i11 + ", lastReadPage=" + i12 + ", isOpenReflow=" + z11 + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        kotlin.jvm.internal.g.e(out, "out");
        out.writeLong(this.f22581a);
        out.writeString(this.f22582b);
        out.writeString(this.c);
        out.writeString(this.f22583d);
        out.writeLong(this.f22584e);
        out.writeLong(this.f22585f);
        out.writeString(this.f22586g);
        out.writeInt(this.f22587h ? 1 : 0);
        out.writeInt(this.f22588i ? 1 : 0);
        out.writeLong(this.f22589j);
        out.writeInt(this.f22590k ? 1 : 0);
        out.writeLong(this.f22591l);
        out.writeInt(this.f22592m ? 1 : 0);
        out.writeInt(this.f22593n);
        out.writeInt(this.f22594o);
        out.writeInt(this.f22595p);
        out.writeInt(this.f22596q ? 1 : 0);
    }
}
