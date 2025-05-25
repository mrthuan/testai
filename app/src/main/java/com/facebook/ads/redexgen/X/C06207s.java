package com.facebook.ads.redexgen.X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.AsyncTask;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.7s  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06207s {
    public static byte[] A04;
    public static final String A05;
    public static final Lock A06;
    public static final Lock A07;
    public static final ReentrantReadWriteLock A08;
    public SQLiteOpenHelper A00;
    public final C1313Zr A01;
    public final C1311Zp A03 = new C1311Zp(this);
    public final C1312Zq A02 = new C1312Zq(this);

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 17);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A04 = new byte[]{-82, -53, -82, 109, -117, 109, -116, Field.DOCPROPERTY, 118, -120, 120, -102, -64, -52, -55, -57, -102, Byte.MAX_VALUE, -87, -82, -88, -83, Byte.MAX_VALUE, Field.GREETINGLINE, -118, -121, -117, -121, -110, Field.GREETINGLINE, -93, -46, -47, -93, Field.CONTROL, -122, -119, 123, 124, -119, Field.CONTROL, 121, -112, Field.CONTROL, Field.DOCPROPERTY, -120, 122, -119, Field.DOCPROPERTY, -115, -60, -75, -78, -65, -78, -115, 110, 116, -82, -94, Field.GREETINGLINE, 110, -101, -99, -55, -25, -12, -12, -11, -6, -90, -23, -25, -14, -14, -90, -19, -21, -6, -54, -25, -6, -25, -24, -25, -7, -21, -90, -20, -8, -11, -13, -90, -6, -18, -21, -90, -37, -49, -90, -6, -18, -8, -21, -25, -22, -89, -112, -126, -119, -126, Byte.MIN_VALUE, -111, Field.ADDRESSBLOCK, -79, -84, -88, -94, -85, -80, 107, -64, -69, -81, -84, -65, -80, -117, -29, -32, -13, -32, -31, -32, -14, -28, -112, -95, -112, -103, -97, -98, -116, -121, -125, 125, -122, -117};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0J() {
        for (int i10 = 0; i10 < A0M().length; i10++) {
        }
        if (this.A00 != null) {
            this.A00.close();
            this.A00 = null;
        }
    }

    static {
        A07();
        StringBuilder append = new StringBuilder().append(A05(107, 14, 44)).append(C1311Zp.A03.A01);
        String A052 = A05(58, 2, 113);
        StringBuilder append2 = append.append(A052);
        String A053 = A05(ShapeTypes.FLOW_CHART_MANUAL_OPERATION, 6, 7);
        StringBuilder append3 = append2.append(A053);
        String A054 = A05(60, 1, 31);
        StringBuilder append4 = append3.append(A054).append(C1311Zp.A02.A01).append(A052);
        String A055 = A05(ShapeTypes.FLOW_CHART_INTERNAL_STORAGE, 6, 26);
        A05 = append4.append(A055).append(A054).append(C1312Zq.A04.A01).append(A052).append(A055).append(A054).append(C1312Zq.A05.A01).append(A052).append(A055).append(A054).append(C1312Zq.A0A.A01).append(A052).append(A055).append(A054).append(C1312Zq.A08.A01).append(A052).append(A055).append(A054).append(C1312Zq.A07.A01).append(A052).append(A055).append(A054).append(C1312Zq.A06.A01).append(A052).append(A055).append(A054).append(C1312Zq.A03.A01).append(A052).append(A055).append(A054).append(C1312Zq.A02.A01).append(A05(11, 6, 105)).append(A055).append(A05(17, 6, 78)).append(A053).append(A05(30, 4, 114)).append(A055).append(A054).append(C1312Zq.A09.A01).append(A05(0, 3, 125)).append(A053).append(A054).append(C1311Zp.A03.A01).append(A05(34, 10, 38)).append(A055).append(A054).append(C1312Zq.A08.A01).append(A05(7, 4, 36)).toString();
        A08 = new ReentrantReadWriteLock();
        A06 = A08.readLock();
        A07 = A08.writeLock();
    }

    public C06207s(C1313Zr c1313Zr) {
        this.A01 = c1313Zr;
    }

    private synchronized SQLiteDatabase A00() {
        if (this.A00 == null) {
            final C1313Zr c1313Zr = this.A01;
            this.A00 = new SQLiteOpenHelper(c1313Zr, this) { // from class: com.facebook.ads.redexgen.X.7t
                public static byte[] A01;
                public static String[] A02 = {"XfAyR2vU0BibGbkW5sl", "72EQRqCB7z", "pQj0Q1BmcNSJNmsLpeVJ6qN75i73IOus", "lsxje2C6xdGld5UPkxYO", "GgAbEVzt1AOENmbxI3KXH96Z5ccDQ2lY", "3OXRqiMUeM1s", "WQkJsHQStWfxe", "yOid3ecrxpkgxviYKYk6NUThnYl"};
                public static final String A03;
                public final C06207s A00;

                public static String A00(int i10, int i11, int i12) {
                    byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
                    for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                        copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 67);
                    }
                    return new String(copyOfRange);
                }

                public static void A02() {
                    A01 = new byte[]{-105, 101, -119, -118, -117, -122, -102, -111, -103, 101, 117, 0, 11, 19, 4, 17, -33, 19, 0, 1, 11, 4, -33, 36, Field.AUTONUMLGL, 36, Field.DDE, Field.MACROBUTTON, Field.GOTOBUTTON, -33, 0, 3, 3, -33, 2, 14, 11, 20, 12, 13, -33, -122, -87, -119, -90, -71, -90, -89, -90, -72, -86, -115, -86, -79, -75, -86, -73, 101, -88, -90, -77, 101, -77, -76, -71, 101, -89, -86, 101, -77, -70, -79, -79, -16, -2, -5, -4, -52, 0, -19, -18, -8, -15, -52, -11, -14, -52, -15, 4, -11, -1, 0, -1, -52, 15, 30, 13, 31, 20, 17, 31, -10, -8, -25, -19, -13, -25, -58, 12, 21, 24, 11, 15, 13, 20, 5, 17, 11, 31, 25, -58, -29, -58, -11, -12, -31, -51, -48, -33, -111, -33, -102, -48, -50};
                    if (A02[7].length() == 23) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A02;
                    strArr[4] = "z4ETzKVSWwABxmvmOp0bWtQm6ZVGd83i";
                    strArr[2] = "IiBR5v01IEKLzmVqyabUzMw7zaZ4VOx3";
                }

                static {
                    A02();
                    A03 = C7t.class.getSimpleName();
                }

                {
                    super(c1313Zr, A01(c1313Zr), (SQLiteDatabase.CursorFactory) null, 4);
                    if (this != null) {
                        this.A00 = this;
                        return;
                    }
                    throw new IllegalArgumentException(A00(41, 32, 2));
                }

                public static String A01(C1313Zr c1313Zr2) {
                    Locale locale = Locale.US;
                    Object[] objArr = {A00(0, 0, 19)};
                    String A00 = A00(126, 8, 41);
                    String format = String.format(locale, A00, objArr);
                    if (!C0877Im.A2X(c1313Zr2)) {
                        return format;
                    }
                    String defaultDbName = c1313Zr2.getPackageName();
                    String processName = ProcessUtils.getProcessName(c1313Zr2);
                    if (!defaultDbName.equals(processName) && !TextUtils.isEmpty(processName)) {
                        String defaultDbName2 = String.format(Locale.US, A00, '_' + processName);
                        return defaultDbName2;
                    }
                    return format;
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onCreate(SQLiteDatabase sQLiteDatabase) {
                    for (AbstractC06237w abstractC06237w : this.A00.A0M()) {
                        abstractC06237w.A07(sQLiteDatabase);
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
                    AbstractC06237w[] A0M;
                    for (AbstractC06237w abstractC06237w : this.A00.A0M()) {
                        abstractC06237w.A08(sQLiteDatabase);
                        abstractC06237w.A07(sQLiteDatabase);
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onOpen(SQLiteDatabase sQLiteDatabase) {
                    super.onOpen(sQLiteDatabase);
                    if (!sQLiteDatabase.isReadOnly()) {
                        sQLiteDatabase.execSQL(A00(101, 25, 99));
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
                    if (i10 == 2 && i11 >= 3) {
                        sQLiteDatabase.execSQL(A00(73, 28, 105));
                    }
                    if (i10 <= 3 && i11 >= 4) {
                        C7q c7q = C1312Zq.A02;
                        sQLiteDatabase.execSQL(A00(11, 30, 124) + c7q.A01 + A00(0, 1, 52) + c7q.A02 + A00(1, 10, 2));
                    }
                }
            };
        }
        return this.A00.getWritableDatabase();
    }

    private synchronized SQLiteDatabase A01() {
        SQLiteException e10 = null;
        for (int i10 = 0; i10 < 10; i10++) {
            try {
            } catch (SQLiteException e11) {
                e10 = e11;
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException unused) {
                }
            }
        }
        this.A01.A07().AA0(A05(128, 8, 110), C8E.A0v, new C8F(e10));
        throw e10;
        return A00();
    }

    public final int A08(int i10) {
        A07.lock();
        try {
            return A0E().delete(A05(ShapeTypes.FLOW_CHART_INTERNAL_STORAGE, 6, 26), C1312Zq.A02.A01 + A05(3, 4, 60), new String[]{String.valueOf(i10 - 1)});
        } finally {
            A07.unlock();
        }
    }

    public final Cursor A09() {
        A06.lock();
        try {
            return this.A02.A0B();
        } finally {
            A06.unlock();
        }
    }

    public final Cursor A0A() {
        A06.lock();
        try {
            return this.A02.A0C();
        } finally {
            A06.unlock();
        }
    }

    public final Cursor A0B() {
        A06.lock();
        try {
            return this.A03.A0B();
        } finally {
            A06.unlock();
        }
    }

    public final Cursor A0C(int i10) {
        A06.lock();
        try {
            return A0E().rawQuery(A05 + A05(23, 7, 45) + String.valueOf(i10), null);
        } finally {
            A06.unlock();
        }
    }

    public final Cursor A0D(String str) {
        A06.lock();
        try {
            return this.A02.A0D(str);
        } finally {
            A06.unlock();
        }
    }

    public final SQLiteDatabase A0E() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return A01();
        }
        throw new IllegalStateException(A05(64, 43, 117));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7v != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8y != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<T> */
    public final <T> AsyncTask A0F(final AbstractC06227v<T> abstractC06227v, final AbstractC06498y<T> abstractC06498y) {
        Executor executor = M8.A07;
        final C1313Zr c1313Zr = this.A01;
        return M5.A00(executor, new AsyncTask<Void, Void, T>(c1313Zr, abstractC06227v, abstractC06498y) { // from class: com.facebook.ads.redexgen.X.7r
            public static byte[] A04;
            public EnumC06217u A00;
            public final C1313Zr A01;
            public final AbstractC06227v<T> A02;
            public final AbstractC06498y<T> A03;

            static {
                A02();
            }

            public static String A01(int i10, int i11, int i12) {
                byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
                for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                    copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 72);
                }
                return new String(copyOfRange);
            }

            public static void A02() {
                A04 = new byte[]{5, 2, 21, 2, 3, 2, 20, 6};
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7r != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7v != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8y != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<T> */
            {
                this.A02 = abstractC06227v;
                this.A03 = abstractC06498y;
                this.A01 = c1313Zr;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7r != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            private final T A00(Void... voidArr) {
                if (KQ.A02(this)) {
                    return null;
                }
                T t4 = null;
                try {
                    try {
                        t4 = this.A02.A03();
                        this.A00 = this.A02.A00();
                        return t4;
                    } catch (Exception e10) {
                        this.A01.A07().AA0(A01(0, 8, 89), C8E.A0w, new C8F(e10));
                        this.A00 = EnumC06217u.A08;
                        return t4;
                    }
                } catch (Throwable th2) {
                    KQ.A00(th2, this);
                    return null;
                }
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7r != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            @Override // android.os.AsyncTask
            public final /* bridge */ /* synthetic */ Object doInBackground(Void[] voidArr) {
                if (KQ.A02(this)) {
                    return null;
                }
                try {
                    return A00(voidArr);
                } catch (Throwable th2) {
                    KQ.A00(th2, this);
                    return null;
                }
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7r != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            @Override // android.os.AsyncTask
            public final void onPostExecute(T result) {
                if (KQ.A02(this)) {
                    return;
                }
                try {
                    if (this.A00 == null) {
                        this.A03.A02(result);
                    } else {
                        this.A03.A01(this.A00.A03(), this.A00.A04());
                    }
                } catch (Throwable th2) {
                    KQ.A00(th2, this);
                }
            }
        }, new Void[0]);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8y != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    public final AsyncTask A0G(String str, int i10, String str2, double d10, double d11, String str3, Map<String, String> data, AbstractC06498y<String> abstractC06498y) {
        return A0F(new Eh(this, str2, str, i10, d10, d11, str3, data), abstractC06498y);
    }

    public final void A0H() {
        A07.lock();
        try {
            this.A02.A09();
            this.A03.A09();
        } finally {
            A07.unlock();
        }
    }

    public final void A0I() {
        A07.lock();
        try {
            this.A03.A0D(this.A01);
        } finally {
            A07.unlock();
        }
    }

    public final boolean A0K(String str) {
        A07.lock();
        try {
            return this.A02.A0F(str);
        } finally {
            A07.unlock();
        }
    }

    public final boolean A0L(String str) {
        boolean z10;
        A07.lock();
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(A05(121, 7, 90)).append(A05(ShapeTypes.FLOW_CHART_INTERNAL_STORAGE, 6, 26)).append(A05(44, 5, 36)).append(C1312Zq.A02.A01).append(A05(61, 1, 32)).append(C1312Zq.A02.A01).append(A05(56, 2, 50)).append(A05(49, 7, 92)).append(C1312Zq.A04.A01).append(A05(62, 2, 77));
            A0E().execSQL(sb2.toString(), new String[]{str});
            z10 = true;
        } catch (SQLiteException unused) {
            z10 = false;
        }
        A07.unlock();
        return z10;
    }

    public final AbstractC06237w[] A0M() {
        return new AbstractC06237w[]{this.A03, this.A02};
    }
}
