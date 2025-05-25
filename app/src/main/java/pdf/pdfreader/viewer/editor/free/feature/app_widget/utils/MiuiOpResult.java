package pdf.pdfreader.viewer.editor.free.feature.app_widget.utils;

/* compiled from: AppOpsExt.kt */
/* loaded from: classes3.dex */
public enum MiuiOpResult {
    ALLOW(0),
    DENY(1),
    ASK(5);
    
    public static final a Companion = new a();
    private final int value;

    /* compiled from: AppOpsExt.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    MiuiOpResult(int i10) {
        this.value = i10;
    }

    public int getValue() {
        return this.value;
    }
}
