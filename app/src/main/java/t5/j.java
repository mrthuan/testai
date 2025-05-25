package t5;

import android.net.Uri;
import android.os.Parcelable;
import com.facebook.FacebookException;
import com.facebook.internal.p;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: Profile.kt */
/* loaded from: classes.dex */
public final class j implements p.a {
    @Override // com.facebook.internal.p.a
    public final void a(JSONObject jSONObject) {
        String str;
        Uri uri;
        Uri uri2 = null;
        if (jSONObject != null) {
            str = jSONObject.optString(FacebookMediationAdapter.KEY_ID);
        } else {
            str = null;
        }
        if (str == null) {
            Parcelable.Creator<com.facebook.j> creator = com.facebook.j.CREATOR;
            return;
        }
        String optString = jSONObject.optString("link");
        String optString2 = jSONObject.optString("profile_picture", null);
        String optString3 = jSONObject.optString("first_name");
        String optString4 = jSONObject.optString("middle_name");
        String optString5 = jSONObject.optString("last_name");
        String optString6 = jSONObject.optString(NamingTable.TAG);
        if (optString != null) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        if (optString2 != null) {
            uri2 = Uri.parse(optString2);
        }
        com.facebook.k.f9831d.a().a(new com.facebook.j(str, optString3, optString4, optString5, optString6, uri, uri2), true);
    }

    @Override // com.facebook.internal.p.a
    public final void b(FacebookException facebookException) {
        Parcelable.Creator<com.facebook.j> creator = com.facebook.j.CREATOR;
        Objects.toString(facebookException);
    }
}
