package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f1751a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1752b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1753d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1754e;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f1751a = parcel.readInt();
        this.c = parcel.readInt();
        this.f1753d = parcel.readInt();
        this.f1754e = parcel.readInt();
        this.f1752b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f1751a);
        parcel.writeInt(this.c);
        parcel.writeInt(this.f1753d);
        parcel.writeInt(this.f1754e);
        parcel.writeInt(this.f1752b);
    }
}
