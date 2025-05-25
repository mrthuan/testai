package com.facebook.ads.redexgen.X;

import com.tom_roush.pdfbox.pdmodel.interactive.measurement.PDNumberFormatDictionary;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import lib.zj.office.fc.hwpf.usermodel.Field;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007\b\u0004¢\u0006\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H¦\u0002J\u0015\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012H\u0015¢\u0006\u0002\u0010\u0014J'\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0012\"\u0004\b\u0001\u0010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0012H\u0014¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, d2 = {"Lkotlin/collections/AbstractCollection;", "E", "", "()V", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "isEmpty", "iterator", "", "toArray", "", "", "()[Ljava/lang/Object;", PDNumberFormatDictionary.FRACTIONAL_DISPLAY_TRUNCATE, "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: assets/audience_network.dex */
public abstract class I1<E> implements Collection<E> {
    public static byte[] A00;

    static {
        A09();
    }

    public static String A08(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 23);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{26, 22, 105, 86, Field.INCLUDEPICTURE, Field.ADVANCE, Field.FORMCHECKBOX, 82, Field.AUTOTEXT, Field.TOA, Field.NOTEREF, 6, Field.AUTOTEXT, Field.DOCPROPERTY, 6, Field.NOTEREF, Field.TOA, 82, 6, Field.DOCPROPERTY, Field.FORMDROPDOWN, 86, 86, Field.TOA, Field.ADVANCE, 82, Field.INCLUDEPICTURE, Field.SECTIONPAGES, 6, 64, Field.TOA, Field.ADVANCE, 6, Field.ADVANCE, Field.INCLUDEPICTURE, Field.FORMCHECKBOX, Field.SECTIONPAGES, 11, Field.TOA, Field.NOTEREF, 74, Field.SHAPE, 6, Field.FILESIZE, Field.TOA, 74, 74, Field.INCLUDEPICTURE, Field.FILESIZE, 82, Field.AUTOTEXT, Field.TOA, Field.NOTEREF, 17, Field.FILLIN, 121, 106, 106, 121, 97, Field.DATA, 33, Field.DATA, 32, Field.DATA, Field.QUOTE, Field.SYMBOL, Field.USERADDRESS};
    }

    public abstract int A0A();

    @Override // java.util.Collection
    public final boolean add(E e10) {
        throw new UnsupportedOperationException(A08(2, 51, 49));
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException(A08(2, 51, 49));
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException(A08(2, 51, 49));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // java.util.Collection, java.util.List
    public boolean contains(E e10) {
        I1<E> i12 = this;
        if ((i12 instanceof Collection) && i12.isEmpty()) {
            return false;
        }
        for (E e11 : i12) {
            if (C1512d7.A0A(e11, e10)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        C1512d7.A07(collection, A08(60, 8, 90));
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public abstract Iterator<E> iterator();

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException(A08(2, 51, 49));
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(A08(2, 51, 49));
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(A08(2, 51, 49));
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return A0A();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC1514d9.A02(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        C1512d7.A07(tArr, A08(55, 5, 15));
        return (T[]) AbstractC1514d9.A03(this, tArr);
    }

    public final String toString() {
        return C0R.A03(this, A08(0, 2, 33), A08(53, 1, 93), A08(54, 1, 109), 0, null, new C3O(this), 24, null);
    }
}
