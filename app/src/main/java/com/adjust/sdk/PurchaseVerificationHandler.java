package com.adjust.sdk;

import com.adjust.sdk.network.IActivityPackageSender;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.adjust.sdk.scheduler.ThreadScheduler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class PurchaseVerificationHandler implements IPurchaseVerificationHandler {
    private static final double MILLISECONDS_TO_SECONDS_DIVISOR = 1000.0d;
    private static final String SCHEDULED_EXECUTOR_SOURCE = "PurchaseVerificationHandler";
    private WeakReference<IActivityHandler> activityHandlerWeakRef;
    private IActivityPackageSender activityPackageSender;
    private BackoffStrategy backoffStrategy;
    private ILogger logger;
    private List<ActivityPackage> packageQueue;
    private boolean paused;
    private ThreadScheduler scheduler;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ActivityPackage f5891a;

        public a(ActivityPackage activityPackage) {
            this.f5891a = activityPackage;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PurchaseVerificationHandler.this.packageQueue.add(this.f5891a);
            PurchaseVerificationHandler.this.logger.debug("Added purchase_verification %d", Integer.valueOf(PurchaseVerificationHandler.this.packageQueue.size()));
            PurchaseVerificationHandler.this.logger.verbose("%s", this.f5891a.getExtendedString());
            PurchaseVerificationHandler.this.sendNextPurchaseVerificationPackage();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PurchaseVerificationHandler.this.sendNextPurchaseVerificationPackageI();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ActivityPackage f5894a;

        public c(ActivityPackage activityPackage) {
            this.f5894a = activityPackage;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PurchaseVerificationHandler.this.sendPurchaseVerificationPackageI(this.f5894a);
            PurchaseVerificationHandler.this.sendNextPurchaseVerificationPackage();
        }
    }

    public PurchaseVerificationHandler(IActivityHandler iActivityHandler, boolean z10, IActivityPackageSender iActivityPackageSender) {
        init(iActivityHandler, z10, iActivityPackageSender);
        this.logger = AdjustFactory.getLogger();
        this.backoffStrategy = AdjustFactory.getSdkClickBackoffStrategy();
        this.scheduler = new SingleThreadCachedScheduler(SCHEDULED_EXECUTOR_SOURCE);
    }

    private Map<String, String> generateSendingParametersI() {
        HashMap hashMap = new HashMap();
        PackageBuilder.addString(hashMap, "sent_at", Util.dateFormatter.format(Long.valueOf(System.currentTimeMillis())));
        int size = this.packageQueue.size() - 1;
        if (size > 0) {
            PackageBuilder.addLong(hashMap, "queue_size", size);
        }
        return hashMap;
    }

    private void retrySendingI(ActivityPackage activityPackage) {
        this.logger.error("Retrying purchase_verification package for the %d time", Integer.valueOf(activityPackage.increaseRetries()));
        sendPurchaseVerificationPackage(activityPackage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendNextPurchaseVerificationPackage() {
        this.scheduler.submit(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendNextPurchaseVerificationPackageI() {
        IActivityHandler iActivityHandler = this.activityHandlerWeakRef.get();
        if (iActivityHandler.getActivityState() == null || iActivityHandler.getActivityState().isGdprForgotten || this.paused || this.packageQueue.isEmpty()) {
            return;
        }
        ActivityPackage remove = this.packageQueue.remove(0);
        int retries = remove.getRetries();
        c cVar = new c(remove);
        if (retries <= 0) {
            cVar.run();
            return;
        }
        long waitingTime = Util.getWaitingTime(retries, this.backoffStrategy);
        this.logger.verbose("Waiting for %s seconds before retrying purchase_verification for the %d time", Util.SecondsDisplayFormat.format(waitingTime / MILLISECONDS_TO_SECONDS_DIVISOR), Integer.valueOf(retries));
        this.scheduler.schedule(cVar, waitingTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendPurchaseVerificationPackageI(ActivityPackage activityPackage) {
        IActivityHandler iActivityHandler = this.activityHandlerWeakRef.get();
        ResponseData sendActivityPackageSync = this.activityPackageSender.sendActivityPackageSync(activityPackage, generateSendingParametersI());
        if (!(sendActivityPackageSync instanceof PurchaseVerificationResponseData)) {
            return;
        }
        PurchaseVerificationResponseData purchaseVerificationResponseData = (PurchaseVerificationResponseData) sendActivityPackageSync;
        if (purchaseVerificationResponseData.willRetry) {
            retrySendingI(activityPackage);
        } else if (iActivityHandler == null) {
        } else {
            if (purchaseVerificationResponseData.trackingState == TrackingState.OPTED_OUT) {
                iActivityHandler.gotOptOutResponse();
            } else {
                iActivityHandler.finishedTrackingActivity(purchaseVerificationResponseData);
            }
        }
    }

    @Override // com.adjust.sdk.IPurchaseVerificationHandler
    public void init(IActivityHandler iActivityHandler, boolean z10, IActivityPackageSender iActivityPackageSender) {
        this.paused = !z10;
        this.packageQueue = new ArrayList();
        this.activityHandlerWeakRef = new WeakReference<>(iActivityHandler);
        this.activityPackageSender = iActivityPackageSender;
    }

    @Override // com.adjust.sdk.IPurchaseVerificationHandler
    public void pauseSending() {
        this.paused = true;
    }

    @Override // com.adjust.sdk.IPurchaseVerificationHandler
    public void resumeSending() {
        this.paused = false;
        sendNextPurchaseVerificationPackage();
    }

    @Override // com.adjust.sdk.IPurchaseVerificationHandler
    public void sendPurchaseVerificationPackage(ActivityPackage activityPackage) {
        this.scheduler.submit(new a(activityPackage));
    }

    @Override // com.adjust.sdk.IPurchaseVerificationHandler
    public void teardown() {
        this.logger.verbose("PurchaseVerificationHandler teardown", new Object[0]);
        ThreadScheduler threadScheduler = this.scheduler;
        if (threadScheduler != null) {
            threadScheduler.teardown();
        }
        List<ActivityPackage> list = this.packageQueue;
        if (list != null) {
            list.clear();
        }
        WeakReference<IActivityHandler> weakReference = this.activityHandlerWeakRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.logger = null;
        this.packageQueue = null;
        this.backoffStrategy = null;
        this.scheduler = null;
    }
}
