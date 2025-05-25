package com.facebook.ads.internal.androidx.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager$SavedState;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public class ViewPager$SavedState extends AbsSavedState {
    public static byte[] A03;
    public static final Parcelable.Creator<ViewPager$SavedState> CREATOR;
    public int A00;
    public Parcelable A01;
    public ClassLoader A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{34, 114, 109, 113, 107, 118, 107, 109, 108, Field.BARCODE, Field.FILESIZE, 113, 98, 100, 110, 102, 109, 119, Field.FORMDROPDOWN, 98, 100, 102, 113, Field.DDE, 80, 98, 117, 102, 103, 80, 119, 98, 119, 102, 120, 6};
    }

    static {
        A02();
        CREATOR = new Parcelable.ClassLoaderCreator<ViewPager$SavedState>() { // from class: com.facebook.ads.redexgen.X.3f
            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* renamed from: A00 */
            public final ViewPager$SavedState createFromParcel(Parcel parcel) {
                return new ViewPager$SavedState(parcel, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: A01 */
            public final ViewPager$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new ViewPager$SavedState(parcel, classLoader);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* renamed from: A02 */
            public final ViewPager$SavedState[] newArray(int i10) {
                return new ViewPager$SavedState[i10];
            }
        };
    }

    public ViewPager$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
        this.A00 = parcel.readInt();
        this.A01 = parcel.readParcelable(classLoader);
        this.A02 = classLoader;
    }

    public ViewPager$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public final String toString() {
        return A01(10, 25, 125) + Integer.toHexString(System.identityHashCode(this)) + A01(0, 10, 124) + this.A00 + A01(35, 1, 5);
    }

    @Override // com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, i10);
    }
}
