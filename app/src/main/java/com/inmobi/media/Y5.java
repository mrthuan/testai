package com.inmobi.media;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Y5 extends G8 {

    /* renamed from: y  reason: collision with root package name */
    public final Q5 f14873y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y5(String url, Q5 data) {
        super("POST", url, (Ib) null, true, (A4) null, "application/json", 64);
        kotlin.jvm.internal.g.e(url, "url");
        kotlin.jvm.internal.g.e(data, "data");
        this.f14873y = data;
    }

    public static String a(String str) {
        File file = new File(str);
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
                sb2.append('\n');
            }
            bufferedReader.close();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g.d(sb3, "toString(...)");
        return sb3;
    }

    @Override // com.inmobi.media.G8
    public final void f() {
        super.f();
        this.f14293t = false;
        this.f14294u = false;
        this.f14297x = false;
        try {
            this.f14285l = new JSONObject(a(this.f14873y.f14592a));
        } catch (FileNotFoundException unused) {
            String g10 = androidx.activity.r.g(new StringBuilder("File - "), this.f14873y.f14592a, " not found");
            H8 h82 = new H8();
            h82.c = new D8(EnumC1849w3.f15568s, g10);
            this.f14287n = h82;
        } catch (IOException unused2) {
            H8 h83 = new H8();
            h83.c = new D8(EnumC1849w3.f15568s, "IOException while reading file - " + this.f14873y.f14592a);
            this.f14287n = h83;
        } catch (JSONException unused3) {
            H8 h84 = new H8();
            h84.c = new D8(EnumC1849w3.f15568s, "JSON exception while parsing file - " + this.f14873y.f14592a);
            this.f14287n = h84;
        }
    }
}
