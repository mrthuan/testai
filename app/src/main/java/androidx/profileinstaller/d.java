package androidx.profileinstaller;

import androidx.activity.r;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: ProfileTranscoder.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f4171a = {112, 114, 111, 0};

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f4172b = {112, 114, 109, 0};

    public static byte[] a(u1.b[] bVarArr, byte[] bArr) {
        int i10 = 0;
        int i11 = 0;
        for (u1.b bVar : bVarArr) {
            i11 += (((((bVar.f30127g * 2) + 8) - 1) & (-8)) / 8) + (bVar.f30125e * 2) + b(bVar.f30122a, bArr, bVar.f30123b).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f30126f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i11);
        if (Arrays.equals(bArr, u1.f.c)) {
            int length = bVarArr.length;
            while (i10 < length) {
                u1.b bVar2 = bVarArr[i10];
                l(byteArrayOutputStream, bVar2, b(bVar2.f30122a, bArr, bVar2.f30123b));
                n(byteArrayOutputStream, bVar2);
                k(byteArrayOutputStream, bVar2);
                m(byteArrayOutputStream, bVar2);
                i10++;
            }
        } else {
            for (u1.b bVar3 : bVarArr) {
                l(byteArrayOutputStream, bVar3, b(bVar3.f30122a, bArr, bVar3.f30123b));
            }
            int length2 = bVarArr.length;
            while (i10 < length2) {
                u1.b bVar4 = bVarArr[i10];
                n(byteArrayOutputStream, bVar4);
                k(byteArrayOutputStream, bVar4);
                m(byteArrayOutputStream, bVar4);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == i11) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i11);
    }

    public static String b(String str, byte[] bArr, String str2) {
        Object obj;
        byte[] bArr2 = u1.f.f30138e;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = u1.f.f30137d;
        String str3 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                str2 = str2.replace("!", ":");
            }
            return str2;
        } else if (str2.equals("classes.dex")) {
            return str;
        } else {
            if (!str2.contains("!") && !str2.contains(":")) {
                if (str2.endsWith(".apk")) {
                    return str2;
                }
                return r.g(a0.a.k(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : ":", str2);
            } else if ("!".equals(obj)) {
                return str2.replace(":", "!");
            } else {
                if (":".equals(obj)) {
                    str2 = str2.replace("!", ":");
                }
                return str2;
            }
        }
    }

    public static int c(int i10, int i11, int i12) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 4) {
                    return i11 + i12;
                }
                throw new IllegalStateException(b.a.c("Unexpected flag: ", i10));
            }
            return i11;
        }
        throw new IllegalStateException("HOT methods are not stored in the bitmap");
    }

    public static int[] d(ByteArrayInputStream byteArrayInputStream, int i10) {
        int[] iArr = new int[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += b.b.U(byteArrayInputStream);
            iArr[i12] = i11;
        }
        return iArr;
    }

    public static u1.b[] e(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, u1.b[] bVarArr) {
        byte[] bArr3 = u1.f.f30139f;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(u1.f.f30135a, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int T = (int) b.b.T(fileInputStream, 1);
                    byte[] S = b.b.S(fileInputStream, (int) b.b.T(fileInputStream, 4), (int) b.b.T(fileInputStream, 4));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(S);
                        try {
                            u1.b[] f10 = f(byteArrayInputStream, T, bVarArr);
                            byteArrayInputStream.close();
                            return f10;
                        } catch (Throwable th2) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                    throw new IllegalStateException("Content found after the end of file");
                }
                throw new IllegalStateException("Unsupported meta version");
            }
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, u1.f.f30140g)) {
            int U = b.b.U(fileInputStream);
            byte[] S2 = b.b.S(fileInputStream, (int) b.b.T(fileInputStream, 4), (int) b.b.T(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(S2);
                try {
                    u1.b[] g10 = g(byteArrayInputStream2, bArr2, U, bVarArr);
                    byteArrayInputStream2.close();
                    return g10;
                } catch (Throwable th4) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        } else {
            throw new IllegalStateException("Unsupported meta version");
        }
    }

    public static u1.b[] f(ByteArrayInputStream byteArrayInputStream, int i10, u1.b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new u1.b[0];
        }
        if (i10 == bVarArr.length) {
            String[] strArr = new String[i10];
            int[] iArr = new int[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int U = b.b.U(byteArrayInputStream);
                iArr[i11] = b.b.U(byteArrayInputStream);
                strArr[i11] = new String(b.b.R(byteArrayInputStream, U), StandardCharsets.UTF_8);
            }
            for (int i12 = 0; i12 < i10; i12++) {
                u1.b bVar = bVarArr[i12];
                if (bVar.f30123b.equals(strArr[i12])) {
                    int i13 = iArr[i12];
                    bVar.f30125e = i13;
                    bVar.f30128h = d(byteArrayInputStream, i13);
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return bVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static u1.b[] g(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i10, u1.b[] bVarArr) {
        u1.b bVar;
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new u1.b[0];
        }
        if (i10 == bVarArr.length) {
            for (int i11 = 0; i11 < i10; i11++) {
                b.b.U(byteArrayInputStream);
                String str2 = new String(b.b.R(byteArrayInputStream, b.b.U(byteArrayInputStream)), StandardCharsets.UTF_8);
                long T = b.b.T(byteArrayInputStream, 4);
                int U = b.b.U(byteArrayInputStream);
                if (bVarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    for (int i12 = 0; i12 < bVarArr.length; i12++) {
                        if (bVarArr[i12].f30123b.equals(str)) {
                            bVar = bVarArr[i12];
                            break;
                        }
                    }
                }
                bVar = null;
                if (bVar != null) {
                    bVar.f30124d = T;
                    int[] d10 = d(byteArrayInputStream, U);
                    if (Arrays.equals(bArr, u1.f.f30138e)) {
                        bVar.f30125e = U;
                        bVar.f30128h = d10;
                    }
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str2));
                }
            }
            return bVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static u1.b[] h(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, u1.f.f30136b)) {
            int T = (int) b.b.T(fileInputStream, 1);
            byte[] S = b.b.S(fileInputStream, (int) b.b.T(fileInputStream, 4), (int) b.b.T(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(S);
                try {
                    u1.b[] i10 = i(str, byteArrayInputStream, T);
                    byteArrayInputStream.close();
                    return i10;
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }

    public static u1.b[] i(String str, ByteArrayInputStream byteArrayInputStream, int i10) {
        TreeMap<Integer, Integer> treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new u1.b[0];
        }
        u1.b[] bVarArr = new u1.b[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int U = b.b.U(byteArrayInputStream);
            int U2 = b.b.U(byteArrayInputStream);
            bVarArr[i11] = new u1.b(str, new String(b.b.R(byteArrayInputStream, U), StandardCharsets.UTF_8), b.b.T(byteArrayInputStream, 4), U2, (int) b.b.T(byteArrayInputStream, 4), (int) b.b.T(byteArrayInputStream, 4), new int[U2], new TreeMap());
        }
        for (int i12 = 0; i12 < i10; i12++) {
            u1.b bVar = bVarArr[i12];
            int available = byteArrayInputStream.available() - bVar.f30126f;
            int i13 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = bVar.f30129i;
                if (available2 <= available) {
                    break;
                }
                i13 += b.b.U(byteArrayInputStream);
                treeMap.put(Integer.valueOf(i13), 1);
                for (int U3 = b.b.U(byteArrayInputStream); U3 > 0; U3--) {
                    b.b.U(byteArrayInputStream);
                    int T = (int) b.b.T(byteArrayInputStream, 1);
                    if (T != 6 && T != 7) {
                        while (T > 0) {
                            b.b.T(byteArrayInputStream, 1);
                            for (int T2 = (int) b.b.T(byteArrayInputStream, 1); T2 > 0; T2--) {
                                b.b.U(byteArrayInputStream);
                            }
                            T--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                bVar.f30128h = d(byteArrayInputStream, bVar.f30125e);
                int i14 = bVar.f30127g;
                BitSet valueOf = BitSet.valueOf(b.b.R(byteArrayInputStream, ((((i14 * 2) + 8) - 1) & (-8)) / 8));
                for (int i15 = 0; i15 < i14; i15++) {
                    int i16 = 2;
                    if (!valueOf.get(c(2, i15, i14))) {
                        i16 = 0;
                    }
                    if (valueOf.get(c(4, i15, i14))) {
                        i16 |= 4;
                    }
                    if (i16 != 0) {
                        Integer num = treeMap.get(Integer.valueOf(i15));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i15), Integer.valueOf(i16 | num.intValue()));
                    }
                }
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return bVarArr;
    }

    public static boolean j(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, u1.b[] bVarArr) {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = u1.f.f30135a;
        int i10 = 0;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                b.b.f0(byteArrayOutputStream2, bVarArr.length);
                int i11 = 2;
                int i12 = 2;
                for (u1.b bVar : bVarArr) {
                    b.b.e0(byteArrayOutputStream2, bVar.c, 4);
                    b.b.e0(byteArrayOutputStream2, bVar.f30124d, 4);
                    b.b.e0(byteArrayOutputStream2, bVar.f30127g, 4);
                    String b10 = b(bVar.f30122a, bArr2, bVar.f30123b);
                    int length2 = b10.getBytes(StandardCharsets.UTF_8).length;
                    b.b.f0(byteArrayOutputStream2, length2);
                    i12 = i12 + 4 + 4 + 4 + 2 + (length2 * 1);
                    byteArrayOutputStream2.write(b10.getBytes(StandardCharsets.UTF_8));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i12 == byteArray.length) {
                    f fVar = new f(FileSectionType.DEX_FILES, byteArray, false);
                    byteArrayOutputStream2.close();
                    arrayList2.add(fVar);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i13 = 0;
                    for (int i14 = 0; i14 < bVarArr.length; i14++) {
                        try {
                            u1.b bVar2 = bVarArr[i14];
                            b.b.f0(byteArrayOutputStream3, i14);
                            b.b.f0(byteArrayOutputStream3, bVar2.f30125e);
                            i13 = i13 + 2 + 2 + (bVar2.f30125e * 2);
                            k(byteArrayOutputStream3, bVar2);
                        } finally {
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i13 == byteArray2.length) {
                        f fVar2 = new f(FileSectionType.CLASSES, byteArray2, true);
                        byteArrayOutputStream3.close();
                        arrayList2.add(fVar2);
                        byteArrayOutputStream2 = new ByteArrayOutputStream();
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < bVarArr.length) {
                            try {
                                u1.b bVar3 = bVarArr[i15];
                                int i17 = i10;
                                for (Map.Entry<Integer, Integer> entry : bVar3.f30129i.entrySet()) {
                                    i17 |= entry.getValue().intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                m(byteArrayOutputStream4, bVar3);
                                byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                n(byteArrayOutputStream5, bVar3);
                                byte[] byteArray4 = byteArrayOutputStream5.toByteArray();
                                byteArrayOutputStream5.close();
                                b.b.f0(byteArrayOutputStream2, i15);
                                int length3 = byteArray3.length + i11 + byteArray4.length;
                                int i18 = i16 + 2 + 4;
                                ArrayList arrayList4 = arrayList3;
                                b.b.e0(byteArrayOutputStream2, length3, 4);
                                b.b.f0(byteArrayOutputStream2, i17);
                                byteArrayOutputStream2.write(byteArray3);
                                byteArrayOutputStream2.write(byteArray4);
                                i16 = i18 + length3;
                                i15++;
                                arrayList3 = arrayList4;
                                i10 = 0;
                                i11 = 2;
                            } finally {
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream2.toByteArray();
                        if (i16 == byteArray5.length) {
                            f fVar3 = new f(FileSectionType.METHODS, byteArray5, true);
                            byteArrayOutputStream2.close();
                            arrayList2.add(fVar3);
                            long j10 = 4;
                            long size = j10 + j10 + 4 + (arrayList2.size() * 16);
                            b.b.e0(byteArrayOutputStream, arrayList2.size(), 4);
                            int i19 = 0;
                            while (i19 < arrayList2.size()) {
                                f fVar4 = (f) arrayList2.get(i19);
                                b.b.e0(byteArrayOutputStream, fVar4.f4178a.getValue(), 4);
                                b.b.e0(byteArrayOutputStream, size, 4);
                                boolean z10 = fVar4.c;
                                byte[] bArr3 = fVar4.f4179b;
                                if (z10) {
                                    byte[] n10 = b.b.n(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(n10);
                                    b.b.e0(byteArrayOutputStream, n10.length, 4);
                                    b.b.e0(byteArrayOutputStream, bArr3.length, 4);
                                    length = n10.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    b.b.e0(byteArrayOutputStream, bArr3.length, 4);
                                    b.b.e0(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += length;
                                i19++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i20 = 0; i20 < arrayList6.size(); i20++) {
                                byteArrayOutputStream.write((byte[]) arrayList6.get(i20));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i16 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray.length);
            } finally {
                try {
                    byteArrayOutputStream2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        }
        byte[] bArr4 = u1.f.f30136b;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] a10 = a(bVarArr, bArr4);
            b.b.e0(byteArrayOutputStream, bVarArr.length, 1);
            b.b.e0(byteArrayOutputStream, a10.length, 4);
            byte[] n11 = b.b.n(a10);
            b.b.e0(byteArrayOutputStream, n11.length, 4);
            byteArrayOutputStream.write(n11);
            return true;
        }
        byte[] bArr5 = u1.f.f30137d;
        if (Arrays.equals(bArr, bArr5)) {
            b.b.e0(byteArrayOutputStream, bVarArr.length, 1);
            for (u1.b bVar4 : bVarArr) {
                String b11 = b(bVar4.f30122a, bArr5, bVar4.f30123b);
                b.b.f0(byteArrayOutputStream, b11.getBytes(StandardCharsets.UTF_8).length);
                b.b.f0(byteArrayOutputStream, bVar4.f30128h.length);
                b.b.e0(byteArrayOutputStream, bVar4.f30129i.size() * 4, 4);
                b.b.e0(byteArrayOutputStream, bVar4.c, 4);
                byteArrayOutputStream.write(b11.getBytes(StandardCharsets.UTF_8));
                for (Integer num : bVar4.f30129i.keySet()) {
                    b.b.f0(byteArrayOutputStream, num.intValue());
                    b.b.f0(byteArrayOutputStream, 0);
                }
                for (int i21 : bVar4.f30128h) {
                    b.b.f0(byteArrayOutputStream, i21);
                }
            }
            return true;
        }
        byte[] bArr6 = u1.f.c;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] a11 = a(bVarArr, bArr6);
            b.b.e0(byteArrayOutputStream, bVarArr.length, 1);
            b.b.e0(byteArrayOutputStream, a11.length, 4);
            byte[] n12 = b.b.n(a11);
            b.b.e0(byteArrayOutputStream, n12.length, 4);
            byteArrayOutputStream.write(n12);
            return true;
        }
        byte[] bArr7 = u1.f.f30138e;
        if (Arrays.equals(bArr, bArr7)) {
            b.b.f0(byteArrayOutputStream, bVarArr.length);
            for (u1.b bVar5 : bVarArr) {
                String b12 = b(bVar5.f30122a, bArr7, bVar5.f30123b);
                b.b.f0(byteArrayOutputStream, b12.getBytes(StandardCharsets.UTF_8).length);
                TreeMap<Integer, Integer> treeMap = bVar5.f30129i;
                b.b.f0(byteArrayOutputStream, treeMap.size());
                b.b.f0(byteArrayOutputStream, bVar5.f30128h.length);
                b.b.e0(byteArrayOutputStream, bVar5.c, 4);
                byteArrayOutputStream.write(b12.getBytes(StandardCharsets.UTF_8));
                for (Integer num2 : treeMap.keySet()) {
                    b.b.f0(byteArrayOutputStream, num2.intValue());
                }
                for (int i22 : bVar5.f30128h) {
                    b.b.f0(byteArrayOutputStream, i22);
                }
            }
            return true;
        }
        return false;
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, u1.b bVar) {
        int i10 = 0;
        for (int i11 : bVar.f30128h) {
            Integer valueOf = Integer.valueOf(i11);
            b.b.f0(byteArrayOutputStream, valueOf.intValue() - i10);
            i10 = valueOf.intValue();
        }
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, u1.b bVar, String str) {
        b.b.f0(byteArrayOutputStream, str.getBytes(StandardCharsets.UTF_8).length);
        b.b.f0(byteArrayOutputStream, bVar.f30125e);
        b.b.e0(byteArrayOutputStream, bVar.f30126f, 4);
        b.b.e0(byteArrayOutputStream, bVar.c, 4);
        b.b.e0(byteArrayOutputStream, bVar.f30127g, 4);
        byteArrayOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static void m(ByteArrayOutputStream byteArrayOutputStream, u1.b bVar) {
        byte[] bArr = new byte[((((bVar.f30127g * 2) + 8) - 1) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : bVar.f30129i.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            int i10 = intValue2 & 2;
            int i11 = bVar.f30127g;
            if (i10 != 0) {
                int c = c(2, intValue, i11);
                int i12 = c / 8;
                bArr[i12] = (byte) ((1 << (c % 8)) | bArr[i12]);
            }
            if ((intValue2 & 4) != 0) {
                int c10 = c(4, intValue, i11);
                int i13 = c10 / 8;
                bArr[i13] = (byte) ((1 << (c10 % 8)) | bArr[i13]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void n(ByteArrayOutputStream byteArrayOutputStream, u1.b bVar) {
        int i10 = 0;
        for (Map.Entry<Integer, Integer> entry : bVar.f30129i.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                b.b.f0(byteArrayOutputStream, intValue - i10);
                b.b.f0(byteArrayOutputStream, 0);
                i10 = intValue;
            }
        }
    }
}
