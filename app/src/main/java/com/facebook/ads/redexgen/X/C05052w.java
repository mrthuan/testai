package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.facebook.ads.redexgen.X.2w  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05052w<K, V> implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
    public static byte[] A04;
    public static String[] A05 = {"EcQijE7IVr04Rw61NGaoicInYj0Y5pIf", "PCDE4c", "BYuZqH1", "OJoSfp", "QCWxhSjCiFvhWHavsiQeM5doYPZYmeMK", "d82pg0nhnPmaH2Vj0U0d9nQwwUZrcRQP", "ixFFHsUoC5yCXRppT5dY", "J79m4yZ8T6gMUys2Mw9buLKZFKLQuXB5"};
    public int A00;
    public final /* synthetic */ AbstractC05072y A03;
    public boolean A02 = false;
    public int A01 = -1;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 41);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{123, 30, 34, Field.QUOTE, Field.SYMBOL, 106, 41, Field.PAGEREF, 36, Field.USERADDRESS, 43, Field.QUOTE, 36, Field.GLOSSARY, 56, 106, Field.DDEAUTO, Field.PAGEREF, Field.GLOSSARY, Field.SYMBOL, 106, 36, Field.PAGEREF, Field.USERADDRESS, 106, Field.SYMBOL, Field.BARCODE, 58, 58, Field.PAGEREF, 56, Field.USERADDRESS, 106, 56, Field.GLOSSARY, Field.USERADDRESS, 43, Field.QUOTE, 36, Field.QUOTE, 36, Field.DDE, 106, 7, 43, 58, 100, 15, 36, Field.USERADDRESS, 56, Field.MACROBUTTON, 106, Field.PAGEREF, Field.DATA, 32, Field.GLOSSARY, 41, Field.USERADDRESS, Field.SYMBOL};
    }

    static {
        A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    public C05052w(AbstractC05072y abstractC05072y) {
        this.A03 = abstractC05072y;
        this.A00 = abstractC05072y.A04() - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Iterator
    /* renamed from: A00 */
    public final Map.Entry<K, V> next() {
        if (hasNext()) {
            this.A01++;
            this.A02 = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.A02) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return AbstractC05002r.A04(entry.getKey(), this.A03.A0B(this.A01, 0)) && AbstractC05002r.A04(entry.getValue(), this.A03.A0B(this.A01, 1));
            }
            return false;
        }
        throw new IllegalStateException(A01(1, 59, 99));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public final K getKey() {
        if (this.A02) {
            return (K) this.A03.A0B(this.A01, 0);
        }
        throw new IllegalStateException(A01(1, 59, 99));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public final V getValue() {
        if (this.A02) {
            return (V) this.A03.A0B(this.A01, 1);
        }
        throw new IllegalStateException(A01(1, 59, 99));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01 < this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (this.A02) {
            Object A0B = this.A03.A0B(this.A01, 0);
            Object value = this.A03.A0B(this.A01, 1);
            return (value != null ? value.hashCode() : 0) ^ (A0B == null ? 0 : A0B.hashCode());
        }
        throw new IllegalStateException(A01(1, 59, 99));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Iterator
    public final void remove() {
        if (this.A02) {
            this.A03.A0E(this.A01);
            this.A01--;
            int i10 = this.A00;
            String[] strArr = A05;
            if (strArr[4].charAt(29) == strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            A05[6] = "BDV7jip61nQIrhzKiydP";
            this.A00 = i10 - 1;
            this.A02 = false;
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public final V setValue(V v10) {
        if (this.A02) {
            return (V) this.A03.A0C(this.A01, v10);
        }
        throw new IllegalStateException(A01(1, 59, 99));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    public final String toString() {
        return getKey() + A01(0, 1, 111) + getValue();
    }
}
