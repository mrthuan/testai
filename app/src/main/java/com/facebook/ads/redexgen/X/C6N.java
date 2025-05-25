package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.lang.reflect.Method;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.6N  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C6N {
    public static String A00;
    public static byte[] A01;
    public static String[] A02 = {"jP5DLqFPT2uLfDhjwGtyJ", "b2Kf1V0V33xxSFNxYAUwKzTnuvA5CTmH", "utws2CXgYjyIi4p9N5JN7AtJgUuBwVKL", "iHkd", "J1QCfiNfulUMnwHMV72QByuh5OrpyBC4", "Ilbx2HAT56j3G7gTz5Evg9nZeC6mk12l", "SrkakodA8D", "LiqB"};
    public static final String A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C6F A02(C7j c7j) {
        Object A002;
        Method A022;
        Object A003;
        boolean z10 = true;
        Method A023 = C6O.A02(A00, A04(257, 29, 2), Context.class);
        if (A023 == null || (A002 = C6O.A00(null, A023, c7j)) == null || ((Integer) A002).intValue() != 0 || (A022 = C6O.A02(A04(65, 57, 83), A04(232, 20, 98), Context.class)) == null || (A003 = C6O.A00(null, A022, c7j)) == null) {
            return null;
        }
        Method A012 = C6O.A01(A003.getClass(), A04(252, 5, 124), new Class[0]);
        Method A013 = C6O.A01(A003.getClass(), A04(286, 24, 126), new Class[0]);
        if (A012 == null || A013 == null) {
            return null;
        }
        String str = (String) C6O.A00(A003, A012, new Object[0]);
        Boolean bool = (Boolean) C6O.A00(A003, A013, new Object[0]);
        if (str != null) {
            return new C6F(str, (bool == null || !bool.booleanValue()) ? false : false, C6E.A06);
        }
        return null;
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 90);
            if (A02[7].length() != 4) {
                throw new RuntimeException();
            }
            A02[0] = "KHgMerLXVce8bYpnKoYEO";
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{102, Field.INCLUDETEXT, Field.MERGESEQ, Field.MERGESEQ, 74, Field.ADDIN, 5, Field.SECTIONPAGES, 64, Field.ADDIN, 5, Field.INCLUDETEXT, Field.SECTION, Field.FORMDROPDOWN, 64, Field.CONTROL, Field.ADDIN, 76, 86, 76, Field.MERGESEQ, Field.SECTIONPAGES, 5, 76, Field.MERGESEQ, Field.INCLUDEPICTURE, 74, 5, 74, Field.MERGESEQ, 5, Field.NOTEREF, Field.INCLUDETEXT, 76, Field.MERGESEQ, 5, Field.ADDIN, 77, Field.CONTROL, 64, Field.INCLUDETEXT, Field.SECTION, 11, Field.HYPERLINK, Field.ADVANCE, 86, 21, Field.BIDIOUTLINE, Field.ADVANCE, Field.ADVANCE, Field.BIDIOUTLINE, Field.CONTROL, Field.GREETINGLINE, 21, Field.LISTNUM, Field.DOCPROPERTY, Field.SHAPE, Field.TOA, Field.ADVANCE, 82, Field.SHAPE, 21, Field.BIDIOUTLINE, 86, Field.NOTEREF, 106, 102, 100, Field.FILLIN, 110, 102, 102, 110, 101, 108, Field.FILLIN, 104, 103, 109, 123, 102, 96, 109, Field.FILLIN, 110, 100, 122, Field.FILLIN, 104, 109, 122, Field.FILLIN, 96, 109, 108, 103, 125, 96, 111, 96, 108, 123, Field.FILLIN, Field.NOTEREF, 109, Byte.MAX_VALUE, 108, 123, 125, 96, 122, 96, 103, 110, 64, 109, 74, 101, 96, 108, 103, 125, Field.ASK, 42, Field.DATA, 107, 34, 42, 42, 34, 41, 32, 107, 36, 43, 33, Field.IMPORT, 42, 44, 33, 107, 34, Field.DATA, Field.AUTONUM, 107, 36, 33, Field.AUTONUM, 107, 44, 33, 32, 43, Field.EQ, 44, Field.QUOTE, 44, 32, Field.IMPORT, 107, Field.AUTONUM, 32, Field.IMPORT, Field.MACROBUTTON, 44, Field.ASK, 32, 107, 22, 17, 4, 23, 17, Field.AUTONUMLGL, Field.SYMBOL, 59, 120, Field.EQ, Field.SYMBOL, Field.SYMBOL, Field.EQ, 58, Field.MACROBUTTON, 120, Field.IMPORT, 56, Field.GOTOBUTTON, 36, Field.SYMBOL, Field.BARCODE, Field.GOTOBUTTON, 120, Field.EQ, 59, Field.PAGEREF, 120, Field.AUTONUMLGL, Field.SYMBOL, 59, 59, Field.SYMBOL, 56, 120, 17, Field.SYMBOL, Field.SYMBOL, Field.EQ, 58, Field.MACROBUTTON, 6, 58, Field.IMPORT, Field.GLOSSARY, 5, Field.MACROBUTTON, 36, 32, Field.BARCODE, Field.AUTONUMLGL, Field.MACROBUTTON, Field.PAGEREF, 3, 34, Field.BARCODE, 58, 116, 118, 125, 118, 97, 122, 112, Field.SHAPE, Field.ADDRESSBLOCK, 76, 121, Field.BIDIOUTLINE, 78, Field.ADDRESSBLOCK, 74, 76, Field.ADDIN, Field.MERGESEQ, Field.ADDIN, 86, Field.SHAPE, 113, Field.BIDIOUTLINE, 113, 86, Field.GREETINGLINE, Field.CONTROL, Field.SECTION, Field.INCLUDEPICTURE, 82, 111, Field.SECTIONPAGES, Field.EQ, 43, 31, Field.IMPORT, Field.IMPORT, Field.BARCODE, Field.AUTONUMOUT, 61, 8, Field.AUTONUMOUT, Field.SYMBOL, 33, 11, 61, 42, Field.DDEAUTO, Field.EQ, 59, 61, 43, 25, Field.DDEAUTO, Field.SYMBOL, Field.EQ, Field.AUTONUMOUT, Field.SYMBOL, 58, Field.AUTONUMOUT, 61, 77, Field.CONTROL, 104, 77, Field.TOA, 77, 80, 101, 64, 112, 86, Field.FILESIZE, Field.FORMCHECKBOX, Field.AUTOTEXT, 77, 74, Field.INCLUDEPICTURE, 97, 74, Field.FILESIZE, Field.FORMTEXT, Field.NOTEREF, Field.SECTION, 64};
    }

    static {
        A05();
        A03 = C6F.class.getSimpleName();
        A00 = A04(ShapeTypes.GEAR_6, 52, 12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r3 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.C6F A00(com.facebook.ads.redexgen.X.C7j r5) {
        /*
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r1 == r0) goto L4a
            com.facebook.ads.redexgen.X.6F r4 = A01(r5)
            if (r4 == 0) goto L35
            java.lang.String r0 = r4.A03()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C6N.A02
            r0 = 5
            r1 = r1[r0]
            r0 = 3
            char r1 = r1.charAt(r0)
            r0 = 120(0x78, float:1.68E-43)
            if (r1 == r0) goto L2c
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L2c:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C6N.A02
            java.lang.String r1 = "hh0RZKDdPPlAkARzc3g59"
            r0 = 0
            r2[r0] = r1
            if (r3 == 0) goto L39
        L35:
            com.facebook.ads.redexgen.X.6F r4 = A02(r5)
        L39:
            if (r4 == 0) goto L45
            java.lang.String r0 = r4.A03()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L49
        L45:
            com.facebook.ads.redexgen.X.6F r4 = A03(r5)
        L49:
            return r4
        L4a:
            r2 = 0
            r1 = 43
            r0 = 127(0x7f, float:1.78E-43)
            java.lang.String r1 = A04(r2, r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C6N.A00(com.facebook.ads.redexgen.X.7j):com.facebook.ads.redexgen.X.6F");
    }

    public static C6F A01(C7j c7j) {
        C7n adId = c7j.A04().A8D();
        if (adId != null) {
            return new C6F(adId.getId(), adId.A9W(), C6E.A02);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.facebook.ads.internal.attribution.GmsAttributionProvider$GoogleAdInfo] */
    public static C6F A03(C7j c7j) {
        C6M c6m = new C6M();
        Intent intent = new Intent(A04(122, 51, 31));
        intent.setPackage(A04(43, 22, 97));
        if (c7j.bindService(intent, c6m, 1)) {
            try {
                final IBinder A022 = c6m.A02();
                ?? r02 = new IInterface(A022) { // from class: com.facebook.ads.internal.attribution.GmsAttributionProvider$GoogleAdInfo
                    public static byte[] A01;
                    public static String[] A02 = {"CGAQp5QWLLSg2Up0KS3Xu0sm6KBD8ljy", "Yp64XCOUL3mdw2EQzsnOwJCP4iXogchF", "0bXbaFV76JbdIHYzvJ", "7kYBXtp0pJ6J2QiQOtBXkhx4Mjb4MhNb", "Pqj6DcWbIXVdg5nys55lljt7m2mFJmbz", "gqs8Z9zjV1B", "yb2LGnYLr1jAVzG6", "kQWFHy19WQfgSFrPEiRm4PYEBX"};
                    public IBinder A00;

                    public static String A00(int i10, int i11, int i12) {
                        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
                        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 103);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A01() {
                        A01 = new byte[]{100, 104, 106, 41, 96, 104, 104, 96, 107, 98, 41, 102, 105, 99, 117, 104, 110, 99, 41, 96, 106, 116, 41, 102, 99, 116, 41, 110, 99, 98, 105, 115, 110, 97, 110, 98, 117, 41, 110, 105, 115, 98, 117, 105, 102, 107, 41, 78, Field.FORMTEXT, 99, 113, 98, 117, 115, 110, 116, 110, 105, 96, 78, 99, Field.ADVANCE, 98, 117, 113, 110, 100, 98};
                    }

                    static {
                        A01();
                    }

                    {
                        this.A00 = A022;
                    }

                    public final String A02() throws RemoteException {
                        Parcel obtain = Parcel.obtain();
                        Parcel obtain2 = Parcel.obtain();
                        try {
                            obtain.writeInterfaceToken(A00(0, 68, 96));
                            this.A00.transact(1, obtain, obtain2, 0);
                            obtain2.readException();
                            String readString = obtain2.readString();
                            if (readString != null) {
                                return readString;
                            }
                            if (A02[2].length() != 16) {
                                A02[3] = "0APG8T86KeB7s6esCzOnlOcV6mb8f0OX";
                                return A00(0, 0, 82);
                            }
                            throw new RuntimeException();
                        } finally {
                            obtain2.recycle();
                            obtain.recycle();
                        }
                    }

                    public final boolean A03() throws RemoteException {
                        Parcel obtain = Parcel.obtain();
                        Parcel obtain2 = Parcel.obtain();
                        try {
                            obtain.writeInterfaceToken(A00(0, 68, 96));
                            boolean z10 = true;
                            obtain.writeInt(1);
                            this.A00.transact(2, obtain, obtain2, 0);
                            obtain2.readException();
                            if (obtain2.readInt() == 0) {
                                z10 = false;
                            }
                            return z10;
                        } finally {
                            obtain2.recycle();
                            obtain.recycle();
                        }
                    }

                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
                        return this.A00;
                    }
                };
                return new C6F(r02.A02(), r02.A03(), C6E.A07);
            } catch (Throwable th2) {
                try {
                    c7j.A07().AA0(A04(225, 7, 73), C8E.A1Q, new C8F(th2));
                } finally {
                    c7j.unbindService(c6m);
                }
            }
        }
        return null;
    }
}
