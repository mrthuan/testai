package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzan {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r0 == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[Catch: SQLiteException -> 0x00d8, TryCatch #8 {SQLiteException -> 0x00d8, blocks: (B:26:0x004f, B:28:0x0070, B:30:0x007f, B:32:0x0087, B:33:0x008a, B:34:0x00a8, B:37:0x00ac, B:39:0x00af, B:41:0x00b7, B:42:0x00be, B:43:0x00c1, B:45:0x00c7, B:27:0x0069), top: B:61:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7 A[Catch: SQLiteException -> 0x00d8, TryCatch #8 {SQLiteException -> 0x00d8, blocks: (B:26:0x004f, B:28:0x0070, B:30:0x007f, B:32:0x0087, B:33:0x008a, B:34:0x00a8, B:37:0x00ac, B:39:0x00af, B:41:0x00b7, B:42:0x00be, B:43:0x00c1, B:45:0x00c7, B:27:0x0069), top: B:61:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.google.android.gms.measurement.internal.zzeu r16, android.database.sqlite.SQLiteDatabase r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String[] r21) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzan.a(com.google.android.gms.measurement.internal.zzeu, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    public static void b(zzeu zzeuVar, SQLiteDatabase sQLiteDatabase) {
        File file = new File(sQLiteDatabase.getPath());
        boolean readable = file.setReadable(false, false);
        zzes zzesVar = zzeuVar.f11715i;
        if (!readable) {
            zzesVar.a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            zzesVar.a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            zzesVar.a("Failed to turn on database read permission for owner");
        }
        if (!file.setWritable(true, true)) {
            zzesVar.a("Failed to turn on database write permission for owner");
        }
    }
}
