package com.bykv.vk.openvk.preload.geckox.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AbandonChannelSQLiteHelper.java */
/* loaded from: classes.dex */
public class b extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f7504a;

    private b(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static b a(Context context) {
        String c;
        if (f7504a == null) {
            synchronized (b.class) {
                if (f7504a == null) {
                    Context applicationContext = context.getApplicationContext();
                    StringBuilder sb2 = new StringBuilder("geckox_clean_statistic");
                    if (!TextUtils.isEmpty(com.bykv.vk.openvk.preload.geckox.utils.a.f7660a)) {
                        c = com.bykv.vk.openvk.preload.geckox.utils.a.f7660a;
                    } else {
                        String a10 = com.bykv.vk.openvk.preload.geckox.utils.a.a();
                        com.bykv.vk.openvk.preload.geckox.utils.a.f7660a = a10;
                        if (!TextUtils.isEmpty(a10)) {
                            c = com.bykv.vk.openvk.preload.geckox.utils.a.f7660a;
                        } else {
                            String b10 = com.bykv.vk.openvk.preload.geckox.utils.a.b();
                            com.bykv.vk.openvk.preload.geckox.utils.a.f7660a = b10;
                            if (!TextUtils.isEmpty(b10)) {
                                c = com.bykv.vk.openvk.preload.geckox.utils.a.f7660a;
                            } else {
                                c = com.bykv.vk.openvk.preload.geckox.utils.a.c(context);
                                com.bykv.vk.openvk.preload.geckox.utils.a.f7660a = c;
                            }
                        }
                    }
                    sb2.append(c);
                    sb2.append(".db");
                    f7504a = new b(applicationContext, sb2.toString());
                }
            }
        }
        return f7504a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table if not exists geckox_clean_statistic (id integer primary key autoincrement,access_key text,channel text,clean_type integer,status integer,pkg_id integer,err_code integer,clean_strategy integer,clean_duration integer,err_msg text)");
    }

    public final void a(String str, String str2, int i10, int i11, long j10, int i12, String str3, long j11) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("access_key", str);
        contentValues.put("channel", str2);
        contentValues.put("clean_type", Integer.valueOf(i10));
        contentValues.put("status", Integer.valueOf(i11));
        contentValues.put("pkg_id", Long.valueOf(j10));
        contentValues.put("err_code", Integer.valueOf(i12));
        contentValues.put("err_msg", str3);
        contentValues.put("clean_duration", Long.valueOf(j11));
        contentValues.put("clean_strategy", (Integer) 1);
        try {
            getWritableDatabase().insert("geckox_clean_statistic", null, contentValues);
        } catch (Exception e10) {
            GeckoLogger.w("clean-channel", "insert failed", e10);
        }
    }

    public final List<StatisticModel.PackageStatisticModel> a() {
        Cursor cursor;
        ArrayList arrayList = new ArrayList();
        Cursor cursor2 = null;
        try {
            cursor = getWritableDatabase().query("geckox_clean_statistic", null, null, null, null, null, null);
        } catch (Exception e10) {
            e = e10;
        }
        if (cursor == null) {
            return arrayList;
        }
        while (cursor.moveToNext()) {
            try {
                String string = cursor.getString(cursor.getColumnIndex("access_key"));
                String string2 = cursor.getString(cursor.getColumnIndex("channel"));
                int i10 = cursor.getInt(cursor.getColumnIndex("clean_type"));
                int i11 = cursor.getInt(cursor.getColumnIndex("status"));
                int i12 = cursor.getInt(cursor.getColumnIndex("err_code"));
                String string3 = cursor.getString(cursor.getColumnIndex("err_msg"));
                int i13 = cursor.getInt(cursor.getColumnIndex("clean_strategy"));
                long j10 = cursor.getLong(cursor.getColumnIndex("clean_duration"));
                StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
                packageStatisticModel.accessKey = string;
                packageStatisticModel.channel = string2;
                packageStatisticModel.statsType = Integer.valueOf(i11);
                packageStatisticModel.f7626id = Long.valueOf(cursor.getInt(cursor.getColumnIndex("pkg_id")));
                packageStatisticModel.errCode = i12 == 0 ? null : String.valueOf(i12);
                packageStatisticModel.errMsg = string3;
                packageStatisticModel.cleanType = Integer.valueOf(i10);
                packageStatisticModel.cleanDuration = Long.valueOf(j10);
                packageStatisticModel.cleanStrategy = Integer.valueOf(i13);
                arrayList.add(packageStatisticModel);
            } catch (Exception e11) {
                e = e11;
                cursor2 = cursor;
                GeckoLogger.w("clean-channel", "get all statistic failed!", e);
                cursor = cursor2;
                CloseableUtils.close(cursor);
                return arrayList;
            }
        }
        getWritableDatabase().delete("geckox_clean_statistic", null, null);
        CloseableUtils.close(cursor);
        return arrayList;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
