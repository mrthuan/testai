package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public final class zza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        float f10 = 0.0f;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 2:
                    j10 = SafeParcelReader.p(readInt, parcel);
                    break;
                case 3:
                case 7:
                case '\t':
                default:
                    SafeParcelReader.s(readInt, parcel);
                    break;
                case 4:
                    str = SafeParcelReader.f(readInt, parcel);
                    break;
                case 5:
                    i12 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 6:
                    arrayList = SafeParcelReader.h(readInt, parcel);
                    break;
                case '\b':
                    j11 = SafeParcelReader.p(readInt, parcel);
                    break;
                case '\n':
                    str3 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 11:
                    i11 = SafeParcelReader.o(readInt, parcel);
                    break;
                case '\f':
                    str2 = SafeParcelReader.f(readInt, parcel);
                    break;
                case '\r':
                    str4 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 14:
                    i13 = SafeParcelReader.o(readInt, parcel);
                    break;
                case 15:
                    f10 = SafeParcelReader.m(readInt, parcel);
                    break;
                case 16:
                    j12 = SafeParcelReader.p(readInt, parcel);
                    break;
                case 17:
                    str5 = SafeParcelReader.f(readInt, parcel);
                    break;
                case 18:
                    z10 = SafeParcelReader.l(readInt, parcel);
                    break;
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new WakeLockEvent(i10, j10, i11, str, i12, arrayList, str2, j11, i13, str3, str4, f10, j12, str5, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new WakeLockEvent[i10];
    }
}
