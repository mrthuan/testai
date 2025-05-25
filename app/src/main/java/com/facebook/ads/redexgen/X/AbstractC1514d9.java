package com.facebook.ads.redexgen.X;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import lib.zj.office.fc.hwpf.usermodel.Field;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\t\u0010\f\u001a~\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u000f2\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u00112(\u0010\u0012\u001a$\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0013H\u0082\b¢\u0006\u0002\u0010\u0014\"\u0018\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"EMPTY", "", "", "[Ljava/lang/Object;", "MAX_SIZE", "", "collectionToArray", "collection", "", "toArray", "(Ljava/util/Collection;)[Ljava/lang/Object;", "a", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "toArrayImpl", "empty", "Lkotlin/Function0;", "alloc", "Lkotlin/Function1;", "trim", "Lkotlin/Function2;", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)[Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.d9  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1514d9 {
    public static byte[] A00;
    public static String[] A01 = {"YRWMBYiInjfQquDkxRxaATvpWTtljPJC", "ofzRm5oD0ZehPjXAXsE4VN9RCemE2t7K", "rA3SUki7nKpweXyrpjsgW", "Q8xFqD15qZ9htNy6CShIJMvcdmz5frjW", "47AxPgGepX47UnNHLVE8SY2HaawvPhh1", "ilOqevOSCglGHIOxiwAEAySXTzWlxd7f", "WuOUZ6PVGszUBtiCu1AXLxWGhthYizTs", "WIuZhNvv8KxyFIlYsT8aGBLDwb7Qt6lT"};
    public static final Object[] A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 30);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{108, 96, 99, 99, 106, 108, 123, 102, 96, 97, 26, 22, 9, 0, Field.AUTONUM, 31, Field.ADDIN, Field.CONTROL, Field.CONTROL, Field.CONTROL, 80, 123, 96, 121, 121, Field.AUTONUMLGL, 118, 116, 123, 123, 122, 97, Field.AUTONUMLGL, 119, 112, Field.AUTONUMLGL, 118, 116, 102, 97, Field.AUTONUMLGL, 97, 122, Field.AUTONUMLGL, 123, 122, 123, 56, 123, 96, 121, 121, Field.AUTONUMLGL, 97, 108, 101, 112, Field.AUTONUMLGL, 126, 122, 97, 121, 124, 123, 59, Field.ADVANCE, 103, 103, 116, 108, 41, 126, 122, 97, 121, 124, 123, 59, Field.ADVANCE, 123, 108, 42, 43};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Deprecated(message = "This function will be made internal in a future release")
    @DeprecatedSinceKotlin(warningSince = "1.9")
    public static final Object[] A02(Collection<?> collection) {
        C1512d7.A07(collection, A00(0, 10, 17));
        int size = collection.size();
        if (size == 0) {
            return A02;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return A02;
        }
        Object[] objArr = new Object[size];
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            objArr[i10] = it.next();
            int length = objArr.length;
            String A002 = A00(10, 11, 103);
            if (i11 >= length) {
                boolean hasNext = it.hasNext();
                String[] strArr = A01;
                if (strArr[3].charAt(14) == strArr[1].charAt(14)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[6] = "EScuV0zxhuEvZysc5helwPhrpqvjjBl6";
                strArr2[4] = "HbMMbmPQRBR0PjZnzsYHyu73qTDtUO0T";
                if (!hasNext) {
                    return objArr;
                }
                int i12 = ((i11 * 3) + 1) >>> 1;
                if (i12 <= i11) {
                    if (i11 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                    i12 = 2147483645;
                }
                objArr = Arrays.copyOf(objArr, i12);
                C1512d7.A06(objArr, A002);
                i10 = i11;
            } else if (!it.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr, i11);
                C1512d7.A06(copyOf, A002);
                return copyOf;
            } else {
                i10 = i11;
            }
        }
    }

    static {
        A01();
        A02 = new Object[0];
    }

    @Deprecated(message = "This function will be made internal in a future release")
    @DeprecatedSinceKotlin(warningSince = "1.9")
    public static final Object[] A03(Collection<?> collection, Object[] objArr) {
        Object[] objArr2;
        C1512d7.A07(collection, A00(0, 10, 17));
        if (objArr != null) {
            int size = collection.size();
            if (size == 0) {
                int $i$f$toArrayImpl = objArr.length;
                if ($i$f$toArrayImpl > 0) {
                    objArr[0] = null;
                }
            } else {
                Iterator<?> it = collection.iterator();
                if (!it.hasNext()) {
                    if (objArr.length > 0) {
                        objArr[0] = null;
                    }
                } else {
                    int length = objArr.length;
                    String[] strArr = A01;
                    String str = strArr[3];
                    String str2 = strArr[1];
                    int size$iv = str.charAt(14);
                    int $i$f$toArrayImpl2 = str2.charAt(14);
                    if (size$iv != $i$f$toArrayImpl2) {
                        String[] strArr2 = A01;
                        strArr2[6] = "lrytJuFjMaT6Yp6XeApmWusax7Y4JpNy";
                        strArr2[4] = "gD4OyNyezD5obJmFstdRZH3h61osYZaN";
                        if (size <= length) {
                            objArr2 = objArr;
                        } else {
                            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                            C1512d7.A05(newInstance, A00(21, 62, 11));
                            objArr2 = (Object[]) newInstance;
                        }
                        int size$iv2 = 0;
                        while (true) {
                            int i$iv = size$iv2 + 1;
                            objArr2[size$iv2] = it.next();
                            int length2 = objArr2.length;
                            String A002 = A00(10, 11, 103);
                            if (i$iv >= length2) {
                                if (!it.hasNext()) {
                                    return objArr2;
                                }
                                int $i$f$toArrayImpl3 = i$iv * 3;
                                int $i$f$toArrayImpl4 = ($i$f$toArrayImpl3 + 1) >>> 1;
                                if ($i$f$toArrayImpl4 <= i$iv) {
                                    if (i$iv < 2147483645) {
                                        $i$f$toArrayImpl4 = 2147483645;
                                    } else {
                                        throw new OutOfMemoryError();
                                    }
                                }
                                objArr2 = Arrays.copyOf(objArr2, $i$f$toArrayImpl4);
                                C1512d7.A06(objArr2, A002);
                                size$iv2 = i$iv;
                            } else if (!it.hasNext()) {
                                if (objArr2 == objArr) {
                                    objArr[i$iv] = null;
                                } else {
                                    objArr = Arrays.copyOf(objArr2, i$iv);
                                    String[] strArr3 = A01;
                                    String str3 = strArr3[7];
                                    String str4 = strArr3[0];
                                    int size$iv3 = str3.charAt(1);
                                    int $i$f$toArrayImpl5 = str4.charAt(1);
                                    if (size$iv3 != $i$f$toArrayImpl5) {
                                        Object[] result$iv = A01;
                                        result$iv[5] = "MOwQC4VnYrG9FSwrwyUZAgsxR7nFQ96o";
                                        C1512d7.A06(objArr, A002);
                                    }
                                }
                                return objArr;
                            } else {
                                size$iv2 = i$iv;
                            }
                        }
                    }
                    throw new RuntimeException();
                }
            }
            return objArr;
        }
        throw new NullPointerException();
    }
}
