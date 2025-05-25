package r1;

import java.io.File;
import java.io.FileFilter;

/* compiled from: MultiDexExtractor.java */
/* loaded from: classes.dex */
public final class b implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return !file.getName().equals("MultiDex.lock");
    }
}
