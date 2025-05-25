package pdf.pdfreader.viewer.editor.free.utils;

import android.text.TextUtils;
import pdf.pdfreader.viewer.editor.free.common.ConstantType;

/* compiled from: ConstantsSelectUtils.java */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final Boolean[] f28704a;

    /* renamed from: b  reason: collision with root package name */
    public static final a[] f28705b;

    /* compiled from: ConstantsSelectUtils.java */
    /* loaded from: classes3.dex */
    public interface a {
    }

    static {
        ConstantType constantType = ConstantType.Max;
        f28704a = new Boolean[constantType.ordinal()];
        f28705b = new a[constantType.ordinal()];
        a();
    }

    public static void a() {
        int i10 = 0;
        while (true) {
            Boolean[] boolArr = f28704a;
            if (i10 < boolArr.length) {
                boolArr[i10] = null;
                f28705b[i10] = null;
                ConstantType fromOrdinal = ConstantType.getFromOrdinal(i10);
                if (TextUtils.isEmpty(fromOrdinal.getKey())) {
                    boolArr[i10] = Boolean.valueOf(fromOrdinal.getDefValue(null));
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
