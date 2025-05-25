package com.facebook.internal;

import java.util.EnumSet;
import java.util.Iterator;

/* compiled from: SmartLoginOption.kt */
/* loaded from: classes.dex */
public enum SmartLoginOption {
    None("None"),
    Enabled("Enabled"),
    RequireConfirm("RequireConfirm");
    
    public static final a Companion = new a();

    /* renamed from: a  reason: collision with root package name */
    public static final EnumSet<SmartLoginOption> f9743a;
    private final long value;

    /* compiled from: SmartLoginOption.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static EnumSet a(long j10) {
            EnumSet result = EnumSet.noneOf(SmartLoginOption.class);
            Iterator it = SmartLoginOption.f9743a.iterator();
            while (it.hasNext()) {
                SmartLoginOption smartLoginOption = (SmartLoginOption) it.next();
                if ((smartLoginOption.getValue() & j10) != 0) {
                    result.add(smartLoginOption);
                }
            }
            kotlin.jvm.internal.g.d(result, "result");
            return result;
        }
    }

    static {
        EnumSet<SmartLoginOption> allOf = EnumSet.allOf(SmartLoginOption.class);
        kotlin.jvm.internal.g.d(allOf, "allOf(SmartLoginOption::class.java)");
        f9743a = allOf;
    }

    SmartLoginOption(String str) {
        this.value = r2;
    }

    public static final EnumSet<SmartLoginOption> parseOptions(long j10) {
        Companion.getClass();
        return a.a(j10);
    }

    public final long getValue() {
        return this.value;
    }
}
