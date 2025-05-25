package com.facebook.internal;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;
import kotlin.text.Regex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9814a;

    public /* synthetic */ o(int i10) {
        this.f9814a = i10;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String name) {
        switch (this.f9814a) {
            case 0:
                return Pattern.matches("cpu[0-9]+", name);
            default:
                kotlin.jvm.internal.g.d(name, "name");
                return new Regex(b.a.f(new Object[]{"anr_log_"}, 1, "^%s[0-9]+.json$", "format(format, *args)")).matches(name);
        }
    }
}
