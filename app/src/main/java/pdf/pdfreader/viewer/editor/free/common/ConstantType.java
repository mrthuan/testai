package pdf.pdfreader.viewer.editor.free.common;

import android.content.Context;
import android.text.TextUtils;
import ea.a;
import pdf.pdfreader.viewer.editor.free.utils.q0;
import pdf.pdfreader.viewer.editor.free.utils.x0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum ForceShowFullAds uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class ConstantType {
    public static final ConstantType AbHasMemoryLowDialog;
    public static final ConstantType ForceShowFullAds;
    public static final ConstantType Max;
    public static final ConstantType ShowEnabledConfig;

    /* renamed from: a  reason: collision with root package name */
    public static ConstantType[] f24125a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ ConstantType[] f24126b;
    private Boolean defValue;
    private final boolean directOn;
    private final String key;
    private final Integer localInit;
    private final String name;

    static {
        String p10 = a.p("CW9DYxxTX28tRj9sGUEMcw==", "CctMe6Z1");
        String p11 = a.p("qoWZ5ciP0bXR6OWVkLzo5bCz", "NdtAuorP");
        Boolean bool = Boolean.FALSE;
        ConstantType constantType = new ConstantType(p10, 0, p11, bool);
        ForceShowFullAds = constantType;
        ConstantType constantType2 = new ConstantType(a.p("HGhedzxuVmI2ZS5DGm4OaWc=", "zQQAmXyZ"), 1, a.p("1Zj159e6h7fA5aSvjpT-596E17zG5caz", "5e6Iykcz"), bool);
        ShowEnabledConfig = constantType2;
        ConstantType constantType3 = new ConstantType(a.p("CmIAYTlNP20nch9MW3cTaVlsPWc=", "IsKHJZL9"), 2, a.p("kYbM5c6YgLjF6NCz0bzu55KX", "9FtIcdUf"), a.p("WGUyXxthEV8fZVlfBW8hXyBsZw==", "ot04QXq6"), Boolean.TRUE);
        AbHasMemoryLowDialog = constantType3;
        ConstantType constantType4 = new ConstantType(a.p("AmF4", "3XIlLTm2"), 3, null, null, null);
        Max = constantType4;
        f24126b = new ConstantType[]{constantType, constantType2, constantType3, constantType4};
        f24125a = null;
    }

    public ConstantType() {
        throw null;
    }

    public ConstantType(String str, int i10, String str2, Boolean bool) {
        this(str, i10, str2, null, bool);
    }

    public static ConstantType getFromOrdinal(int i10) {
        if (f24125a == null) {
            f24125a = values();
        }
        return f24125a[(i10 >= Max.ordinal() || i10 < 0) ? 0 : 0];
    }

    public static ConstantType valueOf(String str) {
        return (ConstantType) Enum.valueOf(ConstantType.class, str);
    }

    public static ConstantType[] values() {
        return (ConstantType[]) f24126b.clone();
    }

    public boolean getDefValue(Context context) {
        Integer num;
        boolean z10;
        x0 x0Var;
        if (context != null && (num = this.localInit) != null && this.defValue == null) {
            int intValue = num.intValue();
            if (intValue < 0) {
                synchronized (x0.class) {
                    if (x0.f28793b == null) {
                        x0.f28793b = new x0();
                    }
                    x0Var = x0.f28793b;
                }
                intValue = x0Var.f28794a.nextInt(2);
            }
            int a10 = q0.a(intValue, context, null, this.key);
            if (a10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.defValue = Boolean.valueOf(z10);
            q0.a(-1, context, Integer.valueOf(a10), this.key);
        }
        if (this.defValue == null) {
            this.defValue = Boolean.TRUE;
            a.p("qZyd5eWw3prV5ta6kIDU5YmCi7i4", "b2sVhgFk");
        }
        return this.defValue.booleanValue();
    }

    public String getKey() {
        return this.key;
    }

    public boolean isDirectOn() {
        return this.directOn;
    }

    public boolean isLocalRand() {
        if (this.localInit != null) {
            return true;
        }
        return false;
    }

    public void setDefValue(Context context, boolean z10) {
        q0.a(-1, context, Integer.valueOf(z10 ? 1 : 0), this.key);
    }

    @Override // java.lang.Enum
    public String toString() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        return super.toString();
    }

    public ConstantType(String str, int i10, String str2, String str3, Boolean bool) {
        this.name = str2;
        this.key = str3;
        this.localInit = null;
        if (bool == null) {
            this.defValue = Boolean.TRUE;
            this.directOn = false;
            return;
        }
        this.defValue = bool;
        if (!TextUtils.isEmpty(str3)) {
            this.directOn = bool.booleanValue();
        } else {
            this.directOn = false;
        }
    }
}
