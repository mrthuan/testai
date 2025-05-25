package com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.sdk.component.Tgh.Qhi.hm;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DBHelper.java */
/* loaded from: classes.dex */
public class cJ {
    private C0082cJ Qhi;
    private Context cJ;

    /* compiled from: DBHelper.java */
    /* loaded from: classes.dex */
    public class Qhi extends AbstractCursor {
        private Qhi() {
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i10) {
            return 0.0d;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i10) {
            return 0.0f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i10) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i10) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i10) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i10) {
            return true;
        }
    }

    public cJ(Context context) {
        try {
            this.cJ = context.getApplicationContext();
            if (this.Qhi == null) {
                this.Qhi = new C0082cJ();
            }
        } catch (Throwable unused) {
        }
    }

    public C0082cJ Qhi() {
        return this.Qhi;
    }

    /* compiled from: DBHelper.java */
    /* renamed from: com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.cJ$cJ  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0082cJ {
        private volatile SQLiteDatabase cJ = null;

        public C0082cJ() {
        }

        private void Qhi() {
            try {
                if (this.cJ != null && this.cJ.isOpen()) {
                    return;
                }
                synchronized (this) {
                    if (this.cJ == null || !this.cJ.isOpen()) {
                        this.cJ = hm.ROR().CJ().Qhi(hm.ROR().Tgh());
                        this.cJ.setLockingEnabled(false);
                    }
                }
            } catch (Throwable th2) {
                if (cJ()) {
                    throw th2;
                }
            }
        }

        private boolean cJ() {
            SQLiteDatabase sQLiteDatabase = this.cJ;
            if (sQLiteDatabase != null && sQLiteDatabase.inTransaction()) {
                return true;
            }
            return false;
        }

        public void Qhi(String str) {
            try {
                Qhi();
                this.cJ.execSQL(str);
            } catch (Throwable th2) {
                if (cJ()) {
                    throw th2;
                }
            }
        }

        public Cursor Qhi(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            try {
                Qhi();
                return this.cJ.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th2) {
                Qhi qhi = new Qhi();
                if (cJ()) {
                    throw th2;
                }
                return qhi;
            }
        }

        public int Qhi(String str, ContentValues contentValues, String str2, String[] strArr) {
            try {
                Qhi();
                return this.cJ.update(str, contentValues, str2, strArr);
            } catch (Exception e10) {
                if (cJ()) {
                    throw e10;
                }
                return 0;
            }
        }

        public long Qhi(String str, String str2, ContentValues contentValues) {
            try {
                Qhi();
                return this.cJ.insert(str, str2, contentValues);
            } catch (Exception e10) {
                if (cJ()) {
                    throw e10;
                }
                return -1L;
            }
        }

        public synchronized void Qhi(String str, String str2, List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> list) {
            JSONObject ROR;
            try {
                Qhi();
                this.cJ.beginTransaction();
                ContentValues contentValues = new ContentValues();
                for (int i10 = 0; i10 < list.size(); i10++) {
                    com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh tgh = list.get(i10);
                    if (tgh != null && (ROR = tgh.ROR()) != null) {
                        contentValues.put(FacebookMediationAdapter.KEY_ID, tgh.ac());
                        String cJ = hm.ROR().hpZ().cJ(ROR.toString());
                        if (!TextUtils.isEmpty(cJ)) {
                            contentValues.put("value", cJ);
                            contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("retry", (Integer) 0);
                            contentValues.put("encrypt", (Integer) 1);
                            if (com.bytedance.sdk.component.Tgh.Qhi.ac.Qhi.CJ() && tgh.WAv() > 0 && (tgh.CJ() == 0 || tgh.CJ() == 3)) {
                                contentValues.put("channel", Integer.valueOf(tgh.WAv()));
                            }
                            this.cJ.insert(str, str2, contentValues);
                        }
                        contentValues.clear();
                    }
                }
                this.cJ.setTransactionSuccessful();
                list.size();
                if (this.cJ != null) {
                    this.cJ.endTransaction();
                }
            } catch (Exception e10) {
                list.size();
                if (!cJ()) {
                    if (this.cJ != null) {
                        this.cJ.endTransaction();
                    }
                } else {
                    throw e10;
                }
            }
        }

        public int Qhi(String str, String str2, String[] strArr) {
            try {
                Qhi();
                return this.cJ.delete(str, str2, strArr);
            } catch (Exception e10) {
                if (cJ()) {
                    throw e10;
                }
                return 0;
            }
        }
    }
}
