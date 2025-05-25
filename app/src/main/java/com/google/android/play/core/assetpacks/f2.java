package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class f2 {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f13232a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    public static ArrayList a(File file, File file2) {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file2.listFiles(new e2());
        if (listFiles == null) {
            fileArr = new File[0];
        } else {
            File[] fileArr2 = new File[listFiles.length];
            int i10 = 0;
            while (true) {
                int length = listFiles.length;
                if (i10 < length) {
                    File file3 = listFiles[i10];
                    int parseInt = Integer.parseInt(file3.getName().split("-")[0]);
                    if (parseInt > length || fileArr2[parseInt] != null) {
                        break;
                    }
                    fileArr2[parseInt] = file3;
                    i10++;
                } else {
                    fileArr = fileArr2;
                    break;
                }
            }
            throw new ck("Metadata folder ordering corrupt.");
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    String str = new o0(fileInputStream).a().f13290a;
                    if (str != null) {
                        File file5 = new File(file, str);
                        if (file5.exists()) {
                            arrayList.add(file5);
                            fileInputStream.close();
                        } else {
                            throw new ck(String.format("Missing asset file %s during slice reconstruction.", file5.getCanonicalPath()));
                        }
                    } else {
                        throw new ck("Metadata files corrupt. Could not read local file header.");
                    }
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        return arrayList;
    }
}
