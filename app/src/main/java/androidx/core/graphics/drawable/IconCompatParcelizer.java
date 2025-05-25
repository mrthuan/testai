package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import h2.a;
import java.nio.charset.Charset;
import lib.zj.office.fc.codec.CharEncoding;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f3531a = aVar.j(iconCompat.f3531a, 1);
        byte[] bArr = iconCompat.c;
        if (aVar.h(2)) {
            bArr = aVar.f();
        }
        iconCompat.c = bArr;
        Parcelable parcelable = iconCompat.f3533d;
        if (aVar.h(3)) {
            parcelable = aVar.k();
        }
        iconCompat.f3533d = parcelable;
        iconCompat.f3534e = aVar.j(iconCompat.f3534e, 4);
        iconCompat.f3535f = aVar.j(iconCompat.f3535f, 5);
        Parcelable parcelable2 = iconCompat.f3536g;
        if (aVar.h(6)) {
            parcelable2 = aVar.k();
        }
        iconCompat.f3536g = (ColorStateList) parcelable2;
        String str = iconCompat.f3538i;
        if (aVar.h(7)) {
            str = aVar.l();
        }
        iconCompat.f3538i = str;
        String str2 = iconCompat.f3539j;
        if (aVar.h(8)) {
            str2 = aVar.l();
        }
        iconCompat.f3539j = str2;
        iconCompat.f3537h = PorterDuff.Mode.valueOf(iconCompat.f3538i);
        switch (iconCompat.f3531a) {
            case -1:
                Parcelable parcelable3 = iconCompat.f3533d;
                if (parcelable3 != null) {
                    iconCompat.f3532b = parcelable3;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case 5:
                Parcelable parcelable4 = iconCompat.f3533d;
                if (parcelable4 != null) {
                    iconCompat.f3532b = parcelable4;
                    break;
                } else {
                    byte[] bArr2 = iconCompat.c;
                    iconCompat.f3532b = bArr2;
                    iconCompat.f3531a = 3;
                    iconCompat.f3534e = 0;
                    iconCompat.f3535f = bArr2.length;
                    break;
                }
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.c, Charset.forName(CharEncoding.UTF_16));
                iconCompat.f3532b = str3;
                if (iconCompat.f3531a == 2 && iconCompat.f3539j == null) {
                    iconCompat.f3539j = str3.split(":", -1)[0];
                    break;
                }
                break;
            case 3:
                iconCompat.f3532b = iconCompat.c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f3538i = iconCompat.f3537h.name();
        switch (iconCompat.f3531a) {
            case -1:
                iconCompat.f3533d = (Parcelable) iconCompat.f3532b;
                break;
            case 1:
            case 5:
                iconCompat.f3533d = (Parcelable) iconCompat.f3532b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.f3532b).getBytes(Charset.forName(CharEncoding.UTF_16));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.f3532b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.f3532b.toString().getBytes(Charset.forName(CharEncoding.UTF_16));
                break;
        }
        int i10 = iconCompat.f3531a;
        if (-1 != i10) {
            aVar.s(i10, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            aVar.n(2);
            aVar.p(bArr);
        }
        Parcelable parcelable = iconCompat.f3533d;
        if (parcelable != null) {
            aVar.n(3);
            aVar.t(parcelable);
        }
        int i11 = iconCompat.f3534e;
        if (i11 != 0) {
            aVar.s(i11, 4);
        }
        int i12 = iconCompat.f3535f;
        if (i12 != 0) {
            aVar.s(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f3536g;
        if (colorStateList != null) {
            aVar.n(6);
            aVar.t(colorStateList);
        }
        String str = iconCompat.f3538i;
        if (str != null) {
            aVar.n(7);
            aVar.u(str);
        }
        String str2 = iconCompat.f3539j;
        if (str2 != null) {
            aVar.n(8);
            aVar.u(str2);
        }
    }
}
