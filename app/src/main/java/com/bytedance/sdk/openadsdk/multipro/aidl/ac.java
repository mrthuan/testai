package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: MapCursor.java */
/* loaded from: classes.dex */
public class ac implements Cursor {
    Map<String, List<String>> Qhi;

    /* renamed from: ac  reason: collision with root package name */
    int f9345ac = 0;
    String[] cJ;

    public ac(Map<String, List<String>> map) {
        if (map != null && map.keySet() != null) {
            this.Qhi = map;
            try {
                this.cJ = (String[]) map.keySet().toArray(new String[map.keySet().size()]);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        this.Qhi = new HashMap();
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int i10) {
        return new byte[0];
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        String[] strArr = this.cJ;
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    @Override // android.database.Cursor
    public int getColumnIndex(String str) {
        String[] strArr = this.cJ;
        if (strArr != null && strArr.length != 0) {
            int i10 = 0;
            while (true) {
                String[] strArr2 = this.cJ;
                if (i10 >= strArr2.length) {
                    return 0;
                }
                if (str.equals(strArr2[i10])) {
                    return i10;
                }
                i10++;
            }
        } else {
            return -1;
        }
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(String str) {
        return 0;
    }

    @Override // android.database.Cursor
    public String getColumnName(int i10) {
        if (i10 >= 0) {
            String[] strArr = this.cJ;
            if (i10 < strArr.length) {
                return strArr[i10];
            }
            return "";
        }
        return "";
    }

    @Override // android.database.Cursor
    public String[] getColumnNames() {
        return this.cJ;
    }

    @Override // android.database.Cursor
    public int getCount() {
        try {
            String[] strArr = this.cJ;
            if (strArr != null && strArr.length != 0) {
                return this.Qhi.get(strArr[0]).size();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.database.Cursor
    public double getDouble(int i10) {
        try {
            return Double.parseDouble(getString(i10));
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    @Override // android.database.Cursor
    public Bundle getExtras() {
        return null;
    }

    @Override // android.database.Cursor
    public float getFloat(int i10) {
        try {
            return Float.parseFloat(getString(i10));
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    @Override // android.database.Cursor
    public int getInt(int i10) {
        try {
            return Integer.parseInt(getString(i10));
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.database.Cursor
    public long getLong(int i10) {
        try {
            return Long.parseLong(getString(i10));
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // android.database.Cursor
    public Uri getNotificationUri() {
        return null;
    }

    @Override // android.database.Cursor
    public int getPosition() {
        return this.f9345ac;
    }

    @Override // android.database.Cursor
    public short getShort(int i10) {
        try {
            return Short.parseShort(getString(i10));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    @Override // android.database.Cursor
    public String getString(int i10) {
        if (i10 >= 0 && i10 < getColumnCount()) {
            return this.Qhi.get(this.cJ[i10]).get(getPosition());
        }
        return "";
    }

    @Override // android.database.Cursor
    public int getType(int i10) {
        return 0;
    }

    @Override // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isAfterLast() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isBeforeFirst() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isClosed() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isFirst() {
        if (this.f9345ac == 0) {
            return true;
        }
        return false;
    }

    @Override // android.database.Cursor
    public boolean isLast() {
        if (this.f9345ac == getCount() - 1) {
            return true;
        }
        return false;
    }

    @Override // android.database.Cursor
    public boolean isNull(int i10) {
        if (getString(i10) == null) {
            return true;
        }
        return false;
    }

    @Override // android.database.Cursor
    public boolean move(int i10) {
        if (this.f9345ac + i10 >= getCount()) {
            return false;
        }
        this.f9345ac += i10;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToFirst() {
        if (getCount() <= 0) {
            return false;
        }
        this.f9345ac = 0;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToLast() {
        if (getCount() <= 0) {
            return false;
        }
        this.f9345ac = this.Qhi.get(this.cJ[0]).size() - 1;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToNext() {
        if (this.f9345ac + 1 >= getCount()) {
            return false;
        }
        this.f9345ac++;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToPosition(int i10) {
        if (i10 >= getCount()) {
            return false;
        }
        this.f9345ac = i10;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToPrevious() {
        int i10 = this.f9345ac;
        if (i10 - 1 < 0) {
            return false;
        }
        this.f9345ac = i10 - 1;
        return true;
    }

    @Override // android.database.Cursor
    public boolean requery() {
        return false;
    }

    @Override // android.database.Cursor
    public Bundle respond(Bundle bundle) {
        return null;
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // android.database.Cursor
    public void deactivate() {
    }

    @Override // android.database.Cursor
    public void registerContentObserver(ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // android.database.Cursor
    public void setExtras(Bundle bundle) {
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int i10, CharArrayBuffer charArrayBuffer) {
    }

    @Override // android.database.Cursor
    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
    }
}
