package com.google.android.gms.common.util;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class ArrayUtils {
    private ArrayUtils() {
    }

    @KeepForSdk
    public static boolean a(Feature feature, Object[] objArr) {
        int i10;
        if (objArr != null) {
            i10 = objArr.length;
        } else {
            i10 = 0;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            } else if (Objects.a(objArr[i11], feature)) {
                if (i11 >= 0) {
                    return true;
                }
            } else {
                i11++;
            }
        }
        return false;
    }
}
