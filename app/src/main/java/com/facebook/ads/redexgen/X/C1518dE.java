package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import lib.zj.office.fc.hwpf.usermodel.Field;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\nJ\u001d\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\rJ\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u000fJ%\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0013J\u001d\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0017J%\u0010\u0018\u001a\u00020\u00192\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001b2\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0000¢\u0006\u0002\b\u001dJ\u0019\u0010\u001e\u001a\u00020\u00042\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0000¢\u0006\u0002\b\u001fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lkotlin/collections/AbstractList$Companion;", "", "()V", "maxArraySize", "", "checkBoundsIndexes", "", "startIndex", "endIndex", "size", "checkBoundsIndexes$kotlin_stdlib", "checkElementIndex", "index", "checkElementIndex$kotlin_stdlib", "checkPositionIndex", "checkPositionIndex$kotlin_stdlib", "checkRangeIndexes", "fromIndex", "toIndex", "checkRangeIndexes$kotlin_stdlib", "newCapacity", "oldCapacity", "minCapacity", "newCapacity$kotlin_stdlib", "orderedEquals", "", "c", "", "other", "orderedEquals$kotlin_stdlib", "orderedHashCode", "orderedHashCode$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.dE  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1518dE {
    public static byte[] A00;

    static {
        A01();
    }

    public /* synthetic */ C1518dE(AbstractC1513d8 abstractC1513d8) {
        this();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 99);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-104, -74, -104, -20, -25, -63, -26, -36, -35, -16, -78, -104, -105, -117, -34, -44, -27, -48, -91, -117, -64, -76, 8, 3, -35, 2, -8, -7, 12, -50, -76, -19, 16, Field.NUMCHARS, 25, 23, -13, 24, 14, 15, 34, -28, -54, 43, 48, Field.ASK, Field.FILLIN, 58, -4, -30, Field.EQ, Field.AUTONUM, 42, Field.FILLIN, Field.AUTONUMOUT};
    }

    public C1518dE() {
    }

    public final int A02(Collection<?> collection) {
        C1512d7.A07(collection, A00(31, 1, 39));
        int i10 = 1;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i11 = i10 * 31;
            int hashCode = next != null ? next.hashCode() : 0;
            i10 = i11 + hashCode;
        }
        return i10;
    }

    public final void A03(int i10, int i11) {
        if (i10 >= 0 && i10 < i11) {
            return;
        }
        throw new IndexOutOfBoundsException(A00(43, 7, 95) + i10 + A00(12, 8, 8) + i11);
    }

    public final void A04(int i10, int i11) {
        if (i10 >= 0 && i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException(A00(43, 7, 95) + i10 + A00(12, 8, 8) + i11);
    }

    public final void A05(int i10, int i11, int i12) {
        String A002 = A00(32, 11, 71);
        if (i10 >= 0 && i11 <= i12) {
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException(A002 + i10 + A00(0, 12, 21) + i11);
        }
        throw new IndexOutOfBoundsException(A002 + i10 + A00(20, 11, 49) + i11 + A00(12, 8, 8) + i12);
    }

    public final boolean A06(Collection<?> collection, Collection<?> collection2) {
        C1512d7.A07(collection, A00(31, 1, 39));
        C1512d7.A07(collection2, A00(50, 5, 95));
        if (collection.size() != collection2.size()) {
            return false;
        }
        Iterator<?> it = collection2.iterator();
        Iterator<?> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!C1512d7.A0A(it2.next(), it.next())) {
                return false;
            }
        }
        return true;
    }
}
