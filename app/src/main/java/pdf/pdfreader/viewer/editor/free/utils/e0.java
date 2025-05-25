package pdf.pdfreader.viewer.editor.free.utils;

import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.util.HashSet;

/* compiled from: MediaStoreUtil.kt */
/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f28646a = {ea.a.p("Vng_ZQFuA2w=", "hAcd0YgM"), ea.a.p("Wm4_ZQFuA2w=", "rF0fuRLL")};

    public static HashSet a(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        String[] strArr = {ea.a.p("EGRQdGE=", "yuNdKFpR"), ea.a.p("EWE1ZQptDWQhZg9lZA==", "U9uAUbkU"), ea.a.p("EHNYemU=", "NQIvw4Ub")};
        StringBuilder sb2 = new StringBuilder(ea.a.p("HGkKZTd0G3AtIFs_", "xyqghbce"));
        String[] strArr2 = {FileMimeTypeEnum.PDF.getMimeType(), FileMimeTypeEnum.DOC.getMimeType(), FileMimeTypeEnum.DOCX.getMimeType(), FileMimeTypeEnum.DOT.getMimeType(), FileMimeTypeEnum.DOTX.getMimeType(), FileMimeTypeEnum.DOTM.getMimeType(), FileMimeTypeEnum.XLS.getMimeType(), FileMimeTypeEnum.XLSX.getMimeType(), FileMimeTypeEnum.XLT.getMimeType(), FileMimeTypeEnum.XLTX.getMimeType(), FileMimeTypeEnum.XLTM.getMimeType(), FileMimeTypeEnum.XLSM.getMimeType(), FileMimeTypeEnum.PPT.getMimeType(), FileMimeTypeEnum.PPTX.getMimeType(), FileMimeTypeEnum.POT.getMimeType(), FileMimeTypeEnum.PPTM.getMimeType(), FileMimeTypeEnum.POTX.getMimeType(), FileMimeTypeEnum.POTM.getMimeType()};
        for (int i10 = 0; i10 < 17; i10++) {
            sb2.append(ea.a.p("E08ZIB5pD2UtdE1wDCBrPw==", "LI5zCTd4"));
        }
        sb2.append(ea.a.p("YUE_RFZfRGkyZUY-FDA=", "3HAqv7DR"));
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g.d(sb3, ea.a.p("PGVdZRp0Xm80UyguAW87dEdpAGdtKQ==", "fU6xkIOB"));
        HashSet hashSet = new HashSet();
        for (String str : f28646a) {
            try {
                Cursor query = context.getContentResolver().query(MediaStore.Files.getContentUri(str), strArr, sb3, strArr2, null);
                if (query != null) {
                    while (query.moveToNext()) {
                        String str2 = "";
                        int columnIndex = query.getColumnIndex(ea.a.p("bGQqdGE=", "khvemI0W"));
                        if (columnIndex > -1) {
                            str2 = query.getString(columnIndex);
                            kotlin.jvm.internal.g.d(str2, ea.a.p("LHVDcxZyGWc_dBl0B2kGZx1wD3QtSQtkFXgp", "znuNpPk1"));
                        }
                        if (!TextUtils.isEmpty(str2) && aj.b.H(str2)) {
                            hashSet.add(str2);
                        }
                    }
                    tf.d dVar = tf.d.f30009a;
                    o9.d.l(query, null);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return hashSet;
    }
}
