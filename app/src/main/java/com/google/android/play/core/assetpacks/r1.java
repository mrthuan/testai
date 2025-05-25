package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class r1 {

    /* renamed from: b  reason: collision with root package name */
    public static final q9.y f13372b = new q9.y("MergeSliceTaskHandler");

    /* renamed from: a  reason: collision with root package name */
    public final d0 f13373a;

    public r1(d0 d0Var) {
        this.f13373a = d0Var;
    }

    public static void b(File file, File file2) {
        File[] listFiles;
        if (file.isDirectory()) {
            file2.mkdirs();
            for (File file3 : file.listFiles()) {
                b(file3, new File(file2, file3.getName()));
            }
            if (!file.delete()) {
                throw new ck("Unable to delete directory: ".concat(String.valueOf(file)));
            }
        } else if (!file2.exists()) {
            if (file.renameTo(file2)) {
                return;
            }
            throw new ck("Unable to move file: ".concat(String.valueOf(file)));
        } else {
            throw new ck("File clashing with existing file from other slice: ".concat(file2.toString()));
        }
    }

    public final void a(q1 q1Var) {
        File n10 = this.f13373a.n(q1Var.c, q1Var.f13249b, q1Var.f13361e, q1Var.f13360d);
        boolean exists = n10.exists();
        int i10 = q1Var.f13248a;
        if (exists) {
            d0 d0Var = this.f13373a;
            d0Var.getClass();
            int i11 = q1Var.c;
            long j10 = q1Var.f13360d;
            String str = q1Var.f13249b;
            File file = new File(d0Var.d(i11, j10, str), "_packs");
            if (!file.exists()) {
                file.mkdirs();
            }
            b(n10, file);
            try {
                File file2 = new File(new File(d0Var.d(i11, j10, str), "_packs"), "merge.tmp");
                Properties properties = new Properties();
                properties.put("numberOfMerges", String.valueOf(d0Var.i(i11, j10, str) + 1));
                file2.getParentFile().mkdirs();
                file2.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                properties.store(fileOutputStream, (String) null);
                fileOutputStream.close();
                return;
            } catch (IOException e10) {
                f13372b.b("Writing merge checkpoint failed with %s.", e10.getMessage());
                throw new ck("Writing merge checkpoint failed.", e10, i10);
            }
        }
        throw new ck(String.format("Cannot find verified files for slice %s.", q1Var.f13361e), i10);
    }
}
