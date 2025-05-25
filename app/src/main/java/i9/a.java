package i9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import y.i;

/* compiled from: ExtendableSavedState.java */
/* loaded from: classes2.dex */
public final class a extends c1.a {
    public static final Parcelable.Creator<a> CREATOR = new C0248a();
    public final i<String, Bundle> c;

    /* compiled from: ExtendableSavedState.java */
    /* renamed from: i9.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0248a implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.ClassLoaderCreator
        public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i10) {
            return new a[i10];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.c = new i<>();
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.c + "}";
    }

    @Override // c1.a, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f5506a, i10);
        i<String, Bundle> iVar = this.c;
        int i11 = iVar.c;
        parcel.writeInt(i11);
        String[] strArr = new String[i11];
        Bundle[] bundleArr = new Bundle[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            strArr[i12] = iVar.h(i12);
            bundleArr[i12] = iVar.l(i12);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.c = new i<>(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.c.put(strArr[i10], bundleArr[i10]);
        }
    }
}
