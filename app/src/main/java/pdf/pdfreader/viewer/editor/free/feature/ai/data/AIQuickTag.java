package pdf.pdfreader.viewer.editor.free.feature.ai.data;

import androidx.activity.f;
import ea.a;
import java.io.Serializable;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.g;

/* compiled from: AIQuickTag.kt */
/* loaded from: classes3.dex */
public final class AIQuickTag implements Serializable {
    private final String des;
    private final String event;
    private final int hType;
    private final int icon;
    private final boolean isTranslate;
    private final String tag;

    public AIQuickTag(int i10, String str, int i11, boolean z10, String str2, String str3) {
        g.e(str, a.p("E2Fn", "Q8g17Gi7"));
        g.e(str3, a.p("MnYUbnQ=", "hHWqigeB"));
        this.icon = i10;
        this.tag = str;
        this.hType = i11;
        this.isTranslate = z10;
        this.des = str2;
        this.event = str3;
    }

    public static /* synthetic */ AIQuickTag copy$default(AIQuickTag aIQuickTag, int i10, String str, int i11, boolean z10, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = aIQuickTag.icon;
        }
        if ((i12 & 2) != 0) {
            str = aIQuickTag.tag;
        }
        String str4 = str;
        if ((i12 & 4) != 0) {
            i11 = aIQuickTag.hType;
        }
        int i13 = i11;
        if ((i12 & 8) != 0) {
            z10 = aIQuickTag.isTranslate;
        }
        boolean z11 = z10;
        if ((i12 & 16) != 0) {
            str2 = aIQuickTag.des;
        }
        String str5 = str2;
        if ((i12 & 32) != 0) {
            str3 = aIQuickTag.event;
        }
        return aIQuickTag.copy(i10, str4, i13, z11, str5, str3);
    }

    public final int component1() {
        return this.icon;
    }

    public final String component2() {
        return this.tag;
    }

    public final int component3() {
        return this.hType;
    }

    public final boolean component4() {
        return this.isTranslate;
    }

    public final String component5() {
        return this.des;
    }

    public final String component6() {
        return this.event;
    }

    public final AIQuickTag copy(int i10, String tag, int i11, boolean z10, String str, String event) {
        g.e(tag, "tag");
        g.e(event, "event");
        return new AIQuickTag(i10, tag, i11, z10, str, event);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIQuickTag)) {
            return false;
        }
        AIQuickTag aIQuickTag = (AIQuickTag) obj;
        if (this.icon == aIQuickTag.icon && g.a(this.tag, aIQuickTag.tag) && this.hType == aIQuickTag.hType && this.isTranslate == aIQuickTag.isTranslate && g.a(this.des, aIQuickTag.des) && g.a(this.event, aIQuickTag.event)) {
            return true;
        }
        return false;
    }

    public final String getDes() {
        return this.des;
    }

    public final String getEvent() {
        return this.event;
    }

    public final int getHType() {
        return this.hType;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final String getTag() {
        return this.tag;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int h10 = (f.h(this.tag, this.icon * 31, 31) + this.hType) * 31;
        boolean z10 = this.isTranslate;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (h10 + i10) * 31;
        String str = this.des;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.event.hashCode() + ((i11 + hashCode) * 31);
    }

    public final boolean isTranslate() {
        return this.isTranslate;
    }

    public String toString() {
        int i10 = this.icon;
        String str = this.tag;
        int i11 = this.hType;
        boolean z10 = this.isTranslate;
        String str2 = this.des;
        String str3 = this.event;
        return "AIQuickTag(icon=" + i10 + ", tag=" + str + ", hType=" + i11 + ", isTranslate=" + z10 + ", des=" + str2 + ", event=" + str3 + ")";
    }

    public /* synthetic */ AIQuickTag(int i10, String str, int i11, boolean z10, String str2, String str3, int i12, d dVar) {
        this(i10, str, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? false : z10, (i12 & 16) != 0 ? str : str2, str3);
    }
}
