package c6;

/* compiled from: SourceApplicationInfo.kt */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final String f5627a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5628b;

    public m(String str, boolean z10) {
        this.f5627a = str;
        this.f5628b = z10;
    }

    public final String toString() {
        String str;
        if (this.f5628b) {
            str = "Applink";
        } else {
            str = "Unclassified";
        }
        String str2 = this.f5627a;
        if (str2 != null) {
            return str + '(' + str2 + ')';
        }
        return str;
    }
}
