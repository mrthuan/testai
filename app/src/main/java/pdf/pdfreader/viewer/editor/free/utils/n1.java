package pdf.pdfreader.viewer.editor.free.utils;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: UriToFileNameUtil.java */
/* loaded from: classes3.dex */
public final class n1 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f28731a = ea.a.p("N3IRVB5QLnQgVRJpbA==", "nXbxqOCi");

    public static String a(Context context, Uri uri, Intent intent, String str, String[] strArr, boolean z10) {
        String str2;
        Cursor cursor;
        boolean z11;
        String type;
        e1.b bVar;
        String str3 = f28731a;
        String str4 = null;
        str4 = null;
        str4 = null;
        str4 = null;
        Cursor cursor2 = null;
        try {
            try {
                cursor = context.getContentResolver().query(uri, null, str, strArr, null);
                try {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(ea.a.p("UHU5cxxyWCA=", "ooQaSIuR"));
                    if (cursor != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    sb2.append(z11);
                    o9.d.s(str3, sb2.toString());
                    if (cursor != null && cursor.moveToFirst()) {
                        int columnIndex = cursor.getColumnIndex(ea.a.p("EGRYcwlsVnkFbittZQ==", "hFltRkIt"));
                        int columnIndex2 = cursor.getColumnIndex(ea.a.p("aGQ7dGE=", "jl7ZIUgM"));
                        int columnIndex3 = cursor.getColumnIndex(ea.a.p("PWVdYQ1pQWUFcCt0aA==", "VrMf3cKo"));
                        int columnIndex4 = cursor.getColumnIndex(ea.a.p("ImlcZSZ0TnBl", "2Z8bDjm8"));
                        ea.a.p("Jm5VZQFEXnMUYSdlTyA=", "mr4j1hVJ");
                        ea.a.p("by0g", "n4TjcpYk");
                        ea.a.p("by0g", "MmQ4Cwrd");
                        ea.a.p("X2RMTR1tAHQxcAM6IA==", "nH64tetN");
                        if (columnIndex4 > -1) {
                            type = cursor.getString(columnIndex4);
                            ea.a.p("ImlaZQ15AmVyIA==", "O1O7Yrku");
                        } else if (intent == null) {
                            type = null;
                        } else {
                            type = intent.getType();
                        }
                        if (columnIndex > -1) {
                            str4 = cursor.getString(columnIndex);
                            o9.d.s(str3, ea.a.p("KGVFRBh0VkM1bD9tGzpIX3FJPVAJQTxfDUE5RU86", "fRrQCtoE") + str4);
                        }
                        if (TextUtils.isEmpty(str4)) {
                            str4 = new e1.b(context, uri).a();
                            o9.d.s(str3, ea.a.p("K29SdRRlWXQcaSZlVW4JbVA9", "1Ul4YxPm") + bVar.a());
                        }
                        if (str4 == null && columnIndex2 > -1) {
                            String string = cursor.getString(columnIndex2);
                            o9.d.s(str3, ea.a.p("VGU_RBJ0A0MdbEFtBzp2XwBBZkFmOg==", "zpOZ8lSq") + string);
                            String decode = Uri.decode(string);
                            str4 = decode.substring(decode.lastIndexOf(ea.a.p("Lw==", "VR0LvURF")) + 1);
                            o9.d.s(str3, ea.a.p("HWUzRBZ0AkMnbBNtWjp3X3xBBkFpbldtESA6", "QUzGwc7A") + str4);
                        }
                        if (str4 == null && columnIndex3 > -1) {
                            String string2 = cursor.getString(columnIndex3);
                            o9.d.s(str3, ea.a.p("KGVFRBh0VkM1bD9tGzpIUnBML1QMViBfN0E4SFI6", "DDoWglrP") + string2);
                            String decode2 = Uri.decode(string2);
                            str4 = decode2.substring(decode2.lastIndexOf(ea.a.p("Lw==", "5dJ6ebxh")) + 1);
                            o9.d.s(str3, ea.a.p("VGU_RBJ0A0MdbEFtBzp2UgFMc1QPVgZfaEEcSBJuB21WIDo=", "8H2fbQSO") + str4);
                        }
                        if (!ge.a.n(str4, type)) {
                            String y10 = ge.a.y(type);
                            if (!TextUtils.isEmpty(y10) && !TextUtils.isEmpty(type) && !TextUtils.isEmpty(str4) && !str4.toLowerCase().endsWith(y10)) {
                                o9.d.s(str3, ea.a.p("MGlYZU1uJW0tIBFpQGg4dUwgIXUvZl94WCAQZDUgMXUwZl14PQ==", "A1V4mDqC") + y10);
                                str4 = str4 + y10;
                            }
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (Exception e10) {
                    e = e10;
                    str2 = null;
                    cursor2 = cursor;
                    e.printStackTrace();
                    o9.d.s(str3, e.getMessage());
                    dp.a.a().getClass();
                    dp.a.d(context, e);
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    str4 = str2;
                    return !z10 ? str4 : str4;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                str2 = null;
            }
            if (!z10 && TextUtils.isEmpty(str4)) {
                return ea.a.p("Rm4gbhx3bg==", "T0MphbCz") + System.currentTimeMillis() + ea.a.p("HXAvZg==", "7SF6S1uy");
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = str4;
        }
    }
}
