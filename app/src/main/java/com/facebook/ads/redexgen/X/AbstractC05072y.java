package com.facebook.ads.redexgen.X;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.2y  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC05072y<K, V> {
    public static String[] A03 = {"1zdW1KODsFltmNuWmrotTBJZ", "RgZO4eFyMPRXq", "TNHX835HuEpqCwzJlYfwEUi8GaEU5NHd", "eVTb3p4k2JpJ0D4m3J9D4ZVPKPKe0wis", "2WztFDsRGhQaALYpxh067UM8", "jcxZvazs935Xr", "SKBAj5hBfWgpr40k574HTlm5xQmSLGYw", "jjH4wggc1wpWWLxRj5DmyzPuqk4QCdce"};
    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/2y<TK;TV;>.EntrySet; */
    public C05032u A00;
    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/2y<TK;TV;>.KeySet; */
    public C05042v A01;
    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/2y<TK;TV;>.ValuesCollection; */
    public C05062x A02;

    public abstract int A04();

    public abstract int A05(Object obj);

    public abstract int A06(Object obj);

    public abstract Map<K, V> A07();

    public abstract Object A0B(int i10, int i11);

    public abstract V A0C(int i10, V v10);

    public abstract void A0D();

    public abstract void A0E(int i10);

    public abstract void A0F(K k10, V v10);

    public static <K, V> boolean A00(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            boolean containsKey = map.containsKey(it.next());
            String[] strArr = A03;
            if (strArr[6].charAt(29) == strArr[2].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[6] = "cUAXgIbWxWmXM8IdimkoIKbOqppmM6Vz";
            strArr2[2] = "Ax9eiVneWoZpIcbsPIrW3KpgweGiIvpy";
            if (!containsKey) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean A01(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object obj : collection) {
            if (A03[7].charAt(9) != 'w') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[6] = "E45UHwgrMTIMwaLYI7blxmvG7mW9Qs1w";
            strArr[2] = "z9os9R0vn0p5TampC1nMxoZk5TfunpzS";
            map.remove(obj);
        }
        int oldSize = map.size();
        return size != oldSize;
    }

    public static <K, V> boolean A02(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            boolean contains = collection.contains(it.next());
            String[] strArr = A03;
            String str = strArr[4];
            String str2 = strArr[0];
            int length = str.length();
            int oldSize = str2.length();
            if (length != oldSize) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[6] = "5v4gpohEe9mjCzRiIQv41Zeqn5qom46c";
            strArr2[2] = "O6DgVsMjSRRAXWI9cjkKRDle2DCyXpBO";
            if (!contains) {
                it.remove();
            }
        }
        int oldSize2 = map.size();
        return size != oldSize2;
    }

    public static <T> boolean A03(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        boolean z10 = obj instanceof Set;
        String[] strArr = A03;
        if (strArr[5].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[4] = "EyqH2KYHB8yq5zU8TINZ2CMR";
        strArr2[0] = "l4DYdurHJXrazQVJZIOfW52E";
        if (z10) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException unused) {
                return false;
            } catch (NullPointerException unused2) {
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2y != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.facebook.ads.redexgen.X.2u] */
    public final Set<Map.Entry<K, V>> A08() {
        if (this.A00 == null) {
            this.A00 = new Set<Map.Entry<K, V>>() { // from class: com.facebook.ads.redexgen.X.2u
                public static String[] A01 = {"YtNF8b8ioPsgGgaDUde7WsjUMR00Jzoy", "ONmCOidcB6U5WZLM0OONVLfChSccD2jC", "SJu8u5Zh6YlgArwXrUirNpL4997vCJ", "nE4owr1wlu2VobktzduoSxTpcn75jZ1P", "qSRAP7Al4GPL3nfNBbzCOWjKh9ZAaoHj", "", "XO0jmWeq4", "JpA0oM1ow"};

                /* JADX WARN: Failed to parse debug info
                java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
                	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
                	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                 */
                @Override // java.util.Set, java.util.Collection
                public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
                    int A04 = AbstractC05072y.this.A04();
                    for (Map.Entry<K, V> entry : collection) {
                        AbstractC05072y.this.A0F(entry.getKey(), entry.getValue());
                    }
                    return A04 != AbstractC05072y.this.A04();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                private final boolean A00(Map.Entry<K, V> object) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final /* bridge */ /* synthetic */ boolean add(Object obj) {
                    A00((Map.Entry) obj);
                    throw null;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final void clear() {
                    AbstractC05072y.this.A0D();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean contains(Object obj) {
                    if (obj instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) obj;
                        int index = AbstractC05072y.this.A05(entry.getKey());
                        if (index < 0) {
                            return false;
                        }
                        Object foundVal = AbstractC05072y.this.A0B(index, 1);
                        return AbstractC05002r.A04(foundVal, entry.getValue());
                    }
                    return false;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean containsAll(Collection<?> collection) {
                    Iterator<?> it = collection.iterator();
                    while (it.hasNext()) {
                        if (!contains(it.next())) {
                            return false;
                        }
                    }
                    return true;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean equals(Object obj) {
                    return AbstractC05072y.A03(this, obj);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final int hashCode() {
                    int i10 = 0;
                    for (int A04 = AbstractC05072y.this.A04() - 1; A04 >= 0; A04--) {
                        AbstractC05072y abstractC05072y = AbstractC05072y.this;
                        String[] strArr = A01;
                        String str = strArr[6];
                        String str2 = strArr[7];
                        int i11 = str.length();
                        int result = str2.length();
                        if (i11 != result) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A01;
                        strArr2[6] = "tAEwYau76";
                        strArr2[7] = "8QLk4N8pE";
                        int i12 = 0;
                        Object A0B = abstractC05072y.A0B(A04, 0);
                        Object A0B2 = AbstractC05072y.this.A0B(A04, 1);
                        int i13 = A0B == null ? 0 : A0B.hashCode();
                        if (A0B2 != null) {
                            i12 = A0B2.hashCode();
                        }
                        i10 += i12 ^ i13;
                    }
                    return i10;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean isEmpty() {
                    return AbstractC05072y.this.A04() == 0;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection, java.lang.Iterable
                public final Iterator<Map.Entry<K, V>> iterator() {
                    return new C05052w(AbstractC05072y.this);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean remove(Object obj) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean removeAll(Collection<?> collection) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean retainAll(Collection<?> collection) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final int size() {
                    return AbstractC05072y.this.A04();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final Object[] toArray() {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2u != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
                @Override // java.util.Set, java.util.Collection
                public final <T> T[] toArray(T[] array) {
                    throw new UnsupportedOperationException();
                }
            };
        }
        C05032u c05032u = this.A00;
        String[] strArr = A03;
        if (strArr[6].charAt(29) != strArr[2].charAt(29)) {
            A03[3] = "P6bvb6eoffQLg6Q5qx1NG9tFVzgAZtCe";
            return c05032u;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2y != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.facebook.ads.redexgen.X.2v] */
    public final Set<K> A09() {
        if (this.A01 == null) {
            this.A01 = new Set<K>() { // from class: com.facebook.ads.redexgen.X.2v
                public static String[] A01 = {"edFq1RSzVbogperxRnGO2mwS9T0C3jXY", "CE90aEI9KYNoN0DMFbwcn9PMt89CsnEy", "tPPb", "CijerYzHuYsgCporrbQrcy6DwpkaY1hX", "Nwp2N8bBhYR0nMsdl7Yct", "Yte1vUSgji4S3VNobeKxGdrgBkFaACT", "hyxYDNsU9Fu2EdzaavUXH", "kSbZdYOgqhrWj8RnTgPZsuZs4QqXHZoL"};

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean add(K object) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean addAll(Collection<? extends K> collection) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final void clear() {
                    AbstractC05072y.this.A0D();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean contains(Object obj) {
                    return AbstractC05072y.this.A05(obj) >= 0;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean containsAll(Collection<?> collection) {
                    return AbstractC05072y.A00(AbstractC05072y.this.A07(), collection);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean equals(Object obj) {
                    return AbstractC05072y.A03(this, obj);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final int hashCode() {
                    int i10 = 0;
                    int result = AbstractC05072y.this.A04();
                    for (int i11 = result - 1; i11 >= 0; i11--) {
                        int i12 = 0;
                        Object A0B = AbstractC05072y.this.A0B(i11, 0);
                        if (A0B != null) {
                            i12 = A0B.hashCode();
                        }
                        i10 += i12;
                    }
                    return i10;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean isEmpty() {
                    return AbstractC05072y.this.A04() == 0;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection, java.lang.Iterable
                public final Iterator<K> iterator() {
                    return new C05022t(AbstractC05072y.this, 0);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean remove(Object obj) {
                    int A05 = AbstractC05072y.this.A05(obj);
                    if (A05 >= 0) {
                        AbstractC05072y.this.A0E(A05);
                        String[] strArr = A01;
                        String str = strArr[1];
                        String str2 = strArr[2];
                        int length = str.length();
                        int index = str2.length();
                        if (length != index) {
                            String[] strArr2 = A01;
                            strArr2[4] = "xtpBes5HGReh40nAQqVKY";
                            strArr2[6] = "hpfnMqiRo4gFf5SPN0UOy";
                            return true;
                        }
                        throw new RuntimeException();
                    }
                    return false;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean removeAll(Collection<?> collection) {
                    return AbstractC05072y.A01(AbstractC05072y.this.A07(), collection);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final boolean retainAll(Collection<?> collection) {
                    return AbstractC05072y.A02(AbstractC05072y.this.A07(), collection);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final int size() {
                    return AbstractC05072y.this.A04();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final Object[] toArray() {
                    return AbstractC05072y.this.A0G(0);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2v != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
                @Override // java.util.Set, java.util.Collection
                public final <T> T[] toArray(T[] array) {
                    return (T[]) AbstractC05072y.this.A0H(array, 0);
                }
            };
        }
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2y != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.facebook.ads.redexgen.X.2x] */
    public final Collection<V> A0A() {
        if (this.A02 == null) {
            this.A02 = new Collection<V>() { // from class: com.facebook.ads.redexgen.X.2x
                public static String[] A01 = {"B65p9FaUvzrFNvwuG6LjFu3dW8", "xEYdbkQkXJmqNi6lUscBQUgiZa7D0Dxz", "kpPcM5P9PMrcR9maJ", "lIn8lLeU70LUHRqRy8hC6rghr0456Bk3", "xAyovFCLcJcKz6S3I", "BHkXiShRs9wapcYGvvb8XQo", "e883n5N2Jnnmw9lqw", "xzZfUck7bISpz3H6ivOii"};

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean add(V object) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean addAll(Collection<? extends V> collection) {
                    throw new UnsupportedOperationException();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final void clear() {
                    AbstractC05072y.this.A0D();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean contains(Object obj) {
                    return AbstractC05072y.this.A06(obj) >= 0;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean containsAll(Collection<?> collection) {
                    Iterator<?> it = collection.iterator();
                    while (it.hasNext()) {
                        if (!contains(it.next())) {
                            return false;
                        }
                    }
                    return true;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean isEmpty() {
                    return AbstractC05072y.this.A04() == 0;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection, java.lang.Iterable
                public final Iterator<V> iterator() {
                    return new C05022t(AbstractC05072y.this, 1);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean remove(Object obj) {
                    int A06 = AbstractC05072y.this.A06(obj);
                    if (A06 >= 0) {
                        AbstractC05072y.this.A0E(A06);
                        return true;
                    }
                    return false;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean removeAll(Collection<?> collection) {
                    int A04 = AbstractC05072y.this.A04();
                    boolean z10 = false;
                    int i10 = 0;
                    while (i10 < A04) {
                        AbstractC05072y abstractC05072y = AbstractC05072y.this;
                        String[] strArr = A01;
                        String str = strArr[4];
                        String str2 = strArr[6];
                        int length = str.length();
                        int N = str2.length();
                        if (length != N) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A01;
                        strArr2[7] = "8TyfarL1WEatJJNOns6yk";
                        strArr2[2] = "ZFPu54ieTgZ9QJdC5";
                        if (collection.contains(abstractC05072y.A0B(i10, 1))) {
                            AbstractC05072y.this.A0E(i10);
                            i10--;
                            A04--;
                            z10 = true;
                        }
                        i10++;
                    }
                    return z10;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final boolean retainAll(Collection<?> collection) {
                    int A04 = AbstractC05072y.this.A04();
                    boolean changed = false;
                    int i10 = 0;
                    while (i10 < A04) {
                        if (!collection.contains(AbstractC05072y.this.A0B(i10, 1))) {
                            AbstractC05072y.this.A0E(i10);
                            i10--;
                            A04--;
                            String[] strArr = A01;
                            String str = strArr[4];
                            String str2 = strArr[6];
                            int length = str.length();
                            int N = str2.length();
                            if (length != N) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A01;
                            strArr2[7] = "W6fJV23d83VeGu0xKkUvg";
                            strArr2[2] = "sGDul30tjAcSIzuwi";
                            changed = true;
                        }
                        i10++;
                    }
                    return changed;
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final int size() {
                    return AbstractC05072y.this.A04();
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final Object[] toArray() {
                    return AbstractC05072y.this.A0G(1);
                }

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
                @Override // java.util.Collection
                public final <T> T[] toArray(T[] array) {
                    return (T[]) AbstractC05072y.this.A0H(array, 1);
                }
            };
        }
        return this.A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2y != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    public final Object[] A0G(int i10) {
        int A04 = A04();
        Object[] objArr = new Object[A04];
        for (int i11 = 0; i11 < A04; i11++) {
            objArr[i11] = A0B(i11, i10);
        }
        return objArr;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2y != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T[] A0H(T[] array, int i10) {
        int A04 = A04();
        int N = array.length;
        if (N < A04) {
            array = (T[]) ((Object[]) Array.newInstance(array.getClass().getComponentType(), A04));
        }
        for (int i11 = 0; i11 < A04; i11++) {
            array[i11] = A0B(i11, i10);
        }
        int N2 = array.length;
        if (N2 > A04) {
            array[A04] = null;
        }
        return array;
    }
}
