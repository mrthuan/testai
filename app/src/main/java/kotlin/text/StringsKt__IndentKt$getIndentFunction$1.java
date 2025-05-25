package kotlin.text;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Indent.kt */
/* loaded from: classes.dex */
public final class StringsKt__IndentKt$getIndentFunction$1 extends Lambda implements cg.l<String, String> {
    public static final StringsKt__IndentKt$getIndentFunction$1 INSTANCE = new StringsKt__IndentKt$getIndentFunction$1();

    public StringsKt__IndentKt$getIndentFunction$1() {
        super(1);
    }

    @Override // cg.l
    public final String invoke(String line) {
        kotlin.jvm.internal.g.e(line, "line");
        return line;
    }
}
