package lib.zj.office.fc.util;

import androidx.appcompat.view.menu.d;
import b.a;

/* loaded from: classes3.dex */
public class ArrayUtil {
    public static void arrayMoveWithin(Object[] objArr, int i10, int i11, int i12) {
        Object[] objArr2;
        if (i12 <= 0 || i10 == i11) {
            return;
        }
        if (i10 >= 0 && i10 < objArr.length) {
            if (i11 >= 0 && i11 < objArr.length) {
                int i13 = i10 + i12;
                if (i13 <= objArr.length) {
                    int i14 = i11 + i12;
                    if (i14 <= objArr.length) {
                        Object[] objArr3 = new Object[i12];
                        System.arraycopy(objArr, i10, objArr3, 0, i12);
                        if (i10 > i11) {
                            int i15 = i10 - i11;
                            objArr2 = new Object[i15];
                            System.arraycopy(objArr, i11, objArr2, 0, i15);
                            i10 = i14;
                        } else {
                            int i16 = i11 - i10;
                            Object[] objArr4 = new Object[i16];
                            System.arraycopy(objArr, i13, objArr4, 0, i16);
                            objArr2 = objArr4;
                        }
                        System.arraycopy(objArr3, 0, objArr, i11, i12);
                        System.arraycopy(objArr2, 0, objArr, i10, objArr2.length);
                        return;
                    }
                    throw new IllegalArgumentException("Asked to move to a position that doesn't have enough space");
                }
                throw new IllegalArgumentException("Asked to move more entries than the array has");
            }
            throw new IllegalArgumentException("The moveTo must be a valid array index");
        }
        throw new IllegalArgumentException("The moveFrom must be a valid array index");
    }

    public static void arraycopy(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        if (i10 >= 0) {
            if (i10 < bArr.length) {
                int i13 = i10 + i12;
                if (i13 <= bArr.length) {
                    if (i11 >= 0) {
                        if (i11 < bArr2.length) {
                            int i14 = i11 + i12;
                            if (i14 <= bArr2.length) {
                                System.arraycopy(bArr, i10, bArr2, i11, i12);
                                return;
                            }
                            StringBuilder e10 = d.e("dst_position + length would overrun the dst array.  Expected end at ", i14, " actual end at ");
                            e10.append(bArr2.length);
                            throw new IllegalArgumentException(e10.toString());
                        }
                        StringBuilder e11 = d.e("dst_position was greater than dst array size.  Tried to write starting at position ", i11, " but the array length is ");
                        e11.append(bArr2.length);
                        throw new IllegalArgumentException(e11.toString());
                    }
                    throw new IllegalArgumentException(a.c("dst_position was less than 0.  Actual value ", i11));
                }
                StringBuilder e12 = d.e("src_position + length would overrun the src array.  Expected end at ", i13, " actual end at ");
                e12.append(bArr.length);
                throw new IllegalArgumentException(e12.toString());
            }
            StringBuilder e13 = d.e("src_position was greater than src array size.  Tried to write starting at position ", i10, " but the array length is ");
            e13.append(bArr.length);
            throw new IllegalArgumentException(e13.toString());
        }
        throw new IllegalArgumentException(a.c("src_position was less than 0.  Actual value ", i10));
    }

    public static byte[] copyOf(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
        return bArr2;
    }
}
