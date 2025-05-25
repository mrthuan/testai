package com.bykv.vk.openvk.preload.geckox.utils;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ResVersionUtils.java */
/* loaded from: classes.dex */
public final class j {
    public static Long a(File file) {
        File[] listFiles = file.listFiles(new FileFilter() { // from class: com.bykv.vk.openvk.preload.geckox.utils.j.1
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return file2.isDirectory();
            }
        });
        Long l10 = null;
        if (listFiles != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                try {
                    long longValue = Long.valueOf(file2.getName()).longValue();
                    if (l10 == null) {
                        l10 = Long.valueOf(longValue);
                    } else if (longValue > l10.longValue()) {
                        l10 = Long.valueOf(longValue);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return l10;
    }

    public static List<Long> b(File file) {
        File[] listFiles = file.listFiles(new FileFilter() { // from class: com.bykv.vk.openvk.preload.geckox.utils.j.2
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return file2.isDirectory();
            }
        });
        if (listFiles != null && listFiles.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (File file2 : listFiles) {
                try {
                    arrayList.add(Long.valueOf(Long.valueOf(file2.getName()).longValue()));
                } catch (Exception unused) {
                }
            }
            return arrayList;
        }
        return null;
    }
}
