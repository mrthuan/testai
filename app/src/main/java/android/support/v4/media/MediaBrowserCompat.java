package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.media.session.MediaButtonReceiver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class MediaBrowserCompat {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f1706b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final d f1707a;

    /* loaded from: classes.dex */
    public static class ItemReceiver extends h.b {
        @Override // h.b
        public final void a(int i10, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            if (i10 == 0 && bundle != null && bundle.containsKey("media_item")) {
                Parcelable parcelable = bundle.getParcelable("media_item");
                if (parcelable != null && !(parcelable instanceof MediaItem)) {
                    throw null;
                }
                MediaItem mediaItem = (MediaItem) parcelable;
                throw null;
            }
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class SearchResultReceiver extends h.b {
        @Override // h.b
        public final void a(int i10, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            if (i10 == 0 && bundle != null && bundle.containsKey("search_results")) {
                Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
                if (parcelableArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Parcelable parcelable : parcelableArray) {
                        arrayList.add((MediaItem) parcelable);
                    }
                }
                throw null;
            }
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<f> f1710a;

        /* renamed from: b  reason: collision with root package name */
        public WeakReference<Messenger> f1711b;

        public a(f fVar) {
            this.f1710a = new WeakReference<>(fVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f1711b;
            if (weakReference != null && weakReference.get() != null) {
                WeakReference<f> weakReference2 = this.f1710a;
                if (weakReference2.get() != null) {
                    Bundle data = message.getData();
                    MediaSessionCompat.a(data);
                    f fVar = weakReference2.get();
                    Messenger messenger = this.f1711b.get();
                    try {
                        int i10 = message.what;
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 != 3) {
                                    message.toString();
                                } else {
                                    Bundle bundle = data.getBundle("data_options");
                                    MediaSessionCompat.a(bundle);
                                    MediaSessionCompat.a(data.getBundle("data_notify_children_changed_options"));
                                    String string = data.getString("data_media_item_id");
                                    data.getParcelableArrayList("data_media_item_list");
                                    fVar.b(messenger, string, bundle);
                                }
                            } else {
                                fVar.a();
                            }
                        } else {
                            MediaSessionCompat.a(data.getBundle("data_root_hints"));
                            data.getString("data_media_item_id");
                            MediaSessionCompat.Token token = (MediaSessionCompat.Token) data.getParcelable("data_media_session_token");
                            fVar.onServiceConnected();
                        }
                    } catch (BadParcelableException unused) {
                        if (message.what == 1) {
                            fVar.a();
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final android.support.v4.media.b f1712a = new android.support.v4.media.b(new C0004b());

        /* renamed from: b  reason: collision with root package name */
        public a f1713b;

        /* loaded from: classes.dex */
        public interface a {
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0004b implements android.support.v4.media.a {
            public C0004b() {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d extends c {
    }

    /* loaded from: classes.dex */
    public static class e extends d {
    }

    /* loaded from: classes.dex */
    public interface f {
        void a();

        void b(Messenger messenger, String str, Bundle bundle);

        void onServiceConnected();
    }

    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public final Messenger f1722a;

        /* renamed from: b  reason: collision with root package name */
        public final Bundle f1723b;

        public g(IBinder iBinder, Bundle bundle) {
            this.f1722a = new Messenger(iBinder);
            this.f1723b = bundle;
        }

        public final void a(int i10, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i10;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f1722a.send(obtain);
        }
    }

    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f1724a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f1725b = new ArrayList();

        public final void a(Bundle bundle) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f1725b;
                if (i10 < arrayList.size()) {
                    if (o9.d.j((Bundle) arrayList.get(i10), bundle)) {
                        i iVar = (i) this.f1724a.get(i10);
                        return;
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i {

        /* loaded from: classes.dex */
        public class a implements android.support.v4.media.c {
            public a() {
            }

            @Override // android.support.v4.media.c
            public final void a() {
                i.this.getClass();
            }

            @Override // android.support.v4.media.c
            public final void b(List list) {
                i.this.getClass();
                MediaItem.a(list);
            }
        }

        /* loaded from: classes.dex */
        public class b extends a implements android.support.v4.media.e {
            public b() {
                super();
            }

            @Override // android.support.v4.media.e
            public final void c(List list) {
                MediaItem.a(list);
                i.this.getClass();
            }

            @Override // android.support.v4.media.e
            public final void d() {
                i.this.getClass();
            }
        }

        public i() {
            new Binder();
            if (Build.VERSION.SDK_INT >= 26) {
                new android.support.v4.media.f(new b());
            } else {
                new android.support.v4.media.d(new a());
            }
        }
    }

    static {
        Log.isLoggable("MediaBrowserCompat", 3);
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, MediaButtonReceiver.a aVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1707a = new e(context, componentName, aVar);
        } else {
            this.f1707a = new d(context, componentName, aVar);
        }
    }

    /* loaded from: classes.dex */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final int f1708a;

        /* renamed from: b  reason: collision with root package name */
        public final MediaDescriptionCompat f1709b;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<MediaItem> {
            @Override // android.os.Parcelable.Creator
            public final MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final MediaItem[] newArray(int i10) {
                return new MediaItem[i10];
            }
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
            if (mediaDescriptionCompat != null) {
                if (!TextUtils.isEmpty(mediaDescriptionCompat.f1728a)) {
                    this.f1708a = i10;
                    this.f1709b = mediaDescriptionCompat;
                    return;
                }
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            throw new IllegalArgumentException("description cannot be null");
        }

        public static void a(List list) {
            MediaItem mediaItem;
            if (list != null) {
                ArrayList arrayList = new ArrayList(list.size());
                for (Object obj : list) {
                    if (obj != null) {
                        MediaBrowser.MediaItem mediaItem2 = (MediaBrowser.MediaItem) obj;
                        mediaItem = new MediaItem(MediaDescriptionCompat.a(mediaItem2.getDescription()), mediaItem2.getFlags());
                    } else {
                        mediaItem = null;
                    }
                    arrayList.add(mediaItem);
                }
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "MediaItem{mFlags=" + this.f1708a + ", mDescription=" + this.f1709b + '}';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f1708a);
            this.f1709b.writeToParcel(parcel, i10);
        }

        public MediaItem(Parcel parcel) {
            this.f1708a = parcel.readInt();
            this.f1709b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements f, b.a {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1715a;

        /* renamed from: b  reason: collision with root package name */
        public final MediaBrowser f1716b;
        public final Bundle c;

        /* renamed from: d  reason: collision with root package name */
        public final a f1717d = new a(this);

        /* renamed from: e  reason: collision with root package name */
        public final y.b<String, h> f1718e = new y.b<>();

        /* renamed from: f  reason: collision with root package name */
        public g f1719f;

        /* renamed from: g  reason: collision with root package name */
        public Messenger f1720g;

        /* renamed from: h  reason: collision with root package name */
        public MediaSessionCompat.Token f1721h;

        public c(Context context, ComponentName componentName, MediaButtonReceiver.a aVar) {
            this.f1715a = context;
            Bundle bundle = new Bundle();
            this.c = bundle;
            bundle.putInt("extra_client_version", 1);
            aVar.f1713b = this;
            this.f1716b = new MediaBrowser(context, componentName, aVar.f1712a, bundle);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public final void b(Messenger messenger, String str, Bundle bundle) {
            if (this.f1720g != messenger) {
                return;
            }
            h orDefault = this.f1718e.getOrDefault(str, null);
            if (orDefault == null) {
                int i10 = MediaBrowserCompat.f1706b;
            } else {
                orDefault.a(bundle);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public final void a() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public final void onServiceConnected() {
        }
    }

    /* loaded from: classes.dex */
    public static class CustomActionResultReceiver extends h.b {
        @Override // h.b
        public final void a(int i10, Bundle bundle) {
        }
    }
}
