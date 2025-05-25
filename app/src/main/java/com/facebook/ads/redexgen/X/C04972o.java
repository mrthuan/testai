package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.2o  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04972o {
    public static C04972o A05;
    public static byte[] A06;
    public static final Object A07;
    public final Context A00;
    public final Handler A01;
    public final HashMap<BroadcastReceiver, ArrayList<C04962n>> A04 = new HashMap<>();
    public final HashMap<String, ArrayList<C04962n>> A03 = new HashMap<>();
    public final ArrayList<C04952m> A02 = new ArrayList<>();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 63);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{11, 11, 109, Field.SECTIONPAGES, Field.FORMCHECKBOX, Field.SHAPE, 78, Field.AUTOTEXTLIST, 11, Field.AUTOTEXT, Field.SECTIONPAGES, Field.AUTOTEXT, 11, Field.FILESIZE, Field.INCLUDETEXT, Field.SHAPE, 11, Field.FORMTEXT, 74, Field.SHAPE, Field.NOTEREF, Field.INCLUDEPICTURE, 17, 11, Field.SHAPE, Field.SHAPE, Field.SYMBOL, 22, 19, 11, 26, 13, Field.SHAPE, 18, 30, 11, Field.NUMCHARS, 23, 26, Field.NUMWORDS, Field.GREETINGLINE, Field.SHAPE, Field.SHAPE, 18, 30, 11, Field.NUMCHARS, 23, Field.SECTIONPAGES, Field.AUTOTEXT, 7, 42, 101, 108, 42, 99, 100, 126, 111, 100, 126, 42, Field.PAGEREF, 118, 102, 109, 96, 104, 96, Field.PAGEREF, 86, 116, 99, 126, 120, 121, Field.IMPORT, 123, 126, 100, 99, Field.DDE, Field.IMPORT, Field.ADVANCE, 119, 123, 121, 116, Field.LISTNUM, 106, 119, 121, 124, 123, 121, 107, 108, Field.DOCPROPERTY, 121, 118, 121, Byte.MAX_VALUE, 125, 106, 24, Field.AUTONUMOUT, 33, Field.AUTONUM, 61, 60, 59, Field.GOTOBUTTON, 117, Field.AUTONUMOUT, Field.GOTOBUTTON, Field.AUTONUMOUT, 60, 59, Field.ASK, 33, 117, Field.MACROBUTTON, 60, Field.SYMBOL, 33, 48, Field.FILLIN, 117, 24, Field.GLOSSARY, Field.SYMBOL, Field.PAGEREF, Field.ASK, 60, Field.QUOTE, 36, Field.DDE, 106, Field.USERADDRESS, Field.MACROBUTTON, 58, Field.GLOSSARY, 106, 56, 58, Field.DDE, 48, Field.AUTONUM, Field.IMPORT, 78, 76, Field.AUTOTEXTLIST, Field.NOTEREF, 74, Field.SECTIONPAGES, Field.SHAPE, Field.ADVANCE, 12, 9, Field.NUMCHARS, 9, Field.NOTEREF, Field.FILESIZE, 76, Field.AUTOTEXTLIST, Field.HTMLCONTROL, 64, Field.FILESIZE, 64, Field.SECTION, Field.AUTOTEXTLIST, 64, 14, Field.BIDIOUTLINE, Field.MERGESEQ, Field.AUTOTEXT, Field.ADDRESSBLOCK, Field.SECTION, 64};
    }

    static {
        A03();
        A07 = new Object();
    }

    public C04972o(Context context) {
        this.A00 = context;
        final Looper mainLooper = context.getMainLooper();
        this.A01 = new Handler(mainLooper) { // from class: com.facebook.ads.redexgen.X.2l
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                switch (message.what) {
                    case 1:
                        C04972o.this.A02();
                        return;
                    default:
                        super.handleMessage(message);
                        return;
                }
            }
        };
    }

    public static C04972o A00(Context context) {
        C04972o c04972o;
        synchronized (A07) {
            if (A05 == null) {
                A05 = new C04972o(context.getApplicationContext());
            }
            c04972o = A05;
        }
        return c04972o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Incorrect condition in loop: B:12:0x001c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02() {
        /*
            r8 = this;
        L0:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<com.facebook.ads.redexgen.X.2n>> r1 = r8.A04
            monitor-enter(r1)
            java.util.ArrayList<com.facebook.ads.redexgen.X.2m> r0 = r8.A02     // Catch: java.lang.Throwable -> L45
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L45
            if (r0 > 0) goto Ld
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            goto L44
        Ld:
            com.facebook.ads.redexgen.X.2m[] r7 = new com.facebook.ads.redexgen.X.C04952m[r0]     // Catch: java.lang.Throwable -> L45
            java.util.ArrayList<com.facebook.ads.redexgen.X.2m> r0 = r8.A02     // Catch: java.lang.Throwable -> L45
            r0.toArray(r7)     // Catch: java.lang.Throwable -> L45
            java.util.ArrayList<com.facebook.ads.redexgen.X.2m> r0 = r8.A02     // Catch: java.lang.Throwable -> L45
            r0.clear()     // Catch: java.lang.Throwable -> L45
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            r6 = 0
        L1b:
            int r0 = r7.length
            if (r6 >= r0) goto L0
            r5 = r7[r6]
            java.util.ArrayList<com.facebook.ads.redexgen.X.2n> r0 = r5.A01
            int r4 = r0.size()
            r3 = 0
        L27:
            if (r3 >= r4) goto L41
            java.util.ArrayList<com.facebook.ads.redexgen.X.2n> r0 = r5.A01
            java.lang.Object r1 = r0.get(r3)
            com.facebook.ads.redexgen.X.2n r1 = (com.facebook.ads.redexgen.X.C04962n) r1
            boolean r0 = r1.A01
            if (r0 != 0) goto L3e
            android.content.BroadcastReceiver r2 = r1.A02
            android.content.Context r1 = r8.A00
            android.content.Intent r0 = r5.A00
            r2.onReceive(r1, r0)
        L3e:
            int r3 = r3 + 1
            goto L27
        L41:
            int r6 = r6 + 1
            goto L1b
        L44:
            return
        L45:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C04972o.A02():void");
    }

    public final void A05(BroadcastReceiver broadcastReceiver) {
        synchronized (this.A04) {
            ArrayList<C04962n> remove = this.A04.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                C04962n c04962n = remove.get(size);
                c04962n.A01 = true;
                for (int j10 = 0; j10 < c04962n.A03.countActions(); j10++) {
                    String action = c04962n.A03.getAction(j10);
                    ArrayList<C04962n> arrayList = this.A03.get(action);
                    if (arrayList != null) {
                        int i10 = arrayList.size();
                        for (int i11 = i10 - 1; i11 >= 0; i11--) {
                            C04962n c04962n2 = arrayList.get(i11);
                            if (c04962n2.A02 == broadcastReceiver) {
                                c04962n2.A01 = true;
                                arrayList.remove(i11);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.A03.remove(action);
                        }
                    }
                }
            }
        }
    }

    public final void A06(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.A04) {
            C04962n c04962n = new C04962n(intentFilter, broadcastReceiver);
            ArrayList<C04962n> arrayList = this.A04.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.A04.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c04962n);
            for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                String action = intentFilter.getAction(i10);
                ArrayList<C04962n> arrayList2 = this.A03.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.A03.put(action, arrayList2);
                }
                arrayList2.add(c04962n);
            }
        }
    }

    public final boolean A07(Intent intent) {
        String A01;
        synchronized (this.A04) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.A00.getContentResolver());
            Uri data = intent.getData();
            String action2 = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean debug = (intent.getFlags() & 8) != 0;
            if (debug) {
                StringBuilder sb2 = new StringBuilder();
                String type = A01(128, 15, 117);
                StringBuilder append = sb2.append(type).append(resolveTypeIfNeeded);
                String type2 = A01(62, 8, 58);
                StringBuilder append2 = append.append(type2).append(action2);
                String type3 = A01(51, 11, 53);
                append2.append(type3).append(intent).toString();
            }
            HashMap<String, ArrayList<C04962n>> hashMap = this.A03;
            String type4 = intent.getAction();
            ArrayList<C04962n> arrayList = hashMap.get(type4);
            if (arrayList != null) {
                if (debug) {
                    StringBuilder sb3 = new StringBuilder();
                    String type5 = A01(70, 13, 40);
                    sb3.append(type5).append(arrayList).toString();
                }
                ArrayList arrayList2 = null;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    C04962n c04962n = arrayList.get(i10);
                    if (debug) {
                        StringBuilder sb4 = new StringBuilder();
                        String type6 = A01(104, 24, 106);
                        sb4.append(type6).append(c04962n.A03).toString();
                    }
                    if (!c04962n.A00) {
                        int match = c04962n.A03.match(action, resolveTypeIfNeeded, action2, data, categories, A01(83, 21, 39));
                        if (match >= 0) {
                            if (debug) {
                                String str = A01(24, 27, 64) + Integer.toHexString(match);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(c04962n);
                            c04962n.A00 = true;
                        } else if (debug) {
                            switch (match) {
                                case -4:
                                    A01 = A01(ShapeTypes.FLOW_CHART_SORT, 8, 18);
                                    break;
                                case -3:
                                    A01 = A01(ShapeTypes.FLOW_CHART_CONNECTOR, 6, 102);
                                    break;
                                case -2:
                                    A01 = A01(ShapeTypes.FLOW_CHART_DISPLAY, 4, 87);
                                    break;
                                case -1:
                                    A01 = A01(ShapeTypes.ACTION_BUTTON_BLANK, 4, 3);
                                    break;
                                default:
                                    A01 = A01(ShapeTypes.ACTION_BUTTON_FORWARD_NEXT, 14, 17);
                                    break;
                            }
                            String str2 = A01(0, 24, 20) + A01;
                        }
                    }
                }
                if (arrayList2 != null) {
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        ((C04962n) arrayList2.get(i11)).A00 = false;
                    }
                    this.A02.add(new C04952m(intent, arrayList2));
                    if (!this.A01.hasMessages(1)) {
                        this.A01.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
