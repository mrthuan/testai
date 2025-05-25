package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    public static void a(Parcel parcel, int i10, boolean z10) {
        parcel.writeInt(i10 | 262144);
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static void b(Parcel parcel, int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int o10 = o(i10, parcel);
        parcel.writeBundle(bundle);
        p(o10, parcel);
    }

    public static void c(Parcel parcel, int i10, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int o10 = o(i10, parcel);
        parcel.writeByteArray(bArr);
        p(o10, parcel);
    }

    public static void d(Parcel parcel, int i10, float f10) {
        parcel.writeInt(i10 | 262144);
        parcel.writeFloat(f10);
    }

    public static void e(Parcel parcel, int i10, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int o10 = o(i10, parcel);
        parcel.writeStrongBinder(iBinder);
        p(o10, parcel);
    }

    public static void f(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | 262144);
        parcel.writeInt(i11);
    }

    public static void g(Parcel parcel, int i10, long j10) {
        parcel.writeInt(i10 | 524288);
        parcel.writeLong(j10);
    }

    public static void h(Parcel parcel, int i10, Long l10) {
        if (l10 == null) {
            return;
        }
        parcel.writeInt(i10 | 524288);
        parcel.writeLong(l10.longValue());
    }

    public static void i(Parcel parcel, int i10, Parcelable parcelable, int i11) {
        if (parcelable == null) {
            return;
        }
        int o10 = o(i10, parcel);
        parcelable.writeToParcel(parcel, i11);
        p(o10, parcel);
    }

    public static void j(Parcel parcel, int i10, String str) {
        if (str == null) {
            return;
        }
        int o10 = o(i10, parcel);
        parcel.writeString(str);
        p(o10, parcel);
    }

    public static void k(Parcel parcel, int i10, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int o10 = o(i10, parcel);
        parcel.writeStringArray(strArr);
        p(o10, parcel);
    }

    public static void l(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int o10 = o(i10, parcel);
        parcel.writeStringList(list);
        p(o10, parcel);
    }

    public static void m(Parcel parcel, int i10, Parcelable[] parcelableArr, int i11) {
        if (parcelableArr == null) {
            return;
        }
        int o10 = o(i10, parcel);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                q(parcel, parcelable, i11);
            }
        }
        p(o10, parcel);
    }

    public static void n(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int o10 = o(i10, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            Parcelable parcelable = (Parcelable) list.get(i11);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                q(parcel, parcelable, 0);
            }
        }
        p(o10, parcel);
    }

    public static int o(int i10, Parcel parcel) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void p(int i10, Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(dataPosition - i10);
        parcel.setDataPosition(dataPosition);
    }

    public static void q(Parcel parcel, Parcelable parcelable, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i10);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
