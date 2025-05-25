package com.facebook.appevents;

import android.content.Context;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

/* compiled from: AppEventDiskStore.kt */
/* loaded from: classes.dex */
public final class d {

    /* compiled from: AppEventDiskStore.kt */
    /* loaded from: classes.dex */
    public static final class a extends ObjectInputStream {
        public a(BufferedInputStream bufferedInputStream) {
            super(bufferedInputStream);
        }

        @Override // java.io.ObjectInputStream
        public final ObjectStreamClass readClassDescriptor() {
            ObjectStreamClass resultClassDescriptor = super.readClassDescriptor();
            if (kotlin.jvm.internal.g.a(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                resultClassDescriptor = ObjectStreamClass.lookup(AccessTokenAppIdPair.SerializationProxyV1.class);
            } else if (kotlin.jvm.internal.g.a(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
                resultClassDescriptor = ObjectStreamClass.lookup(AppEvent.SerializationProxyV2.class);
            }
            kotlin.jvm.internal.g.d(resultClassDescriptor, "resultClassDescriptor");
            return resultClassDescriptor;
        }
    }

    static {
        new d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[Catch: all -> 0x0068, TRY_ENTER, TRY_LEAVE, TryCatch #6 {, blocks: (B:4:0x0003, B:8:0x002a, B:9:0x002d, B:27:0x0061, B:14:0x003d, B:15:0x0040, B:16:0x0049, B:18:0x004b, B:20:0x0050, B:25:0x005c, B:23:0x0056), top: B:42:0x0003 }] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final synchronized com.facebook.appevents.PersistedEvents a() {
        /*
            java.lang.Class<com.facebook.appevents.d> r0 = com.facebook.appevents.d.class
            monitor-enter(r0)
            int r1 = c6.f.f5607a     // Catch: java.lang.Throwable -> L68
            android.content.Context r1 = com.facebook.d.a()     // Catch: java.lang.Throwable -> L68
            r2 = 0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L4a java.io.FileNotFoundException -> L55
            java.lang.String r4 = "context.openFileInput(PERSISTED_EVENTS_FILENAME)"
            kotlin.jvm.internal.g.d(r3, r4)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L4a java.io.FileNotFoundException -> L55
            com.facebook.appevents.d$a r4 = new com.facebook.appevents.d$a     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L4a java.io.FileNotFoundException -> L55
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L4a java.io.FileNotFoundException -> L55
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L4a java.io.FileNotFoundException -> L55
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L4a java.io.FileNotFoundException -> L55
            java.lang.Object r3 = r4.readObject()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L4b java.io.FileNotFoundException -> L56
            java.lang.String r5 = "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents"
            kotlin.jvm.internal.g.c(r3, r5)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L4b java.io.FileNotFoundException -> L56
            com.facebook.appevents.PersistedEvents r3 = (com.facebook.appevents.PersistedEvents) r3     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L4b java.io.FileNotFoundException -> L56
            com.facebook.internal.p.c(r4)     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L68
            r1.delete()     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L68
        L36:
            r2 = r3
            goto L5f
        L38:
            r2 = move-exception
            r3 = r2
            r2 = r4
            goto L3d
        L3c:
            r3 = move-exception
        L3d:
            com.facebook.internal.p.c(r2)     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L68
            r1.delete()     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L68
        L49:
            throw r3     // Catch: java.lang.Throwable -> L68
        L4a:
            r4 = r2
        L4b:
            com.facebook.internal.p.c(r4)     // Catch: java.lang.Throwable -> L68
            java.lang.String r3 = "AppEventsLogger.persistedevents"
        L50:
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Exception -> L5f java.lang.Throwable -> L68
            goto L5c
        L55:
            r4 = r2
        L56:
            com.facebook.internal.p.c(r4)     // Catch: java.lang.Throwable -> L68
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            goto L50
        L5c:
            r1.delete()     // Catch: java.lang.Exception -> L5f java.lang.Throwable -> L68
        L5f:
            if (r2 != 0) goto L66
            com.facebook.appevents.PersistedEvents r2 = new com.facebook.appevents.PersistedEvents     // Catch: java.lang.Throwable -> L68
            r2.<init>()     // Catch: java.lang.Throwable -> L68
        L66:
            monitor-exit(r0)
            return r2
        L68:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.d.a():com.facebook.appevents.PersistedEvents");
    }

    public static final void b(PersistedEvents persistedEvents) {
        ObjectOutputStream objectOutputStream;
        Context a10 = com.facebook.d.a();
        try {
            objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(a10.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream.writeObject(persistedEvents);
                com.facebook.internal.p.c(objectOutputStream);
            } catch (Throwable unused) {
                try {
                    a10.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception unused2) {
                } catch (Throwable th2) {
                    com.facebook.internal.p.c(objectOutputStream);
                    throw th2;
                }
            }
        } catch (Throwable unused3) {
            objectOutputStream = null;
        }
    }
}
