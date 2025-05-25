package com.facebook.ads.redexgen.X;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.9J  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9J implements Closeable {
    public static byte[] A03;
    public static String[] A04 = {"eAEkEYRVeXrfS58a4k5WuKPwy8inSFa", "kCWvHOIytqFj1LqyoQQyp7", "68j8lTajfoiD43mqP1eMjl4G9M", "TuTeUuVTuzlBunCet0oFaCexHHLwVmnb", "nTNwkbliDK7ulO", "oDpWF45gCEuTtB4s", "WYN7gIj7AgnNZEOK", "71vjkKoJ6BpaE0wznNMgre6CgC3xNcNz"};
    public final AnonymousClass99 A01;
    public final Deque<C9I> A02 = new LinkedList();
    public boolean A00 = false;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 100);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-37, 7, 13, 4, -4, -72, 6, 7, 12, -72, -7, -4, -4, -72, 10, -3, -5, 7, 10, -4, -72, 12, 7, -72, 6, -3, 15, 4, 17, -72, -7, -4, -4, -3, -4, -72, -2, 1, 4, -3, 30, Field.SYMBOL, Field.SECTION, Field.INCLUDETEXT, 61, 60, -8, 76, Field.FORMCHECKBOX, -8, 60, 61, Field.INCLUDETEXT, 61, 76, 61, -8, Field.USERADDRESS, Field.SECTION, Field.INCLUDETEXT, 61, -8, -1, -3, Field.MERGESEQ, -1, -73, -46, -38, -35, -42, -43, -111, -27, -32, -111, -35, -38, -28, -27, -111, -41, -38, -35, -42, -43, -111, -38, -33, -111, -43, -38, -29, -42, -44, -27, -32, -29, -22, -111, -104, -106, -28, -104, -31, -4, 4, 7, 0, -1, -69, 15, 10, -69, 7, 10, -4, -1, -69, 1, 4, 7, 0, -69, -62, -64, 14, -62, -57, -69, 14, 6, 4, 11, 11, 4, 9, 2, -69, -4, 7, 7, -69, 11, 13, 0, 17, 4, 10, 16, 14, -69, 1, 4, 7, 0, 14, -69, 16, 9, 15, 4, 7, -69, -64, -1, -37, -4, -5, -70, -16, -4, -5, 1, -10, -12, 2, -4, 2, 0, -83, -5, -18, -6, -14, -15, -83, -13, -10, -7, -14, -83, -10, -5, -83, -7, -4, -12, -12, -10, -5, -12, -83, -15, -10, -1, -14, -16, 1, -4, -1, 6, -57, -83, -78, -15, -71, -83, -6, -10, -5, -83, -10, 0, -83, -78, -15, -43, -24, -26, -14, -11, -25, -55, -20, -17, -24, -42, -24, -12, -8, -24, -15, -26, -24, -93, -28, -17, -11, -24, -28, -25, -4, -93, -26, -17, -14, -10, -24, -25, Field.GLOSSARY, Field.NOTEREF, Field.FILESIZE, Field.NOTEREF, Field.TOA, Field.ADDIN, Field.NOTEREF, -6, 64, Field.INCLUDEPICTURE, Field.FORMTEXT, Field.BARCODE, -6, Field.INCLUDEPICTURE, Field.NOTEREF, -6, Field.FORMTEXT, Field.TOA, Field.SECTION, Field.SECTION, Field.INCLUDEPICTURE, Field.NOTEREF, Field.SECTION, -6, Field.USERADDRESS, Field.INCLUDEPICTURE, 76, Field.BARCODE, 61, 78, Field.TOA, 76, Field.FORMDROPDOWN, 20, -6, 1, -1, 77, 1};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized int A09() throws IOException {
        int i10;
        if (this.A00) {
            throw new IOException(A02(227, 33, 31));
        }
        i10 = 0;
        for (C9I c9i : this.A02) {
            i10 += c9i.A01();
        }
        return i10;
    }

    static {
        A03();
    }

    public C9J(AnonymousClass99 anonymousClass99, C9H c9h) throws IOException {
        this.A01 = anonymousClass99;
        A05(anonymousClass99, c9h);
        if (this.A02.isEmpty()) {
            A00();
        }
    }

    private C9I A00() throws IOException {
        int i10 = -1;
        if (!this.A02.isEmpty()) {
            i10 = this.A02.getLast().A00();
        }
        int i11 = i10 + 1;
        this.A02.add(new C9I(i11, new C9F(new File(this.A01.A05(), A01(i11)))));
        return this.A02.getLast();
    }

    public static String A01(int i10) {
        return Integer.toString(i10);
    }

    private void A04(int i10, File file) throws IOException {
        C9F c9f = new C9F(file);
        c9f.A05();
        this.A02.addFirst(new C9I(i10, c9f));
    }

    private void A05(AnonymousClass99 anonymousClass99, C9H c9h) throws IOException {
        File[] listFiles = anonymousClass99.A05().listFiles();
        if (listFiles != null) {
            HashMap hashMap = new HashMap();
            HashSet hashSet = new HashSet();
            int i10 = -1;
            for (File file : listFiles) {
                try {
                    int parseInt = Integer.parseInt(file.getName());
                    hashMap.put(Integer.valueOf(parseInt), file);
                    if (parseInt > i10) {
                        i10 = parseInt;
                    }
                } catch (NumberFormatException unused) {
                    hashSet.add(file);
                    c9h.AFj(String.format(Locale.US, A02(260, 39, 118), file.getCanonicalPath()));
                }
            }
            boolean isEmpty = hashMap.isEmpty();
            if (A04[0].length() != 31) {
                throw new RuntimeException();
            }
            A04[7] = "dQtFqGLzpKOzaVLFdcsStellVtbbzgLH";
            if (!isEmpty) {
                int i11 = i10;
                while (hashMap.containsKey(Integer.valueOf(i11 - 1))) {
                    i11--;
                }
                Iterator it = new HashSet(hashMap.keySet()).iterator();
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (intValue < i11) {
                        c9h.AFj(String.format(Locale.US, A02(ShapeTypes.ACTION_BUTTON_BACK_PREVIOUS, 61, 41), Integer.valueOf(intValue), Integer.valueOf(i11)));
                        hashSet.add((File) hashMap.remove(Integer.valueOf(intValue)));
                    }
                }
                while (i10 >= i11) {
                    File file2 = (File) hashMap.get(Integer.valueOf(i10));
                    try {
                        A04(i10, file2);
                        hashMap.remove(Integer.valueOf(i10));
                        i10--;
                    } catch (IOException e10) {
                        c9h.AFk(String.format(Locale.US, A02(104, 62, 55), file2.getCanonicalPath(), Integer.valueOf(i10)), e10);
                        hashSet.addAll(hashMap.values());
                    }
                }
            }
            for (Object obj : hashSet) {
                String[] strArr = A04;
                if (strArr[2].length() == strArr[1].length()) {
                    throw new RuntimeException();
                }
                A04[4] = "c1qN9eBQiEQB2i";
                File file3 = (File) obj;
                if (!file3.delete()) {
                    Locale locale = Locale.US;
                    String canonicalPath = file3.getCanonicalPath();
                    Object[] objArr = new Object[1];
                    if (A04[7].charAt(19) != 'm') {
                        A04[7] = "thOmxL8vB3eH9n9jjORGQQ6LKF6RMw2U";
                        objArr[0] = canonicalPath;
                        c9h.AFj(String.format(locale, A02(40, 26, 116), objArr));
                    } else {
                        A04[7] = "xgRJlHLuW2qx7z7dN03x9GIdgxBOKXSD";
                        objArr[0] = canonicalPath;
                        c9h.AFj(String.format(locale, A02(38, 20, 82), objArr));
                    }
                }
            }
            return;
        }
        IOException e11 = new IOException(String.format(Locale.US, A02(66, 38, 13), anonymousClass99.A05().getCanonicalPath()));
        throw e11;
    }

    public final synchronized int A06() throws IOException {
        if (!this.A00) {
            if (this.A02.isEmpty()) {
                return -1;
            }
            return this.A02.getFirst().A00();
        }
        throw new IOException(A02(227, 33, 31));
    }

    public final synchronized int A07() throws IOException {
        if (!this.A00) {
            if (this.A02.isEmpty()) {
                return 0;
            }
            return this.A02.getFirst().A01();
        }
        throw new IOException(A02(227, 33, 31));
    }

    public final synchronized int A08() throws IOException {
        if (!this.A00) {
        } else {
            throw new IOException(A02(227, 33, 31));
        }
        return this.A02.size();
    }

    public final synchronized AnonymousClass97 A0A(int i10, int i11, byte[] bArr, int i12, int[] iArr, int i13) throws IOException {
        if (!this.A00) {
            for (C9I file : this.A02) {
                if (file.A00() == i10) {
                    return new AnonymousClass97(i10, file.A02(i11, bArr, i12, iArr, i13));
                }
            }
            return new AnonymousClass97(-1, new AnonymousClass96(AnonymousClass95.A05, -1, -1, 0));
        }
        throw new IOException(A02(227, 33, 31));
    }

    public final synchronized void A0B() throws IOException {
        if (!this.A00) {
            for (C9I c9i : this.A02) {
                c9i.A04();
            }
            this.A02.clear();
            A00();
        } else {
            throw new IOException(A02(227, 33, 31));
        }
    }

    public final synchronized void A0C(byte[] bArr) throws IOException {
        if (!this.A00) {
            if ((this.A02.isEmpty() || !this.A02.getLast().A05(bArr)) && !A00().A05(bArr)) {
                throw new IOException(A02(0, 40, 52));
            }
        } else {
            throw new IOException(A02(227, 33, 31));
        }
    }

    public final synchronized boolean A0D() throws IOException {
        if (!this.A00) {
            if (this.A02.size() > 1) {
                this.A02.removeFirst();
                this.A02.getFirst().A04();
                return true;
            }
            return false;
        }
        throw new IOException(A02(227, 33, 31));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        for (C9I c9i : this.A02) {
            c9i.A03();
        }
    }
}
