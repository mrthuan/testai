package kotlin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Lazy.kt */
/* loaded from: classes.dex */
public final class LazyThreadSafetyMode {
    public static final LazyThreadSafetyMode NONE;
    public static final LazyThreadSafetyMode PUBLICATION;
    public static final LazyThreadSafetyMode SYNCHRONIZED;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ LazyThreadSafetyMode[] f19909a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ xf.a f19910b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = new LazyThreadSafetyMode("SYNCHRONIZED", 0);
        SYNCHRONIZED = lazyThreadSafetyMode;
        LazyThreadSafetyMode lazyThreadSafetyMode2 = new LazyThreadSafetyMode("PUBLICATION", 1);
        PUBLICATION = lazyThreadSafetyMode2;
        LazyThreadSafetyMode lazyThreadSafetyMode3 = new LazyThreadSafetyMode("NONE", 2);
        NONE = lazyThreadSafetyMode3;
        LazyThreadSafetyMode[] lazyThreadSafetyModeArr = {lazyThreadSafetyMode, lazyThreadSafetyMode2, lazyThreadSafetyMode3};
        f19909a = lazyThreadSafetyModeArr;
        f19910b = kotlin.enums.a.a(lazyThreadSafetyModeArr);
    }

    public LazyThreadSafetyMode(String str, int i10) {
    }

    public static xf.a<LazyThreadSafetyMode> getEntries() {
        return f19910b;
    }

    public static LazyThreadSafetyMode valueOf(String str) {
        return (LazyThreadSafetyMode) Enum.valueOf(LazyThreadSafetyMode.class, str);
    }

    public static LazyThreadSafetyMode[] values() {
        return (LazyThreadSafetyMode[]) f19909a.clone();
    }
}
