package pdf.pdfreader.viewer.editor.free.feature.app_widget.utils;

/* compiled from: ShortcutPermissionExt.kt */
/* loaded from: classes3.dex */
public enum VivoShortcutPermission {
    ALLOW(0),
    DENY(1),
    ASK(2);
    
    public static final a Companion = new a();
    private final String[] values;

    /* compiled from: ShortcutPermissionExt.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    VivoShortcutPermission(int i10) {
        this.values = r2;
    }

    public final String[] getValues() {
        return this.values;
    }
}
