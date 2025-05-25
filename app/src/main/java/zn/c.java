package zn;

import java.io.File;
import java.io.FileFilter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return file.exists();
    }
}
