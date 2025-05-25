package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* JADX INFO: Add missing generic type declarations: [E] */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0092\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\r\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"Lkotlin/collections/AbstractList$ListIteratorImpl;", "Lkotlin/collections/AbstractList$IteratorImpl;", "Lkotlin/collections/AbstractList;", "", "index", "", "(Lkotlin/collections/AbstractList;I)V", "hasPrevious", "", "nextIndex", "previous", "()Ljava/lang/Object;", "previousIndex", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.6y  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C06046y<E> extends AbstractC06036x<E>.IteratorImpl implements ListIterator<E> {
    public static byte[] A01;
    public final /* synthetic */ AbstractC06036x<E> A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 88);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{18, Field.DDE, 56, Field.GLOSSARY, 60, 41, Field.AUTONUMOUT, Field.GOTOBUTTON, Field.MACROBUTTON, 125, Field.AUTONUMOUT, Field.DDEAUTO, 125, Field.MACROBUTTON, Field.GOTOBUTTON, 41, 125, Field.DDEAUTO, Field.DATA, Field.DDE, Field.DDE, Field.GOTOBUTTON, Field.GLOSSARY, 41, 56, Field.SYMBOL, 125, 59, Field.GOTOBUTTON, Field.GLOSSARY, 125, Field.GLOSSARY, 56, 60, Field.SYMBOL, 112, Field.GOTOBUTTON, Field.MACROBUTTON, Field.EQ, 36, 125, Field.USERADDRESS, Field.GOTOBUTTON, Field.EQ, Field.EQ, 56, Field.USERADDRESS, 41, Field.AUTONUMOUT, Field.GOTOBUTTON, Field.MACROBUTTON};
    }

    @Override // java.util.ListIterator
    public final void add(E e10) {
        throw new UnsupportedOperationException(A00(0, 51, 5));
    }

    @Override // java.util.ListIterator
    public final void set(E e10) {
        throw new UnsupportedOperationException(A00(0, 51, 5));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06046y(AbstractC06036x abstractC06036x, int i10) {
        super(abstractC06036x);
        this.A00 = abstractC06036x;
        AbstractC06036x.A02.A04(i10, this.A00.size());
        A05(i10);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return A04() > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return A04();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            AbstractC06036x<E> abstractC06036x = this.A00;
            A05(A04() - 1);
            return abstractC06036x.get(A04());
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return A04() - 1;
    }
}
