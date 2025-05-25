package c7;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import c7.p;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.a;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements p.a, SuccessContinuation, Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f5639a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5640b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3) {
        this.f5639a = obj;
        this.f5640b = obj2;
        this.c = obj3;
    }

    @Override // c7.p.a
    public final Object apply(Object obj) {
        boolean z10;
        long insert;
        boolean z11;
        byte[] bArr;
        p pVar = (p) this.f5639a;
        v6.n nVar = (v6.n) this.f5640b;
        v6.s sVar = (v6.s) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        long simpleQueryForLong = pVar.f().compileStatement("PRAGMA page_size").simpleQueryForLong() * pVar.f().compileStatement("PRAGMA page_count").simpleQueryForLong();
        e eVar = pVar.f5656d;
        int i10 = (simpleQueryForLong > eVar.e() ? 1 : (simpleQueryForLong == eVar.e() ? 0 : -1));
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            pVar.d(1L, LogEventDropped.Reason.CACHE_FULL, nVar.g());
            return -1L;
        }
        Long h10 = p.h(sQLiteDatabase, sVar);
        if (h10 != null) {
            insert = h10.longValue();
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("backend_name", sVar.b());
            contentValues.put("priority", Integer.valueOf(f7.a.a(sVar.d())));
            contentValues.put("next_request_ms", (Integer) 0);
            if (sVar.c() != null) {
                contentValues.put("extras", Base64.encodeToString(sVar.c(), 0));
            }
            insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        int d10 = eVar.d();
        byte[] bArr2 = nVar.d().f30721b;
        if (bArr2.length <= d10) {
            z11 = true;
        } else {
            z11 = false;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("context_id", Long.valueOf(insert));
        contentValues2.put("transport_name", nVar.g());
        contentValues2.put("timestamp_ms", Long.valueOf(nVar.e()));
        contentValues2.put("uptime_ms", Long.valueOf(nVar.h()));
        contentValues2.put("payload_encoding", nVar.d().f30720a.f29752a);
        contentValues2.put("code", nVar.c());
        contentValues2.put("num_attempts", (Integer) 0);
        contentValues2.put("inline", Boolean.valueOf(z11));
        if (z11) {
            bArr = bArr2;
        } else {
            bArr = new byte[0];
        }
        contentValues2.put("payload", bArr);
        long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
        if (!z11) {
            int ceil = (int) Math.ceil(bArr2.length / d10);
            for (int i11 = 1; i11 <= ceil; i11++) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i11 - 1) * d10, Math.min(i11 * d10, bArr2.length));
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("event_id", Long.valueOf(insert2));
                contentValues3.put("sequence_num", Integer.valueOf(i11));
                contentValues3.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues3);
            }
        }
        for (Map.Entry entry : Collections.unmodifiableMap(nVar.b()).entrySet()) {
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put("event_id", Long.valueOf(insert2));
            contentValues4.put(NamingTable.TAG, (String) entry.getKey());
            contentValues4.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues4);
        }
        return Long.valueOf(insert2);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task j(Object obj) {
        String d10;
        String str;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f5639a;
        String str2 = (String) this.f5640b;
        a.C0177a c0177a = (a.C0177a) this.c;
        String str3 = (String) obj;
        com.google.firebase.messaging.a c = FirebaseMessaging.c(firebaseMessaging.f13646d);
        z9.e eVar = firebaseMessaging.f13644a;
        eVar.a();
        if ("[DEFAULT]".equals(eVar.f32309b)) {
            d10 = "";
        } else {
            d10 = eVar.d();
        }
        String a10 = firebaseMessaging.f13653k.a();
        synchronized (c) {
            long currentTimeMillis = System.currentTimeMillis();
            int i10 = a.C0177a.f13661e;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str3);
                jSONObject.put("appVersion", a10);
                jSONObject.put("timestamp", currentTimeMillis);
                str = jSONObject.toString();
            } catch (JSONException e10) {
                e10.toString();
                str = null;
            }
            if (str != null) {
                SharedPreferences.Editor edit = c.f13659a.edit();
                edit.putString(d10 + "|T|" + str2 + "|*", str);
                edit.commit();
            }
        }
        if (c0177a == null || !str3.equals(c0177a.f13662a)) {
            z9.e eVar2 = firebaseMessaging.f13644a;
            eVar2.a();
            if ("[DEFAULT]".equals(eVar2.f32309b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    eVar2.a();
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str3);
                new jb.j(firebaseMessaging.f13646d).c(intent);
            }
        }
        return Tasks.e(str3);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        boolean z10;
        mb.e eVar = (mb.e) this.f5639a;
        Task task2 = (Task) this.f5640b;
        Task task3 = (Task) this.c;
        eVar.getClass();
        if (task2.o() && task2.k() != null) {
            nb.e eVar2 = (nb.e) task2.k();
            if (task3.o()) {
                nb.e eVar3 = (nb.e) task3.k();
                if (eVar3 != null && eVar2.c.equals(eVar3.c)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    return Tasks.e(Boolean.FALSE);
                }
            }
            nb.d dVar = eVar.f21967e;
            dVar.getClass();
            nb.b bVar = new nb.b(dVar, eVar2);
            Executor executor = dVar.f22411a;
            return Tasks.c(bVar, executor).p(executor, new nb.c(dVar, eVar2)).g(eVar.c, new androidx.appcompat.libconvert.helper.b(eVar, 6));
        }
        return Tasks.e(Boolean.FALSE);
    }
}
