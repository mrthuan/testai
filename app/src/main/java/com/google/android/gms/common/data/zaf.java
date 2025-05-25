package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zaf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 1000) {
                                SafeParcelReader.s(readInt, parcel);
                            } else {
                                i10 = SafeParcelReader.o(readInt, parcel);
                            }
                        } else {
                            bundle = SafeParcelReader.b(readInt, parcel);
                        }
                    } else {
                        i11 = SafeParcelReader.o(readInt, parcel);
                    }
                } else {
                    cursorWindowArr = (CursorWindow[]) SafeParcelReader.i(parcel, readInt, CursorWindow.CREATOR);
                }
            } else {
                strArr = SafeParcelReader.g(readInt, parcel);
            }
        }
        SafeParcelReader.k(t4, parcel);
        DataHolder dataHolder = new DataHolder(i10, strArr, cursorWindowArr, i11, bundle);
        dataHolder.c = new Bundle();
        int i12 = 0;
        while (true) {
            String[] strArr2 = dataHolder.f11166b;
            if (i12 >= strArr2.length) {
                break;
            }
            dataHolder.c.putInt(strArr2[i12], i12);
            i12++;
        }
        CursorWindow[] cursorWindowArr2 = dataHolder.f11167d;
        dataHolder.f11170g = new int[cursorWindowArr2.length];
        int i13 = 0;
        for (int i14 = 0; i14 < cursorWindowArr2.length; i14++) {
            dataHolder.f11170g[i14] = i13;
            i13 += cursorWindowArr2[i14].getNumRows() - (i13 - cursorWindowArr2[i14].getStartPosition());
        }
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new DataHolder[i10];
    }
}
