package o9;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.install.InstallException;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class l extends j {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ m f22773e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, TaskCompletionSource taskCompletionSource, String str) {
        super(mVar, new p9.n("OnRequestInstallCallback"), taskCompletionSource);
        this.f22773e = mVar;
    }

    @Override // o9.j, p9.j
    public final void P(Bundle bundle) {
        super.P(bundle);
        int i10 = bundle.getInt("error.code", -2);
        TaskCompletionSource taskCompletionSource = this.c;
        if (i10 != 0) {
            taskCompletionSource.c(new InstallException(bundle.getInt("error.code", -2)));
            return;
        }
        int i11 = bundle.getInt("version.code", -1);
        int i12 = bundle.getInt("update.availability");
        int i13 = bundle.getInt("install.status", 0);
        if (bundle.getInt("client.version.staleness", -1) != -1) {
            bundle.getInt("client.version.staleness");
        }
        int i14 = bundle.getInt("in.app.update.priority", 0);
        long j10 = bundle.getLong("bytes.downloaded");
        long j11 = bundle.getLong("total.bytes.to.download");
        long j12 = bundle.getLong("additional.size.required");
        n nVar = this.f22773e.f22778d;
        nVar.getClass();
        long a10 = n.a(new File(nVar.f22779a.getFilesDir(), "assetpacks"));
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("blocking.intent");
        PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("nonblocking.intent");
        PendingIntent pendingIntent3 = (PendingIntent) bundle.getParcelable("blocking.destructive.intent");
        PendingIntent pendingIntent4 = (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent");
        HashMap hashMap = new HashMap();
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent");
        HashSet hashSet = new HashSet();
        if (integerArrayList != null) {
            hashSet.addAll(integerArrayList);
        }
        hashMap.put("blocking.destructive.intent", hashSet);
        ArrayList<Integer> integerArrayList2 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent");
        HashSet hashSet2 = new HashSet();
        if (integerArrayList2 != null) {
            hashSet2.addAll(integerArrayList2);
        }
        hashMap.put("nonblocking.destructive.intent", hashSet2);
        ArrayList<Integer> integerArrayList3 = bundle.getIntegerArrayList("update.precondition.failures:blocking.intent");
        HashSet hashSet3 = new HashSet();
        if (integerArrayList3 != null) {
            hashSet3.addAll(integerArrayList3);
        }
        hashMap.put("blocking.intent", hashSet3);
        ArrayList<Integer> integerArrayList4 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent");
        HashSet hashSet4 = new HashSet();
        if (integerArrayList4 != null) {
            hashSet4.addAll(integerArrayList4);
        }
        hashMap.put("nonblocking.intent", hashSet4);
        taskCompletionSource.d(new a(i11, i12, i13, i14, j10, j11, j12, a10, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4));
    }
}
