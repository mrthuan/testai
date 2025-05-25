package pdf.pdfreader.viewer.editor.free.utils;

import java.io.File;
import java.io.FileFilter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        if (file.isFile() && file.getName().startsWith(ea.a.p("UGEmZQFhIWEfZUZh", "nbseBSjf")) && file.getName().endsWith(ea.a.p("YWpBZw==", "khPEnjEo"))) {
            return true;
        }
        return false;
    }
}
