package com.bytedance.adsdk.ugeno.viewpager;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: AbsSavedState.java */
/* loaded from: classes.dex */
public abstract class Qhi implements Parcelable {
    private final Parcelable cJ;
    public static final Qhi Qhi = new Qhi() { // from class: com.bytedance.adsdk.ugeno.viewpager.Qhi.1
    };
    public static final Parcelable.Creator<Qhi> CREATOR = new Parcelable.ClassLoaderCreator<Qhi>() { // from class: com.bytedance.adsdk.ugeno.viewpager.Qhi.2
        @Override // android.os.Parcelable.Creator
        /* renamed from: Qhi */
        public Qhi createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: Qhi */
        public Qhi createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return Qhi.Qhi;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: Qhi */
        public Qhi[] newArray(int i10) {
            return new Qhi[i10];
        }
    };

    public final Parcelable Qhi() {
        return this.cJ;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.cJ, i10);
    }

    private Qhi() {
        this.cJ = null;
    }

    public Qhi(Parcelable parcelable) {
        if (parcelable != null) {
            this.cJ = parcelable == Qhi ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public Qhi(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.cJ = readParcelable == null ? Qhi : readParcelable;
    }
}
