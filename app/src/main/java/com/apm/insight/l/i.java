package com.apm.insight.l;

import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ConnectTimeoutException;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f6647a;

    static {
        HashSet hashSet = new HashSet();
        f6647a = hashSet;
        hashSet.add("HeapTaskDaemon");
        hashSet.add("ThreadPlus");
        hashSet.add("ApiDispatcher");
        hashSet.add("ApiLocalDispatcher");
        hashSet.add("AsyncLoader");
        hashSet.add("AsyncTask");
        hashSet.add("Binder");
        hashSet.add("PackageProcessor");
        hashSet.add("SettingsObserver");
        hashSet.add("WifiManager");
        hashSet.add("JavaBridge");
        hashSet.add("Compiler");
        hashSet.add("Signal Catcher");
        hashSet.add("GC");
        hashSet.add("ReferenceQueueDaemon");
        hashSet.add("FinalizerDaemon");
        hashSet.add("FinalizerWatchdogDaemon");
        hashSet.add("CookieSyncManager");
        hashSet.add("RefQueueWorker");
        hashSet.add("CleanupReference");
        hashSet.add("VideoManager");
        hashSet.add("DBHelper-AsyncOp");
        hashSet.add("InstalledAppTracker2");
        hashSet.add("AppData-AsyncOp");
        hashSet.add("IdleConnectionMonitor");
        hashSet.add("LogReaper");
        hashSet.add("ActionReaper");
        hashSet.add("Okio Watchdog");
        hashSet.add("CheckWaitingQueue");
        hashSet.add("NPTH-CrashTimer");
        hashSet.add("NPTH-JavaCallback");
        hashSet.add("NPTH-LocalParser");
        hashSet.add("ANR_FILE_MODIFY");
    }

    public static Set<String> a() {
        return f6647a;
    }

    public static boolean a(Throwable th2) {
        if (th2 == null) {
            return true;
        }
        try {
            if ((th2 instanceof ConnectTimeoutException) || (th2 instanceof SocketTimeoutException) || (th2 instanceof BindException) || (th2 instanceof ConnectException) || (th2 instanceof NoRouteToHostException) || (th2 instanceof PortUnreachableException) || (th2 instanceof SocketException) || (th2 instanceof UnknownHostException) || (th2 instanceof ProtocolException)) {
                return true;
            }
            return th2 instanceof SSLException;
        } catch (Throwable th3) {
            th3.printStackTrace();
            return false;
        }
    }
}
