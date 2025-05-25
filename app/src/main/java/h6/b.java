package h6;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;
import kotlin.jvm.internal.g;
import kotlin.text.Regex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18046a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String name) {
        switch (this.f18046a) {
            case 0:
                g.d(name, "name");
                return new Regex(b.a.f(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3, "^(%s|%s|%s)[0-9]+.json$", "format(format, *args)")).matches(name);
            default:
                Charset charset = ra.c.f29488d;
                return name.startsWith("event");
        }
    }
}
