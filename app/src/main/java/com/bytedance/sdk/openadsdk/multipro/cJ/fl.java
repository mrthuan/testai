package com.bytedance.sdk.openadsdk.multipro.CJ;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.multipro.Qhi;
import java.util.Map;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* compiled from: SPMultiProviderImpl.java */
/* loaded from: classes.dex */
public class fl implements Qhi {
    private Context Qhi;

    private Context cJ() {
        Context context = this.Qhi;
        if (context == null) {
            return HzH.Qhi();
        }
        return context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Qhi
    public String Qhi() {
        return "t_sp";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Qhi
    public Cursor Qhi(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Map<String, ?> ac2;
        if (!uri.getPath().split(PackagingURIHelper.FORWARD_SLASH_STRING)[2].equals("get_all") || (ac2 = ac.ac(cJ(), uri.getQueryParameter("sp_file_name"))) == null) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"cursor_name", "cursor_type", "cursor_value"});
        for (String str3 : ac2.keySet()) {
            Object[] objArr = new Object[3];
            objArr[0] = str3;
            Object obj = ac2.get(str3);
            objArr[2] = obj;
            if (obj instanceof Boolean) {
                objArr[1] = "boolean";
            } else if (obj instanceof String) {
                objArr[1] = "string";
            } else if (obj instanceof Integer) {
                objArr[1] = "int";
            } else if (obj instanceof Long) {
                objArr[1] = Constants.LONG;
            } else if (obj instanceof Float) {
                objArr[1] = "float";
            }
            matrixCursor.addRow(objArr);
        }
        return matrixCursor;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Qhi
    public String Qhi(Uri uri) {
        String[] split = uri.getPath().split(PackagingURIHelper.FORWARD_SLASH_STRING);
        String str = split[2];
        String str2 = split[3];
        if (str.equals("contain")) {
            return String.valueOf(ac.Qhi(HzH.Qhi(), uri.getQueryParameter("sp_file_name"), str2));
        }
        return ac.Qhi(cJ(), uri.getQueryParameter("sp_file_name"), str2, str);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Qhi
    public Uri Qhi(Uri uri, ContentValues contentValues) {
        if (contentValues == null) {
            return null;
        }
        String str = uri.getPath().split(PackagingURIHelper.FORWARD_SLASH_STRING)[3];
        Object obj = contentValues.get("value");
        if (obj != null) {
            ac.Qhi(cJ(), uri.getQueryParameter("sp_file_name"), str, obj);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Qhi
    public int Qhi(Uri uri, String str, String[] strArr) {
        String[] split = uri.getPath().split(PackagingURIHelper.FORWARD_SLASH_STRING);
        if (split[2].equals("clean")) {
            ac.cJ(cJ(), uri.getQueryParameter("sp_file_name"));
            return 0;
        }
        String str2 = split[3];
        if (ac.Qhi(cJ(), uri.getQueryParameter("sp_file_name"), str2)) {
            ac.cJ(cJ(), uri.getQueryParameter("sp_file_name"), str2);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Qhi
    public int Qhi(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (contentValues == null) {
            return 0;
        }
        Qhi(uri, contentValues);
        return 0;
    }
}
