package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: _Collections.kt */
/* loaded from: classes.dex */
public class m extends k {
    public static final List A0(Comparator comparator, Iterable iterable) {
        ArrayList arrayList;
        boolean z10 = iterable instanceof Collection;
        if (z10) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return E0(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            kotlin.jvm.internal.g.e(array, "<this>");
            if (array.length > 1) {
                Arrays.sort(array, comparator);
            }
            return f.v(array);
        }
        if (z10) {
            arrayList = F0((Collection) iterable);
        } else {
            ArrayList arrayList2 = new ArrayList();
            C0(iterable, arrayList2);
            arrayList = arrayList2;
        }
        j.j0(arrayList, comparator);
        return arrayList;
    }

    public static final <T> List<T> B0(Iterable<? extends T> iterable, int i10) {
        boolean z10;
        int i11 = 0;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 == 0) {
                return EmptyList.INSTANCE;
            }
            if (iterable instanceof Collection) {
                if (i10 >= ((Collection) iterable).size()) {
                    return E0(iterable);
                }
                if (i10 == 1) {
                    return ge.a.H(q0(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i10);
            for (T t4 : iterable) {
                arrayList.add(t4);
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            return ge.a.K(arrayList);
        }
        throw new IllegalArgumentException(a0.a.g("Requested element count ", i10, " is less than zero.").toString());
    }

    public static final void C0(Iterable iterable, java.util.AbstractCollection abstractCollection) {
        kotlin.jvm.internal.g.e(iterable, "<this>");
        for (Object obj : iterable) {
            abstractCollection.add(obj);
        }
    }

    public static final int[] D0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Number) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    public static final <T> List<T> E0(Iterable<? extends T> iterable) {
        ArrayList arrayList;
        Object next;
        kotlin.jvm.internal.g.e(iterable, "<this>");
        boolean z10 = iterable instanceof Collection;
        if (z10) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return F0(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return ge.a.H(next);
            }
            return EmptyList.INSTANCE;
        }
        if (z10) {
            arrayList = F0((Collection) iterable);
        } else {
            ArrayList arrayList2 = new ArrayList();
            C0(iterable, arrayList2);
            arrayList = arrayList2;
        }
        return ge.a.K(arrayList);
    }

    public static final ArrayList F0(Collection collection) {
        kotlin.jvm.internal.g.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final <T> Set<T> G0(Iterable<? extends T> iterable) {
        Object next;
        kotlin.jvm.internal.g.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(t0.g0(collection.size()));
                    C0(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return ea.a.y(next);
            }
            return EmptySet.INSTANCE;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        C0(iterable, linkedHashSet2);
        int size2 = linkedHashSet2.size();
        if (size2 != 0) {
            if (size2 == 1) {
                return ea.a.y(linkedHashSet2.iterator().next());
            }
            return linkedHashSet2;
        }
        return EmptySet.INSTANCE;
    }

    public static final ArrayList n0(ArrayList arrayList) {
        int i10;
        boolean z10;
        int size = arrayList.size();
        int i11 = size / 4;
        if (size % 4 == 0) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        ArrayList arrayList2 = new ArrayList(i11 + i10);
        int i12 = 0;
        while (true) {
            if (i12 >= 0 && i12 < size) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i13 = size - i12;
                if (4 <= i13) {
                    i13 = 4;
                }
                ArrayList arrayList3 = new ArrayList(i13);
                for (int i14 = 0; i14 < i13; i14++) {
                    arrayList3.add(arrayList.get(i14 + i12));
                }
                arrayList2.add(arrayList3);
                i12 += 4;
            } else {
                return arrayList2;
            }
        }
    }

    public static final <T> boolean o0(Iterable<? extends T> iterable, T t4) {
        int i10;
        kotlin.jvm.internal.g.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t4);
        }
        if (iterable instanceof List) {
            i10 = ((List) iterable).indexOf(t4);
        } else {
            Iterator<? extends T> it = iterable.iterator();
            int i11 = 0;
            while (true) {
                if (it.hasNext()) {
                    T next = it.next();
                    if (i11 >= 0) {
                        if (kotlin.jvm.internal.g.a(t4, next)) {
                            i10 = i11;
                            break;
                        }
                        i11++;
                    } else {
                        ge.a.c0();
                        throw null;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
        }
        if (i10 < 0) {
            return false;
        }
        return true;
    }

    public static final ArrayList p0(ArrayList arrayList) {
        kotlin.jvm.internal.g.e(arrayList, "<this>");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final <T> T q0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g.e(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) r0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T r0(List<? extends T> list) {
        kotlin.jvm.internal.g.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T s0(List<? extends T> list) {
        kotlin.jvm.internal.g.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final Object t0(int i10, List list) {
        kotlin.jvm.internal.g.e(list, "<this>");
        if (i10 >= 0 && i10 <= ge.a.A(list)) {
            return list.get(i10);
        }
        return null;
    }

    public static final void u0(Iterable iterable, StringBuilder sb2, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, cg.l lVar) {
        kotlin.jvm.internal.g.e(iterable, "<this>");
        kotlin.jvm.internal.g.e(separator, "separator");
        kotlin.jvm.internal.g.e(prefix, "prefix");
        kotlin.jvm.internal.g.e(postfix, "postfix");
        kotlin.jvm.internal.g.e(truncated, "truncated");
        sb2.append(prefix);
        int i11 = 0;
        for (Object obj : iterable) {
            i11++;
            if (i11 > 1) {
                sb2.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            ea.a.i(sb2, obj, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            sb2.append(truncated);
        }
        sb2.append(postfix);
    }

    public static /* synthetic */ void v0(ArrayList arrayList, StringBuilder sb2) {
        u0(arrayList, sb2, "\n", "", "", -1, "...", null);
    }

    public static String w0(Iterable iterable, String str, String str2, String str3, cg.l lVar, int i10) {
        String prefix;
        String postfix;
        int i11;
        CharSequence truncated;
        cg.l lVar2;
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        if ((i10 & 2) != 0) {
            prefix = "";
        } else {
            prefix = str2;
        }
        if ((i10 & 4) != 0) {
            postfix = "";
        } else {
            postfix = str3;
        }
        if ((i10 & 8) != 0) {
            i11 = -1;
        } else {
            i11 = 0;
        }
        int i12 = i11;
        if ((i10 & 16) != 0) {
            truncated = "...";
        } else {
            truncated = null;
        }
        if ((i10 & 32) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        kotlin.jvm.internal.g.e(iterable, "<this>");
        kotlin.jvm.internal.g.e(prefix, "prefix");
        kotlin.jvm.internal.g.e(postfix, "postfix");
        kotlin.jvm.internal.g.e(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        u0(iterable, sb2, str4, prefix, postfix, i12, truncated, lVar2);
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g.d(sb3, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb3;
    }

    public static final <T> T x0(List<? extends T> list) {
        kotlin.jvm.internal.g.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(ge.a.A(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T y0(List<? extends T> list) {
        kotlin.jvm.internal.g.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return (T) a0.a.f(list, -1);
    }

    public static final ArrayList z0(Collection collection, Object obj) {
        kotlin.jvm.internal.g.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }
}
