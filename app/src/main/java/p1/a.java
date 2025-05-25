package p1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/* compiled from: LocalBroadcastManager.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f23587f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static a f23588g;

    /* renamed from: a  reason: collision with root package name */
    public final Context f23589a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<BroadcastReceiver, ArrayList<c>> f23590b = new HashMap<>();
    public final HashMap<String, ArrayList<c>> c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<b> f23591d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public final HandlerC0323a f23592e;

    /* compiled from: LocalBroadcastManager.java */
    /* renamed from: p1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class HandlerC0323a extends Handler {
        public HandlerC0323a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int size;
            b[] bVarArr;
            if (message.what != 1) {
                super.handleMessage(message);
                return;
            }
            a aVar = a.this;
            while (true) {
                synchronized (aVar.f23590b) {
                    size = aVar.f23591d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    aVar.f23591d.toArray(bVarArr);
                    aVar.f23591d.clear();
                }
                for (int i10 = 0; i10 < size; i10++) {
                    b bVar = bVarArr[i10];
                    int size2 = bVar.f23595b.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        c cVar = bVar.f23595b.get(i11);
                        if (!cVar.f23598d) {
                            cVar.f23597b.onReceive(aVar.f23589a, bVar.f23594a);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: LocalBroadcastManager.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f23594a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<c> f23595b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.f23594a = intent;
            this.f23595b = arrayList;
        }
    }

    /* compiled from: LocalBroadcastManager.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final IntentFilter f23596a;

        /* renamed from: b  reason: collision with root package name */
        public final BroadcastReceiver f23597b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f23598d;

        public c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            this.f23596a = intentFilter;
            this.f23597b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f23597b);
            sb2.append(" filter=");
            sb2.append(this.f23596a);
            if (this.f23598d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    public a(Context context) {
        this.f23589a = context;
        this.f23592e = new HandlerC0323a(context.getMainLooper());
    }

    public static a a(Context context) {
        a aVar;
        synchronized (f23587f) {
            if (f23588g == null) {
                f23588g = new a(context.getApplicationContext());
            }
            aVar = f23588g;
        }
        return aVar;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f23590b) {
            c cVar = new c(broadcastReceiver, intentFilter);
            ArrayList<c> arrayList = this.f23590b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f23590b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                String action = intentFilter.getAction(i10);
                ArrayList<c> arrayList2 = this.c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    public final void c(Intent intent) {
        boolean z10;
        int i10;
        String str;
        ArrayList arrayList;
        ArrayList<c> arrayList2;
        String str2;
        boolean z11;
        synchronized (this.f23590b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f23589a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z12 = false;
            if ((intent.getFlags() & 8) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                intent.toString();
            }
            ArrayList<c> arrayList3 = this.c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z10) {
                    arrayList3.toString();
                }
                ArrayList arrayList4 = null;
                int i11 = 0;
                while (i11 < arrayList3.size()) {
                    c cVar = arrayList3.get(i11);
                    if (z10) {
                        Objects.toString(cVar.f23596a);
                    }
                    if (cVar.c) {
                        i10 = i11;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        arrayList = arrayList4;
                        z11 = z12;
                    } else {
                        IntentFilter intentFilter = cVar.f23596a;
                        String str3 = action;
                        String str4 = resolveTypeIfNeeded;
                        i10 = i11;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = resolveTypeIfNeeded;
                        z11 = z12;
                        int match = intentFilter.match(str3, str4, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z10) {
                                Integer.toHexString(match);
                            }
                            if (arrayList == null) {
                                arrayList4 = new ArrayList();
                            } else {
                                arrayList4 = arrayList;
                            }
                            arrayList4.add(cVar);
                            cVar.c = true;
                            i11 = i10 + 1;
                            z12 = z11;
                            action = str;
                            arrayList3 = arrayList2;
                            resolveTypeIfNeeded = str2;
                        }
                    }
                    arrayList4 = arrayList;
                    i11 = i10 + 1;
                    z12 = z11;
                    action = str;
                    arrayList3 = arrayList2;
                    resolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                boolean z13 = z12;
                if (arrayList5 != null) {
                    for (int i12 = z13; i12 < arrayList5.size(); i12++) {
                        ((c) arrayList5.get(i12)).c = z13;
                    }
                    this.f23591d.add(new b(intent, arrayList5));
                    if (!this.f23592e.hasMessages(1)) {
                        this.f23592e.sendEmptyMessage(1);
                    }
                }
            }
        }
    }

    public final void d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f23590b) {
            ArrayList<c> remove = this.f23590b.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                c cVar = remove.get(size);
                cVar.f23598d = true;
                for (int i10 = 0; i10 < cVar.f23596a.countActions(); i10++) {
                    String action = cVar.f23596a.getAction(i10);
                    ArrayList<c> arrayList = this.c.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            c cVar2 = arrayList.get(size2);
                            if (cVar2.f23597b == broadcastReceiver) {
                                cVar2.f23598d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.c.remove(action);
                        }
                    }
                }
            }
        }
    }
}
