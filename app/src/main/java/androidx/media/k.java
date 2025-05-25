package androidx.media;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MediaBrowserServiceCompatApi21.java */
/* loaded from: classes.dex */
public final class k<T> {

    /* renamed from: a  reason: collision with root package name */
    public final MediaBrowserService.Result f4140a;

    public k(MediaBrowserService.Result result) {
        this.f4140a = result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(T t4) {
        boolean z10 = t4 instanceof List;
        ArrayList arrayList = null;
        MediaBrowserService.Result result = this.f4140a;
        if (z10) {
            List<Parcel> list = (List) t4;
            if (list != null) {
                arrayList = new ArrayList();
                for (Parcel parcel : list) {
                    parcel.setDataPosition(0);
                    arrayList.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                    parcel.recycle();
                }
            }
            result.sendResult(arrayList);
        } else if (t4 instanceof Parcel) {
            Parcel parcel2 = (Parcel) t4;
            parcel2.setDataPosition(0);
            result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
            parcel2.recycle();
        } else {
            result.sendResult(null);
        }
    }
}
