package com.bykv.vk.openvk.component.video.Qhi.cJ.cJ;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.sdk.component.Sf.WAv;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: VideoProxyDB.java */
/* loaded from: classes.dex */
public class ac {
    private static volatile ac cJ;
    private final Executor CJ;
    private final SparseArray<Map<String, Qhi>> Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private final fl f7160ac;

    /* renamed from: fl  reason: collision with root package name */
    private volatile SQLiteStatement f7161fl;

    private ac(Context context) {
        SparseArray<Map<String, Qhi>> sparseArray = new SparseArray<>(2);
        this.Qhi = sparseArray;
        this.CJ = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new WAv(5, "video_proxy_db"));
        this.f7160ac = new fl(context.getApplicationContext());
        sparseArray.put(0, new ConcurrentHashMap());
        sparseArray.put(1, new ConcurrentHashMap());
    }

    private String cJ(int i10) {
        if (i10 <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(i10 << 1);
        sb2.append("?");
        for (int i11 = 1; i11 < i10; i11++) {
            sb2.append(",?");
        }
        return sb2.toString();
    }

    public static ac Qhi(Context context) {
        if (cJ == null) {
            synchronized (ac.class) {
                if (cJ == null) {
                    cJ = new ac(context);
                }
            }
        }
        return cJ;
    }

    public Qhi Qhi(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map<String, Qhi> map = this.Qhi.get(i10);
        Qhi qhi = map == null ? null : map.get(str);
        if (qhi != null) {
            return qhi;
        }
        try {
            Cursor query = this.f7160ac.getReadableDatabase().query("video_http_header_t", null, "key=? AND flag=?", new String[]{str, String.valueOf(i10)}, null, null, null, "1");
            if (query != null) {
                if (query.getCount() > 0 && query.moveToNext()) {
                    qhi = new Qhi(query.getString(query.getColumnIndex("key")), query.getString(query.getColumnIndex("mime")), query.getInt(query.getColumnIndex("contentLength")), i10, query.getString(query.getColumnIndex("extra")));
                }
                query.close();
            }
            if (qhi != null && map != null) {
                map.put(str, qhi);
            }
            return qhi;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void Qhi(final Qhi qhi) {
        if (qhi != null) {
            Map<String, Qhi> map = this.Qhi.get(qhi.CJ);
            if (map != null) {
                map.put(qhi.Qhi, qhi);
            }
            this.CJ.execute(new Runnable() { // from class: com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.ac.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (ac.this.f7161fl == null) {
                            ac acVar = ac.this;
                            acVar.f7161fl = acVar.f7160ac.getWritableDatabase().compileStatement("INSERT INTO video_http_header_t (key,mime,contentLength,flag,extra) VALUES(?,?,?,?,?)");
                        } else {
                            ac.this.f7161fl.clearBindings();
                        }
                        ac.this.f7161fl.bindString(1, qhi.Qhi);
                        ac.this.f7161fl.bindString(2, qhi.cJ);
                        ac.this.f7161fl.bindLong(3, qhi.f7158ac);
                        ac.this.f7161fl.bindLong(4, qhi.CJ);
                        ac.this.f7161fl.bindString(5, qhi.f7159fl);
                        ac.this.f7161fl.executeInsert();
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    public void Qhi(Collection<String> collection, int i10) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        int size = collection.size() + 1;
        String[] strArr = new String[size];
        Map<String, Qhi> map = this.Qhi.get(i10);
        int i11 = -1;
        for (String str : collection) {
            if (map != null) {
                map.remove(str);
            }
            i11++;
            strArr[i11] = str;
        }
        strArr[i11 + 1] = String.valueOf(i10);
        try {
            SQLiteDatabase writableDatabase = this.f7160ac.getWritableDatabase();
            writableDatabase.delete("video_http_header_t", "key IN(" + cJ(size) + ") AND flag=?", strArr);
        } catch (Throwable unused) {
        }
    }

    public void Qhi(final int i10) {
        Map<String, Qhi> map = this.Qhi.get(i10);
        if (map != null) {
            map.clear();
        }
        this.CJ.execute(new Runnable() { // from class: com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.ac.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ac.this.f7160ac.getWritableDatabase().delete("video_http_header_t", "flag=?", new String[]{String.valueOf(i10)});
                } catch (Throwable unused) {
                }
            }
        });
    }
}
