package com.tom_roush.fontbox.util.autodetect;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class NativeFontDirFinder implements FontDirFinder {
    @Override // com.tom_roush.fontbox.util.autodetect.FontDirFinder
    public List<File> find() {
        ArrayList arrayList = new ArrayList();
        String[] searchableDirectories = getSearchableDirectories();
        if (searchableDirectories != null) {
            for (String str : searchableDirectories) {
                File file = new File(str);
                try {
                    if (file.exists() && file.canRead()) {
                        arrayList.add(file);
                    }
                } catch (SecurityException unused) {
                }
            }
        }
        return arrayList;
    }

    public abstract String[] getSearchableDirectories();
}
