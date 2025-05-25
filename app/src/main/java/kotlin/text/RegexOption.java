package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Regex.kt */
/* loaded from: classes.dex */
public final class RegexOption implements c {
    public static final RegexOption CANON_EQ;
    public static final RegexOption COMMENTS;
    public static final RegexOption DOT_MATCHES_ALL;
    public static final RegexOption IGNORE_CASE;
    public static final RegexOption LITERAL;
    public static final RegexOption MULTILINE;
    public static final RegexOption UNIX_LINES;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ RegexOption[] f19963a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ xf.a f19964b;
    private final int mask;
    private final int value;

    static {
        RegexOption regexOption = new RegexOption("IGNORE_CASE", 0, 2, 0, 2, null);
        IGNORE_CASE = regexOption;
        RegexOption regexOption2 = new RegexOption("MULTILINE", 1, 8, 0, 2, null);
        MULTILINE = regexOption2;
        RegexOption regexOption3 = new RegexOption("LITERAL", 2, 16, 0, 2, null);
        LITERAL = regexOption3;
        RegexOption regexOption4 = new RegexOption("UNIX_LINES", 3, 1, 0, 2, null);
        UNIX_LINES = regexOption4;
        RegexOption regexOption5 = new RegexOption("COMMENTS", 4, 4, 0, 2, null);
        COMMENTS = regexOption5;
        RegexOption regexOption6 = new RegexOption("DOT_MATCHES_ALL", 5, 32, 0, 2, null);
        DOT_MATCHES_ALL = regexOption6;
        RegexOption regexOption7 = new RegexOption("CANON_EQ", 6, 128, 0, 2, null);
        CANON_EQ = regexOption7;
        RegexOption[] regexOptionArr = {regexOption, regexOption2, regexOption3, regexOption4, regexOption5, regexOption6, regexOption7};
        f19963a = regexOptionArr;
        f19964b = kotlin.enums.a.a(regexOptionArr);
    }

    public RegexOption() {
        throw null;
    }

    public RegexOption(String str, int i10, int i11, int i12, int i13, kotlin.jvm.internal.d dVar) {
        i12 = (i13 & 2) != 0 ? i11 : i12;
        this.value = i11;
        this.mask = i12;
    }

    public static xf.a<RegexOption> getEntries() {
        return f19964b;
    }

    public static RegexOption valueOf(String str) {
        return (RegexOption) Enum.valueOf(RegexOption.class, str);
    }

    public static RegexOption[] values() {
        return (RegexOption[]) f19963a.clone();
    }

    @Override // kotlin.text.c
    public int getMask() {
        return this.mask;
    }

    @Override // kotlin.text.c
    public int getValue() {
        return this.value;
    }
}
