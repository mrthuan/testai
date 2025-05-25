package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f1737a;

    /* renamed from: b  reason: collision with root package name */
    public final float f1738b;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        public final RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final RatingCompat[] newArray(int i10) {
            return new RatingCompat[i10];
        }
    }

    public RatingCompat(int i10, float f10) {
        this.f1737a = i10;
        this.f1738b = f10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f1737a;
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.f1737a);
        sb2.append(" rating=");
        float f10 = this.f1738b;
        if (f10 < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f10);
        }
        sb2.append(valueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f1737a);
        parcel.writeFloat(this.f1738b);
    }
}
