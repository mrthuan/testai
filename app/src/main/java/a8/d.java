package a8;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.internal.zzan;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
@VisibleForTesting
/* loaded from: classes2.dex */
public final class d extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f125a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Context context) {
        super(context, "google_app_measurement.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f125a = eVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        boolean z10;
        e eVar = this.f125a;
        z1 z1Var = eVar.f144e;
        Object obj = eVar.f3529a;
        ((zzge) obj).getClass();
        if (z1Var.f396b == 0 || z1Var.f395a.b() - z1Var.f396b >= 3600000) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException unused) {
                z1 z1Var2 = eVar.f144e;
                z1Var2.f396b = z1Var2.f395a.b();
                zzeu zzeuVar = ((zzge) obj).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11712f.a("Opening the database failed, dropping and recreating it");
                ((zzge) obj).getClass();
                if (!((zzge) obj).f11773a.getDatabasePath("google_app_measurement.db").delete()) {
                    zzeu zzeuVar2 = ((zzge) obj).f11780i;
                    zzge.f(zzeuVar2);
                    zzeuVar2.f11712f.b("google_app_measurement.db", "Failed to delete corrupted db file");
                }
                try {
                    SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    z1Var2.f396b = 0L;
                    return writableDatabase;
                } catch (SQLiteException e10) {
                    zzeu zzeuVar3 = ((zzge) obj).f11780i;
                    zzge.f(zzeuVar3);
                    zzeuVar3.f11712f.b(e10, "Failed to open freshly created database");
                    throw e10;
                }
            }
        }
        throw new SQLiteException("Database open failed");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        zzeu zzeuVar = ((zzge) this.f125a.f3529a).f11780i;
        zzge.f(zzeuVar);
        zzan.b(zzeuVar, sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        e eVar = this.f125a;
        zzeu zzeuVar = ((zzge) eVar.f3529a).f11780i;
        zzge.f(zzeuVar);
        zzan.a(zzeuVar, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", e.f135f);
        zzeu zzeuVar2 = ((zzge) eVar.f3529a).f11780i;
        zzge.f(zzeuVar2);
        zzan.a(zzeuVar2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
        zzeu zzeuVar3 = ((zzge) eVar.f3529a).f11780i;
        zzge.f(zzeuVar3);
        zzan.a(zzeuVar3, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", e.f136g);
        zzeu zzeuVar4 = ((zzge) eVar.f3529a).f11780i;
        zzge.f(zzeuVar4);
        zzan.a(zzeuVar4, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", e.f137h);
        zzeu zzeuVar5 = ((zzge) eVar.f3529a).f11780i;
        zzge.f(zzeuVar5);
        zzan.a(zzeuVar5, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", e.f139j);
        zzeu zzeuVar6 = ((zzge) eVar.f3529a).f11780i;
        zzge.f(zzeuVar6);
        zzan.a(zzeuVar6, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
        zzeu zzeuVar7 = ((zzge) eVar.f3529a).f11780i;
        zzge.f(zzeuVar7);
        zzan.a(zzeuVar7, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", e.f138i);
        zzeu zzeuVar8 = ((zzge) eVar.f3529a).f11780i;
        zzge.f(zzeuVar8);
        zzan.a(zzeuVar8, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", e.f140k);
        zzeu zzeuVar9 = ((zzge) eVar.f3529a).f11780i;
        zzge.f(zzeuVar9);
        zzan.a(zzeuVar9, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", e.f141l);
        zzeu zzeuVar10 = ((zzge) eVar.f3529a).f11780i;
        zzge.f(zzeuVar10);
        zzan.a(zzeuVar10, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        zzeu zzeuVar11 = ((zzge) eVar.f3529a).f11780i;
        zzge.f(zzeuVar11);
        zzan.a(zzeuVar11, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", e.f142m);
        zzeu zzeuVar12 = ((zzge) eVar.f3529a).f11780i;
        zzge.f(zzeuVar12);
        zzan.a(zzeuVar12, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
        zzeu zzeuVar13 = ((zzge) eVar.f3529a).f11780i;
        zzge.f(zzeuVar13);
        zzan.a(zzeuVar13, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
        zzeu zzeuVar14 = ((zzge) eVar.f3529a).f11780i;
        zzge.f(zzeuVar14);
        zzan.a(zzeuVar14, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
