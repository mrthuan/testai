package l6;

import java.io.File;
import java.io.FilenameFilter;
import kotlin.jvm.internal.g;
import kotlin.text.Regex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String name) {
        g.d(name, "name");
        return new Regex(b.a.f(new Object[]{"error_log_"}, 1, "^%s[0-9]+.json$", "format(format, *args)")).matches(name);
    }
}
