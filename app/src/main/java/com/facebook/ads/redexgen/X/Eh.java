package com.facebook.ads.redexgen.X;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public class Eh extends AbstractC1310Zo<String> {
    public static byte[] A08;
    public static String[] A09 = {"ZKW0rplATEIsE5gjt8qXTQnY", "r6HJdeSoORQdJfGxA0AnZWlkU33wQIlK", "lLZOtDHAe6uwMhK1fYaqg", "CFnqFcdcZfU1FaRsph1ThokBMpi4uqZk", "TONJvFd", "LRRDDC4", "oqOd7Km", "E"};
    public final /* synthetic */ double A00;
    public final /* synthetic */ double A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C06207s A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ Map A07;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 122);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {56, Field.AUTONUMLGL, Field.NOTEREF, Field.AUTONUMLGL, Field.AUTONUM, Field.AUTONUMLGL, Field.FORMCHECKBOX, Field.SYMBOL};
        if (A09[2].length() == 32) {
            throw new RuntimeException();
        }
        A09[2] = "0lpDBp9tBU8jLddyd5eWZp";
        A08 = bArr;
    }

    static {
        A02();
    }

    public Eh(C06207s c06207s, String str, String str2, int i10, double d10, double d11, String str3, Map map) {
        this.A03 = c06207s;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = i10;
        this.A01 = d10;
        this.A00 = d11;
        this.A04 = str3;
        this.A07 = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC06227v
    /* renamed from: A00 */
    public final String A03() {
        C1313Zr c1313Zr;
        Lock lock;
        Lock lock2;
        C1313Zr c1313Zr2;
        C1313Zr c1313Zr3;
        Lock lock3;
        C1313Zr c1313Zr4;
        C1312Zq c1312Zq;
        C1311Zp c1311Zp;
        Lock lock4;
        C1313Zr c1313Zr5;
        String eventId = A01(0, 8, 90);
        c1313Zr = this.A03.A01;
        c1313Zr.A07().A9A(this.A06);
        if (TextUtils.isEmpty(this.A05)) {
            return null;
        }
        lock = C06207s.A07;
        lock.lock();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                sQLiteDatabase = this.A03.A0E();
                sQLiteDatabase.beginTransaction();
                c1312Zq = this.A03.A02;
                c1311Zp = this.A03.A03;
                String A0E = c1312Zq.A0E(c1311Zp.A0C(this.A05), this.A02, this.A06, this.A01, this.A00, this.A04, this.A07);
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception e10) {
                        c1313Zr5 = this.A03.A01;
                        c1313Zr5.A07().AA0(eventId, C8E.A0z, new C8F(e10));
                    }
                }
                lock4 = C06207s.A07;
                lock4.unlock();
                return A0E;
            } catch (Exception e11) {
                A01(EnumC06217u.A05);
                c1313Zr3 = this.A03.A01;
                c1313Zr3.A07().AA0(eventId, C8E.A0y, new C8F(e11));
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception e12) {
                        c1313Zr4 = this.A03.A01;
                        c1313Zr4.A07().AA0(eventId, C8E.A0z, new C8F(e12));
                    }
                }
                lock3 = C06207s.A07;
                lock3.unlock();
                return null;
            }
        } catch (Throwable th2) {
            if (sQLiteDatabase != null) {
                boolean isOpen = sQLiteDatabase.isOpen();
                if (A09[5].length() != 7) {
                    throw new RuntimeException();
                }
                A09[2] = "rWG930h";
                if (isOpen) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception e13) {
                        c1313Zr2 = this.A03.A01;
                        c1313Zr2.A07().AA0(eventId, C8E.A0z, new C8F(e13));
                    }
                }
            }
            lock2 = C06207s.A07;
            lock2.unlock();
            throw th2;
        }
    }
}
