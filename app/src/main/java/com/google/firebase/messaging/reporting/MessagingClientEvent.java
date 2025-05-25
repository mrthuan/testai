package com.google.firebase.messaging.reporting;

import za.b;

/* loaded from: classes2.dex */
public final class MessagingClientEvent {

    /* renamed from: a  reason: collision with root package name */
    public final long f13673a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13674b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final MessageType f13675d;

    /* renamed from: e  reason: collision with root package name */
    public final SDKPlatform f13676e;

    /* renamed from: f  reason: collision with root package name */
    public final String f13677f;

    /* renamed from: g  reason: collision with root package name */
    public final String f13678g;

    /* renamed from: i  reason: collision with root package name */
    public final int f13680i;

    /* renamed from: j  reason: collision with root package name */
    public final String f13681j;

    /* renamed from: l  reason: collision with root package name */
    public final Event f13683l;

    /* renamed from: m  reason: collision with root package name */
    public final String f13684m;

    /* renamed from: o  reason: collision with root package name */
    public final String f13686o;

    /* renamed from: h  reason: collision with root package name */
    public final int f13679h = 0;

    /* renamed from: k  reason: collision with root package name */
    public final long f13682k = 0;

    /* renamed from: n  reason: collision with root package name */
    public final long f13685n = 0;

    /* loaded from: classes2.dex */
    public enum Event implements b {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        
        private final int number_;

        Event(int i10) {
            this.number_ = i10;
        }

        @Override // za.b
        public int getNumber() {
            return this.number_;
        }
    }

    /* loaded from: classes2.dex */
    public enum MessageType implements b {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        
        private final int number_;

        MessageType(int i10) {
            this.number_ = i10;
        }

        @Override // za.b
        public int getNumber() {
            return this.number_;
        }
    }

    /* loaded from: classes2.dex */
    public enum SDKPlatform implements b {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        
        private final int number_;

        SDKPlatform(int i10) {
            this.number_ = i10;
        }

        @Override // za.b
        public int getNumber() {
            return this.number_;
        }
    }

    public MessagingClientEvent(long j10, String str, String str2, MessageType messageType, SDKPlatform sDKPlatform, String str3, String str4, int i10, String str5, Event event, String str6, String str7) {
        this.f13673a = j10;
        this.f13674b = str;
        this.c = str2;
        this.f13675d = messageType;
        this.f13676e = sDKPlatform;
        this.f13677f = str3;
        this.f13678g = str4;
        this.f13680i = i10;
        this.f13681j = str5;
        this.f13683l = event;
        this.f13684m = str6;
        this.f13686o = str7;
    }
}
