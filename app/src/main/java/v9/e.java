package v9;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes2.dex */
public abstract class e extends p9.d {
    public e() {
        super(1);
    }

    @Override // p9.d
    public final boolean K(int i10, Parcel parcel, Parcel parcel2, int i11) {
        Parcelable parcelable;
        if (i10 != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i12 = a.f30776a;
        if (parcel.readInt() == 0) {
            parcelable = null;
        } else {
            parcelable = (Parcelable) creator.createFromParcel(parcel);
        }
        Bundle bundle = (Bundle) parcelable;
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            u9.g gVar = (u9.g) this;
            o oVar = gVar.f30270d.f30271a;
            if (oVar != null) {
                TaskCompletionSource taskCompletionSource = gVar.c;
                synchronized (oVar.f30792f) {
                    oVar.f30791e.remove(taskCompletionSource);
                }
                synchronized (oVar.f30792f) {
                    if (oVar.f30797k.get() > 0 && oVar.f30797k.decrementAndGet() > 0) {
                        oVar.f30789b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                    } else {
                        oVar.a().post(new j(oVar));
                    }
                }
            }
            gVar.f30269b.a("onGetLaunchReviewFlowInfo", new Object[0]);
            gVar.c.d(new u9.b((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
            return true;
        }
        throw new BadParcelableException(b.a.c("Parcel data not fully consumed, unread size: ", dataAvail));
    }
}
