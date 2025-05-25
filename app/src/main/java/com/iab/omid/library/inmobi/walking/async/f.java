package com.iab.omid.library.inmobi.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.inmobi.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class f extends a {
    public f(b.InterfaceC0186b interfaceC0186b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0186b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.inmobi.internal.c c = com.iab.omid.library.inmobi.internal.c.c();
        if (c != null) {
            for (com.iab.omid.library.inmobi.adsession.a aVar : c.b()) {
                if (this.c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().b(str, this.f14030e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.inmobi.utils.c.h(this.f14029d, this.f14032b.a())) {
            return null;
        }
        this.f14032b.a(this.f14029d);
        return this.f14029d.toString();
    }

    @Override // com.iab.omid.library.inmobi.walking.async.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
