package com.facebook.ads.internal.androidx.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public abstract class AbsSavedState implements Parcelable {
    public static byte[] A01;
    public static final AbsSavedState A02;
    public static final Parcelable.Creator<AbsSavedState> CREATOR;
    public final Parcelable A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 106);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Field.DOCPROPERTY, Field.FORMDROPDOWN, 86, Field.INCLUDEPICTURE, Field.ADVANCE, 117, 82, Field.FORMCHECKBOX, 82, Field.INCLUDEPICTURE, 6, Field.MERGESEQ, Field.FORMDROPDOWN, Field.DOCPROPERTY, 82, 6, Field.NOTEREF, Field.TOA, 82, 6, Field.INCLUDETEXT, Field.INCLUDEPICTURE, 6, Field.NOTEREF, Field.FORMDROPDOWN, 74, 74};
    }

    static {
        A01();
        A02 = new AbsSavedState() { // from class: com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState.1
        };
        CREATOR = new Parcelable.ClassLoaderCreator<AbsSavedState>() { // from class: com.facebook.ads.redexgen.X.32
            public static byte[] A00;

            static {
                A03();
            }

            public static String A02(int i10, int i11, int i12) {
                byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
                for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                    copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 78);
                }
                return new String(copyOfRange);
            }

            public static void A03() {
                A00 = new byte[]{23, 25, 20, 9, 22, -9, 24, 5, 24, 9, -60, 17, 25, 23, 24, -60, 6, 9, -60, 18, 25, 16, 16};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* renamed from: A00 */
            public final AbsSavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: A01 */
            public final AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                Parcelable superState = parcel.readParcelable(classLoader);
                if (superState == null) {
                    return AbsSavedState.A02;
                }
                throw new IllegalStateException(A02(0, 23, 86));
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* renamed from: A04 */
            public final AbsSavedState[] newArray(int i10) {
                return new AbsSavedState[i10];
            }
        };
    }

    public AbsSavedState() {
        this.A00 = null;
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable superState = parcel.readParcelable(classLoader);
        this.A00 = superState == null ? A02 : superState;
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.A00 = parcelable == A02 ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException(A00(0, 27, 76));
    }

    public final Parcelable A02() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.A00, i10);
    }
}
