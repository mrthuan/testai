package com.pgl.ssdk;

import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SafelyLibraryLoader.java */
/* loaded from: classes2.dex */
public class K {

    /* renamed from: a  reason: collision with root package name */
    private static List<String> f15779a = new ArrayList();

    /* compiled from: SafelyLibraryLoader.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f15780a;

        /* renamed from: b  reason: collision with root package name */
        public String f15781b;

        public a(int i10, String... strArr) {
            this.f15780a = i10;
            JSONArray jSONArray = new JSONArray();
            for (String str : strArr) {
                jSONArray.put(str);
            }
            this.f15781b = jSONArray.toString();
        }
    }

    private static ZipEntry a(ZipFile zipFile, String str, String str2) {
        StringBuilder g10 = b.a.g("lib/", str, PackagingURIHelper.FORWARD_SLASH_STRING);
        g10.append(System.mapLibraryName(str2));
        ZipEntry entry = zipFile.getEntry(g10.toString());
        if (entry != null) {
            return entry;
        }
        int indexOf = str.indexOf(45);
        StringBuilder sb2 = new StringBuilder("lib/");
        if (indexOf <= 0) {
            indexOf = str.length();
        }
        sb2.append(str.substring(0, indexOf));
        sb2.append(PackagingURIHelper.FORWARD_SLASH_STRING);
        sb2.append(System.mapLibraryName(str2));
        return zipFile.getEntry(sb2.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0124 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0125 A[Catch: all -> 0x0133, TRY_ENTER, TRY_LEAVE, TryCatch #8 {, blocks: (B:4:0x0005, B:18:0x002f, B:20:0x0035, B:22:0x003b, B:24:0x004c, B:27:0x005c, B:31:0x0066, B:34:0x0079, B:36:0x007f, B:50:0x00dc, B:65:0x0117, B:57:0x00f8, B:70:0x0125, B:64:0x010a, B:10:0x0013), top: B:90:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized com.pgl.ssdk.K.a a(android.content.Context r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.K.a(android.content.Context, java.lang.String):com.pgl.ssdk.K$a");
    }

    private static String a(ZipFile zipFile, String str) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"armeabi-v7a", "arm64-v8a", "x86", "x86_64", "armeabi"};
        for (int i10 = 0; i10 < 5; i10++) {
            String str2 = strArr[i10];
            if (a(zipFile, str2, str) != null) {
                arrayList.add(str2);
            }
        }
        List asList = Arrays.asList(Build.SUPPORTED_ABIS);
        ArrayList arrayList2 = new ArrayList();
        String str3 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str3)) {
            arrayList2.add(str3);
        }
        String str4 = Build.CPU_ABI2;
        if (!TextUtils.isEmpty(str4)) {
            arrayList2.add(str4);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("supportedABIS", asList);
            jSONObject.put("curABIs", arrayList2);
            jSONObject.put("apkABIS", arrayList);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
