package q9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public abstract class s extends n implements t {
    public s() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    @Override // q9.n
    public final boolean K(int i10, Parcel parcel) {
        switch (i10) {
            case 2:
                o.b(parcel);
                r(parcel.readInt(), (Bundle) o.a(parcel, Bundle.CREATOR));
                break;
            case 3:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) o.a(parcel, Bundle.CREATOR);
                o.b(parcel);
                com.google.android.play.core.assetpacks.o oVar = (com.google.android.play.core.assetpacks.o) this;
                oVar.f13342b.f13444d.d(oVar.f13341a);
                com.google.android.play.core.assetpacks.y.f13440g.d("onCancelDownload(%d)", Integer.valueOf(readInt));
                break;
            case 4:
                int readInt2 = parcel.readInt();
                Bundle bundle2 = (Bundle) o.a(parcel, Bundle.CREATOR);
                o.b(parcel);
                com.google.android.play.core.assetpacks.o oVar2 = (com.google.android.play.core.assetpacks.o) this;
                oVar2.f13342b.f13444d.d(oVar2.f13341a);
                com.google.android.play.core.assetpacks.y.f13440g.d("onGetSession(%d)", Integer.valueOf(readInt2));
                break;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                o.b(parcel);
                N(createTypedArrayList);
                break;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) o.a(parcel, creator);
                Bundle bundle4 = (Bundle) o.a(parcel, creator);
                o.b(parcel);
                com.google.android.play.core.assetpacks.o oVar3 = (com.google.android.play.core.assetpacks.o) this;
                oVar3.f13342b.f13444d.d(oVar3.f13341a);
                com.google.android.play.core.assetpacks.y.f13440g.d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle3.getString("module_name"), bundle3.getString("slice_id"), Integer.valueOf(bundle3.getInt("chunk_number")), Integer.valueOf(bundle3.getInt("session_id")));
                break;
            case 7:
                o.b(parcel);
                g0((Bundle) o.a(parcel, Bundle.CREATOR));
                break;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle5 = (Bundle) o.a(parcel, creator2);
                Bundle bundle6 = (Bundle) o.a(parcel, creator2);
                o.b(parcel);
                com.google.android.play.core.assetpacks.o oVar4 = (com.google.android.play.core.assetpacks.o) this;
                oVar4.f13342b.f13444d.d(oVar4.f13341a);
                com.google.android.play.core.assetpacks.y.f13440g.d("onNotifyModuleCompleted(%s, sessionId=%d)", bundle5.getString("module_name"), Integer.valueOf(bundle5.getInt("session_id")));
                break;
            case 9:
            default:
                return false;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle7 = (Bundle) o.a(parcel, creator3);
                o.b(parcel);
                com.google.android.play.core.assetpacks.o oVar5 = (com.google.android.play.core.assetpacks.o) this;
                oVar5.f13342b.f13444d.d(oVar5.f13341a);
                com.google.android.play.core.assetpacks.y.f13440g.d("onNotifySessionFailed(%d)", Integer.valueOf(((Bundle) o.a(parcel, creator3)).getInt("session_id")));
                break;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                o.b(parcel);
                m((Bundle) o.a(parcel, creator4), (Bundle) o.a(parcel, creator4));
                break;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                o.b(parcel);
                r0((Bundle) o.a(parcel, creator5), (Bundle) o.a(parcel, creator5));
                break;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                o.b(parcel);
                j0((Bundle) o.a(parcel, creator6), (Bundle) o.a(parcel, creator6));
                break;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                Bundle bundle8 = (Bundle) o.a(parcel, creator7);
                Bundle bundle9 = (Bundle) o.a(parcel, creator7);
                o.b(parcel);
                com.google.android.play.core.assetpacks.o oVar6 = (com.google.android.play.core.assetpacks.o) this;
                oVar6.f13342b.f13444d.d(oVar6.f13341a);
                com.google.android.play.core.assetpacks.y.f13440g.d("onRemoveModule()", new Object[0]);
                break;
            case 15:
                Bundle bundle10 = (Bundle) o.a(parcel, Bundle.CREATOR);
                o.b(parcel);
                com.google.android.play.core.assetpacks.o oVar7 = (com.google.android.play.core.assetpacks.o) this;
                oVar7.f13342b.f13444d.d(oVar7.f13341a);
                com.google.android.play.core.assetpacks.y.f13440g.d("onCancelDownloads()", new Object[0]);
                break;
        }
        return true;
    }
}
