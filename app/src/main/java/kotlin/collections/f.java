package kotlin.collections;

import com.android.billingclient.api.a0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: _Arrays.kt */
/* loaded from: classes.dex */
public class f extends o9.d {
    public static final void A(Object[] objArr, int i10, int i11) {
        kotlin.jvm.internal.g.e(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, (Object) null);
    }

    public static void B(Object[] objArr, a0 a0Var) {
        int length = objArr.length;
        kotlin.jvm.internal.g.e(objArr, "<this>");
        Arrays.fill(objArr, 0, length, a0Var);
    }

    public static final ArrayList C(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final Float D(int i10, float[] fArr) {
        if (i10 >= 0 && i10 <= fArr.length - 1) {
            return Float.valueOf(fArr[i10]);
        }
        return null;
    }

    public static final Object E(int i10, Object[] objArr) {
        kotlin.jvm.internal.g.e(objArr, "<this>");
        if (i10 >= 0 && i10 <= objArr.length - 1) {
            return objArr[i10];
        }
        return null;
    }

    public static final char F(char[] cArr) {
        kotlin.jvm.internal.g.e(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final void G(HashSet hashSet, Object[] objArr) {
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
    }

    public static final <T> List<T> H(T[] tArr) {
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                return I(tArr);
            }
            return ge.a.H(tArr[0]);
        }
        return EmptyList.INSTANCE;
    }

    public static final ArrayList I(Object[] objArr) {
        kotlin.jvm.internal.g.e(objArr, "<this>");
        return new ArrayList(new d(objArr, false));
    }

    public static final List v(Object[] objArr) {
        kotlin.jvm.internal.g.e(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        kotlin.jvm.internal.g.d(asList, "asList(this)");
        return asList;
    }

    public static final boolean w(Object obj, Object[] objArr) {
        int i10;
        kotlin.jvm.internal.g.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            i10 = 0;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    break;
                }
                i10++;
            }
            i10 = -1;
        } else {
            int length2 = objArr.length;
            for (int i11 = 0; i11 < length2; i11++) {
                if (kotlin.jvm.internal.g.a(obj, objArr[i11])) {
                    i10 = i11;
                    break;
                }
            }
            i10 = -1;
        }
        if (i10 < 0) {
            return false;
        }
        return true;
    }

    public static final void x(byte[] bArr, int i10, int i11, byte[] destination, int i12) {
        kotlin.jvm.internal.g.e(bArr, "<this>");
        kotlin.jvm.internal.g.e(destination, "destination");
        System.arraycopy(bArr, i11, destination, i10, i12 - i11);
    }

    public static final void y(Object[] objArr, int i10, Object[] destination, int i11, int i12) {
        kotlin.jvm.internal.g.e(objArr, "<this>");
        kotlin.jvm.internal.g.e(destination, "destination");
        System.arraycopy(objArr, i11, destination, i10, i12 - i11);
    }

    public static final byte[] z(int i10, int i11, byte[] bArr) {
        kotlin.jvm.internal.g.e(bArr, "<this>");
        o9.d.m(i11, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        kotlin.jvm.internal.g.d(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }
}
