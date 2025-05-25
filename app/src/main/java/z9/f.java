package z9;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;
import java.util.Arrays;

/* compiled from: FirebaseOptions.java */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f32319a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32320b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f32321d;

    /* renamed from: e  reason: collision with root package name */
    public final String f32322e;

    /* renamed from: f  reason: collision with root package name */
    public final String f32323f;

    /* renamed from: g  reason: collision with root package name */
    public final String f32324g;

    public f(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.l("ApplicationId must be set.", !Strings.a(str));
        this.f32320b = str;
        this.f32319a = str2;
        this.c = str3;
        this.f32321d = str4;
        this.f32322e = str5;
        this.f32323f = str6;
        this.f32324g = str7;
    }

    public static f a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String a10 = stringResourceValueReader.a("google_app_id");
        if (TextUtils.isEmpty(a10)) {
            return null;
        }
        return new f(a10, stringResourceValueReader.a("google_api_key"), stringResourceValueReader.a("firebase_database_url"), stringResourceValueReader.a("ga_trackingId"), stringResourceValueReader.a("gcm_defaultSenderId"), stringResourceValueReader.a("google_storage_bucket"), stringResourceValueReader.a("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!Objects.a(this.f32320b, fVar.f32320b) || !Objects.a(this.f32319a, fVar.f32319a) || !Objects.a(this.c, fVar.c) || !Objects.a(this.f32321d, fVar.f32321d) || !Objects.a(this.f32322e, fVar.f32322e) || !Objects.a(this.f32323f, fVar.f32323f) || !Objects.a(this.f32324g, fVar.f32324g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32320b, this.f32319a, this.c, this.f32321d, this.f32322e, this.f32323f, this.f32324g});
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.a(this.f32320b, "applicationId");
        toStringHelper.a(this.f32319a, "apiKey");
        toStringHelper.a(this.c, "databaseUrl");
        toStringHelper.a(this.f32322e, "gcmSenderId");
        toStringHelper.a(this.f32323f, "storageBucket");
        toStringHelper.a(this.f32324g, "projectId");
        return toStringHelper.toString();
    }
}
