package a8;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.internal.zzan;
import com.google.android.gms.measurement.internal.zzen;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
@VisibleForTesting
/* loaded from: classes2.dex */
public final class m extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzen f223a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(zzen zzenVar, Context context) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f223a = zzenVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e10) {
            throw e10;
        } catch (SQLiteException unused) {
            zzen zzenVar = this.f223a;
            zzeu zzeuVar = ((zzge) zzenVar.f3529a).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11712f.a("Opening the local database failed, dropping and recreating it");
            ((zzge) zzenVar.f3529a).getClass();
            if (!((zzge) zzenVar.f3529a).f11773a.getDatabasePath("google_app_measurement_local.db").delete()) {
                zzeu zzeuVar2 = ((zzge) zzenVar.f3529a).f11780i;
                zzge.f(zzeuVar2);
                zzeuVar2.f11712f.b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e11) {
                zzeu zzeuVar3 = ((zzge) zzenVar.f3529a).f11780i;
                zzge.f(zzeuVar3);
                zzeuVar3.f11712f.b(e11, "Failed to open local database. Events will bypass local storage");
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        zzeu zzeuVar = ((zzge) this.f223a.f3529a).f11780i;
        zzge.f(zzeuVar);
        zzan.b(zzeuVar, sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        zzeu zzeuVar = ((zzge) this.f223a.f3529a).f11780i;
        zzge.f(zzeuVar);
        zzan.a(zzeuVar, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
