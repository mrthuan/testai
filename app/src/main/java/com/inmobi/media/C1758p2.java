package com.inmobi.media;

import android.content.ContentValues;
import com.inmobi.commons.core.configs.Config;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.p2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1758p2 extends AbstractC1860x1 {
    public C1758p2() {
        super("config_db", "(account_id TEXT NOT NULL,config_value TEXT NOT NULL,config_type TEXT NOT NULL,update_ts INTEGER DEFAULT 0,UNIQUE(account_id,config_type))");
    }

    @Override // com.inmobi.media.AbstractC1860x1
    public final Object a(ContentValues contentValues) {
        kotlin.jvm.internal.g.e(contentValues, "contentValues");
        String asString = contentValues.getAsString("config_value");
        if (asString == null) {
            return null;
        }
        String asString2 = contentValues.getAsString("account_id");
        Long asLong = contentValues.getAsLong("update_ts");
        C1621f2 c1621f2 = Config.Companion;
        String asString3 = contentValues.getAsString("config_type");
        kotlin.jvm.internal.g.d(asString3, "getAsString(...)");
        JSONObject jSONObject = new JSONObject(asString);
        kotlin.jvm.internal.g.b(asLong);
        long longValue = asLong.longValue();
        c1621f2.getClass();
        return C1621f2.a(asString3, jSONObject, asString2, longValue);
    }

    @Override // com.inmobi.media.AbstractC1860x1
    public final ContentValues b(Object obj) {
        Config config = (Config) obj;
        kotlin.jvm.internal.g.e(config, "config");
        ContentValues contentValues = new ContentValues();
        contentValues.put("account_id", config.getAccountId$media_release());
        contentValues.put("config_value", config.toJson().toString());
        contentValues.put("config_type", config.getType());
        contentValues.put("update_ts", Long.valueOf(config.getLastUpdateTimeStamp()));
        return contentValues;
    }

    public final boolean b(String type, String accountId) {
        boolean z10;
        kotlin.jvm.internal.g.e(type, "type");
        kotlin.jvm.internal.g.e(accountId, "accountId");
        try {
            z10 = !R2.b(this.f15618a, null, "account_id=? AND config_type=?", new String[]{accountId, type}, null, null, null, null).isEmpty();
        } catch (Exception unused) {
            z10 = false;
        }
        return !z10;
    }

    public final long a(String type, String str) {
        kotlin.jvm.internal.g.e(type, "type");
        String[] strArr = {str, type};
        C1745o2 transform = C1745o2.f15358a;
        kotlin.jvm.internal.g.e(transform, "transform");
        Object obj = null;
        try {
            List<ContentValues> b10 = R2.b(this.f15618a, null, "account_id=? AND config_type=?", strArr, null, null, null, null);
            if (!b10.isEmpty()) {
                obj = transform.invoke(b10.get(0));
            }
        } catch (Exception unused) {
        }
        Long l10 = (Long) obj;
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }
}
