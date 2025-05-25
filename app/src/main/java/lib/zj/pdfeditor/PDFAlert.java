package lib.zj.pdfeditor;

/* loaded from: classes3.dex */
public final class PDFAlert {

    /* renamed from: a  reason: collision with root package name */
    public final String f21159a;

    /* renamed from: b  reason: collision with root package name */
    public final IconType f21160b;
    public final ButtonGroupType c;

    /* renamed from: d  reason: collision with root package name */
    public final String f21161d;

    /* renamed from: e  reason: collision with root package name */
    public ButtonPressed f21162e;

    /* loaded from: classes3.dex */
    public enum ButtonGroupType {
        Ok,
        OkCancel,
        YesNo,
        YesNoCancel
    }

    /* loaded from: classes3.dex */
    public enum ButtonPressed {
        None,
        Ok,
        Cancel,
        No,
        Yes
    }

    /* loaded from: classes3.dex */
    public enum IconType {
        Error,
        Warning,
        Question,
        Status
    }

    public PDFAlert(String str, IconType iconType, ButtonGroupType buttonGroupType, String str2, ButtonPressed buttonPressed) {
        this.f21159a = str;
        this.f21160b = iconType;
        this.c = buttonGroupType;
        this.f21161d = str2;
        this.f21162e = buttonPressed;
    }
}
